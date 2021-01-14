package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0VT;
import X.C06140Ry;
import X.C40181sl;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AutoFitGridRecyclerView extends RecyclerView {
    public int A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A0J);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        A0j(new C40181sl(this.A01, i));
        setLayoutManager(new GridLayoutManager(1));
        this.A0i = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            AnonymousClass0VT r3 = this.A0S;
            if (r3 instanceof GridLayoutManager) {
                ((GridLayoutManager) r3).A1N(Math.max(1, getMeasuredWidth() / this.A00));
            }
        }
    }
}
