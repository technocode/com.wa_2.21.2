package com.google.android.material.snackbar;

import X.AnonymousClass0Q7;
import X.AnonymousClass1Ds;
import X.C08030aM;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class SnackbarContentLayout extends LinearLayout implements AnonymousClass1Ds {
    public int A00;
    public int A01;
    public Button A02;
    public TextView A03;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0r);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A03.getPaddingTop() == i2 && this.A03.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A03;
        if (AnonymousClass0Q7.A0l(textView)) {
            int A07 = AnonymousClass0Q7.A07(textView);
            int A06 = AnonymousClass0Q7.A06(textView);
            if (Build.VERSION.SDK_INT >= 17) {
                textView.setPaddingRelative(A07, i2, A06, i3);
                return true;
            }
            textView.setPadding(A07, i2, A06, i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.A02;
    }

    public TextView getMessageView() {
        return this.A03;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A03 = (TextView) findViewById(R.id.snackbar_text);
        this.A02 = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            int r0 = r6.A01
            if (r0 <= 0) goto L_0x0018
            int r0 = r6.getMeasuredWidth()
            int r1 = r6.A01
            if (r0 <= r1) goto L_0x0018
            r0 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            super.onMeasure(r7, r8)
        L_0x0018:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165539(0x7f070163, float:1.7945298E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165538(0x7f070162, float:1.7945296E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r6.A03
            android.text.Layout r0 = r0.getLayout()
            int r0 = r0.getLineCount()
            r3 = 0
            r2 = 1
            if (r0 <= r2) goto L_0x0056
            int r0 = r6.A00
            if (r0 <= 0) goto L_0x0057
            android.widget.Button r0 = r6.A02
            int r1 = r0.getMeasuredWidth()
            int r0 = r6.A00
            if (r1 <= r0) goto L_0x0057
            int r0 = r5 - r4
            boolean r0 = r6.A00(r2, r5, r0)
            if (r0 == 0) goto L_0x0055
        L_0x0052:
            super.onMeasure(r7, r8)
        L_0x0055:
            return
        L_0x0056:
            r5 = r4
        L_0x0057:
            boolean r0 = r6.A00(r3, r5, r5)
            if (r0 == 0) goto L_0x0055
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
