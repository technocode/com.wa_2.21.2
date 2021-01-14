package com.whatsapp;

import X.ActivityC004702f;
import X.AnonymousClass0PB;
import X.C02290Bk;
import X.C38431pr;
import X.C38441ps;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

public class BlockingUserInteractionActivity extends ActivityC004702f {
    public final C02290Bk A00 = C02290Bk.A02();
    public final AnonymousClass0PB A01 = AnonymousClass0PB.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("blocking_type", 0);
        if (intExtra == 0) {
            setContentView(R.layout.activity_blocking_user_interactions);
            C02290Bk r0 = this.A00;
            r0.A01.A03(this, new C38431pr(this));
        } else if (intExtra == 1) {
            setTitle(R.string.msg_store_migrate_title);
            setContentView(R.layout.activity_forced_migration_blocking_user_interactions);
            AnonymousClass0PB r02 = this.A01;
            r02.A00.A03(this, new C38441ps(this));
        }
    }
}
