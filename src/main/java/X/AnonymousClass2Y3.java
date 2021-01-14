package X;

import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;
import java.util.List;

/* renamed from: X.2Y3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Y3 implements AnonymousClass0SG {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity A00;

    public /* synthetic */ AnonymousClass2Y3(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        this.A00 = inviteNonWhatsAppContactPickerActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.A00;
        List list = (List) obj;
        inviteNonWhatsAppContactPickerActivity.A00.setVisible(!list.isEmpty());
        C58922ml r0 = inviteNonWhatsAppContactPickerActivity.A03;
        r0.A00 = list;
        r0.A01 = list;
        r0.notifyDataSetChanged();
    }
}
