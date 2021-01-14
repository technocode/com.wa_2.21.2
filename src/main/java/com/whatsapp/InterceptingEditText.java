package com.whatsapp;

import X.AnonymousClass1MD;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class InterceptingEditText extends WaEditText {
    public AnonymousClass1MD A00;

    public InterceptingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass1MD r0;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (r0 = this.A00) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        r0.ADG();
        return true;
    }

    public void setOnBackButtonListener(AnonymousClass1MD r1) {
        this.A00 = r1;
    }
}
