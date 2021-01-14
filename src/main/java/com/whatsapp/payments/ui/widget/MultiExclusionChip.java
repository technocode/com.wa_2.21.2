package com.whatsapp.payments.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public class MultiExclusionChip extends Chip {
    public CompoundButton.OnCheckedChangeListener A00;

    public MultiExclusionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.chip.Chip
    public void setChecked(boolean z) {
        super.setChecked(z);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.A00;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    @Override // com.google.android.material.chip.Chip
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00 = onCheckedChangeListener;
    }
}
