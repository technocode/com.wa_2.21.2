package com.whatsapp.status.playback.widget;

import X.C003701u;
import X.C05240Nt;
import X.C660532r;
import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public class TextStatusContentView extends TextEmojiLabel {
    public float A00;

    public TextStatusContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A05() {
        if (this.A00 == 0.0f) {
            this.A00 = getPaint().getTextSize();
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth > 0 && measuredHeight > 0) {
            CharSequence text = getText();
            TransformationMethod transformationMethod = getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, this);
            }
            float f = this.A00;
            TextPaint textPaint = new TextPaint(getPaint());
            float f2 = f;
            float f3 = 2.0f;
            while (true) {
                if (f - f3 <= 2.0f) {
                    f2 = f3;
                    break;
                }
                textPaint.setTextSize(f2);
                C05240Nt.A00(text, textPaint);
                if (C660532r.A00.A3M(C003701u.A00(text), textPaint, this, measuredWidth).getHeight() <= measuredHeight) {
                    if (this.A00 == f2) {
                        break;
                    }
                    f3 = f2;
                } else {
                    f = f2;
                }
                f2 = (f3 + f) / 2.0f;
            }
            textPaint.setTextSize(f2);
            while (textPaint.getTextSize() > 2.0f) {
                C05240Nt.A00(text, textPaint);
                Layout A3M = C660532r.A00.A3M(C003701u.A00(text), textPaint, this, measuredWidth);
                if (A3M.getHeight() <= measuredHeight) {
                    int lineCount = A3M.getLineCount();
                    boolean z = true;
                    for (int i = 0; i < lineCount; i++) {
                        if (A3M.getLineMax(i) > ((float) measuredWidth)) {
                            z = false;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
                textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
            }
            super.setTextSize(0, textPaint.getTextSize());
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A05();
        }
    }

    @Override // X.C05560Pe
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A05();
    }

    @Override // com.whatsapp.TextEmojiLabel, android.widget.TextView, com.whatsapp.WaTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A05();
    }

    @Override // X.C05560Pe
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A05();
    }
}
