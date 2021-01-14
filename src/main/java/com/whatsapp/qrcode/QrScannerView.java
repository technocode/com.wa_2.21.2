package com.whatsapp.qrcode;

import X.AbstractC64792yn;
import X.AnonymousClass008;
import X.C64692yb;
import X.C64782ym;
import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;

public class QrScannerView extends SurfaceView implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera.PreviewCallback A02;
    public Camera.Size A03;
    public Camera A04;
    public Handler A05;
    public AbstractC64792yn A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public final Camera.AutoFocusCallback A0A = new C64782ym(this);
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final SurfaceHolder A0C;
    public final Runnable A0D = new RunnableEBaseShape12S0100000_I1_7(this, 11);
    public volatile byte[] A0E;

    public QrScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        SurfaceHolder holder = getHolder();
        this.A0C = holder;
        holder.addCallback(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011a, code lost:
        if (r7 != 3) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (r7 == 2) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
        // Method dump skipped, instructions count: 580
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrScannerView.A00():void");
    }

    public final void A01() {
        AbstractC64792yn r1 = this.A06;
        if (r1 != null) {
            r1.ADi(1);
        }
    }

    public final void A02() {
        Camera camera = this.A04;
        if (camera == null) {
            Handler handler = this.A05;
            if (handler != null) {
                handler.post(new RunnableEBaseShape12S0100000_I1_7(this, 12));
            } else {
                A03();
            }
        } else {
            try {
                camera.reconnect();
            } catch (IOException e) {
                this.A04.release();
                this.A04 = null;
                Log.e("qrview/startcamera error reconnecting camera", e);
                A01();
            }
        }
    }

    public final void A03() {
        if (this.A04 == null) {
            try {
                Camera open = Camera.open();
                this.A04 = open;
                if (open == null) {
                    open = Camera.open(0);
                    this.A04 = open;
                }
                open.setErrorCallback(new C64692yb(this));
            } catch (Exception e) {
                Camera camera = this.A04;
                if (camera != null) {
                    camera.release();
                }
                this.A04 = null;
                Log.e("qrview/startcamera error opening camera", e);
                A01();
            }
        }
    }

    public final void A04() {
        Log.i("qrview/stopcamera");
        Camera camera = this.A04;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                Log.w("qrview/stopcamera error stopping camera preview", e);
            }
            try {
                this.A04.release();
            } catch (Exception e2) {
                Log.w("qrview/stopcamera error releaseing camera", e2);
            }
            this.A04 = null;
        }
    }

    public Camera getCamera() {
        return this.A04;
    }

    public Camera.Size getPreviewSize() {
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (r1 == 2) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrScannerView.onMeasure(int, int):void");
    }

    public void setCameraCallback(AbstractC64792yn r1) {
        this.A06 = r1;
    }

    public void setCameraPreviewCallback(Camera.PreviewCallback previewCallback) {
        this.A02 = previewCallback;
    }

    public void setThreadHandler(Handler handler) {
        this.A05 = handler;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.A04 == null) {
            if (this.A05 == null) {
                Log.e("qrview/surfacechanged: no camera");
                A01();
            }
        } else if (this.A0C.getSurface() == null) {
            Log.e("qrview/surfacechanged: no surface");
            A01();
        } else {
            AnonymousClass008.A1K(AnonymousClass008.A0U("qrview/surfacechanged  format:", i, " w:", i2, " h:"), i3);
            try {
                if (!surfaceHolder.isCreating()) {
                    Log.d("qrview/surfacechanged: !holder.isCreating");
                    this.A04.stopPreview();
                }
                this.A04.setPreviewDisplay(surfaceHolder);
                A00();
            } catch (RuntimeException e) {
                this.A04.release();
                this.A04 = null;
                Log.e("qrview/surfacechanged ", e);
                A01();
            } catch (IOException e2) {
                this.A04.release();
                this.A04 = null;
                Log.e("qrview/surfacechanged: error setting preview display", e2);
                A01();
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.i("qrview/surfaceCreated");
        A02();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.i("qrview/surfacedestroyed");
        A04();
    }
}
