package com.whatsapp.payments.ui.widget;

import X.AnonymousClass01X;
import X.C61212so;
import X.EnumC63582wf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.BidiToolbar;
import com.whatsapp.WaImageView;

public class PayToolbar extends BidiToolbar {
    public View A00;
    public FrameLayout A01;
    public TextView A02;
    public WaImageView A03;
    public AnonymousClass01X A04;
    public EnumC63582wf A05;

    public void setOnLockClicked(View.OnClickListener onClickListener) {
    }

    public PayToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EnumC63582wf r1;
        if (this.A04 == null) {
            this.A04 = AnonymousClass01X.A00();
        }
        LayoutInflater.from(getContext()).inflate(R.layout.pay_header, (ViewGroup) this, true);
        if (attributeSet != null && !isInEditMode()) {
            int i = 0;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C61212so.A1f, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                setContentDescription(this.A04.A06(resourceId));
            }
            findViewById(R.id.back).setVisibility(obtainStyledAttributes.getBoolean(0, false) ? 0 : 8);
            int i2 = obtainStyledAttributes.getInt(3, -1);
            if (i2 >= 0) {
                EnumC63582wf[] values = EnumC63582wf.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        r1 = null;
                        break;
                    }
                    r1 = values[i];
                    if (r1.ordinal() == i2) {
                        break;
                    }
                    i++;
                }
                this.A05 = r1;
            }
            this.A02 = (TextView) findViewById(R.id.title);
            this.A01 = (FrameLayout) findViewById(R.id.title_layout);
            this.A03 = (WaImageView) findViewById(R.id.fbpay_logo);
            this.A00 = findViewById(R.id.lock);
            setLockIconVisibility(obtainStyledAttributes.getBoolean(1, true));
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, com.whatsapp.BidiToolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.A01;
        int i9 = 0;
        if (frameLayout != null && frameLayout.getVisibility() != 8 && this.A05 != null) {
            int width = getWidth();
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            int i10 = width - paddingRight;
            int i11 = height - paddingBottom;
            FrameLayout frameLayout2 = this.A01;
            int i12 = -1;
            if (frameLayout2 == null) {
                i7 = -1;
            } else {
                int measuredWidth = frameLayout2.getMeasuredWidth();
                if (frameLayout2.getLayoutParams() != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                    i6 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                i7 = measuredWidth + i6 + i5;
            }
            FrameLayout frameLayout3 = this.A01;
            if (frameLayout3 != null) {
                int measuredHeight = frameLayout3.getMeasuredHeight();
                if (frameLayout3.getLayoutParams() != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout3.getLayoutParams();
                    i9 = marginLayoutParams2.topMargin;
                    i8 = marginLayoutParams2.bottomMargin;
                } else {
                    i8 = 0;
                }
                i12 = measuredHeight + i9 + i8;
            }
            if (this.A05.ordinal() == 1) {
                int i13 = height >> 1;
                int i14 = i12 >> 1;
                int i15 = paddingLeft - currentContentInsetLeft;
                paddingLeft = Math.max(i15, ((width >> 1) + i15) - (i7 >> 1));
                i10 = Math.min(i10 - currentContentInsetRight, i7 + paddingLeft);
                paddingTop = Math.max(paddingTop, i13 - i14);
                i11 = Math.min(i11, i13 + i14);
            }
            this.A01.layout(paddingLeft, paddingTop, i10, i11);
        }
    }

    public void setLockIconVisibility(boolean z) {
        int i;
        View view = this.A00;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01.getLayoutParams();
        if (z) {
            i = getContext().getResources().getDimensionPixelOffset(R.dimen.fb_pay_toolbar_overflow_offset);
        } else {
            i = 0;
        }
        marginLayoutParams.setMargins(0, 0, i, 0);
        this.A01.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogo(int i) {
        this.A02.setVisibility(8);
        this.A03.setVisibility(0);
        this.A03.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogo(Drawable drawable) {
        this.A02.setVisibility(8);
        this.A03.setVisibility(0);
        this.A03.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar, com.whatsapp.util.MarqueeToolbar
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null || !this.A04.A06(R.string.facebook_pay).equalsIgnoreCase(charSequence.toString())) {
            this.A03.setVisibility(8);
            this.A02.setText(charSequence);
            this.A02.setVisibility(0);
            return;
        }
        this.A02.setVisibility(8);
        this.A03.setVisibility(0);
    }
}
