package com.whatsapp.components;

import X.AnonymousClass01X;
import X.C06140Ry;
import X.C46932Fs;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TextAndDateLayout extends FrameLayout {
    public int A00;
    public boolean A01;
    public final AnonymousClass01X A02;

    public TextAndDateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A02 = A002;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C06140Ry.A1p, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getInt(1, 0);
                this.A01 = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final int A00(Layout layout) {
        int i = this.A00;
        if (i == 0) {
            return layout.getLineCount() - 1;
        }
        return Math.min(i - 1, layout.getLineCount() - 1);
    }

    private int getLastParagraphDirection() {
        Layout layout = ((TextView) getChildAt(0)).getLayout();
        return layout.getParagraphDirection(A00(layout));
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setTextViewStyle(this.A00);
        if (this.A01) {
            TextView textView = (TextView) getChildAt(0);
            textView.addTextChangedListener(new C46932Fs(textView));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0152, code lost:
        if (r12.A01 == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.TextAndDateLayout.onMeasure(int, int):void");
    }

    public void setMaxTextLineCount(int i) {
        if (this.A00 != i) {
            invalidate();
            setTextViewStyle(i);
        }
        this.A00 = i;
    }

    private void setTextViewStyle(int i) {
        TextView textView = (TextView) getChildAt(0);
        if (i > 0) {
            textView.setMaxLines(i);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }
}
