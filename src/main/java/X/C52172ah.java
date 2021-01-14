package X;

import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.conversationrow.ContactSyncActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ah  reason: invalid class name and case insensitive filesystem */
public class C52172ah extends AnonymousClass0JW {
    public final AnonymousClass0XN A00;
    public final AnonymousClass2JH A01;
    public final UserJid A02;
    public final AnonymousClass09H A03;

    public C52172ah(AnonymousClass09H r1, AnonymousClass0XN r2, AnonymousClass2JH r3, UserJid userJid) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = userJid;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r1 = (ActivityC004702f) this.A01;
        r1.A0M(r1.getString(R.string.loading_spinner));
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int i;
        String string;
        AnonymousClass0QK r7 = (AnonymousClass0QK) obj;
        ContactSyncActivity contactSyncActivity = (ContactSyncActivity) this.A01;
        contactSyncActivity.A00 = null;
        contactSyncActivity.A0K.A00();
        if (r7 == null || !r7.A00()) {
            if (r7 == AnonymousClass0QK.NETWORK_UNAVAILABLE) {
                i = 1;
                string = contactSyncActivity.getString(R.string.something_went_wrong_network_required);
            } else {
                i = 2;
                string = contactSyncActivity.getString(R.string.something_went_wrong);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", i);
            bundle.putString("message", string);
            bundle.putBoolean("cancelable", false);
            bundle.putString("positive_button", contactSyncActivity.getString(R.string.ok));
            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
            promptDialogFragment.A0N(bundle);
            C002001d.A2p(contactSyncActivity.A04(), promptDialogFragment, null);
            return;
        }
        contactSyncActivity.finish();
        AnonymousClass36B r0 = contactSyncActivity.A04;
        contactSyncActivity.startActivity(Conversation.A04(contactSyncActivity, r0.A03.A0A(contactSyncActivity.A01)));
    }
}
