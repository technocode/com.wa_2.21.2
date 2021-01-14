package com.whatsapp.text;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.WaTextView;

public class CondensedTextView extends WaTextView {
    public float A00 = 0.8f;
    public TextPaint A01;

    public CondensedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, null, i);
    }

    public final void A01(String str) {
        int measuredWidth;
        TextPaint textPaint = this.A01;
        if (textPaint == null || textPaint.getTextSize() != getPaint().getTextSize()) {
            TextPaint textPaint2 = new TextPaint(getPaint());
            this.A01 = textPaint2;
            textPaint2.setTextScaleX(1.0f);
        }
        float measureText = this.A01.measureText(str);
        if (measureText > 0.0f && (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) > 0) {
            float f = (float) measuredWidth;
            float f2 = f / measureText;
            if (f2 < 1.0f) {
                float max = Math.max(this.A00, f2);
                setTextScaleX(max);
                float measureText2 = getPaint().measureText(str);
                while (measureText2 > f && max > this.A00) {
                    max *= 0.99f;
                    setTextScaleX(max);
                    measureText2 = getPaint().measureText(str);
                }
                setSingleLine(true);
                setHorizontallyScrolling(false);
            } else if (getTextScaleX() != 1.0f) {
                setTextScaleX(1.0f);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A01(getText().toString());
        }
    }

    @Override // X.C05560Pe
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A01(getText().toString());
    }

    @Override // android.widget.TextView, com.whatsapp.WaTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A01(charSequence.toString());
    }

    public void setTextScaleLimit(float f) {
        this.A00 = f;
    }

    @Override // X.C05560Pe
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A01.setTextSize(getPaint().getTextSize());
        A01(getText().toString());
    }
}
