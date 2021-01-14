package X;

import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2XD  reason: invalid class name */
public class AnonymousClass2XD implements AnonymousClass0EF {
    public final /* synthetic */ ContactInfoActivity A00;

    @Override // X.AnonymousClass0EF
    public void AJ5(C02900Dx r1) {
    }

    public AnonymousClass2XD(ContactInfoActivity contactInfoActivity) {
        this.A00 = contactInfoActivity;
    }

    @Override // X.AnonymousClass0EF
    public void AJ6(AnonymousClass02N r5, UserJid userJid) {
        ContactInfoActivity contactInfoActivity = this.A00;
        if (r5.equals(contactInfoActivity.A0h())) {
            AnonymousClass02M r2 = ((ActivityC004702f) contactInfoActivity).A0F;
            r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(contactInfoActivity, 18));
        }
    }

    @Override // X.AnonymousClass0EF
    public void AJ7(AnonymousClass02N r5, UserJid userJid) {
        ContactInfoActivity contactInfoActivity = this.A00;
        if (r5.equals(contactInfoActivity.A0h())) {
            AnonymousClass02M r2 = ((ActivityC004702f) contactInfoActivity).A0F;
            r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(contactInfoActivity, 19));
        }
    }
}
