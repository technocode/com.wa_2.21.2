package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0M9;
import X.AnonymousClass2C0;
import X.C26971Nk;
import X.CountDownTimerC26961Nj;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S1100000_I1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

public class SpamWarningActivity extends ActivityC004602e {
    public static ConditionVariable A02 = new ConditionVariable(false);
    public int A00;
    public final AnonymousClass0M9 A01 = AnonymousClass0M9.A01();

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_spam_warning);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.spam_title));
        int intExtra = getIntent().getIntExtra("spam_warning_reason_key", 100);
        this.A00 = getIntent().getIntExtra("expiry_in_seconds", -1);
        String stringExtra = getIntent().getStringExtra("spam_warning_message_key");
        String stringExtra2 = getIntent().getStringExtra("faq_url_key");
        AnonymousClass008.A1L(AnonymousClass008.A0T("SpamWarningActivity started with code ", intExtra, " and expiry (in seconds) "), this.A00);
        switch (intExtra) {
            case 101:
                i = R.string.spam_too_many_messages;
                break;
            case 102:
                i = R.string.spam_too_many_blocks;
                break;
            case 103:
                i = R.string.spam_too_many_groups;
                break;
            case 104:
                i = R.string.spam_too_many_people;
                break;
            case 105:
            default:
                int i2 = this.A00;
                i = R.string.spam_generic;
                if (i2 == -1) {
                    i = R.string.spam_generic_unknown_time_left;
                    break;
                }
                break;
            case 106:
                i = R.string.spam_too_many_messages_broadcasted;
                break;
        }
        findViewById(R.id.btn_spam_warning_learn_more).setOnClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, stringExtra2, 1));
        TextView textView = (TextView) findViewById(R.id.spam_warning_info_textview);
        if (stringExtra == null || stringExtra.isEmpty()) {
            textView.setText(r6.A06(i));
        } else {
            textView.setText(stringExtra);
        }
        if (this.A00 == -1) {
            Log.d("unknown expiry time.");
            findViewById(R.id.progress_bar).setVisibility(8);
            new C26971Nk(this).start();
            return;
        }
        findViewById(R.id.spam_warning_generic_data_connection_missing_textview).setVisibility(8);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        circularProgressBar.setVisibility(0);
        circularProgressBar.A0G = true;
        circularProgressBar.setMax(this.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        new CountDownTimerC26961Nj(this, (long) (this.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS), circularProgressBar).start();
    }
}
