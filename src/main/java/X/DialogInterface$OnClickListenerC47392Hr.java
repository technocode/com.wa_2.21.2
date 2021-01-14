package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.DeviceChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;

/* renamed from: X.2Hr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47392Hr implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceChangeDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC47392Hr(DeviceChangeDialogFragment deviceChangeDialogFragment) {
        this.A00 = deviceChangeDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceChangeDialogFragment deviceChangeDialogFragment = this.A00;
        ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A00.A05(deviceChangeDialogFragment.A00(), new Intent("android.intent.action.VIEW", ((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A06.A03("general", "26000361", null)));
    }
}
