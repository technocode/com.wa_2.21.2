package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.2K7  reason: invalid class name */
public class AnonymousClass2K7 {
    public float A00;
    public int A01;
    public int A02 = 0;
    public Matrix A03;
    public Rect A04;
    public RectF A05;
    public RectF A06;
    public View A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = false;
    public final Paint A0B = new Paint();
    public final Paint A0C = new Paint();
    public final Paint A0D = new Paint();

    public AnonymousClass2K7(View view) {
        this.A07 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r11 >= (((float) r3.bottom) + r4)) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r6 == false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(float r10, float r11) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K7.A00(float, float):int");
    }

    public Rect A01() {
        RectF rectF = this.A05;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final Rect A02() {
        RectF rectF = this.A05;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.A03.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }
}
