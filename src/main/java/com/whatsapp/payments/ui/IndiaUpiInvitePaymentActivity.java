package com.whatsapp.payments.ui;

import X.AnonymousClass00E;
import X.AnonymousClass01R;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass2C0;
import X.C07400Xm;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

public class IndiaUpiInvitePaymentActivity extends AnonymousClass1PY {
    public final C07400Xm A00 = C07400Xm.A00();
    public final AnonymousClass01R A01 = AnonymousClass01R.A01();

    public /* synthetic */ void lambda$onCreate$84$IndiaUpiInvitePaymentActivity(View view) {
        Intent intent = new Intent(this, IndiaUpiPaymentSettingsActivity.class);
        intent.putExtra("extra_send_to_upi_id", true);
        startActivity(intent);
        finish();
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_payments_invite);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        UserJid nullable = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
        boolean z = false;
        if (nullable != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        String stringExtra = intent.getStringExtra("extra_receiver");
        AnonymousClass00E.A03(stringExtra);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            A09.A08(((AnonymousClass2C0) this).A01.A0D(R.string.payments_invite_activity_title, stringExtra));
        }
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        ((TextView) findViewById(R.id.payments_invite_title)).setText(r4.A0D(R.string.payments_invite_title, stringExtra));
        ((TextView) findViewById(R.id.payments_invite_desc)).setText(r4.A0D(R.string.payments_invite_desc, stringExtra));
        TextView textView = (TextView) findViewById(R.id.payments_invite_button);
        textView.setText(r4.A06(R.string.payments_invite_button_text));
        textView.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, nullable, 13));
        findViewById(R.id.send_to_vpa).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 17));
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
