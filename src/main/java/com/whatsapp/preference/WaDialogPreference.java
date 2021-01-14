package com.whatsapp.preference;

import X.AnonymousClass01X;
import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WaDialogPreference extends DialogPreference {
    public WaDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X.A00();
    }

    public View onCreateView(ViewGroup viewGroup) {
        View onCreateView = super.onCreateView(viewGroup);
        WaPreference.A00(onCreateView);
        return onCreateView;
    }
}
