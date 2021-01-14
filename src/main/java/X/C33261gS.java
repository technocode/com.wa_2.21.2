package X;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1gS  reason: invalid class name and case insensitive filesystem */
public class C33261gS extends CameraDevice.StateCallback implements AbstractC22140zw {
    public CameraDevice A00;
    public C33111gD A01;
    public C33131gF A02;
    public C21620z2 A03;
    public Boolean A04;
    public final C21880zU A05;

    public C33261gS(C33111gD r4, C33131gF r5) {
        this.A01 = r4;
        this.A02 = r5;
        C21880zU r2 = new C21880zU();
        this.A05 = r2;
        r2.A02(0);
    }

    @Override // X.AbstractC22140zw
    public void A2I() {
        this.A05.A00();
    }

    @Override // X.AbstractC22140zw
    public Object A8p() {
        Boolean bool = this.A04;
        if (bool == null) {
            throw new IllegalStateException("Open Camera operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A00;
        } else {
            throw this.A03;
        }
    }

    public void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        C33111gD r7 = this.A01;
        if (r7 != null) {
            r7.A00.A0k = false;
            C33171gJ r5 = r7.A00;
            r5.A0l = false;
            r5.A0f = null;
            r5.A0D = null;
            r5.A0B = null;
            r5.A0C = null;
            C21860zR r0 = r5.A0Z;
            r0.A04 = null;
            r0.A02 = null;
            r0.A03 = null;
            r0.A01 = null;
            r0.A00 = null;
            r0.A05 = null;
            r0.A07 = null;
            r0.A06 = null;
            r5.A04 = null;
            r5.A0V.A0B = false;
            r5.A0U.A00();
            C21850zQ r1 = r5.A0Y;
            if (r1.A0C && (!r5.A0m || r1.A0B)) {
                try {
                    r5.A0b.A01(new CallableC21500yq(r7), "on_camera_closed_stop_video_recording", new AnonymousClass258()).get();
                } catch (InterruptedException | ExecutionException unused) {
                    C22100zr.A00();
                }
            }
            C21780zJ r2 = r5.A0W;
            if (r2.A00 != null) {
                synchronized (C21780zJ.A0R) {
                    C33251gR r02 = r2.A08;
                    if (r02 != null) {
                        r02.A0E = false;
                        r2.A08 = null;
                    }
                }
                try {
                    r2.A00.abortCaptures();
                    r2.A00.close();
                } catch (Exception unused2) {
                }
                r2.A00 = null;
            }
            String id = cameraDevice.getId();
            C33161gI r12 = r5.A0S;
            if (id.equals(r12.A00)) {
                r12.A01();
                r12.A00 = null;
            }
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A04 = Boolean.FALSE;
            this.A03 = new C21620z2("Could not open camera. Operation disconnected.");
            this.A05.A01();
            return;
        }
        C33131gF r0 = this.A02;
        if (r0 != null) {
            C33171gJ.A00(r0.A00, 2, "Camera has been disconnected.");
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        String str;
        int i2;
        if (this.A00 == null) {
            this.A04 = Boolean.FALSE;
            this.A03 = new C21620z2(AnonymousClass008.A0F("Could not open camera. Operation error: ", i));
            this.A05.A01();
            return;
        }
        C33131gF r0 = this.A02;
        if (r0 != null) {
            C33171gJ r2 = r0.A00;
            if (i == 1) {
                str = "Camera in use by higher priority component.";
            } else if (i == 2) {
                str = "There are too many open camera devices.";
            } else if (i == 3) {
                str = "Camera disabled, device policy error.";
            } else if (i == 4 || i == 5) {
                i2 = 100;
                str = "Camera device has encountered a fatal error.";
                C33171gJ.A00(r2, i2, str);
            } else {
                str = "Unknown camera error.";
            }
            i2 = 1;
            C33171gJ.A00(r2, i2, str);
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        this.A04 = Boolean.TRUE;
        this.A00 = cameraDevice;
        this.A05.A01();
    }
}
