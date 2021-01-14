package com.whatsapp.preference;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WaCheckBoxPreference extends CheckBoxPreference {
    public WaCheckBoxPreference(Context context) {
        super(context);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onBindView(View view) {
        super.onBindView(view);
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            TextView textView = (TextView) findViewById;
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public View onCreateView(ViewGroup viewGroup) {
        View onCreateView = super.onCreateView(viewGroup);
        WaPreference.A00(onCreateView);
        return onCreateView;
    }
}
