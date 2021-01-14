package com.whatsapp.preference;

import X.C002001d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class ChatHistoryPreference extends WaPreference {
    public int A00;
    public int A01;

    public ChatHistoryPreference(Context context) {
        this(context, null);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C002001d.A06(context, R.attr.settingsIconColor, R.color.settings_icon);
        this.A01 = C002001d.A06(context, R.attr.settingsTitleTextColor, R.color.settings_item_title_text);
    }

    public void onBindView(View view) {
        super.onBindView(view);
        C002001d.A2m((ImageView) view.findViewById(16908294), this.A00);
        ((TextView) view.findViewById(16908310)).setTextColor(this.A01);
    }
}
