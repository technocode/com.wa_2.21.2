package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.Conversation;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38M implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoipActivityV2.ReplyWithMessageDialogFragment A00;
    public final /* synthetic */ String[] A01;

    public /* synthetic */ AnonymousClass38M(VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment, String[] strArr) {
        this.A00 = replyWithMessageDialogFragment;
        this.A01 = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment = this.A00;
        String[] strArr = this.A01;
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) replyWithMessageDialogFragment.A0B();
        Intent intent = new Intent(voipActivityV2, Conversation.class);
        intent.putExtra("jid", replyWithMessageDialogFragment.A00.getRawString());
        intent.addFlags(335544320);
        if (i != strArr.length - 1) {
            intent.putExtra("wa_type", (byte) 0);
            intent.putExtra("share_msg", strArr[i]);
            intent.putExtra("has_share", true);
            Conversation.A0A(replyWithMessageDialogFragment.A00(), intent);
        } else {
            intent.putExtra("show_keyboard", true);
        }
        voipActivityV2.startActivity(intent);
        voipActivityV2.A0z(2);
    }
}
