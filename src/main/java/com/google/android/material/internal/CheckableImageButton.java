package com.google.android.material.internal;

import X.AnonymousClass0Q7;
import X.C07790Zn;
import X.C07880a2;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.google.android.search.verification.client.R;

public class CheckableImageButton extends C07880a2 implements Checkable {
    public static final int[] A01 = {16842912};
    public boolean A00;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        AnonymousClass0Q7.A0d(this, new C07790Zn(this));
    }

    public boolean isChecked() {
        return this.A00;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.A00) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = A01;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void setChecked(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.A00);
    }
}
