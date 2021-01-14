package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass01X;
import X.AnonymousClass2C0;
import X.C004302a;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

public class About extends ActivityC004602e {
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.about);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.about_statusbar));
        }
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        ((TextView) findViewById(R.id.version)).setText(r5.A0D(R.string.version, "2.21.2.4"));
        TextView textView = (TextView) findViewById(R.id.about_licenses);
        SpannableString spannableString = new SpannableString(r5.A06(R.string.view_licenses));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        textView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 0));
    }
}
