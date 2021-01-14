package com.whatsapp.camera.litecamera;

import X.AbstractC19760vZ;
import X.AbstractC19830vg;
import X.AbstractC19840vh;
import X.AbstractC21080y9;
import X.AnonymousClass008;
import X.AnonymousClass020;
import X.AnonymousClass0L6;
import X.AnonymousClass0VO;
import X.AnonymousClass0VV;
import X.AnonymousClass102;
import X.AnonymousClass24s;
import X.AnonymousClass254;
import X.AnonymousClass2E5;
import X.AnonymousClass2E6;
import X.AnonymousClass2EV;
import X.AnonymousClass2WW;
import X.AnonymousClass2WY;
import X.C07070Vu;
import X.C21060y6;
import X.C21110yC;
import X.C32371eq;
import X.C32421ev;
import X.C32451ey;
import X.C33011g3;
import X.C454324u;
import X.C454624x;
import X.C454724y;
import X.C50862Wj;
import X.C50902Wn;
import X.C50912Wo;
import X.C50922Wp;
import X.C50932Wq;
import X.C50942Wr;
import X.EnumC21070y8;
import X.EnumC21400yg;
import X.TextureView$SurfaceTextureListenerC32431ew;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LiteCameraView extends FrameLayout implements AnonymousClass2E6 {
    public AnonymousClass2E5 A00;
    public String A01 = "off";
    public List A02 = Collections.emptyList();
    public List A03 = Collections.emptyList();
    public boolean A04;
    public boolean A05;
    public final SharedPreferences A06;
    public final AbstractC19760vZ A07 = new C50902Wn(this);
    public final AbstractC19830vg A08 = new C50912Wo(this);
    public final AbstractC19840vh A09 = new C50922Wp(this);
    public final C32371eq A0A;
    public final TextureView$SurfaceTextureListenerC32431ew A0B;
    public final AnonymousClass2EV A0C;
    public final AnonymousClass0L6 A0D = AnonymousClass0L6.A00();
    public volatile boolean A0E;

    @Override // X.AnonymousClass2E6
    public int getCameraType() {
        return 1;
    }

    public LiteCameraView(Context context, int i) {
        super(context);
        AnonymousClass0VV r0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(AnonymousClass020.A02, 0);
        this.A06 = sharedPreferences;
        int i2 = sharedPreferences.getInt("camera_facing", 0);
        Boolean bool = AnonymousClass102.A02;
        if (bool == null) {
            if (Build.VERSION.SDK_INT < 24) {
                bool = Boolean.FALSE;
                AnonymousClass102.A02 = bool;
            } else {
                try {
                    CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                    for (String str : cameraManager.getCameraIdList()) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num != null) {
                            int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
                            if (AnonymousClass102.A01 == -1 && num.intValue() == 0) {
                                AnonymousClass102.A01 = intValue;
                            } else if (AnonymousClass102.A00 == -1 && num.intValue() == 1) {
                                AnonymousClass102.A00 = intValue;
                            }
                        }
                    }
                    int i3 = AnonymousClass102.A01;
                    boolean A002 = AnonymousClass102.A00(i3);
                    if (!A002 || !AnonymousClass102.A00(AnonymousClass102.A00)) {
                        int i4 = AnonymousClass102.A00;
                        if (AnonymousClass102.A00(i4) && i3 != 2 && i3 >= 0 && Build.VERSION.SDK_INT >= 26) {
                            bool = Boolean.TRUE;
                            AnonymousClass102.A02 = bool;
                        } else if (!A002 || i4 == 2 || i4 < 0 || Build.VERSION.SDK_INT < 26) {
                            bool = Boolean.FALSE;
                            AnonymousClass102.A02 = bool;
                        } else {
                            bool = Boolean.TRUE;
                            AnonymousClass102.A02 = bool;
                        }
                    } else {
                        bool = Boolean.TRUE;
                        AnonymousClass102.A02 = bool;
                    }
                } catch (AssertionError | Exception unused) {
                    bool = Boolean.FALSE;
                    AnonymousClass102.A02 = bool;
                }
            }
        }
        TextureView$SurfaceTextureListenerC32431ew r2 = new TextureView$SurfaceTextureListenerC32431ew(context, new C32451ey(), bool.booleanValue());
        r2.A0A = false;
        this.A0B = r2;
        TextureView textureView = r2.A0G;
        if (r2.A0C) {
            AbstractC21080y9 r1 = r2.A0M;
            if (i2 == 0) {
                r0 = AnonymousClass0VV.BACK;
            } else if (i2 == 1) {
                r0 = AnonymousClass0VV.FRONT;
            } else {
                throw new RuntimeException(AnonymousClass008.A0F("Could not convert camera facing to optic: ", i2));
            }
            if (r1.AAF(r0)) {
                r2.A00 = i2;
            }
            int i5 = 2097152;
            int i6 = 307200;
            int i7 = 2073600;
            if (i >= 2016) {
                i5 = 8388608;
                i6 = 2073600;
            } else if (i >= 2014) {
                i5 = 5242880;
                i6 = 921600;
            } else {
                i7 = 921600;
            }
            C32371eq r12 = new C32371eq(i7, i5, i6);
            this.A0A = r12;
            this.A0B.A08 = r12;
            addView(textureView);
            this.A0C = new AnonymousClass2EV(new C50862Wj(this));
            return;
        }
        throw new IllegalStateException("Initial camera facing must be set before initializing the camera.");
    }

    public static final int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    return 2;
                }
            } else if (str.equals("off")) {
                return 0;
            }
        } else if (str.equals("on")) {
            return 1;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("Not able to map app flash mode: ", str));
    }

    public final void A01() {
        List flashModes = getFlashModes();
        SharedPreferences sharedPreferences = this.A06;
        if (sharedPreferences.getInt(getFlashModesCountPrefKey(), 0) != flashModes.size()) {
            sharedPreferences.edit().putInt(getFlashModesCountPrefKey(), flashModes.size()).apply();
        }
    }

    @Override // X.AnonymousClass2E6
    public void A2j() {
        this.A0C.A03.A00();
    }

    @Override // X.AnonymousClass2E6
    public void A4K(float f, float f2) {
        TextureView$SurfaceTextureListenerC32431ew r3 = this.A0B;
        r3.A05 = new C50932Wq(this);
        int i = (int) f;
        int i2 = (int) f2;
        AnonymousClass0VO A012 = r3.A01();
        if (A012 != null) {
            float[] fArr = {(float) i, (float) i2};
            AbstractC21080y9 r32 = r3.A0M;
            r32.ABt(fArr);
            if (((Boolean) A012.A00(AnonymousClass0VO.A0F)).booleanValue()) {
                r32.AQ0((int) fArr[0], (int) fArr[1], new AnonymousClass254());
            }
            if (((Boolean) A012.A00(AnonymousClass0VO.A0E)).booleanValue()) {
                r32.A4J((int) fArr[0], (int) fArr[1]);
            }
        }
    }

    @Override // X.AnonymousClass2E6
    public boolean AB5() {
        return this.A0B.A00 == 1;
    }

    @Override // X.AnonymousClass2E6
    public boolean AB7() {
        return this.A0E;
    }

    @Override // X.AnonymousClass2E6
    public boolean ABT() {
        return this.A0B.A0M.ABU();
    }

    @Override // X.AnonymousClass2E6
    public boolean ACD() {
        return AB5() && !this.A01.equals("off");
    }

    @Override // X.AnonymousClass2E6
    public void ACO() {
        Log.d("LiteCamera/nextCamera");
        TextureView$SurfaceTextureListenerC32431ew r2 = this.A0B;
        AbstractC21080y9 r1 = r2.A0M;
        if (r1.ABb()) {
            this.A0C.A00();
            if (!r2.A0C && r1.ABb()) {
                r1.AQP(r2.A0R);
            }
        }
    }

    @Override // X.AnonymousClass2E6
    public String ACP() {
        Log.d("LiteCamera/nextFlashMode");
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return "off";
        }
        int indexOf = flashModes.indexOf(getFlashMode());
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        String str = (String) flashModes.get((indexOf + 1) % flashModes.size());
        this.A01 = str;
        this.A0B.A02(A00(str));
        return this.A01;
    }

    @Override // X.AnonymousClass2E6
    public void AN4() {
        if (this.A0E) {
            AnonymousClass2E5 r0 = this.A00;
            if (r0 != null) {
                ((AnonymousClass2WY) r0).A00();
                return;
            }
            return;
        }
        AN6();
    }

    @Override // X.AnonymousClass2E6
    public void AN6() {
        EnumC21400yg r8;
        AnonymousClass0VV r5;
        Log.d("LiteCamera/resume");
        TextureView$SurfaceTextureListenerC32431ew r1 = this.A0B;
        r1.A0B = this.A05;
        AbstractC19760vZ r2 = this.A07;
        if (r2 != null) {
            r1.A0N.A01(r2);
        }
        r1.A07 = this.A08;
        if (r1.A0C) {
            r1.A0C = false;
            OrientationEventListener orientationEventListener = r1.A0F;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.enable();
            }
            HandlerThread handlerThread = r1.A0E;
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                C21110yC.A00().A01.A00 = new Handler(looper);
                EnumC21400yg r7 = EnumC21400yg.HIGH;
                C32371eq r9 = r1.A08;
                if (r9 == null) {
                    r9 = new C32371eq();
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    r8 = r7;
                } else if (i >= 19) {
                    r8 = EnumC21400yg.MEDIUM;
                } else {
                    r8 = EnumC21400yg.LOW;
                }
                C454724y r6 = new C454724y(r7, r8, r9, new C33011g3(), r1.A0B);
                r1.A02 = r1.A00();
                AbstractC21080y9 r3 = r1.A0M;
                r3.A1r(r1.A0I);
                r3.AOG(r1.A0O);
                String str = r1.A0T;
                int i2 = r1.A00;
                if (i2 == 0) {
                    r5 = AnonymousClass0VV.BACK;
                } else if (i2 == 1) {
                    r5 = AnonymousClass0VV.FRONT;
                } else {
                    throw new RuntimeException(AnonymousClass008.A0F("Could not convert camera facing to optic: ", i2));
                }
                r3.A2y(str, r5, r6, new C21060y6(), r1.A0K, r1.A02, null, null, r1.A0Q);
                return;
            }
            StringBuilder A0S = AnonymousClass008.A0S("Callback handler looper is null. CallbackHandlerThread is alive: ");
            A0S.append(handlerThread.isAlive());
            throw new RuntimeException(A0S.toString());
        }
    }

    @Override // X.AnonymousClass2E6
    public int APS(int i) {
        int AA0;
        AnonymousClass008.A0t("LiteCamera/setZoomLevel: ", i);
        TextureView$SurfaceTextureListenerC32431ew r2 = this.A0B;
        if (r2.A05()) {
            r2.A0M.APT(i, null);
        }
        AnonymousClass0VO A012 = r2.A01();
        if (A012 == null || !r2.A05()) {
            return 100;
        }
        List list = (List) A012.A00(AnonymousClass0VO.A0h);
        if (!r2.A05()) {
            AA0 = 0;
        } else {
            AA0 = r2.A0M.AA0();
        }
        return ((Number) list.get(AA0)).intValue();
    }

    @Override // X.AnonymousClass2E6
    public void AQ8(File file, int i) {
        Log.d("LiteCamera/startVideoCapture");
        TextureView$SurfaceTextureListenerC32431ew r6 = this.A0B;
        AbstractC19840vh r8 = this.A09;
        if (r6.A0C) {
            r6.A0J.A00(10, new Object[]{r8, new IllegalStateException("Cannot start video recording while camera is paused.")});
            return;
        }
        synchronized (r6.A0S) {
            if (r6.A0V) {
                r6.A0J.A00(10, new Object[]{r8, new IllegalStateException("Cannot start video recording. Another recording already in progress")});
                return;
            }
            r6.A0V = true;
            r6.A0U = r8;
            r6.A0M.AQB(file, new C454624x(r6));
        }
    }

    @Override // X.AnonymousClass2E6
    public void AQH() {
        Log.d("LiteCamera/stopVideoCapture");
        TextureView$SurfaceTextureListenerC32431ew r5 = this.A0B;
        if (r5 != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            synchronized (r5.A0S) {
                if (r5.A0V) {
                    r5.A0M.AQJ(false, new C454324u(r5, countDownLatch));
                    try {
                        countDownLatch.await(5, TimeUnit.SECONDS);
                    } catch (InterruptedException unused) {
                        throw new RuntimeException("Timeout stopping video recording.");
                    }
                }
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass2E6
    public void AQS(AnonymousClass2WW r4, boolean z) {
        Log.d("LiteCamera/takePicture");
        TextureView$SurfaceTextureListenerC32431ew r1 = this.A0B;
        C50942Wr r0 = new C50942Wr(this, r4);
        if (r1 != null) {
            r1.A0M.AQR(false, z, new C32421ev(r1, r0));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2E6
    public int getCameraApi() {
        return this.A0B.A0L == EnumC21070y8.CAMERA2 ? 1 : 0;
    }

    @Override // X.AnonymousClass2E6
    public String getFlashMode() {
        return this.A01;
    }

    @Override // X.AnonymousClass2E6
    public List getFlashModes() {
        return AB5() ? this.A03 : this.A02;
    }

    private String getFlashModesCountPrefKey() {
        StringBuilder A0S = AnonymousClass008.A0S("flash_modes_count");
        A0S.append(this.A0B.A00);
        return A0S.toString();
    }

    @Override // X.AnonymousClass2E6
    public int getMaxZoom() {
        TextureView$SurfaceTextureListenerC32431ew r0 = this.A0B;
        AnonymousClass0VO A012 = r0.A01();
        if (A012 == null || !r0.A05()) {
            return 0;
        }
        return ((Number) A012.A00(AnonymousClass0VO.A0N)).intValue();
    }

    @Override // X.AnonymousClass2E6
    public int getNumberOfCameras() {
        return this.A0B.A0M.ABb() ? 2 : 1;
    }

    @Override // X.AnonymousClass2E6
    public long getPictureResolution() {
        C07070Vu r0 = this.A0A.A00;
        if (r0 != null) {
            return (long) (r0.A01 * r0.A00);
        }
        return 0;
    }

    @Override // X.AnonymousClass2E6
    public int getStoredFlashModeCount() {
        return this.A06.getInt(getFlashModesCountPrefKey(), 0);
    }

    @Override // X.AnonymousClass2E6
    public long getVideoResolution() {
        C07070Vu r0 = this.A0A.A01;
        if (r0 != null) {
            return (long) (r0.A01 * r0.A00);
        }
        return 0;
    }

    @Override // X.AnonymousClass2E6
    public void pause() {
        Log.d("LiteCamera/pause");
        TextureView$SurfaceTextureListenerC32431ew r3 = this.A0B;
        if (!r3.A0C) {
            OrientationEventListener orientationEventListener = r3.A0F;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.disable();
            }
            r3.A0C = true;
            AbstractC21080y9 r1 = r3.A0M;
            r1.AMg(r3.A0I);
            r1.AOG(null);
            r1.A3l(new AnonymousClass24s(r3));
        }
        AbstractC19760vZ r12 = this.A07;
        if (r3 != null) {
            if (r12 != null) {
                r3.A0N.A02(r12);
            }
            r3.A07 = null;
            r3.A03(null);
            this.A0C.A00();
            this.A0E = false;
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2E6
    public void setCameraCallback(AnonymousClass2E5 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass2E6
    public void setQrScanningEnabled(boolean z) {
        if (z != this.A05) {
            this.A05 = z;
            if (z) {
                TextureView$SurfaceTextureListenerC32431ew r2 = this.A0B;
                AnonymousClass2EV r1 = this.A0C;
                r2.A03(r1.A01);
                if (!r1.A08) {
                    r1.A03.A02();
                    r1.A08 = true;
                    return;
                }
                return;
            }
            this.A0C.A00();
            this.A0B.A03(null);
        }
    }
}
