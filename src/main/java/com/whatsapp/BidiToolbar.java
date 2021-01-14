package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.MarqueeToolbar;

public class BidiToolbar extends MarqueeToolbar {
    public final AnonymousClass01X A00;

    public BidiToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A00 = A002;
        if (!isInEditMode()) {
            AnonymousClass0Q7.A0X(this, this.A00.A02().A06 ? 1 : 0);
        }
    }

    public final void A0K(View view, int i) {
        if ((view instanceof ViewGroup) && view.getId() != R.id.custom_view) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                childAt.layout(i - childAt.getRight(), childAt.getTop(), i - childAt.getLeft(), childAt.getBottom());
                A0K(childAt, childAt.getRight() - childAt.getLeft());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!isInEditMode() && !AnonymousClass0SE.A01 && this.A00.A02().A06) {
            A0K(this, i3 - i);
        }
    }
}
