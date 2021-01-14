package X;

import android.content.DialogInterface;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.2G4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2G4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public /* synthetic */ AnonymousClass2G4(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactPickerFragment contactPickerFragment = this.A00;
        C002001d.A2N(contactPickerFragment.A0A(), 1);
        AbstractC06110Rt r0 = contactPickerFragment.A0C;
        if (r0 != null) {
            r0.A00();
        }
    }
}
