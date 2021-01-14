package com.whatsapp.payments.ui;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01K;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass0GQ;
import X.AnonymousClass0GT;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.C002101e;
import X.C018809u;
import X.C01970Ad;
import X.C02010Ah;
import X.C03340Fu;
import X.C60982sJ;
import X.C61072sS;
import X.C61482tF;
import X.C63842x6;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class PaymentDeleteAccountActivity extends ActivityC004602e implements AnonymousClass0GT {
    public int A00;
    public final AnonymousClass04j A01 = AnonymousClass04j.A00();
    public final AnonymousClass01K A02 = AnonymousClass01K.A00();
    public final AnonymousClass0GP A03 = AnonymousClass0GP.A00();
    public final C02010Ah A04 = C02010Ah.A00();
    public final C03340Fu A05 = C03340Fu.A00();
    public final AnonymousClass0GQ A06 = AnonymousClass0GQ.A00();
    public final C01970Ad A07 = C01970Ad.A00();
    public final C018809u A08 = C018809u.A00("PaymentDeleteAccountActivity", "payment-settings", "COMMON");
    public final C63842x6 A09 = C63842x6.A00();
    public final AnonymousClass00T A0A = C002101e.A00();

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r2) {
        APo(R.string.payment_account_not_unlinked);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        int A6F = this.A07.A03().A5Y().A6F(r4.code, null);
        if (A6F != 0) {
            APo(A6F);
        } else {
            APo(R.string.payment_account_not_unlinked);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r6) {
        C018809u r2 = this.A08;
        StringBuilder A0S = AnonymousClass008.A0S("onDeleteAccount successful: ");
        A0S.append(r6.A02);
        A0S.append(" remove type: ");
        AnonymousClass008.A1N(A0S, this.A00, r2);
        findViewById(R.id.progress).setVisibility(8);
        boolean z = r6.A02;
        if (!z || this.A00 == 1) {
            int i = R.string.payment_account_not_unlinked;
            if (z) {
                i = R.string.payment_account_unlinked;
            }
            ((TextView) findViewById(R.id.unlink_payment_accounts_title)).setText(((AnonymousClass2C0) this).A01.A06(i));
            findViewById(R.id.unlink_payment_accounts_desc).setVisibility(8);
            APo(i);
        }
        if (r6.A02 && this.A00 == 2) {
            Intent intent = new Intent();
            intent.putExtra("extra_remove_payment_account", this.A00);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_payments);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.payment_unlink_payment_accounts);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_unlink_payment_accounts));
            A092.A0A(true);
        }
        int i = 0;
        if (getIntent() != null) {
            i = getIntent().getIntExtra("extra_remove_payment_account", 0);
        }
        this.A00 = i;
        new C61482tF(this, ((ActivityC004702f) this).A0F, this.A0A, this.A09, this.A07, this.A02, this.A04, this.A01, this.A05, this.A06, this.A03).A00(this);
        this.A08.A07(null, "deleted payments store and sending delete account request", null);
        onConfigurationChanged(getResources().getConfiguration());
    }
}
