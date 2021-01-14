package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0VS  reason: invalid class name */
public abstract class AnonymousClass0VS {
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public final Rect A01 = new Rect();
    public final AnonymousClass0VT A02;

    public AnonymousClass0VS(AnonymousClass0VT r2) {
        this.A02 = r2;
    }

    public static AnonymousClass0VS A00(AnonymousClass0VT r1, int i) {
        if (i == 0) {
            return new C30531bV(r1);
        }
        if (i == 1) {
            return new C30541bW(r1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public int A01() {
        if (!(this instanceof C30541bW)) {
            return this.A02.A03;
        }
        return this.A02.A00;
    }

    public int A02() {
        if (!(this instanceof C30541bW)) {
            AnonymousClass0VT r0 = this.A02;
            return r0.A03 - r0.A0E();
        }
        AnonymousClass0VT r02 = this.A02;
        return r02.A00 - r02.A0C();
    }

    public int A03() {
        if (!(this instanceof C30541bW)) {
            return this.A02.A04;
        }
        return this.A02.A01;
    }

    public int A04() {
        if (!(this instanceof C30541bW)) {
            return this.A02.A0D();
        }
        return this.A02.A0F();
    }

    public int A05() {
        if (!(this instanceof C30541bW)) {
            AnonymousClass0VT r2 = this.A02;
            return (r2.A03 - r2.A0D()) - r2.A0E();
        }
        AnonymousClass0VT r22 = this.A02;
        return (r22.A00 - r22.A0F()) - r22.A0C();
    }

    public int A06(View view) {
        if (!(this instanceof C30541bW)) {
            return AnonymousClass0VT.A04(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
        }
        return AnonymousClass0VT.A02(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public int A07(View view) {
        if (!(this instanceof C30541bW)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            Rect rect = ((C16410pl) view.getLayoutParams()).A03;
            return view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect2 = ((C16410pl) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect2.top + rect2.bottom + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
    }

    public int A08(View view) {
        if (!(this instanceof C30541bW)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            Rect rect = ((C16410pl) view.getLayoutParams()).A03;
            return view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect2 = ((C16410pl) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect2.left + rect2.right + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
    }

    public int A09(View view) {
        if (!(this instanceof C30541bW)) {
            return AnonymousClass0VT.A03(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
        }
        return AnonymousClass0VT.A05(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    public int A0A(View view) {
        if (!(this instanceof C30541bW)) {
            AnonymousClass0VT r1 = this.A02;
            Rect rect = this.A01;
            r1.A0S(view, rect);
            return rect.right;
        }
        AnonymousClass0VT r12 = this.A02;
        Rect rect2 = this.A01;
        r12.A0S(view, rect2);
        return rect2.bottom;
    }

    public int A0B(View view) {
        if (!(this instanceof C30541bW)) {
            AnonymousClass0VT r1 = this.A02;
            Rect rect = this.A01;
            r1.A0S(view, rect);
            return rect.left;
        }
        AnonymousClass0VT r12 = this.A02;
        Rect rect2 = this.A01;
        r12.A0S(view, rect2);
        return rect2.top;
    }

    public void A0C(int i) {
        if (!(this instanceof C30541bW)) {
            this.A02.A0m(i);
        } else {
            this.A02.A0n(i);
        }
    }
}
