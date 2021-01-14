package X;

import android.content.DialogInterface;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.2GC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GC implements DialogInterface.OnClickListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public /* synthetic */ AnonymousClass2GC(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactPickerFragment contactPickerFragment = this.A00;
        C002001d.A2N(contactPickerFragment.A0A(), 1);
        contactPickerFragment.A16(null);
    }
}
