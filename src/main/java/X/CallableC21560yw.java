package X;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Callable;

/* renamed from: X.0yw  reason: invalid class name and case insensitive filesystem */
public class CallableC21560yw implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33171gJ A01;

    public CallableC21560yw(C33171gJ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AnonymousClass0VO r2;
        int min;
        CaptureRequest.Builder builder;
        AnonymousClass0VO r0;
        C33171gJ r1 = this.A01;
        if (r1.isConnected()) {
            C21780zJ r5 = r1.A0W;
            C21630z4 r7 = r5.A0I;
            r7.A01("Can only check if the prepared on the Optic thread");
            if (r7.A00) {
                C21860zR r4 = r1.A0Z;
                int i = this.A00;
                if (!(r4.A02 == null || r4.A03 == null || (r2 = r4.A04) == null || r4.A05 == null || r4.A00 == null || r4.A01 == null || (min = Math.min(Math.max(i, 0), ((Number) r2.A00(AnonymousClass0VO.A0N)).intValue())) == r4.A00())) {
                    C33341ga r3 = r4.A03;
                    ((AbstractC22030zj) r3).A00.A01(AnonymousClass0VN.A0k, Integer.valueOf(min));
                    r3.A00();
                    int width = r4.A01.width();
                    int height = r4.A01.height();
                    double intValue = ((double) (((float) ((Number) r4.A05.get(min)).intValue()) / 100.0f)) * 2.0d;
                    int i2 = (int) (((double) width) / intValue);
                    int i3 = (int) (((double) height) / intValue);
                    int i4 = width >> 1;
                    int i5 = height >> 1;
                    r4.A00.set(i4 - i2, i5 - i3, i4 + i2, i5 + i3);
                    Rect rect = r4.A00;
                    MeteringRectangle[] A02 = r4.A02(r4.A07);
                    MeteringRectangle[] A022 = r4.A02(r4.A06);
                    r7.A01("Can only apply zoom on the Optic thread");
                    r7.A01("Can only check if the prepared on the Optic thread");
                    if (!(!r7.A00 || (builder = r5.A03) == null || (r0 = r5.A0C) == null)) {
                        C21780zJ.A00(builder, rect, A02, A022, r0);
                        if (r5.A0P) {
                            r5.A04();
                        }
                    }
                }
                return Integer.valueOf(r4.A00());
            }
        }
        return 0;
    }
}
