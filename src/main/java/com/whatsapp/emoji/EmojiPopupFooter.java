package com.whatsapp.emoji;

import X.AnonymousClass0Q7;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiPopupFooter extends FrameLayout {
    public int A00;

    public EmojiPopupFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getTopOffset() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass0Q7.A0U(this, this.A00);
    }

    public void setTopOffset(int i) {
        AnonymousClass0Q7.A0U(this, Math.max(Math.min(getHeight(), i), 0) - getTop());
        this.A00 = getTop();
    }
}
