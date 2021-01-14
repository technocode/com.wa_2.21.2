package androidx.appcompat.widget;

import X.AbstractC06110Rt;
import X.AbstractC06350Sx;
import X.AnonymousClass05p;
import X.AnonymousClass0T3;
import X.AnonymousClass0T8;
import X.AnonymousClass0TU;
import X.AnonymousClass0V6;
import X.AnonymousClass1ZM;
import X.AnonymousClass1ZO;
import X.AnonymousClass1Za;
import X.AnonymousClass23R;
import X.C06360Sy;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;

public class ActionBarContextView extends AbstractC06350Sx {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public CharSequence A08;
    public CharSequence A09;
    public boolean A0A;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A04, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = AnonymousClass05p.A01(context, resourceId);
        }
        setBackground(drawable);
        this.A02 = obtainStyledAttributes.getResourceId(5, 0);
        this.A01 = obtainStyledAttributes.getResourceId(4, 0);
        super.A00 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.A00 = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void A04() {
        if (this.A05 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A05 = linearLayout;
            this.A07 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A06 = (TextView) this.A05.findViewById(R.id.action_bar_subtitle);
            if (this.A02 != 0) {
                this.A07.setTextAppearance(getContext(), this.A02);
            }
            if (this.A01 != 0) {
                this.A06.setTextAppearance(getContext(), this.A01);
            }
        }
        this.A07.setText(this.A09);
        this.A06.setText(this.A08);
        boolean z = !TextUtils.isEmpty(this.A09);
        boolean z2 = !TextUtils.isEmpty(this.A08);
        TextView textView = this.A06;
        int i = 0;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout2 = this.A05;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.A05.getParent() == null) {
            addView(this.A05);
        }
    }

    public void A05(AbstractC06110Rt r8) {
        AnonymousClass0T8 r2;
        View view = this.A03;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.A00, (ViewGroup) this, false);
            this.A03 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.A03);
        }
        this.A03.findViewById(R.id.action_mode_close_button).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(r8));
        if (!(r8 instanceof AnonymousClass1ZM)) {
            r2 = ((AnonymousClass0V6) r8).A03;
        } else {
            r2 = ((AnonymousClass1ZM) r8).A02;
        }
        AnonymousClass23R r0 = super.A01;
        if (r0 != null) {
            r0.A01();
            AnonymousClass1Za r02 = r0.A06;
            if (r02 != null) {
                r02.A01();
            }
        }
        AnonymousClass23R r03 = new AnonymousClass23R(getContext());
        super.A01 = r03;
        r03.A0D = true;
        r03.A0E = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        r2.A0C(super.A01, super.A06);
        AnonymousClass23R r3 = super.A01;
        AnonymousClass0TU r22 = ((AnonymousClass1ZO) r3).A07;
        if (r22 == null) {
            AnonymousClass0TU r1 = (AnonymousClass0TU) ((AnonymousClass1ZO) r3).A04.inflate(((AnonymousClass1ZO) r3).A01, (ViewGroup) this, false);
            ((AnonymousClass1ZO) r3).A07 = r1;
            r1.AAm(((AnonymousClass1ZO) r3).A05);
            r3.AQr(true);
        }
        AnonymousClass0TU r12 = ((AnonymousClass1ZO) r3).A07;
        if (r22 != r12) {
            ((ActionMenuView) r12).setPresenter(r3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) r12;
        super.A02 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(super.A02, layoutParams);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getSubtitle() {
        return this.A08;
    }

    public CharSequence getTitle() {
        return this.A09;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass23R r0 = super.A01;
        if (r0 != null) {
            r0.A01();
            AnonymousClass1Za r02 = super.A01.A06;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.A09);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean A012 = C06360Sy.A01(this);
        if (A012) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.A03;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
            if (A012) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A002 = i6 + AbstractC06350Sx.A00(this.A03, i6, paddingTop, paddingTop2, A012);
            if (A012) {
                paddingLeft = A002 - i5;
            } else {
                paddingLeft = A002 + i5;
            }
        }
        LinearLayout linearLayout = this.A05;
        if (!(linearLayout == null || this.A04 != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += AbstractC06350Sx.A00(this.A05, paddingLeft, paddingTop, paddingTop2, A012);
        }
        View view2 = this.A04;
        if (view2 != null) {
            AbstractC06350Sx.A00(view2, paddingLeft, paddingTop, paddingTop2, A012);
        }
        if (A012) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = super.A02;
        if (actionMenuView != null) {
            AbstractC06350Sx.A00(actionMenuView, paddingRight, paddingTop, paddingTop2, !A012);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append("ActionBarContextView");
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = super.A00;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            View view = this.A03;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, EditorInfoCompat.IME_FLAG_FORCE_ASCII), makeMeasureSpec);
                int max = Math.max(0, (paddingLeft - view.getMeasuredWidth()) - 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
                paddingLeft = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = super.A02;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                ActionMenuView actionMenuView2 = super.A02;
                actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, EditorInfoCompat.IME_FLAG_FORCE_ASCII), makeMeasureSpec);
                paddingLeft = Math.max(0, (paddingLeft - actionMenuView2.getMeasuredWidth()) - 0);
            }
            LinearLayout linearLayout = this.A05;
            if (linearLayout != null && this.A04 == null) {
                if (this.A0A) {
                    this.A05.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.A05.getMeasuredWidth();
                    boolean z = false;
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.A05;
                    int i6 = 8;
                    if (z) {
                        i6 = 0;
                    }
                    linearLayout2.setVisibility(i6);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, EditorInfoCompat.IME_FLAG_FORCE_ASCII), makeMeasureSpec);
                    paddingLeft = Math.max(0, (paddingLeft - linearLayout.getMeasuredWidth()) - 0);
                }
            }
            View view2 = this.A04;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                if (i7 != -2) {
                    i8 = 1073741824;
                }
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else if (i9 >= 0) {
                    i5 = Math.min(i9, i5);
                }
                this.A04.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (super.A00 <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ActionBarContextView");
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    @Override // X.AbstractC06350Sx
    public void setContentHeight(int i) {
        super.A00 = i;
    }

    public void setCustomView(View view) {
        View view2 = this.A04;
        if (view2 != null) {
            removeView(view2);
        }
        this.A04 = view;
        if (view != null) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A05 = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A04();
    }

    public void setTitle(CharSequence charSequence) {
        this.A09 = charSequence;
        A04();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A0A) {
            requestLayout();
        }
        this.A0A = z;
    }
}
