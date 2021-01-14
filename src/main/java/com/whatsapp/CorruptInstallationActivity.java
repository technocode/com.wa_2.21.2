package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass01X;
import X.AnonymousClass0GZ;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C664034c;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class CorruptInstallationActivity extends ActivityC004602e {
    public final AnonymousClass0GZ A00 = AnonymousClass0GZ.A00();

    public /* synthetic */ void lambda$onCreate$940$CorruptInstallationActivity(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")));
    }

    public /* synthetic */ void lambda$onCreate$941$CorruptInstallationActivity(View view) {
        startActivity(new Intent("android.intent.action.DELETE", Uri.parse("package:com.whatsapp")));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_corrupt_installation);
        TextView textView = (TextView) findViewById(R.id.corrupt_installation_contact_support_textview);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        Spanned fromHtml = Html.fromHtml(r6.A06(R.string.corrupt_installation_contact_support_prompt));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new C664034c(C002001d.A0R(this, "corrupt-install", null, null, null, null, null)), spanStart, spanEnd, spanFlags);
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (!this.A00.A02()) {
            TextView textView2 = (TextView) findViewById(R.id.corrupt_installation_description_website_distribution_textview);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(Html.fromHtml(r6.A0D(R.string.corrupt_installation_description_website_distribution, "https://www.whatsapp.com/android/")));
            findViewById(R.id.play_store_div).setVisibility(8);
            return;
        }
        View findViewById = findViewById(R.id.btn_play_store);
        View findViewById2 = findViewById(R.id.btn_uninstall);
        findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 15));
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 16));
        findViewById(R.id.website_div).setVisibility(8);
    }
}
