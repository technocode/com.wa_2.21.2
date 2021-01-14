package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;

/* renamed from: X.1mq  reason: invalid class name and case insensitive filesystem */
public class C36771mq extends C24841Df {
    public int A00 = -1;
    public int A01;
    public int A02;
    public AnonymousClass1DQ A03;
    public AnonymousClass1DR A04 = new AnonymousClass1DR(this);
    public boolean A05 = false;
    public boolean A06;
    public final AnonymousClass1DO A07 = new AnonymousClass1DO(this);

    public C36771mq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray A002 = C08040aN.A00(context, attributeSet, C08030aM.A0K, R.attr.chipGroupStyle, 2131952433, new int[0]);
        int dimensionPixelOffset = A002.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(A002.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(A002.getDimensionPixelOffset(3, dimensionPixelOffset));
        super.A02 = A002.getBoolean(4, false);
        setSingleSelection(A002.getBoolean(5, false));
        int resourceId = A002.getResourceId(0, -1);
        if (resourceId != -1) {
            this.A00 = resourceId;
        }
        A002.recycle();
        super.setOnHierarchyChangeListener(this.A04);
    }

    public final void A00(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.A05 = true;
            ((CompoundButton) findViewById).setChecked(z);
            this.A05 = false;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i2 = this.A00;
                if (i2 != -1 && this.A06) {
                    A00(i2, false);
                }
                this.A00 = compoundButton.getId();
            }
        }
        super.addView(view, i, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof AnonymousClass1DP);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1DP();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1DP(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass1DP(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.A06) {
            return this.A00;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.A01;
    }

    public int getChipSpacingVertical() {
        return this.A02;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            A00(i, true);
            this.A00 = this.A00;
        }
    }

    public static void setCheckedId(C36771mq r0, int i) {
        r0.A00 = i;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            super.A00 = i;
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            super.A01 = i;
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(AnonymousClass1DQ r1) {
        this.A03 = r1;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A04.A00 = onHierarchyChangeListener;
    }

    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        super.A02 = getResources().getBoolean(i);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            this.A05 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((CompoundButton) childAt).setChecked(false);
                }
            }
            this.A05 = false;
            this.A00 = -1;
        }
    }
}
