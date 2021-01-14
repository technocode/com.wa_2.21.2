package com.whatsapp.conversationrow;

import X.AbstractC005802u;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass09H;
import X.AnonymousClass0JW;
import X.AnonymousClass0XN;
import X.AnonymousClass2JH;
import X.AnonymousClass36B;
import X.C002101e;
import X.C52172ah;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.jid.UserJid;

public class ContactSyncActivity extends ActivityC004602e implements AbstractC005802u, AnonymousClass2JH {
    public C52172ah A00;
    public UserJid A01;
    public final AnonymousClass0XN A02 = AnonymousClass0XN.A00();
    public final AnonymousClass09H A03 = AnonymousClass09H.A01();
    public final AnonymousClass36B A04 = AnonymousClass36B.A01();
    public final AnonymousClass00T A05 = C002101e.A00();

    @Override // X.AbstractC005802u
    public void AF5(int i) {
    }

    @Override // X.AbstractC005802u
    public void AF6(int i) {
    }

    @Override // X.AbstractC005802u
    public void AF7(int i) {
        if (i == 1 || i == 2) {
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("user_jid"));
        if (nullable != null) {
            this.A01 = nullable;
            if (!((ActivityC004702f) this).A0H.A05()) {
                Bundle A012 = AnonymousClass008.A01("dialog_id", 1);
                A012.putString("message", getString(R.string.something_went_wrong_network_required));
                A012.putBoolean("cancelable", false);
                A012.putString("positive_button", getString(R.string.ok));
                PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                promptDialogFragment.A0N(A012);
                promptDialogFragment.A0u(A04(), null);
                return;
            }
            C52172ah r0 = this.A00;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            C52172ah r2 = new C52172ah(this.A03, this.A02, this, this.A01);
            this.A00 = r2;
            this.A05.ANC(r2, new Void[0]);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C52172ah r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A00 = null;
        }
    }
}
