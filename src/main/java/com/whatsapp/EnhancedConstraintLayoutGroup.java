package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public class EnhancedConstraintLayoutGroup extends Group {
    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC06500To
    public void A06(ConstraintLayout constraintLayout) {
        super.A06(constraintLayout);
        for (int i : getReferencedIds()) {
            constraintLayout.findViewById(i).setAlpha(getAlpha());
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        A01();
    }
}
