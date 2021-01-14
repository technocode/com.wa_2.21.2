package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0aV  reason: invalid class name and case insensitive filesystem */
public class C08120aV {
    public static final TimeInterpolator A0R = C08060aP.A01;
    public static final int[] A0S = new int[0];
    public static final int[] A0T = {16842910};
    public static final int[] A0U = {16842908, 16842910};
    public static final int[] A0V = {16843623, 16842910};
    public static final int[] A0W = {16843623, 16842908, 16842910};
    public static final int[] A0X = {16842919, 16842910};
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public float A04;
    public int A05 = 0;
    public int A06;
    public Animator A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public ViewTreeObserver.OnPreDrawListener A0B;
    public C08050aO A0C;
    public C08050aO A0D;
    public C08050aO A0E;
    public C08050aO A0F;
    public C08230ag A0G;
    public C08250ai A0H;
    public ArrayList A0I;
    public ArrayList A0J;
    public final Matrix A0K = new Matrix();
    public final Rect A0L = new Rect();
    public final RectF A0M = new RectF();
    public final RectF A0N = new RectF();
    public final C08130aW A0O;
    public final C08010aK A0P;
    public final AbstractC08110aU A0Q;

    public void A07() {
    }

    public void A0F(Rect rect) {
    }

    public boolean A0H() {
        return true;
    }

    public C08120aV(C08010aK r4, AbstractC08110aU r5) {
        this.A0P = r4;
        this.A0Q = r5;
        C08130aW r2 = new C08130aW();
        this.A0O = r2;
        r2.A00(A0X, A00(new C08150aY(this)));
        this.A0O.A00(A0W, A00(new C08180ab(this)));
        this.A0O.A00(A0U, A00(new C08180ab(this)));
        this.A0O.A00(A0V, A00(new C08180ab(this)));
        this.A0O.A00(A0T, A00(new C08190ac(this)));
        this.A0O.A00(A0S, A00(new C08200ad(this)));
        this.A04 = this.A0P.getRotation();
    }

    public static final ValueAnimator A00(AbstractC08160aZ r3) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A0R);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(r3);
        valueAnimator.addUpdateListener(r3);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float A01() {
        return this.A00;
    }

    public final AnimatorSet A02(C08050aO r10, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        C08010aK r6 = this.A0P;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r6, View.ALPHA, f);
        r10.A03("opacity").A00(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r6, View.SCALE_X, f2);
        r10.A03("scale").A00(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r6, View.SCALE_Y, f2);
        r10.A03("scale").A00(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.A0K;
        A0B(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(r6, new AnonymousClass1D1(), new AnonymousClass1D2(), new Matrix(matrix));
        r10.A03("iconScale").A00(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C008805h.A0q(animatorSet, arrayList);
        return animatorSet;
    }

    public GradientDrawable A03() {
        return new GradientDrawable();
    }

    public C08230ag A04() {
        return new C08230ag();
    }

    public C08230ag A05(int i, ColorStateList colorStateList) {
        Context context = this.A0P.getContext();
        C08230ag A042 = A04();
        int A002 = C004302a.A00(context, R.color.design_fab_stroke_top_outer_color);
        int A003 = C004302a.A00(context, R.color.design_fab_stroke_top_inner_color);
        int A004 = C004302a.A00(context, R.color.design_fab_stroke_end_inner_color);
        int A005 = C004302a.A00(context, R.color.design_fab_stroke_end_outer_color);
        A042.A06 = A002;
        A042.A05 = A003;
        A042.A03 = A004;
        A042.A02 = A005;
        float f = (float) i;
        if (A042.A00 != f) {
            A042.A00 = f;
            A042.A09.setStrokeWidth(f * 1.3333f);
            A042.A08 = true;
            A042.invalidateSelf();
        }
        if (colorStateList != null) {
            A042.A04 = colorStateList.getColorForState(A042.getState(), A042.A04);
        }
        A042.A07 = colorStateList;
        A042.A08 = true;
        A042.invalidateSelf();
        return A042;
    }

    public void A06() {
        C08130aW r1 = this.A0O;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            r1.A00 = null;
        }
    }

    public final void A08() {
        Rect rect = this.A0L;
        A0E(rect);
        A0F(rect);
        AbstractC08110aU r0 = this.A0Q;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C08000aJ r1 = ((C08100aT) r0).A00;
        r1.A0C.set(i, i2, i3, i4);
        int i5 = r1.A02;
        r1.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public final void A09(float f) {
        this.A02 = f;
        Matrix matrix = this.A0K;
        A0B(f, matrix);
        this.A0P.setImageMatrix(matrix);
    }

    public void A0A(float f, float f2, float f3) {
        C08250ai r1 = this.A0H;
        if (r1 != null) {
            r1.A00(f, this.A03 + f);
            A08();
        }
    }

    public final void A0B(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.A0P.getDrawable();
        if (drawable != null && this.A06 != 0) {
            RectF rectF = this.A0M;
            RectF rectF2 = this.A0N;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.A06;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) this.A06) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }

    public void A0C(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable != null) {
            C002001d.A2b(drawable, C08220af.A01(colorStateList));
        }
    }

    public void A0D(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        GradientDrawable A032 = A03();
        A032.setShape(1);
        A032.setColor(-1);
        Drawable A0d = C002001d.A0d(A032);
        this.A0A = A0d;
        C002001d.A2b(A0d, colorStateList);
        if (mode != null) {
            C002001d.A2c(this.A0A, mode);
        }
        GradientDrawable A033 = A03();
        A033.setShape(1);
        A033.setColor(-1);
        Drawable A0d2 = C002001d.A0d(A033);
        this.A09 = A0d2;
        C002001d.A2b(A0d2, C08220af.A01(colorStateList2));
        if (i > 0) {
            C08230ag A052 = A05(i, colorStateList);
            this.A0G = A052;
            drawableArr = new Drawable[]{A052, this.A0A, this.A09};
        } else {
            this.A0G = null;
            drawableArr = new Drawable[]{this.A0A, this.A09};
        }
        this.A08 = new LayerDrawable(drawableArr);
        Context context = this.A0P.getContext();
        Drawable drawable = this.A08;
        C08000aJ r2 = ((C08100aT) this.A0Q).A00;
        float f = this.A00;
        C08250ai r3 = new C08250ai(context, drawable, ((float) r2.A02(r2.A04)) / 2.0f, f, f + this.A03);
        this.A0H = r3;
        r3.A06 = false;
        r3.invalidateSelf();
        C08120aV.super.setBackgroundDrawable(this.A0H);
    }

    public void A0E(Rect rect) {
        this.A0H.getPadding(rect);
    }

    public void A0G(int[] iArr) {
        C08170aa r1;
        ValueAnimator valueAnimator;
        C08130aW r6 = this.A0O;
        ArrayList arrayList = r6.A03;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                r1 = null;
                break;
            }
            r1 = (C08170aa) arrayList.get(i);
            if (StateSet.stateSetMatches(r1.A01, iArr)) {
                break;
            }
            i++;
        }
        C08170aa r0 = r6.A01;
        if (r1 != r0) {
            if (!(r0 == null || (valueAnimator = r6.A00) == null)) {
                valueAnimator.cancel();
                r6.A00 = null;
            }
            r6.A01 = r1;
            if (r1 != null) {
                ValueAnimator valueAnimator2 = r1.A00;
                r6.A00 = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }
}
