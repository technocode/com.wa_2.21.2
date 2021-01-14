package X;

import android.content.DialogInterface;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2H0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChangeNumberNotificationDialogFragment A00;
    public final /* synthetic */ C007003k A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass2H0(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment, boolean z, C007003k r3) {
        this.A00 = changeNumberNotificationDialogFragment;
        this.A02 = z;
        this.A01 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = this.A00;
        boolean z = this.A02;
        C007003k r2 = this.A01;
        if (z) {
            dialogInterface.dismiss();
            return;
        }
        AbstractC03760Hn r1 = changeNumberNotificationDialogFragment.A00;
        if (r1 != null) {
            Jid A022 = r2.A02(UserJid.class);
            if (A022 != null) {
                r1.A1t(r2, (AnonymousClass02N) A022);
                return;
            }
            throw null;
        }
    }
}
