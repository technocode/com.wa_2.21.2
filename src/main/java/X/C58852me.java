package X;

import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.2me  reason: invalid class name and case insensitive filesystem */
public class C58852me extends C30271b3 {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity A00;

    public C58852me(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        this.A00 = inviteNonWhatsAppContactPickerActivity;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(C51362Yk.class)) {
            InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.A00;
            return new C51362Yk(inviteNonWhatsAppContactPickerActivity.A07, inviteNonWhatsAppContactPickerActivity.A0A, inviteNonWhatsAppContactPickerActivity.A08, inviteNonWhatsAppContactPickerActivity.A0B);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
