package com.google.android.exoplayer2.ui;

import X.AbstractC232514z;
import X.AnonymousClass150;
import X.AnonymousClass154;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {
    public float A00;
    public int A01 = 0;
    public AbstractC232514z A02;
    public final AnonymousClass150 A03;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass154.A00, 0, 0);
            try {
                this.A01 = obtainStyledAttributes.getInt(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A03 = new AnonymousClass150(this);
    }

    public int getResizeMode() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r9 > 0.0f) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r9 > 0.0f) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AbstractC232514z r1) {
        this.A02 = r1;
    }

    public void setResizeMode(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            requestLayout();
        }
    }
}
