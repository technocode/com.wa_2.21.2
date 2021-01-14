package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.ImageReader;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0zJ  reason: invalid class name and case insensitive filesystem */
public class C21780zJ {
    public static final Object A0R = new Object();
    public CameraCaptureSession A00;
    public CameraCharacteristics A01;
    public CameraDevice A02;
    public CaptureRequest.Builder A03;
    public ImageReader A04;
    public Surface A05;
    public Surface A06;
    public C33021g4 A07;
    public C33251gR A08;
    public C33321gY A09;
    public AnonymousClass0VM A0A;
    public C33341ga A0B;
    public AnonymousClass0VO A0C;
    public boolean A0D;
    public MeteringRectangle[] A0E;
    public MeteringRectangle[] A0F;
    public final C21120yD A0G = new C21120yD();
    public final C21120yD A0H = new C21120yD();
    public final C21630z4 A0I;
    public final C21810zM A0J;
    public final AnonymousClass0zS A0K = new C33211gN(this);
    public final AnonymousClass0zS A0L = new C33201gM(this);
    public final C33281gU A0M = new C33281gU(new C33221gO(this));
    public final C22170zz A0N;
    public final List A0O = new ArrayList();
    public volatile boolean A0P;
    public volatile boolean A0Q;

    public C21780zJ(C22170zz r3, C21810zM r4) {
        this.A0N = r3;
        this.A0J = r4;
        this.A0I = new C21630z4(r3);
    }

    public static void A00(CaptureRequest.Builder builder, Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, AnonymousClass0VO r5) {
        if (((Boolean) r5.A00(AnonymousClass0VO.A0J)).booleanValue()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (((Boolean) r5.A00(AnonymousClass0VO.A0E)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (((Boolean) r5.A00(AnonymousClass0VO.A0F)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    public static boolean A01(List list, int[] iArr) {
        if (!(list == null || iArr == null || (iArr[0] == 0 && iArr[1] == 0))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final CameraCaptureSession A02(List list, String str) {
        this.A0I.A01("Method createCaptureSession must be called on Optic Thread");
        C33281gU r1 = this.A0M;
        r1.A03 = 1;
        r1.A02.A02(0);
        return (CameraCaptureSession) this.A0N.A03(new CallableC21750zG(this, list), str);
    }

    public CameraCaptureSession A03(boolean z, boolean z2, AnonymousClass0zS r8) {
        List asList;
        C21630z4 r3 = this.A0I;
        r3.A00("Cannot start preview.");
        C33251gR r1 = this.A08;
        r1.A0C = 1;
        r1.A05 = r8;
        r1.A07 = Boolean.TRUE;
        r1.A02 = null;
        r3.A00("Cannot get output surfaces.");
        if (z) {
            Surface[] surfaceArr = new Surface[3];
            surfaceArr[0] = this.A05;
            surfaceArr[1] = this.A04.getSurface();
            ImageReader imageReader = this.A0J.A01;
            if (imageReader != null) {
                surfaceArr[2] = imageReader.getSurface();
                asList = Arrays.asList(surfaceArr);
            } else {
                throw new IllegalStateException("Getting image reader surface without initialize.");
            }
        } else {
            asList = Arrays.asList(this.A05, this.A04.getSurface());
        }
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        this.A00 = A02(asList, "start_preview_on_camera_handler_thread");
        A06(z);
        A07(z2, "Preview session was closed while starting preview");
        this.A0P = true;
        return this.A00;
    }

    public void A04() {
        this.A0I.A00("Cannot refresh camera preview.");
        try {
            A07(false, null);
        } catch (Exception unused) {
        }
    }

    public void A05() {
        C33231gP r1;
        this.A0I.A00("Cannot update frame metadata collection.");
        AnonymousClass0VM r12 = this.A0A;
        if (r12 != null) {
            boolean booleanValue = ((Boolean) r12.A00(AnonymousClass0VN.A0O)).booleanValue();
            C33251gR r2 = this.A08;
            if (booleanValue) {
                r1 = this.A0J.A07;
                if (r2.A06 == null) {
                    r2.A06 = new C22050zl();
                }
            } else {
                r1 = null;
            }
            r2.A0F = booleanValue;
            r2.A04 = r1;
        }
    }

    public void A06(boolean z) {
        this.A0I.A00("Cannot update preview builder for CPU frames.");
        CaptureRequest.Builder builder = this.A03;
        if (builder == null) {
            return;
        }
        if (z) {
            ImageReader imageReader = this.A0J.A01;
            if (imageReader != null) {
                builder.addTarget(imageReader.getSurface());
                this.A0Q = true;
                return;
            }
            throw new IllegalStateException("Getting image reader surface without initialize.");
        }
        ImageReader imageReader2 = this.A0J.A01;
        if (imageReader2 != null) {
            builder.removeTarget(imageReader2.getSurface());
            this.A0Q = false;
            return;
        }
        throw new IllegalStateException("Getting image reader surface without initialize.");
    }

    public final void A07(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0I.A01("Method updatePreviewView must be invoked in the Optic background thread");
        synchronized (A0R) {
            CameraCaptureSession cameraCaptureSession = this.A00;
            if (cameraCaptureSession != null && (builder = this.A03) != null) {
                cameraCaptureSession.setRepeatingRequest(builder.build(), this.A08, null);
            } else if (z) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new C21620z2(str);
            }
        }
    }

    public void A08(boolean z, boolean z2) {
        AnonymousClass0zS r0;
        C21630z4 r1 = this.A0I;
        r1.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A08 != null) {
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00) {
                C33251gR r3 = this.A08;
                if (!r3.A0E || r3.A0C != 1) {
                    if (z2) {
                        r0 = this.A0L;
                    } else {
                        r0 = this.A0K;
                    }
                    this.A00 = A03(z, false, r0);
                    return;
                }
                this.A0O.add(new C21770zI(z, z2));
            }
        }
    }

    public final boolean A09(int i) {
        int[] iArr = (int[]) this.A01.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
