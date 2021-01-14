package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.0zP  reason: invalid class name and case insensitive filesystem */
public class CallableC21840zP implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ C21850zQ A02;
    public final /* synthetic */ C33251gR A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public CallableC21840zP(C21850zQ r1, CaptureRequest.Builder builder, boolean z, C33251gR r4, boolean z2, long j) {
        this.A02 = r1;
        this.A01 = builder;
        this.A05 = z;
        this.A03 = r4;
        this.A04 = z2;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        CaptureRequest.Builder builder;
        C21850zQ r5 = this.A02;
        if (!r5.A0C) {
            throw new IllegalStateException("Not recording video.");
        } else if (r5.A0A == null || r5.A05 == null || r5.A04 == null || r5.A03 == null || r5.A02 == null) {
            throw new IllegalStateException("Cannot stop recording video, camera is closed");
        } else if (r5.A06 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r5.A00;
            if (elapsedRealtime < 500) {
                SystemClock.sleep(500 - elapsedRealtime);
            }
            C07050Vs r7 = r5.A06;
            boolean z = r5.A0B;
            Exception A002 = r5.A00();
            if (!(((Number) r5.A04.A00(AnonymousClass0VN.A09)).intValue() == 0 || (builder = this.A01) == null)) {
                AnonymousClass0N2.A17(builder, r5.A05, 0);
                r5.A03.A04();
            }
            if (this.A05) {
                r5.A02.A02(this.A01, this.A03);
                if (z) {
                    r5.A03.A08(this.A04, true);
                }
            }
            if (A002 == null) {
                long j = this.A00;
                long j2 = r7.A02;
                if (j2 != -1) {
                    j = j2;
                }
                r7.A02 = j;
                return r7;
            }
            throw A002;
        } else {
            throw new IllegalStateException("Cannot stop recording video, VideoCaptureInfo is null");
        }
    }
}
