package com.whatsapp.stickers;

import X.AnonymousClass00E;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;

public class StickerStoreRowHeaderLayout extends LinearLayout {
    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() != 4) {
            AnonymousClass00E.A08(false, "StickerStoreRowHeaderLayout should have 4 children!");
            return;
        }
        int measuredWidth = getMeasuredWidth();
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        View childAt3 = getChildAt(2);
        View childAt4 = getChildAt(3);
        if (childAt == null || childAt3 == null || childAt4 == null || childAt2 == null) {
            AnonymousClass00E.A08(false, "StickerStoreRowHeaderLayout should have 4 children! Title View, Animated View, Author View and a Remaining View");
            return;
        }
        childAt4.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
        int max = Math.max(measuredWidth - childAt4.getMeasuredWidth(), 0);
        childAt2.measure(View.MeasureSpec.makeMeasureSpec(max, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
        int measuredWidth2 = max - childAt2.getMeasuredWidth();
        childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
        childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
        int measuredWidth3 = childAt3.getMeasuredWidth();
        int measuredWidth4 = childAt.getMeasuredWidth();
        if (measuredWidth3 + measuredWidth4 > measuredWidth2) {
            int min = Math.min(measuredWidth2 / 3, measuredWidth3);
            measuredWidth4 = Math.min((measuredWidth2 << 1) / 3, measuredWidth4);
            int i3 = measuredWidth2 - (min + measuredWidth4);
            if (min == measuredWidth3) {
                measuredWidth4 += i3;
            } else {
                min += i3;
            }
            measuredWidth3 = min;
        }
        childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
    }
}
