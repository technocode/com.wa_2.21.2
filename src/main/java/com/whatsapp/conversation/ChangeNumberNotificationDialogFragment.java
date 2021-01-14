package com.whatsapp.conversation;

import X.AbstractC03760Hn;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02Y;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass2H0;
import X.C007003k;
import X.C12420i4;
import X.DialogInterface$OnClickListenerC47222Gy;
import X.DialogInterface$OnClickListenerC47232Gz;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public final class ChangeNumberNotificationDialogFragment extends WaDialogFragment {
    public AbstractC03760Hn A00;
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public static ChangeNumberNotificationDialogFragment A00(UserJid userJid, UserJid userJid2, String str) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = new ChangeNumberNotificationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("convo_jid", userJid.getRawString());
        bundle.putString("new_jid", userJid2.getRawString());
        bundle.putString("old_display_name", str);
        changeNumberNotificationDialogFragment.A0N(bundle);
        return changeNumberNotificationDialogFragment;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        try {
            this.A00 = (AbstractC03760Hn) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement ChangeNumberNotificationDialogListener");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            try {
                UserJid userJid = UserJid.get(bundle2.getString("convo_jid"));
                UserJid userJid2 = UserJid.get(bundle2.getString("new_jid"));
                String string = bundle2.getString("old_display_name");
                if (string != null) {
                    C007003k A0A = this.A01.A0A(userJid2);
                    boolean z = false;
                    if (A0A.A08 != null) {
                        z = true;
                    }
                    AnonymousClass0MB r3 = new AnonymousClass0MB(A00());
                    DialogInterface$OnClickListenerC47222Gy r5 = DialogInterface$OnClickListenerC47222Gy.A00;
                    DialogInterface$OnClickListenerC47232Gz r6 = new DialogInterface$OnClickListenerC47232Gz(this, A0A);
                    AnonymousClass2H0 r7 = new AnonymousClass2H0(this, z, A0A);
                    if (userJid.equals(userJid2)) {
                        if (z) {
                            AnonymousClass01X r62 = this.A02;
                            r3.A01.A0E = r62.A0D(R.string.change_number_dialog_text_already_added, r62.A0F(C12420i4.A00(A0A)));
                            r3.A07(r62.A06(R.string.ok_got_it), r5);
                        } else {
                            AnonymousClass01X r63 = this.A02;
                            r3.A01.A0E = r63.A0D(R.string.change_number_notification_text_new, string, C12420i4.A00(A0A));
                            r3.A05(r63.A06(R.string.cancel), r5);
                            r3.A07(r63.A06(R.string.add_contact), r7);
                        }
                    } else if (z) {
                        AnonymousClass01X r72 = this.A02;
                        r3.A01.A0E = r72.A0D(R.string.change_number_dialog_text_already_added, r72.A0F(C12420i4.A00(A0A)));
                        r3.A07(r72.A06(R.string.got_it), r5);
                        r3.A06(r72.A06(R.string.change_number_message_new_number), r6);
                    } else {
                        AnonymousClass01X r2 = this.A02;
                        r3.A01.A0E = r2.A0D(R.string.change_number_notification_text_old, string);
                        r3.A06(r2.A06(R.string.send_message_to_contact_button), r6);
                        r3.A07(r2.A06(R.string.add_contact), r7);
                        r3.A05(r2.A06(R.string.cancel), r5);
                    }
                    AnonymousClass0MD A002 = r3.A00();
                    A002.setCanceledOnTouchOutside(true);
                    return A002;
                }
                throw null;
            } catch (AnonymousClass02Y e) {
                throw new RuntimeException(e);
            }
        } else {
            throw null;
        }
    }
}
