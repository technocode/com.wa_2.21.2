package com.whatsapp.preference;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class WaPreference extends Preference {
    public WaPreference(Context context) {
        super(context);
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void A00(View view) {
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(view.getContext().getResources().getColorStateList(R.color.palette_onsurface_primary_color_selector));
        }
    }

    public View onCreateView(ViewGroup viewGroup) {
        View onCreateView = super.onCreateView(viewGroup);
        A00(onCreateView);
        return onCreateView;
    }
}
