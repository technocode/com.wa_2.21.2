package com.whatsapp.storage;

import X.AnonymousClass01X;
import X.AnonymousClass346;
import X.C002001d;
import X.C07990aH;
import X.C663633y;
import X.C663733z;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class SizeTickerView extends WaTextView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnimatorSet A06;
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();

    public SizeTickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A24);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        this.A00 = 300;
        setTextSize(0, (float) this.A04);
    }

    public final void A01() {
        CharSequence[] split = C002001d.A1Y(this.A07, this.A05).split(" ");
        int length = split.length;
        if (length == 0) {
            setText("");
        } else if (length == 1) {
            setText(split[0]);
        } else {
            SpannableString spannableString = new SpannableString(split[1]);
            spannableString.setSpan(new AbsoluteSizeSpan(this.A03), 0, split[1].length(), 18);
            setText(TextUtils.concat(split[0], " ", spannableString));
        }
    }

    public void A02(long j, int i, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A06 = new AnimatorSet();
            long j2 = this.A05;
            if (j2 != j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 10);
                ofInt.addUpdateListener(new C663733z(this, j2, j));
                arrayList.add(ofInt);
            }
            if (this.A02 != i) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.A02), Integer.valueOf(i));
                ofObject.addUpdateListener(new C663633y(this));
                arrayList.add(ofObject);
            }
            this.A06.addListener(new AnonymousClass346(this, j, i));
            this.A06.setInterpolator(new LinearInterpolator());
            this.A06.setDuration((long) this.A01);
            this.A06.setStartDelay((long) this.A00);
            this.A06.playTogether(arrayList);
            this.A06.start();
            return;
        }
        AnimatorSet animatorSet2 = this.A06;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.A05 = j;
        this.A02 = i;
        setTextColor(i);
        A01();
    }
}
