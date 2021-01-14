package com.google.android.material.internal;

import X.AbstractC13070jY;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q0;
import X.AnonymousClass0Q7;
import X.AnonymousClass1ZT;
import X.C002001d;
import X.C36801mu;
import X.C36811mv;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

public class NavigationMenuItemView extends C36801mu implements AbstractC13070jY {
    public static final int[] A0A = {16842912};
    public ColorStateList A00;
    public Drawable A01;
    public FrameLayout A02;
    public AnonymousClass1ZT A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final CheckedTextView A08;
    public final AnonymousClass0Q0 A09 = new C36811mv(this);

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.A08 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AnonymousClass0Q7.A0d(this.A08, this.A09);
    }

    @Override // X.AbstractC13070jY
    public void AAn(AnonymousClass1ZT r8, int i) {
        StateListDrawable stateListDrawable;
        this.A03 = r8;
        int i2 = 8;
        if (r8.isVisible()) {
            i2 = 0;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(A0A, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(r8.isCheckable());
        setChecked(r8.isChecked());
        setEnabled(r8.isEnabled());
        setTitle(r8.A0I);
        setIcon(r8.getIcon());
        setActionView(r8.getActionView());
        setContentDescription(r8.A0H);
        AnonymousClass0N2.A19(this, r8.A0K);
        AnonymousClass1ZT r1 = this.A03;
        if (r1.A0I == null && r1.getIcon() == null && this.A03.getActionView() != null) {
            this.A08.setVisibility(8);
            FrameLayout frameLayout = this.A02;
            if (frameLayout != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                marginLayoutParams.width = -1;
                this.A02.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        this.A08.setVisibility(0);
        FrameLayout frameLayout2 = this.A02;
        if (frameLayout2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
            marginLayoutParams2.width = -2;
            this.A02.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // X.AbstractC13070jY
    public AnonymousClass1ZT getItemData() {
        return this.A03;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        AnonymousClass1ZT r1 = this.A03;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, A0A);
        }
        return onCreateDrawableState;
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
                this.A02 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A02.addView(view);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A04 != z) {
            this.A04 = z;
            this.A09.A00(this.A08, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A08.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A05) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C002001d.A0d(drawable).mutate();
                C002001d.A2b(drawable, this.A00);
            }
            int i = this.A07;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A06) {
            if (this.A01 == null) {
                Drawable A0c = C002001d.A0c(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.A01 = A0c;
                if (A0c != null) {
                    int i2 = this.A07;
                    A0c.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.A01;
        }
        AnonymousClass0N2.A1N(this.A08, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.A08.setCompoundDrawablePadding(i);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A00 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        this.A05 = z;
        AnonymousClass1ZT r0 = this.A03;
        if (r0 != null) {
            setIcon(r0.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A06 = z;
    }

    public void setTextAppearance(int i) {
        AnonymousClass0N2.A1K(this.A08, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A08.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A08.setText(charSequence);
    }
}
