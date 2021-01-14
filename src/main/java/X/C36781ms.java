package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.1ms  reason: invalid class name and case insensitive filesystem */
public class C36781ms extends C08120aV {
    public InsetDrawable A00;

    @Override // X.C08120aV
    public void A06() {
    }

    @Override // X.C08120aV
    public boolean A0H() {
        return false;
    }

    public C36781ms(C08010aK r1, AbstractC08110aU r2) {
        super(r1, r2);
    }

    @Override // X.C08120aV
    public float A01() {
        return this.A0P.getElevation();
    }

    @Override // X.C08120aV
    public GradientDrawable A03() {
        return new AnonymousClass1Db();
    }

    @Override // X.C08120aV
    public C08230ag A04() {
        return new C36791mt();
    }

    @Override // X.C08120aV
    public void A07() {
        A08();
    }

    @Override // X.C08120aV
    public void A0A(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.A0P.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C08120aV.A0X, A0I(f, f3));
            stateListAnimator.addState(C08120aV.A0W, A0I(f, f2));
            stateListAnimator.addState(C08120aV.A0U, A0I(f, f2));
            stateListAnimator.addState(C08120aV.A0V, A0I(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            C08010aK r6 = this.A0P;
            arrayList.add(ObjectAnimator.ofFloat(r6, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(r6, View.TRANSLATION_Z, r6.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(r6, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C08120aV.A0R);
            stateListAnimator.addState(C08120aV.A0T, animatorSet);
            stateListAnimator.addState(C08120aV.A0S, A0I(0.0f, 0.0f));
            r6.setStateListAnimator(stateListAnimator);
        }
        if (((C08100aT) this.A0Q).A00.A0B) {
            A08();
        }
    }

    @Override // X.C08120aV
    public void A0C(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C08220af.A01(colorStateList));
        } else if (drawable != null) {
            C002001d.A2b(drawable, C08220af.A01(colorStateList));
        }
    }

    @Override // X.C08120aV
    public void A0D(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        GradientDrawable A03 = A03();
        A03.setShape(1);
        A03.setColor(-1);
        Drawable A0d = C002001d.A0d(A03);
        this.A0A = A0d;
        C002001d.A2b(A0d, colorStateList);
        if (mode != null) {
            C002001d.A2c(this.A0A, mode);
        }
        if (i > 0) {
            C08230ag A05 = A05(i, colorStateList);
            this.A0G = A05;
            drawable = new LayerDrawable(new Drawable[]{A05, this.A0A});
        } else {
            this.A0G = null;
            drawable = this.A0A;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C08220af.A01(colorStateList2), drawable, null);
        this.A09 = rippleDrawable;
        this.A08 = rippleDrawable;
        C36781ms.super.setBackgroundDrawable(rippleDrawable);
    }

    @Override // X.C08120aV
    public void A0E(Rect rect) {
        C08000aJ r2 = ((C08100aT) this.A0Q).A00;
        if (r2.A0B) {
            r2.A02(r2.A04);
            float elevation = this.A0P.getElevation() + this.A03;
            int ceil = (int) Math.ceil((double) elevation);
            int ceil2 = (int) Math.ceil((double) (elevation * 1.5f));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // X.C08120aV
    public void A0F(Rect rect) {
        C08000aJ r1 = ((C08100aT) this.A0Q).A00;
        if (r1.A0B) {
            InsetDrawable insetDrawable = new InsetDrawable(this.A09, rect.left, rect.top, rect.right, rect.bottom);
            this.A00 = insetDrawable;
            C36781ms.super.setBackgroundDrawable(insetDrawable);
            return;
        }
        C36781ms.super.setBackgroundDrawable(this.A09);
    }

    @Override // X.C08120aV
    public void A0G(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            C08010aK r2 = this.A0P;
            if (r2.isEnabled()) {
                r2.setElevation(super.A00);
                if (r2.isPressed()) {
                    r2.setTranslationZ(this.A03);
                } else if (r2.isFocused() || r2.isHovered()) {
                    r2.setTranslationZ(this.A01);
                } else {
                    r2.setTranslationZ(0.0f);
                }
            } else {
                r2.setElevation(0.0f);
                r2.setTranslationZ(0.0f);
            }
        }
    }

    public final Animator A0I(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        C08010aK r7 = this.A0P;
        animatorSet.play(ObjectAnimator.ofFloat(r7, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(r7, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C08120aV.A0R);
        return animatorSet;
    }
}
