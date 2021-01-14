package com.whatsapp.components;

import X.C46832Fb;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimatingArrowsLayout extends LinearLayout {
    public List A00;
    public final AnimatorSet A01 = new AnimatorSet();

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01.start();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.A01;
        animatorSet.removeAllListeners();
        animatorSet.end();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = 0;
        this.A00 = Arrays.asList(getChildAt(3), getChildAt(2), getChildAt(1), getChildAt(0));
        ArrayList arrayList = new ArrayList(4);
        do {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A00.get(i), "alpha", 0.0f, 0.6f, 0.0f);
            ofFloat.setDuration(750L);
            ofFloat.setStartDelay((long) (i * 100));
            arrayList.add(ofFloat);
            i++;
        } while (i < 4);
        AnimatorSet animatorSet = this.A01;
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C46832Fb(this));
        animatorSet.start();
    }
}
