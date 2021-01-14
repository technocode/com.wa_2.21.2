package com.google.android.material.transformation;

import X.AbstractC07570Yg;
import X.AbstractC08020aL;
import X.AnonymousClass0Q7;
import X.AnonymousClass1ED;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class ExpandableBehavior extends AbstractC07570Yg {
    public int A00 = 0;

    public abstract boolean A07(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!AnonymousClass0Q7.A0j(view)) {
            List A06 = coordinatorLayout.A06(view);
            int size = A06.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                View view2 = (View) A06.get(i2);
                if (A01(coordinatorLayout, view, view2)) {
                    AbstractC08020aL r4 = (AbstractC08020aL) view2;
                    if (r4 != null) {
                        boolean AB2 = r4.AB2();
                        int i3 = this.A00;
                        if (!AB2 ? i3 == 1 : i3 == 0 || i3 == 2) {
                            int i4 = 2;
                            if (AB2) {
                                i4 = 1;
                            }
                            this.A00 = i4;
                            view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1ED(this, view, i4, r4));
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        return false;
    }
}
