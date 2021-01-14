package X;

import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.2Y1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Y1 implements AnonymousClass0SG {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity A00;

    public /* synthetic */ AnonymousClass2Y1(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        this.A00 = inviteNonWhatsAppContactPickerActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        Integer valueOf;
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.A00;
        C007003k r9 = (C007003k) obj;
        if (r9 != null) {
            C09040cC r6 = inviteNonWhatsAppContactPickerActivity.A05;
            StringBuilder A0S = AnonymousClass008.A0S("sms:");
            A0S.append(C12420i4.A00(r9));
            Uri parse = Uri.parse(A0S.toString());
            String A0D = inviteNonWhatsAppContactPickerActivity.A0A.A0D(R.string.tell_a_friend_sms, "https://whatsapp.com/dl/");
            int intExtra = inviteNonWhatsAppContactPickerActivity.getIntent().getIntExtra("invite_source", 0);
            if (intExtra == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(intExtra);
            }
            r6.A01(inviteNonWhatsAppContactPickerActivity, parse, A0D, valueOf);
        }
    }
}
