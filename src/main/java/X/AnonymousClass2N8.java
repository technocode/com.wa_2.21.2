package X;

import android.graphics.PointF;

/* renamed from: X.2N8  reason: invalid class name */
public class AnonymousClass2N8 {
    public double A00 = 3.0d;
    public long A01;
    public final AnonymousClass2N5 A02;
    public final AnonymousClass2NA A03 = new AnonymousClass2NA();
    public final AnonymousClass2NA A04 = new AnonymousClass2NA();
    public final AnonymousClass2NA A05 = new AnonymousClass2NA();
    public final AnonymousClass2NA A06 = new AnonymousClass2NA();

    public AnonymousClass2N8(PointF pointF, long j) {
        this.A02 = new AnonymousClass2N5(pointF, j);
        this.A01 = j;
        this.A05.set(pointF);
        this.A06.set(0.0f, 0.0f);
    }

    public final void A00() {
        AnonymousClass2NA r3 = this.A03;
        AnonymousClass2NA r2 = this.A04;
        AnonymousClass2NA r5 = this.A05;
        if (r3 != null) {
            float f = ((PointF) r2).x - ((PointF) r5).x;
            ((PointF) r3).x = f;
            float f2 = ((PointF) r2).y - ((PointF) r5).y;
            ((PointF) r3).y = f2;
            float f3 = f * 0.05f;
            ((PointF) r3).x = f3;
            float f4 = f2 * 0.05f;
            ((PointF) r3).y = f4;
            AnonymousClass2NA r32 = this.A06;
            float f5 = ((PointF) r32).x + f3;
            ((PointF) r32).x = f5;
            float f6 = ((PointF) r32).y + f4;
            ((PointF) r32).y = f6;
            float f7 = f5 * 0.7f;
            ((PointF) r32).x = f7;
            float f8 = f6 * 0.7f;
            ((PointF) r32).y = f8;
            ((PointF) r5).x += f7;
            ((PointF) r5).y += f8;
            long j = (long) (((double) this.A01) + 3.0d);
            this.A01 = j;
            this.A02.A00(r5, j);
            return;
        }
        throw null;
    }
}
