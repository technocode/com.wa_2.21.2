package X;

import android.graphics.Path;

/* renamed from: X.1e6  reason: invalid class name */
public class AnonymousClass1e6 implements AbstractC18720to {
    public float A00;
    public float A01;
    public Path A02 = new Path();

    public AnonymousClass1e6(C31931e2 r2) {
        if (r2 != null) {
            r2.A02(this);
        }
    }

    @Override // X.AbstractC18720to
    public void A26(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C18930u9.A04(this.A00, this.A01, f, f2, f3, z, z2, f4, f5, this);
        this.A00 = f4;
        this.A01 = f5;
    }

    @Override // X.AbstractC18720to
    public void A3W(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A02.cubicTo(f, f2, f3, f4, f5, f6);
        this.A00 = f5;
        this.A01 = f6;
    }

    @Override // X.AbstractC18720to
    public void ABk(float f, float f2) {
        this.A02.lineTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.AbstractC18720to
    public void ACB(float f, float f2) {
        this.A02.moveTo(f, f2);
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.AbstractC18720to
    public void AMF(float f, float f2, float f3, float f4) {
        this.A02.quadTo(f, f2, f3, f4);
        this.A00 = f3;
        this.A01 = f4;
    }

    @Override // X.AbstractC18720to
    public void close() {
        this.A02.close();
    }
}
