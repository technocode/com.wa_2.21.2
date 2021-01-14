package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.InviteToGroupCallConfirmationFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2GF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GF implements DialogInterface.OnClickListener {
    public final /* synthetic */ InviteToGroupCallConfirmationFragment A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ AnonymousClass2GF(InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment, UserJid userJid) {
        this.A00 = inviteToGroupCallConfirmationFragment;
        this.A01 = userJid;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment = this.A00;
        UserJid userJid = this.A01;
        AnonymousClass037 r3 = inviteToGroupCallConfirmationFragment.A0D;
        if (r3 != null) {
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) r3;
            Intent intent = new Intent();
            intent.putExtra("contact", userJid.getRawString());
            contactPickerFragment.A0H.A01(intent);
            contactPickerFragment.A0H.A00();
        }
    }
}
