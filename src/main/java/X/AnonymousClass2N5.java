package X;

import android.graphics.PointF;

/* renamed from: X.2N5  reason: invalid class name */
public class AnonymousClass2N5 {
    public AnonymousClass2NA A00;
    public AnonymousClass2NA A01;
    public final long A02;
    public final AnonymousClass2N7 A03 = new AnonymousClass2N7();
    public final AnonymousClass2NA A04 = new AnonymousClass2NA();

    public AnonymousClass2N5(PointF pointF, long j) {
        AnonymousClass2NA r3 = new AnonymousClass2NA(pointF);
        this.A00 = r3;
        this.A01 = r3;
        this.A02 = j;
        this.A03.A00(r3, this.A04, (float) j);
    }

    public void A00(PointF pointF, long j) {
        if (j >= this.A02) {
            AnonymousClass2NA r5 = this.A00;
            AnonymousClass2NA r4 = this.A01;
            if (r5 == r4) {
                this.A00 = new AnonymousClass2NA(pointF);
                return;
            }
            AnonymousClass2NA r3 = this.A04;
            if (r3 != null) {
                float f = pointF.x - ((PointF) r4).x;
                ((PointF) r3).x = f;
                float f2 = pointF.y - ((PointF) r4).y;
                ((PointF) r3).y = f2;
                ((PointF) r3).x = f * 0.5f;
                ((PointF) r3).y = f2 * 0.5f;
                this.A03.A00(r5, r3, (float) j);
                this.A01.set(this.A00);
                this.A00.set(pointF);
                return;
            }
            throw null;
        }
        throw new IllegalStateException("events must deliver in order");
    }
}
