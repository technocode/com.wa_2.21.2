package com.whatsapp.contact.picker;

import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass2GF;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import X.C014308b;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public class InviteToGroupCallConfirmationFragment extends WaDialogFragment {
    public final C000300f A00 = C000300f.A00();
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass01X r2;
        String A06;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        AnonymousClass00E.A04(bundle2, "null arguments");
        UserJid nullable = UserJid.getNullable(bundle2.getString("peer_id"));
        AnonymousClass00E.A04(nullable, "null peer jid");
        ActivityC004902h A0A = A0A();
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0A);
        String A04 = this.A02.A04(this.A01.A0A(nullable));
        if (C002001d.A3L(this.A00)) {
            AnonymousClass01X r7 = this.A03;
            r2 = r7;
            String A0D = r7.A0D(R.string.invite_to_group_call_confirmation_title, A04);
            AnonymousClass0MC r8 = r4.A01;
            r8.A0I = A0D;
            r8.A0E = Html.fromHtml(r7.A0D(R.string.invite_to_group_call_confirmation_description, String.format("%06X", Integer.valueOf(C004302a.A00(A0A, R.color.accent_light) & 16777215))));
            A06 = r7.A06(R.string.invite_to_group_call_confirmation_positive_button_label);
        } else {
            r2 = this.A03;
            r4.A01.A0E = r2.A0D(R.string.invite_to_group_call_confirmation_text, A04);
            A06 = r2.A06(R.string.invite_to_group_call_confirmation_positive_button_label);
        }
        r4.A07(A06, new AnonymousClass2GF(this, nullable));
        r4.A05(r2.A06(R.string.cancel), null);
        AnonymousClass0MD A002 = r4.A00();
        A002.setCanceledOnTouchOutside(true);
        return A002;
    }
}
