package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Y2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Y2 implements AnonymousClass1O8 {
    public final /* synthetic */ ContactPickerFragment A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ AnonymousClass2Y2(ContactPickerFragment contactPickerFragment, C007003k r2) {
        this.A00 = contactPickerFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1O8
    public final void AQl() {
        ContactPickerFragment contactPickerFragment = this.A00;
        C007003k r1 = this.A01;
        AnonymousClass0GG r3 = contactPickerFragment.A12;
        ActivityC004902h A0A = contactPickerFragment.A0A();
        Jid A02 = r1.A02(UserJid.class);
        if (A02 != null) {
            r3.A07(A0A, null, (UserJid) A02);
            return;
        }
        throw null;
    }
}
