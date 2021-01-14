package X;

import android.content.DialogInterface;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.2W2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2W2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ PopupNotification A00;

    public /* synthetic */ AnonymousClass2W2(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PopupNotification popupNotification = this.A00;
        AnonymousClass0GG r2 = popupNotification.A0c;
        Jid A02 = popupNotification.A0N.A02(UserJid.class);
        if (A02 != null) {
            r2.A07(popupNotification, null, (UserJid) A02);
            C002001d.A2N(popupNotification, 106);
            return;
        }
        throw null;
    }
}
