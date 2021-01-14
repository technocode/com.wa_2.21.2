package X;

import android.view.View;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.2X8  reason: invalid class name */
public class AnonymousClass2X8 extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ContactInfoActivity A01;
    public final /* synthetic */ String A02;

    public AnonymousClass2X8(ContactInfoActivity contactInfoActivity, int i, String str) {
        this.A01 = contactInfoActivity;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        ContactInfoActivity contactInfoActivity = this.A01;
        contactInfoActivity.APl(ChatInfoActivity.EncryptionExplanationDialogFragment.A00(contactInfoActivity.A0h(), this.A00, this.A02), null);
    }
}
