package com.whatsapp.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public final class AutoOrientationLinearLayout extends LinearLayout {
    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        post(new RunnableEBaseShape8S0100000_I1_3(this, 41));
    }
}
