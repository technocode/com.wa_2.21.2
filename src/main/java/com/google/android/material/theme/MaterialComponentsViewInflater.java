package com.google.android.material.theme;

import X.C29581Zk;
import X.C459026x;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C29581Zk createButton(Context context, AttributeSet attributeSet) {
        return new C459026x(context, attributeSet);
    }
}
