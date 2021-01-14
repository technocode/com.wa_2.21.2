package X;

import android.content.DialogInterface;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;

/* renamed from: X.2Gz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47232Gz implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChangeNumberNotificationDialogFragment A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ DialogInterface$OnClickListenerC47232Gz(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment, C007003k r2) {
        this.A00 = changeNumberNotificationDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = this.A00;
        changeNumberNotificationDialogFragment.A0h(Conversation.A04(changeNumberNotificationDialogFragment.A0A(), this.A01));
    }
}
