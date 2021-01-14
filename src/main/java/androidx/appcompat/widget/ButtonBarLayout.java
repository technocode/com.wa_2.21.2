package androidx.appcompat.widget;

import X.AnonymousClass0T3;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

public class ButtonBarLayout extends LinearLayout {
    public int A00 = -1;
    public boolean A01;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = AnonymousClass0T3.A0F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r3 != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        int i = 80;
        if (z) {
            i = 5;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }
}
