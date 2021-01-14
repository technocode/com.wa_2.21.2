package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment;

/* renamed from: X.2Hs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47402Hs implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EncryptionChangeDialogFragment A01;
    public final /* synthetic */ C007003k A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ DialogInterface$OnClickListenerC47402Hs(EncryptionChangeDialogFragment encryptionChangeDialogFragment, int i, boolean z, C007003k r4) {
        this.A01 = encryptionChangeDialogFragment;
        this.A00 = i;
        this.A03 = z;
        this.A02 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Uri parse;
        EncryptionChangeDialogFragment encryptionChangeDialogFragment = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        C007003k r0 = this.A02;
        if (i2 != 0) {
            parse = encryptionChangeDialogFragment.A07.A02("security-and-privacy", "end-to-end-encryption-for-business-messages");
        } else if (z) {
            parse = Uri.parse(encryptionChangeDialogFragment.A07.A03("general", "26000103", null).toString());
        } else if (r0.A0S) {
            parse = encryptionChangeDialogFragment.A07.A02("chats", "learn-more-about-chats-with-whatsapp-chat-support");
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("https://www.whatsapp.com/security?lg=");
            AnonymousClass01X r1 = encryptionChangeDialogFragment.A04;
            A0S.append(r1.A04());
            A0S.append("&lc=");
            A0S.append(r1.A03());
            parse = Uri.parse(A0S.toString());
        }
        encryptionChangeDialogFragment.A00.A05(encryptionChangeDialogFragment.A00(), new Intent("android.intent.action.VIEW", parse));
        encryptionChangeDialogFragment.A0w(false, false);
    }
}
