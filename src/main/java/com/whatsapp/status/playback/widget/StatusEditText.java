package com.whatsapp.status.playback.widget;

import X.C003701u;
import X.C05240Nt;
import X.C660532r;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.whatsapp.MentionableEntry;

public class StatusEditText extends MentionableEntry {
    public float A00;

    public StatusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A0E() {
        if (this.A00 == 0.0f) {
            this.A00 = getPaint().getTextSize();
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth > 0 && measuredHeight > 0) {
            Editable text = getText();
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
            super.setTextSize(0, f2);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0E();
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                setSelection(0);
                post(new RunnableEBaseShape0S0102000_I1(this, selectionStart, selectionEnd, 2));
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A0E();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A0E();
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        A0E();
    }
}
