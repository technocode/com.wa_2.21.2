package com.whatsapp.accountsync;

import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass2C0;
import X.AnonymousClass2CR;
import X.C002101e;
import X.C11060fe;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;

public class LoginActivity extends AnonymousClass2CR {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass01I A01 = AnonymousClass01I.A00();
    public final AnonymousClass00T A02 = C002101e.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass2CR, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r8 = ((AnonymousClass2C0) this).A01;
        setTitle(r8.A06(R.string.app_name));
        setContentView(R.layout.login);
        boolean z = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.whatsapp".contains(account.type)) {
                z = true;
            }
        }
        if (z) {
            this.A00.A0C(r8.A06(R.string.account_sync_acct_added), 1);
            finish();
            return;
        }
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        if (r0.A03 == null) {
            Intent intent = new Intent(this, Main.class);
            intent.putExtra("show_registration_first_dlg", true);
            startActivity(intent);
            finish();
            return;
        }
        this.A02.ANC(new C11060fe(this, this), new Void[0]);
    }
}
