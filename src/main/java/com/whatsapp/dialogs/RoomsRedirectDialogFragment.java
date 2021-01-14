package com.whatsapp.dialogs;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0MB;
import X.C09190cR;
import X.DialogInterface$OnClickListenerC48302Lr;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class RoomsRedirectDialogFragment extends WaDialogFragment {
    public final C09190cR A00 = C09190cR.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle A03 = A03();
        DialogInterface$OnClickListenerC48302Lr r4 = new DialogInterface$OnClickListenerC48302Lr(this, AnonymousClass02N.A01(A03.getString("chat_jid", null)), A03.getInt("entry_point"));
        AnonymousClass0MB r3 = new AnonymousClass0MB(A01());
        AnonymousClass01X r2 = this.A01;
        r3.A01.A0E = r2.A06(R.string.rooms_create_link_in_messenger_continue);
        r3.A07(r2.A06(R.string.rooms_continue_in_messenger), r4);
        return AnonymousClass008.A03(r2, R.string.cancel, r3);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        C09190cR r2 = this.A00;
        int i = A03().getInt("entry_point");
        AnonymousClass00D r5 = r2.A03;
        SharedPreferences sharedPreferences = r5.A00;
        AnonymousClass008.A0k(r5, "rooms_redirect_shown", (1 << i) | sharedPreferences.getInt("rooms_redirect_shown", 0));
        AnonymousClass008.A0k(r5, "rooms_dialogs_shown", sharedPreferences.getInt("rooms_dialogs_shown", 0) + 1);
    }
}
