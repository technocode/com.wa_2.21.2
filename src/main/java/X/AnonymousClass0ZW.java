package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.0ZW  reason: invalid class name */
public class AnonymousClass0ZW {
    public int A00 = -1;
    public C07660Za A01;
    public C07660Za A02;
    public C07660Za A03;
    public final View A04;
    public final C06340Sv A05;

    public AnonymousClass0ZW(View view) {
        this.A04 = view;
        this.A05 = C06340Sv.A01();
    }

    public ColorStateList A00() {
        C07660Za r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode A01() {
        C07660Za r0 = this.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void A02() {
        PorterDuff.Mode supportBackgroundTintMode;
        View view = this.A04;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.A02 != null) {
                C07660Za r1 = this.A03;
                if (r1 == null) {
                    r1 = new C07660Za();
                    this.A03 = r1;
                }
                r1.A00 = null;
                r1.A02 = false;
                r1.A01 = null;
                r1.A03 = false;
                ColorStateList A08 = AnonymousClass0Q7.A08(view);
                if (A08 != null) {
                    r1.A02 = true;
                    r1.A00 = A08;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    supportBackgroundTintMode = view.getBackgroundTintMode();
                } else {
                    if (view instanceof AbstractC05570Pf) {
                        supportBackgroundTintMode = ((AbstractC05570Pf) view).getSupportBackgroundTintMode();
                    }
                    if (r1.A02 || r1.A03) {
                        AnonymousClass0TZ.A02(background, r1, view.getDrawableState());
                        return;
                    }
                }
                if (supportBackgroundTintMode != null) {
                    r1.A03 = true;
                    r1.A01 = supportBackgroundTintMode;
                }
                AnonymousClass0TZ.A02(background, r1, view.getDrawableState());
                return;
            }
            C07660Za r12 = this.A01;
            if (r12 != null) {
                AnonymousClass0TZ.A02(background, r12, view.getDrawableState());
                return;
            }
            C07660Za r13 = this.A02;
            if (r13 != null) {
                AnonymousClass0TZ.A02(background, r13, view.getDrawableState());
            }
        }
    }

    public void A03() {
        this.A00 = -1;
        A05(null);
        A02();
    }

    public void A04(int i) {
        ColorStateList colorStateList;
        this.A00 = i;
        C06340Sv r1 = this.A05;
        if (r1 != null) {
            colorStateList = r1.A03(this.A04.getContext(), i);
        } else {
            colorStateList = null;
        }
        A05(colorStateList);
        A02();
    }

    public void A05(ColorStateList colorStateList) {
        if (colorStateList != null) {
            C07660Za r1 = this.A02;
            if (r1 == null) {
                r1 = new C07660Za();
                this.A02 = r1;
            }
            r1.A00 = colorStateList;
            r1.A02 = true;
        } else {
            this.A02 = null;
        }
        A02();
    }

    public void A06(ColorStateList colorStateList) {
        C07660Za r1 = this.A01;
        if (r1 == null) {
            r1 = new C07660Za();
            this.A01 = r1;
        }
        r1.A00 = colorStateList;
        r1.A02 = true;
        A02();
    }

    public void A07(PorterDuff.Mode mode) {
        C07660Za r1 = this.A01;
        if (r1 == null) {
            r1 = new C07660Za();
            this.A01 = r1;
        }
        r1.A01 = mode;
        r1.A03 = true;
        A02();
    }

    public void A08(AttributeSet attributeSet, int i) {
        View view = this.A04;
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(view.getContext(), attributeSet, AnonymousClass0T3.A0e, i);
        try {
            TypedArray typedArray = A002.A02;
            if (typedArray.hasValue(0)) {
                this.A00 = typedArray.getResourceId(0, -1);
                ColorStateList A032 = this.A05.A03(view.getContext(), this.A00);
                if (A032 != null) {
                    A05(A032);
                }
            }
            if (typedArray.hasValue(1)) {
                AnonymousClass0Q7.A0a(view, A002.A01(1));
            }
            if (typedArray.hasValue(2)) {
                AnonymousClass0Q7.A0b(view, AnonymousClass0WQ.A00(typedArray.getInt(2, -1), null));
            }
            typedArray.recycle();
        } catch (Throwable th) {
            A002.A02.recycle();
            throw th;
        }
    }
}
