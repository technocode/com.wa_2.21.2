package com.whatsapp;

import X.AbstractC26321Kk;
import X.AbstractC26331Kl;
import X.AnonymousClass03P;
import X.AnonymousClass0SE;
import X.C002001d;
import X.C008805h;
import X.C25531Hi;
import X.C26311Kj;
import X.C26341Km;
import X.C26361Ko;
import X.C38461pu;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;

public final class CodeInputField extends WaEditText {
    public static Typeface A07;
    public static Typeface A08;
    public char A00;
    public char A01;
    public int A02;
    public ValueAnimator A03;
    public C26361Ko A04;
    public boolean A05;
    public final AnonymousClass03P A06 = AnonymousClass03P.A00();

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A03() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            float x = getX();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x, ((float) getResources().getDimensionPixelSize(R.dimen.error_wiggle_animation_offset)) + x);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(50L);
            ofFloat.addUpdateListener(new C25531Hi(this));
            ofFloat.addListener(new C26311Kj(this, x));
            this.A03 = ofFloat;
        }
        this.A03.start();
        C008805h.A1E(this.A06);
    }

    public void A04(int i, AbstractC26321Kk r11, int i2) {
        C38461pu r8 = new C38461pu(this, i2);
        setPasswordTransformationEnabled(true);
        setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 12));
        setCursorVisible(false);
        A05(r11, i, ')', '(', "pin_font", r8);
    }

    public void A05(AbstractC26321Kk r3, int i, char c, char c2, String str, AbstractC26331Kl r8) {
        this.A02 = i;
        this.A01 = c;
        this.A00 = c2;
        C26361Ko r0 = new C26361Ko(r3, this, r8);
        this.A04 = r0;
        addTextChangedListener(r0);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            Typeface typeface = A07;
            if (typeface == null) {
                typeface = C002001d.A0Z(getContext());
                A07 = typeface;
            }
            setTypeface(typeface);
        } else {
            Typeface typeface2 = A08;
            if (typeface2 == null) {
                typeface2 = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
                A08 = typeface2;
            }
            setTypeface(typeface2);
        }
        AnonymousClass0SE.A03(this);
    }

    public String getCode() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public boolean getErrorState() {
        return this.A05;
    }

    public void onSelectionChanged(int i, int i2) {
        int indexOf;
        if (i == i2 && (indexOf = getText().toString().indexOf(this.A01)) > -1 && i > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i, i2);
    }

    public void setCode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        while (true) {
            int i = this.A02;
            if (length < i + 1) {
                sb.append(this.A01);
                length++;
            } else {
                sb.insert(i >> 1, (char) 160);
                this.A04.A01 = true;
                setText(sb);
                setSelection(length + 1);
                this.A04.A01 = false;
                return;
            }
        }
    }

    public void setErrorState(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z) {
        setTransformationMethod(z ? new C26341Km(this) : null);
    }

    public void setRegistrationVoiceCodeLength(int i) {
        this.A02 = i;
    }
}
