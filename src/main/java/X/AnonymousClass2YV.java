package X;

import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.ArrayList;

/* renamed from: X.2YV  reason: invalid class name */
public class AnonymousClass2YV implements AnonymousClass0YR {
    public final /* synthetic */ PhoneContactsSelector A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public AnonymousClass2YV(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        PhoneContactsSelector phoneContactsSelector = this.A00;
        phoneContactsSelector.A0C = str;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) phoneContactsSelector).A01);
        phoneContactsSelector.A0D = A03;
        if (A03.isEmpty()) {
            phoneContactsSelector.A0D = null;
        }
        PhoneContactsSelector.A05(phoneContactsSelector);
        return false;
    }
}
