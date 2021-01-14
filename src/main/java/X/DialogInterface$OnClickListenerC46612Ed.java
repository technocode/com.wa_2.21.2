package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.Jid;

/* renamed from: X.2Ed  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC46612Ed implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChatInfoActivity.EncryptionExplanationDialogFragment A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ DialogInterface$OnClickListenerC46612Ed(ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment, C007003k r2) {
        this.A00 = encryptionExplanationDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChatInfoActivity.EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = this.A00;
        C007003k r3 = this.A01;
        Intent intent = new Intent(encryptionExplanationDialogFragment.A00(), IdentityVerificationActivity.class);
        Jid jid = r3.A09;
        if (jid != null) {
            intent.putExtra("jid", jid.getRawString());
            encryptionExplanationDialogFragment.A0h(intent);
            return;
        }
        throw null;
    }
}
