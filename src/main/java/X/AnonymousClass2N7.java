package X;

import android.graphics.PointF;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.2N7  reason: invalid class name */
public class AnonymousClass2N7 {
    public static final PointF A09 = new AnonymousClass2NA();
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public float A04 = 1.0f;
    public float A05;
    public AnonymousClass2N6 A06;
    public AnonymousClass2N6 A07;
    public final NavigableMap A08 = new TreeMap();

    public void A00(PointF pointF, PointF pointF2, float f) {
        AnonymousClass2N6 r2 = this.A07;
        if (r2 == null) {
            PointF pointF3 = A09;
            float f2 = pointF3.x;
            float[] fArr = {f2, f2, pointF2.x, pointF.x};
            float f3 = pointF3.y;
            this.A07 = new AnonymousClass2N6(fArr, new float[]{f3, f3, pointF2.y, pointF.y});
            this.A05 = f;
            return;
        }
        float[] fArr2 = r2.A01;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = r2.A02;
        AnonymousClass2N6 r22 = new AnonymousClass2N6(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A07 = r22;
        this.A08.put(Float.valueOf(this.A03), r22);
        this.A03 = this.A07.A00() + this.A03;
        this.A02 = f - this.A05;
    }
}
