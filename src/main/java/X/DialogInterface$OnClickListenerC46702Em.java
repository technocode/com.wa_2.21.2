package X;

import android.content.DialogInterface;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.2Em  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC46702Em implements DialogInterface.OnClickListener {
    public final /* synthetic */ ListChatInfo A00;

    public /* synthetic */ DialogInterface$OnClickListenerC46702Em(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ListChatInfo listChatInfo = this.A00;
        C002001d.A2N(listChatInfo, 6);
        C007003k r3 = listChatInfo.A0A;
        AnonymousClass0EO r2 = listChatInfo.A0U;
        AnonymousClass0OP A0g = listChatInfo.A0g();
        Jid A02 = r3.A02(UserJid.class);
        if (A02 == null) {
            throw null;
        } else if (r2 != null) {
            r2.A0D(A0g, Collections.singletonList(A02));
            listChatInfo.A0c.remove(r3);
            listChatInfo.A0W.A04(listChatInfo.A0g(), false);
            listChatInfo.A0j();
            listChatInfo.A0m();
        } else {
            throw null;
        }
    }
}
