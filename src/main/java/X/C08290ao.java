package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0;
import com.google.android.search.verification.client.R;

/* renamed from: X.0ao  reason: invalid class name and case insensitive filesystem */
public class C08290ao implements AnonymousClass0TD {
    public int A00 = 0;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public AnonymousClass23R A08;
    public Toolbar A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;

    public C08290ao(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.A09 = toolbar;
        CharSequence charSequence = toolbar.A0V;
        this.A0C = charSequence;
        this.A0B = toolbar.A0U;
        this.A0E = charSequence != null;
        this.A05 = toolbar.getNavigationIcon();
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(toolbar.getContext(), null, AnonymousClass0T3.A00, R.attr.actionBarStyle);
        this.A02 = A002.A02(15);
        if (z) {
            TypedArray typedArray = A002.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                APC(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                AP7(text2);
            }
            Drawable A022 = A002.A02(20);
            if (A022 != null) {
                this.A04 = A022;
                A02();
            }
            Drawable A023 = A002.A02(17);
            if (A023 != null) {
                this.A03 = A023;
                A02();
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                this.A05 = drawable;
                A01();
            }
            AOC(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                AOA(LayoutInflater.from(this.A09.getContext()).inflate(resourceId, (ViewGroup) this.A09, false));
                AOC(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                Toolbar toolbar2 = this.A09;
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar2.A0A();
                toolbar2.A0P.A00(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar3 = this.A09;
                Context context = toolbar3.getContext();
                toolbar3.A0B = resourceId2;
                TextView textView = toolbar3.mTitleTextView;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar4 = this.A09;
                Context context2 = toolbar4.getContext();
                toolbar4.A06 = resourceId3;
                TextView textView2 = toolbar4.A0K;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A09.setPopupTheme(resourceId4);
            }
        } else {
            int i = 11;
            if (this.A09.getNavigationIcon() != null) {
                i = 15;
                this.A02 = this.A09.getNavigationIcon();
            }
            this.A01 = i;
        }
        A002.A02.recycle();
        if (R.string.abc_action_bar_up_description != this.A00) {
            this.A00 = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.A09.getNavigationContentDescription())) {
                this.A0A = getContext().getString(R.string.abc_action_bar_up_description);
                A00();
            }
        }
        this.A0A = this.A09.getNavigationContentDescription();
        this.A09.setNavigationOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this));
    }

    public final void A00() {
        if ((this.A01 & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.A0A)) {
            this.A09.setNavigationContentDescription(this.A00);
        } else {
            this.A09.setNavigationContentDescription(this.A0A);
        }
    }

    public final void A01() {
        if ((this.A01 & 4) != 0) {
            Toolbar toolbar = this.A09;
            Drawable drawable = this.A05;
            if (drawable == null) {
                drawable = this.A02;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.A09.setNavigationIcon((Drawable) null);
    }

    public final void A02() {
        Drawable drawable;
        int i = this.A01;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.A04;
            if (drawable == null) {
                drawable = this.A03;
            }
        } else {
            drawable = this.A03;
        }
        this.A09.setLogo(drawable);
    }

    @Override // X.AnonymousClass0TD
    public boolean A2V() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.A09;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.A0O) != null && actionMenuView.A0B;
    }

    @Override // X.AnonymousClass0TD
    public void A2p() {
        AnonymousClass1ZT r0;
        C29671Zy r02 = this.A09.A0Q;
        if (r02 != null && (r0 = r02.A01) != null) {
            r0.collapseActionView();
        }
    }

    @Override // X.AnonymousClass0TD
    public void A3o() {
        AnonymousClass23R r0;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView != null && (r0 = actionMenuView.A08) != null) {
            r0.A01();
            AnonymousClass1Za r02 = r0.A06;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    @Override // X.AnonymousClass0TD
    public int A65() {
        return this.A01;
    }

    @Override // X.AnonymousClass0TD
    public Menu A7N() {
        return this.A09.getMenu();
    }

    @Override // X.AnonymousClass0TD
    public int A7c() {
        return 0;
    }

    @Override // X.AnonymousClass0TD
    public ViewGroup A9m() {
        return this.A09;
    }

    @Override // X.AnonymousClass0TD
    public boolean AAI() {
        C29671Zy r0 = this.A09.A0Q;
        return (r0 == null || r0.A01 == null) ? false : true;
    }

    @Override // X.AnonymousClass0TD
    public boolean AAS() {
        AnonymousClass23R r0;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A01()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0TD
    public void AAi() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // X.AnonymousClass0TD
    public void AAj() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // X.AnonymousClass0TD
    public boolean ABN() {
        AnonymousClass23R r1;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView == null || (r1 = actionMenuView.A08) == null) {
            return false;
        }
        if (r1.A0A != null || r1.A02()) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass0TD
    public boolean ABO() {
        AnonymousClass23R r0;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A02()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0TD
    public void ANx(Drawable drawable) {
        this.A09.setBackground(drawable);
    }

    @Override // X.AnonymousClass0TD
    public void AO2(boolean z) {
        this.A09.setCollapsible(z);
    }

    @Override // X.AnonymousClass0TD
    public void AOA(View view) {
        View view2 = this.A06;
        if (!(view2 == null || (this.A01 & 16) == 0)) {
            this.A09.removeView(view2);
        }
        this.A06 = view;
        if (view != null && (this.A01 & 16) != 0) {
            this.A09.addView(view);
        }
    }

    @Override // X.AnonymousClass0TD
    public void AOC(int i) {
        View view;
        int i2 = this.A01 ^ i;
        this.A01 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    A00();
                }
                A01();
            }
            if ((i2 & 3) != 0) {
                A02();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.A09.setTitle(this.A0C);
                    this.A09.setSubtitle(this.A0B);
                } else {
                    this.A09.setTitle((CharSequence) null);
                    this.A09.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.A06) != null) {
                if ((i & 16) != 0) {
                    this.A09.addView(view);
                } else {
                    this.A09.removeView(view);
                }
            }
        }
    }

    @Override // X.AnonymousClass0TD
    public void AOE(C13390kA r1) {
    }

    @Override // X.AnonymousClass0TD
    public void AOK(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(getContext(), i);
        } else {
            drawable = null;
        }
        this.A03 = drawable;
        A02();
    }

    @Override // X.AnonymousClass0TD
    public void AOL(Drawable drawable) {
        this.A03 = drawable;
        A02();
    }

    @Override // X.AnonymousClass0TD
    public void AOS(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(getContext(), i);
        } else {
            drawable = null;
        }
        this.A04 = drawable;
        A02();
    }

    @Override // X.AnonymousClass0TD
    public void AOY(AnonymousClass0TR r2, AnonymousClass0MX r3) {
        Toolbar toolbar = this.A09;
        toolbar.A0M = r2;
        toolbar.A0L = r3;
        ActionMenuView actionMenuView = toolbar.A0O;
        if (actionMenuView != null) {
            actionMenuView.A07 = r2;
            actionMenuView.A05 = r3;
        }
    }

    @Override // X.AnonymousClass0TD
    public void AOZ() {
        this.A0D = true;
    }

    @Override // X.AnonymousClass0TD
    public void AOd(Drawable drawable) {
        this.A05 = drawable;
        A01();
    }

    @Override // X.AnonymousClass0TD
    public void AP7(CharSequence charSequence) {
        this.A0B = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setSubtitle(charSequence);
        }
    }

    @Override // X.AnonymousClass0TD
    public void APC(CharSequence charSequence) {
        this.A0E = true;
        this.A0C = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setTitle(charSequence);
        }
    }

    @Override // X.AnonymousClass0TD
    public void APK(int i) {
        this.A09.setVisibility(i);
    }

    @Override // X.AnonymousClass0TD
    public C06330Su APU(int i, long j) {
        C06330Su A0E2 = AnonymousClass0Q7.A0E(this.A09);
        float f = 0.0f;
        if (i == 0) {
            f = 1.0f;
        }
        A0E2.A02(f);
        A0E2.A04(j);
        AnonymousClass23V r1 = new AnonymousClass23V(this, i);
        View view = (View) A0E2.A01.get();
        if (view != null) {
            A0E2.A05(view, r1);
        }
        return A0E2;
    }

    @Override // X.AnonymousClass0TD
    public boolean APs() {
        AnonymousClass23R r0;
        ActionMenuView actionMenuView = this.A09.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A03()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0TD
    public Context getContext() {
        return this.A09.getContext();
    }

    @Override // X.AnonymousClass0TD
    public CharSequence getTitle() {
        return this.A09.A0V;
    }

    @Override // X.AnonymousClass0TD
    public void setMenu(Menu menu, AnonymousClass0TR r9) {
        AnonymousClass1ZT r0;
        AnonymousClass23R r4 = this.A08;
        if (r4 == null) {
            r4 = new AnonymousClass23R(this.A09.getContext());
            this.A08 = r4;
        }
        ((AnonymousClass1ZO) r4).A06 = r9;
        Toolbar toolbar = this.A09;
        AnonymousClass0T8 r8 = (AnonymousClass0T8) menu;
        if (r8 != null || toolbar.A0O != null) {
            toolbar.A0C();
            AnonymousClass0T8 r1 = toolbar.A0O.A06;
            if (r1 != r8) {
                if (r1 != null) {
                    r1.A0B(toolbar.A0N);
                    r1.A0B(toolbar.A0Q);
                }
                if (toolbar.A0Q == null) {
                    toolbar.A0Q = new C29671Zy(toolbar);
                }
                r4.A0B = true;
                if (r8 != null) {
                    r8.A0C(r4, toolbar.A0C);
                    r8.A0C(toolbar.A0Q, toolbar.A0C);
                } else {
                    r4.AAh(toolbar.A0C, null);
                    C29671Zy r2 = toolbar.A0Q;
                    AnonymousClass0T8 r12 = r2.A00;
                    if (!(r12 == null || (r0 = r2.A01) == null)) {
                        r12.A0L(r0);
                    }
                    r2.A00 = null;
                    r4.AQr(true);
                    toolbar.A0Q.AQr(true);
                }
                toolbar.A0O.setPopupTheme(toolbar.A05);
                toolbar.A0O.setPresenter(r4);
                toolbar.A0N = r4;
            }
        }
    }

    @Override // X.AnonymousClass0TD
    public void setWindowCallback(Window.Callback callback) {
        this.A07 = callback;
    }

    @Override // X.AnonymousClass0TD
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.A0E) {
            this.A0C = charSequence;
            if ((this.A01 & 8) != 0) {
                this.A09.setTitle(charSequence);
            }
        }
    }
}
