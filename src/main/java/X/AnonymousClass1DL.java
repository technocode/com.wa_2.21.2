package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;

/* renamed from: X.1DL  reason: invalid class name */
public class AnonymousClass1DL {
    public static final boolean A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public PorterDuff.Mode A09;
    public Drawable A0A;
    public Drawable A0B;
    public GradientDrawable A0C;
    public GradientDrawable A0D;
    public GradientDrawable A0E;
    public GradientDrawable A0F;
    public GradientDrawable A0G;
    public boolean A0H = false;
    public final Paint A0I = new Paint(1);
    public final Rect A0J = new Rect();
    public final RectF A0K = new RectF();
    public final C459026x A0L;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        A0M = z;
    }

    public AnonymousClass1DL(C459026x r3) {
        this.A0L = r3;
    }

    public final Drawable A00() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A0C = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.A00) + 1.0E-5f);
        this.A0C.setColor(-1);
        A01();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.A0G = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.A00) + 1.0E-5f);
        this.A0G.setColor(0);
        this.A0G.setStroke(this.A05, this.A08);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{this.A0C, this.A0G}), this.A02, this.A04, this.A03, this.A01);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.A0E = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.A00) + 1.0E-5f);
        this.A0E.setColor(-1);
        return new AnonymousClass1DK(C08220af.A01(this.A07), insetDrawable, this.A0E);
    }

    public final void A01() {
        GradientDrawable gradientDrawable = this.A0C;
        if (gradientDrawable != null) {
            C002001d.A2b(gradientDrawable, this.A06);
            PorterDuff.Mode mode = this.A09;
            if (mode != null) {
                C002001d.A2c(this.A0C, mode);
            }
        }
    }
}
