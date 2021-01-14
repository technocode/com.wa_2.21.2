package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.0VD  reason: invalid class name */
public class AnonymousClass0VD {
    public static final Matrix A0G = new Matrix();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public PathMeasure A08;
    public Boolean A09;
    public String A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final AnonymousClass05V A0E;
    public final AnonymousClass0VF A0F;

    public AnonymousClass0VD() {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 255;
        this.A0A = null;
        this.A09 = null;
        this.A0E = new AnonymousClass05V();
        this.A0F = new AnonymousClass0VF();
        this.A0C = new Path();
        this.A0D = new Path();
    }

    public AnonymousClass0VD(AnonymousClass0VD r4) {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 255;
        this.A0A = null;
        this.A09 = null;
        AnonymousClass05V r2 = new AnonymousClass05V();
        this.A0E = r2;
        this.A0F = new AnonymousClass0VF(r4.A0F, r2);
        this.A0C = new Path(r4.A0C);
        this.A0D = new Path(r4.A0D);
        this.A01 = r4.A01;
        this.A00 = r4.A00;
        this.A03 = r4.A03;
        this.A02 = r4.A02;
        this.A04 = r4.A04;
        this.A05 = r4.A05;
        this.A0A = r4.A0A;
        String str = r4.A0A;
        if (str != null) {
            this.A0E.put(str, this);
        }
        this.A09 = r4.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        if (r0 != 0) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass0VF r21, android.graphics.Matrix r22, android.graphics.Canvas r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VD.A00(X.0VF, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return ((float) this.A05) / 255.0f;
    }

    public int getRootAlpha() {
        return this.A05;
    }

    public void setAlpha(float f) {
        this.A05 = (int) (f * 255.0f);
    }

    public void setRootAlpha(int i) {
        this.A05 = i;
    }
}
