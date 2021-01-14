package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;

/* renamed from: X.2YE  reason: invalid class name */
public class AnonymousClass2YE implements AnonymousClass0YR {
    public final /* synthetic */ ContactPickerFragment A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public AnonymousClass2YE(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        ContactPickerFragment contactPickerFragment = this.A00;
        contactPickerFragment.A0V = str;
        ArrayList A03 = AnonymousClass1YB.A03(str, contactPickerFragment.A1O);
        contactPickerFragment.A0c = A03;
        if (A03.isEmpty()) {
            contactPickerFragment.A0c = null;
        }
        contactPickerFragment.A0t();
        return false;
    }
}
