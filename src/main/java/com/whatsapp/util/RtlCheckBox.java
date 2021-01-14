package com.whatsapp.util;

import X.AnonymousClass01X;
import X.AnonymousClass367;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class RtlCheckBox extends AppCompatCheckBox {
    public int A00;
    public int A01;
    public Drawable A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode() && this.A03.A02().A06) {
            setBackgroundDrawable(null);
            this.A00 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            this.A01 = paddingRight;
            int min = Math.min(this.A00, paddingRight);
            setPadding(min, getPaddingTop(), min, getPaddingBottom());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox
    public int getCompoundPaddingLeft() {
        if (isInEditMode() || AnonymousClass01X.A00().A0M()) {
            return super.getCompoundPaddingLeft();
        }
        return super.getPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (isInEditMode() || AnonymousClass01X.A00().A0M()) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.A02;
        return drawable != null ? paddingRight + Math.max(this.A00, drawable.getIntrinsicWidth()) : paddingRight;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.A03.A02().A06 && this.A02 != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.A02.getIntrinsicHeight();
            int intrinsicWidth = this.A02.getIntrinsicWidth();
            int i = 0;
            if (gravity == 16) {
                i = (getHeight() - intrinsicHeight) >> 1;
            } else if (gravity == 80) {
                i = getHeight() - intrinsicHeight;
            }
            int width = getWidth() - intrinsicWidth;
            int width2 = getWidth();
            this.A02.setBounds(width, i, width2, intrinsicHeight + i);
            this.A02.draw(canvas);
        }
    }

    @Override // android.widget.CompoundButton, androidx.appcompat.widget.AppCompatCheckBox
    public void setButtonDrawable(Drawable drawable) {
        if (isInEditMode() || AnonymousClass01X.A00().A0M()) {
            super.setButtonDrawable(drawable);
            return;
        }
        this.A02 = drawable;
        super.setButtonDrawable(new AnonymousClass367(drawable));
    }
}
