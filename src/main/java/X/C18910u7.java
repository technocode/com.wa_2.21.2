package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* renamed from: X.0u7  reason: invalid class name and case insensitive filesystem */
public class C18910u7 {
    public Paint A00;
    public Paint A01;
    public C18660ti A02;
    public C18660ti A03;
    public C18820ty A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public C18910u7() {
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setFlags(385);
        this.A00.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A00;
        Typeface typeface = Typeface.DEFAULT;
        paint2.setTypeface(typeface);
        Paint paint3 = new Paint();
        this.A01 = paint3;
        paint3.setFlags(385);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setTypeface(typeface);
        this.A04 = C18820ty.A00();
    }

    public C18910u7(C18910u7 r4) {
        this.A05 = r4.A05;
        this.A06 = r4.A06;
        this.A00 = new Paint(r4.A00);
        this.A01 = new Paint(r4.A01);
        C18660ti r1 = r4.A03;
        if (r1 != null) {
            this.A03 = new C18660ti(r1);
        }
        C18660ti r12 = r4.A02;
        if (r12 != null) {
            this.A02 = new C18660ti(r12);
        }
        this.A07 = r4.A07;
        try {
            this.A04 = (C18820ty) r4.A04.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.A04 = C18820ty.A00();
        }
    }
}
