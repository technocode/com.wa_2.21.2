package com.whatsapp.biz;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass08B;
import X.AnonymousClass0AQ;
import X.AnonymousClass0BP;
import X.AnonymousClass0S2;
import X.AnonymousClass1RU;
import X.C007003k;
import X.C014308b;
import X.C017009c;
import X.C41731vY;
import X.C41751va;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

public class BusinessProfileExtraFieldsActivity extends ActivityC004602e {
    public AnonymousClass1RU A00;
    public C007003k A01;
    public UserJid A02;
    public final C017009c A03 = C017009c.A00();
    public final AnonymousClass0BP A04 = new C41751va(this);
    public final AnonymousClass08B A05 = AnonymousClass08B.A00;
    public final C014308b A06 = C014308b.A00();
    public final AnonymousClass0AQ A07 = AnonymousClass0AQ.A00();

    public void A0T() {
        C007003k A022 = this.A07.A02(this.A02);
        this.A01 = A022;
        setTitle(this.A06.A08(A022, false));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            this.A02 = nullable;
            A0T();
            AnonymousClass0S2 A09 = A09();
            if (A09 != null) {
                A09.A0A(true);
            }
            setContentView(R.layout.smb_extra_business_profile_activity_view);
            this.A00 = new AnonymousClass1RU(this, ((ActivityC004702f) this).A04, this.A01, true);
            this.A03.A03(this.A02, new C41731vY(this));
            this.A05.A01(this.A04);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A05.A00(this.A04);
    }
}
