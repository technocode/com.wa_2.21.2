package com.whatsapp.components;

import X.C06140Ry;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MainChildCoordinatorLayout extends CoordinatorLayout {
    public int A00;

    public MainChildCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A17);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public boolean A0H(View view, int i, int i2) {
        return (view != null && view.getId() == this.A00) || super.A0H(view, i, i2);
    }
}
