package com.whatsapp.preference;

import X.AnonymousClass01X;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

public class WaListPreference extends ListPreference {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    public WaListPreference(Context context) {
        super(context);
    }

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View onCreateView(ViewGroup viewGroup) {
        setNegativeButtonText(this.A00.A06(R.string.cancel));
        View onCreateView = super.onCreateView(viewGroup);
        WaPreference.A00(onCreateView);
        return onCreateView;
    }
}
