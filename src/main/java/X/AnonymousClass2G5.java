package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.2G5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2G5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public /* synthetic */ AnonymousClass2G5(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Intent intent = new Intent();
        Jid jid = contactPickerFragment.A0O.A09;
        if (jid != null) {
            intent.putExtra("contact", jid.getRawString());
            intent.putExtra("message_row_id", contactPickerFragment.A0o().getLong("message_row_id"));
            contactPickerFragment.A0H.A01(intent);
            C002001d.A2N(contactPickerFragment.A0A(), 3);
            contactPickerFragment.A0H.A00();
            return;
        }
        throw null;
    }
}
