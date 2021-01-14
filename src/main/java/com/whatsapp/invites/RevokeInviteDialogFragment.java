package com.whatsapp.invites;

import X.ActivityC004902h;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass2RS;
import X.AnonymousClass2Ra;
import X.C007003k;
import X.C014308b;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public class RevokeInviteDialogFragment extends WaDialogFragment {
    public AnonymousClass2Ra A00;
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A00 = null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AnonymousClass2Ra) {
            this.A00 = (AnonymousClass2Ra) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            ActivityC004902h A0A = A0A();
            if (A0A != null) {
                UserJid nullable = UserJid.getNullable(bundle2.getString("jid"));
                if (nullable != null) {
                    C007003k A0A2 = this.A01.A0A(nullable);
                    AnonymousClass2RS r7 = new AnonymousClass2RS(this, nullable);
                    AnonymousClass0MB r6 = new AnonymousClass0MB(A0A);
                    AnonymousClass01X r5 = this.A03;
                    r6.A01.A0E = r5.A0D(R.string.revoke_invite_confirm, this.A02.A04(A0A2));
                    r6.A07(r5.A06(R.string.revoke), r7);
                    r6.A05(r5.A06(R.string.cancel), null);
                    AnonymousClass0MD A002 = r6.A00();
                    A002.setCanceledOnTouchOutside(true);
                    return A002;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
