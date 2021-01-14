package com.whatsapp.contact.picker;

import X.AbstractC47082Gj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class SharedTextPreviewScrollView extends ScrollView {
    public AbstractC47082Gj A00;
    public boolean A01;
    public boolean A02;

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void fling(int i) {
        super.fling(i);
        this.A01 = true;
    }

    public AbstractC47082Gj getOnEndScrollListener() {
        return this.A00;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.A01 && this.A02) {
            return;
        }
        if (((float) Math.abs(i2 - i4)) < 1.0f || i2 >= getMeasuredHeight() || i2 == 0) {
            AbstractC47082Gj r0 = this.A00;
            if (r0 != null) {
                r0.AFV();
            }
            this.A01 = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.A02 = false;
            if (!this.A01) {
                this.A00.AFV();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            this.A02 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnEndScrollListener(AbstractC47082Gj r1) {
        this.A00 = r1;
    }
}
