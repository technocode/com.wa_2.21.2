package X;

import android.content.DialogInterface;
import com.whatsapp.MessageReplyActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ia  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25711Ia implements DialogInterface.OnClickListener {
    public final /* synthetic */ MessageReplyActivity A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ DialogInterface$OnClickListenerC25711Ia(MessageReplyActivity messageReplyActivity, C007003k r2) {
        this.A00 = messageReplyActivity;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MessageReplyActivity messageReplyActivity = this.A00;
        C007003k r1 = this.A01;
        AnonymousClass0GG r2 = messageReplyActivity.A0L;
        Jid A02 = r1.A02(UserJid.class);
        if (A02 != null) {
            r2.A07(messageReplyActivity, null, (UserJid) A02);
            C002001d.A2N(messageReplyActivity, 106);
            messageReplyActivity.A08.A01(true);
            return;
        }
        throw null;
    }
}
