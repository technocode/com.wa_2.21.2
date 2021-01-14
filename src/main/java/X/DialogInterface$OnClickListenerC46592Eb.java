package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.chatinfo.ChatInfoActivity;

/* renamed from: X.2Eb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC46592Eb implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ChatInfoActivity.EncryptionExplanationDialogFragment A01;

    public /* synthetic */ DialogInterface$OnClickListenerC46592Eb(ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment, int i) {
        this.A01 = encryptionExplanationDialogFragment;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Uri A02;
        ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = this.A01;
        int i2 = this.A00;
        if (i2 == 5) {
            A02 = encryptionExplanationDialogFragment.A04.A02("chats", "learn-more-about-chats-with-whatsapp-chat-support");
        } else {
            AnonymousClass0M9 r3 = encryptionExplanationDialogFragment.A04;
            if (i2 == 1) {
                A02 = r3.A03("general", "28030015", null);
            } else {
                A02 = r3.A02("security-and-privacy", "end-to-end-encryption-for-business-messages");
            }
        }
        encryptionExplanationDialogFragment.A00.A05(encryptionExplanationDialogFragment.A00(), new Intent("android.intent.action.VIEW", A02));
        encryptionExplanationDialogFragment.A0w(false, false);
    }
}
