package com.whatsapp.search.views;

import X.AnonymousClass0Q7;
import X.C008805h;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;

public class ProgressView extends FrameLayout {
    public AnimatorSet A00;
    public final int A01 = C008805h.A02(getContext(), 40.0f);
    public final CircularProgressBar A02 = ((CircularProgressBar) AnonymousClass0Q7.A0D(this, R.id.progress_bar));

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        FrameLayout.inflate(context, R.layout.search_progress, this);
    }

    public final void A00(boolean z) {
        int i;
        long j;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.A00 = new AnimatorSet();
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        if (z) {
            i = this.A01;
        } else {
            i = 0;
        }
        ValueAnimator A06 = C008805h.A06(this, i, null, -1);
        CircularProgressBar circularProgressBar = this.A02;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(circularProgressBar, "scaleX", f2, f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(circularProgressBar, "scaleY", f2, f);
        this.A00.playTogether(A06, ofFloat, ofFloat2);
        AnimatorSet animatorSet2 = this.A00;
        if (z) {
            j = 800;
        } else {
            j = 0;
        }
        animatorSet2.setStartDelay(j);
        this.A00.setDuration(800L);
        this.A00.start();
    }
}
