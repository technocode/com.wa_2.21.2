package X;

import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.1n6  reason: invalid class name and case insensitive filesystem */
public final class C36901n6 extends AbstractC24951Dr {
    public static final int[] A02 = {R.attr.snackbarButtonStyle};
    public boolean A00;
    public final AccessibilityManager A01;

    public C36901n6(ViewGroup viewGroup, View view, AnonymousClass1Ds r5) {
        super(viewGroup, view, r5);
        this.A01 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static C36901n6 A00(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (!(view instanceof FrameLayout)) {
                    if (view == null) {
                        break;
                    }
                } else if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                } else {
                    viewGroup2 = (ViewGroup) view;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    if (view == null) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        viewGroup = viewGroup2;
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(A02);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            int i2 = R.layout.design_layout_snackbar_include;
            if (resourceId != -1) {
                i2 = R.layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            C36901n6 r1 = new C36901n6(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) r1.A05.getChildAt(0)).A03.setText(charSequence);
            ((AbstractC24951Dr) r1).A00 = i;
            return r1;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public void A04() {
        int i;
        AnonymousClass1Dw A002 = AnonymousClass1Dw.A00();
        if (!this.A00 || !this.A01.isTouchExplorationEnabled()) {
            i = super.A00;
        } else {
            i = -2;
        }
        AbstractC24961Du r5 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r5)) {
                AnonymousClass1Dv r1 = A002.A00;
                r1.A00 = i;
                A002.A02.removeCallbacksAndMessages(r1);
                A002.A04(A002.A00);
                return;
            }
            AnonymousClass1Dv r2 = A002.A01;
            boolean z = false;
            if (!(r2 == null || r5 == null || r2.A02.get() != r5)) {
                z = true;
            }
            if (z) {
                r2.A00 = i;
            } else {
                A002.A01 = new AnonymousClass1Dv(i, r5);
            }
            AnonymousClass1Dv r12 = A002.A00;
            if (r12 == null || !A002.A06(r12, 4)) {
                A002.A00 = null;
                A002.A01();
            }
        }
    }

    public void A05(int i) {
        ((SnackbarContentLayout) this.A05.getChildAt(0)).A02.setTextColor(i);
    }

    public void A06(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.A05.getChildAt(0)).A02;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.A00 = false;
            return;
        }
        this.A00 = true;
        button.setVisibility(0);
        button.setText(charSequence);
        button.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, onClickListener, 1));
    }
}
