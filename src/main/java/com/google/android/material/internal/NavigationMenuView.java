package com.google.android.material.internal;

import X.AnonymousClass0T8;
import X.AnonymousClass0TU;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements AnonymousClass0TU {
    @Override // X.AnonymousClass0TU
    public void AAm(AnonymousClass0T8 r1) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }
}
