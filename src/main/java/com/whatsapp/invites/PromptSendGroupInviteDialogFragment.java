package com.whatsapp.invites;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass1VY;
import X.AnonymousClass2RR;
import X.C014308b;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.List;

public class PromptSendGroupInviteDialogFragment extends WaDialogFragment {
    public final C014308b A00 = C014308b.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            ActivityC004902h A0A = A0A();
            if (A0A != null) {
                List A0G = AnonymousClass1VY.A0G(UserJid.class, bundle2.getStringArrayList("jids"));
                AnonymousClass2RR r7 = new AnonymousClass2RR(this, (Intent) bundle2.getParcelable("invite_intent"), bundle2.getInt("invite_intent_code"));
                AnonymousClass0MB r5 = new AnonymousClass0MB(A0A);
                AnonymousClass01X r6 = this.A01;
                r5.A01.A0E = r6.A0A(R.plurals.group_add_privacy_failure_prompt_invite, (long) ((AbstractCollection) A0G).size(), r6.A0E(this.A00.A0B(A0G)));
                r5.A07(r6.A06(R.string.button_invite_to_group), r7);
                r5.A05(r6.A06(R.string.cancel), null);
                AnonymousClass0MD A002 = r5.A00();
                A002.setCanceledOnTouchOutside(false);
                return A002;
            }
            throw null;
        }
        throw null;
    }
}
