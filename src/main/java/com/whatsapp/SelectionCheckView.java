package com.whatsapp;

import X.AnonymousClass01X;
import X.C004302a;
import X.C40561tT;
import X.C40571tU;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class SelectionCheckView extends FrameLayout {
    public ShapeDrawable A00;
    public View A01;
    public AnimationSet A02;
    public AnimationSet A03;
    public ScaleAnimation A04;
    public ScaleAnimation A05;
    public ScaleAnimation A06;
    public ScaleAnimation A07;
    public ScaleAnimation A08;
    public ScaleAnimation A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public boolean A0C = false;
    public final AnonymousClass01X A0D = AnonymousClass01X.A00();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0054, code lost:
        if (r3 == null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SelectionCheckView(android.content.Context r12, android.util.AttributeSet r13) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SelectionCheckView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final ScaleAnimation A00(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setAnimationListener(new C40561tT(view));
        return scaleAnimation;
    }

    public final ScaleAnimation A01(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setAnimationListener(new C40571tU(view));
        return scaleAnimation;
    }

    public final void A02() {
        ScaleAnimation A002 = A00(this.A0A);
        this.A06 = A002;
        A002.setStartOffset(20);
        this.A08 = A00(this.A01);
        ScaleAnimation A003 = A00(this.A0B);
        this.A04 = A003;
        A003.setStartOffset(10);
        AnimationSet animationSet = new AnimationSet(false);
        this.A02 = animationSet;
        animationSet.addAnimation(this.A06);
        this.A02.addAnimation(this.A08);
        this.A02.addAnimation(this.A04);
        this.A07 = A01(this.A0A);
        ScaleAnimation A012 = A01(this.A01);
        this.A09 = A012;
        A012.setStartOffset(20);
        ScaleAnimation A013 = A01(this.A0B);
        this.A05 = A013;
        A013.setStartOffset(10);
        AnimationSet animationSet2 = new AnimationSet(false);
        this.A03 = animationSet2;
        animationSet2.addAnimation(this.A07);
        this.A03.addAnimation(this.A09);
        this.A03.addAnimation(this.A05);
        this.A0C = true;
    }

    public void A03(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                if (!this.A0C) {
                    A02();
                }
                setVisibility(0);
                this.A0A.clearAnimation();
                this.A01.clearAnimation();
                this.A0B.clearAnimation();
                this.A0A.setAnimation(this.A06);
                this.A01.setAnimation(this.A08);
                this.A0B.setAnimation(this.A04);
                this.A0A.setForeground(this.A00);
                this.A02.start();
                return;
            }
            this.A0A.setVisibility(0);
            this.A01.setVisibility(0);
            this.A0B.setVisibility(0);
        } else if (z2) {
            if (!this.A0C) {
                A02();
            }
            this.A0A.clearAnimation();
            this.A01.clearAnimation();
            this.A0B.clearAnimation();
            this.A0A.setAnimation(this.A07);
            this.A01.setAnimation(this.A09);
            this.A0B.setAnimation(this.A05);
            this.A0A.setForeground(null);
            this.A03.start();
        } else {
            this.A0A.setVisibility(4);
            this.A01.setVisibility(4);
            this.A0B.setVisibility(4);
        }
    }

    public void setIcon(int i) {
        this.A0B.setImageDrawable(C004302a.A03(getContext(), i));
    }

    public void setSelectionBackground(int i) {
        this.A01.setBackgroundResource(i);
    }
}
