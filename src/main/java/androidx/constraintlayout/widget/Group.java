package androidx.constraintlayout.widget;

import X.AbstractC06500To;
import android.content.Context;
import android.util.AttributeSet;

public class Group extends AbstractC06500To {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC06500To
    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
    }

    @Override // X.AbstractC06500To
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A01();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A01();
    }
}
