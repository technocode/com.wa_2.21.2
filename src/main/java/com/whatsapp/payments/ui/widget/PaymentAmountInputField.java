package com.whatsapp.payments.ui.widget;

import X.AbstractC05890Qx;
import X.AbstractC60792qE;
import X.AbstractC63602wh;
import X.AbstractC63782x0;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03P;
import X.AnonymousClass3IJ;
import X.C004302a;
import X.C28051Sr;
import X.C61212so;
import X.C63462wS;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.HashSet;

public class PaymentAmountInputField extends AbstractC60792qE {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public TextPaint A07;
    public View A08;
    public Animation A09;
    public TextView A0A;
    public AnonymousClass01X A0B;
    public AbstractC05890Qx A0C;
    public AbstractC63602wh A0D;
    public AbstractC63782x0 A0E;
    public Runnable A0F = new RunnableEBaseShape11S0100000_I1_6(this, 47);
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass02M A0M = AnonymousClass02M.A00();
    public final AnonymousClass03P A0N = AnonymousClass03P.A00();
    public final AnonymousClass01X A0O = AnonymousClass01X.A00();

    public PaymentAmountInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.A0L = false;
        this.A0H = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C61212so.A1g);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            this.A0K = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            z = z2;
        } else {
            this.A0K = false;
        }
        this.A0B = this.A0O;
        this.A0G = getText().toString();
        this.A02 = -1;
        this.A04 = getContext().getResources().getConfiguration().orientation;
        setInputType(2);
        A04();
        setFilterTouchesWhenObscured(true);
        setCursorVisible(true);
        setFocusable(true);
        setSingleLine(true);
        addTextChangedListener(this);
        setAutoScaleTextSize(z);
        this.A0L = true;
    }

    public static String A00(AnonymousClass01X r3) {
        String str = ",";
        if (C28051Sr.A0r(r3).contains(",")) {
            str = ".";
        }
        if (str.equals(".")) {
            return "\\.";
        }
        return ",";
    }

    public final float A03(String str, float f) {
        String str2;
        String str3;
        float f2 = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (this.A07 == null) {
            TextPaint textPaint = new TextPaint();
            this.A07 = textPaint;
            textPaint.setTypeface(Typeface.DEFAULT);
        }
        int indexOf = TextUtils.indexOf(str, C28051Sr.A0r(this.A0B).charAt(0));
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf);
        } else {
            str2 = str;
            str3 = "";
        }
        this.A07.setTextSize(f);
        float measureText = this.A07.measureText(str2);
        if (!TextUtils.isEmpty(str3)) {
            this.A07.setTextSize(f * 0.5f);
            f2 = this.A07.measureText(str3);
        }
        return measureText + f2;
    }

    public final void A04() {
        String str = "0123456789";
        if (this.A0H) {
            StringBuilder A0S = AnonymousClass008.A0S(str);
            A0S.append(C28051Sr.A0r(this.A0B).charAt(0));
            str = A0S.toString();
        }
        setKeyListener(DigitsKeyListener.getInstance(str));
    }

    public /* synthetic */ void A05(ValueAnimator valueAnimator) {
        super.setTextSize(0, ((Number) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void A06(String str) {
        float f;
        float textSize = getTextSize();
        if (this.A0L && this.A02 > 0) {
            int i = 0;
            while (true) {
                f = this.A00 * (1.0f - (((float) i) * 0.15f));
                float A032 = A03(str, f);
                if (i != 0) {
                    if (i == 1 && A032 <= ((float) this.A02) * 0.75f) {
                        break;
                    }
                } else if (A032 <= ((float) this.A02) * 0.5f) {
                    break;
                }
                i++;
                if (i > 2) {
                    f = Math.max(f, this.A01);
                    break;
                }
            }
        } else {
            f = this.A00;
        }
        if (f != textSize) {
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A06.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(textSize, f);
            this.A06 = ofFloat;
            ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
            this.A06.setDuration(100L);
            this.A06.addUpdateListener(new C63462wS(this));
            this.A06.start();
        }
    }

    @Override // X.AbstractC60792qE
    public int getCursorColor() {
        return C004302a.A00(getContext(), R.color.primary_light);
    }

    @Override // X.AbstractC60792qE
    public int getCursorVerticalPadding() {
        return getResources().getDimensionPixelSize(R.dimen.pay_amount_cursor_vertical_padding);
    }

    @Override // X.AbstractC60792qE
    public int getCursorWidth() {
        return getResources().getDimensionPixelSize(R.dimen.pay_amount_cursor_width);
    }

    private ViewGroup getFirstNonWrapContentParent() {
        if (getParent() == null) {
            return null;
        }
        for (ViewGroup viewGroup = (ViewGroup) getParent(); viewGroup != null; viewGroup = (ViewGroup) viewGroup.getParent()) {
            if (viewGroup.getLayoutParams().width != -2) {
                return viewGroup;
            }
        }
        return null;
    }

    public AnonymousClass01X getWhatsAppLocale() {
        return this.A0B;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i != this.A04) {
            this.A04 = i;
            this.A02 = -1;
        }
        super.onConfigurationChanged(configuration);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0I && this.A02 == -1) {
            if (getLayoutParams().width == -2) {
                ViewGroup firstNonWrapContentParent = getFirstNonWrapContentParent();
                if (firstNonWrapContentParent == null) {
                    this.A02 = (Resources.getSystem().getDisplayMetrics().widthPixels - getCompoundPaddingLeft()) - getCompoundPaddingRight();
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) getParent();
                HashSet hashSet = new HashSet();
                int width = firstNonWrapContentParent.getWidth();
                while (!hashSet.contains(firstNonWrapContentParent)) {
                    for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                        View childAt = viewGroup.getChildAt(i5);
                        if (childAt != this && !hashSet.contains(childAt)) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                            width -= (childAt.getWidth() + marginLayoutParams.rightMargin) + marginLayoutParams.leftMargin;
                            hashSet.add(childAt);
                        }
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    int paddingRight = viewGroup.getPaddingRight();
                    width -= viewGroup.getPaddingLeft() + (paddingRight + (marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin));
                    hashSet.add(viewGroup);
                    viewGroup = (ViewGroup) viewGroup.getParent();
                }
                this.A02 = width;
                return;
            }
            this.A02 = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        }
    }

    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && this.A0A != null) {
            AnonymousClass02M r0 = this.A0M;
            r0.A02.removeCallbacks(this.A0F);
            this.A09.cancel();
            this.A09.reset();
            this.A0A.setVisibility(8);
        }
    }

    public void setAllowDecimal(boolean z) {
        this.A0H = z;
        A04();
    }

    public void setAutoScaleTextSize(boolean z) {
        this.A0I = z;
        if (z) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
        }
    }

    public void setCurrency(AbstractC05890Qx r1) {
        this.A0C = r1;
    }

    public void setErrorTextView(TextView textView) {
        this.A0A = textView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A09 = alphaAnimation;
        alphaAnimation.setDuration(500);
        this.A09.setAnimationListener(new AnonymousClass3IJ(textView));
    }

    public void setFormatWithCommas(boolean z) {
        this.A0K = z;
    }

    public void setInputAmountType(int i) {
        this.A03 = i;
    }

    public void setInputAmountValidator(AbstractC63782x0 r1) {
        this.A0E = r1;
    }

    public void setOnAmountChangedLister(AbstractC63602wh r1) {
        this.A0D = r1;
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        if (this.A0I) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
            A06(this.A0G);
        }
    }

    public void setWhatsAppLocale(AnonymousClass01X r1) {
        this.A0B = r1;
    }
}
