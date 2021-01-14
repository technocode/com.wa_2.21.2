package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01L;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.C002101e;
import X.C007003k;
import X.C015808q;
import X.DialogInterface$OnClickListenerC47422Hu;
import X.DialogInterface$OnClickListenerC47432Hv;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

public class IdentityChangeDialogFragment extends SecurityNotificationDialogFragment {
    public final AnonymousClass01L A00 = AnonymousClass01L.A00();
    public final C015808q A01 = C015808q.A00();
    public final AnonymousClass00T A02 = C002101e.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("participant_jid");
            AnonymousClass02N A012 = AnonymousClass02N.A01(string);
            StringBuilder sb = new StringBuilder("IdentityChangeDialogFragment/onCreateDialog/invalid remote resource jid=");
            sb.append(string);
            AnonymousClass00E.A04(A012, sb.toString());
            C007003k A0A = ((SecurityNotificationDialogFragment) this).A02.A0A(A012);
            AlertDialog.Builder builder = new AlertDialog.Builder(A00());
            C015808q r5 = this.A01;
            boolean A03 = r5.A03();
            int i = R.string.identity_change_info;
            if (A03) {
                i = R.string.identity_change_info_md;
            }
            AlertDialog.Builder message = builder.setMessage(A0x(i, A0A));
            AnonymousClass01X r3 = ((SecurityNotificationDialogFragment) this).A04;
            AlertDialog.Builder neutralButton = message.setNegativeButton(r3.A06(R.string.ok), (DialogInterface.OnClickListener) null).setNeutralButton(r3.A06(R.string.learn_more), new DialogInterface$OnClickListenerC47422Hu(this, A0A));
            boolean A032 = r5.A03();
            int i2 = R.string.identity_change_verify;
            if (A032) {
                i2 = R.string.verify_code;
            }
            return neutralButton.setPositiveButton(r3.A06(i2), new DialogInterface$OnClickListenerC47432Hv(this, string)).create();
        }
        throw null;
    }
}
