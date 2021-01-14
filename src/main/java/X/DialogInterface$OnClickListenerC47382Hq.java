package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.DeviceChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.2Hq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47382Hq implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceChangeDialogFragment A00;
    public final /* synthetic */ AnonymousClass02N A01;
    public final /* synthetic */ AnonymousClass02N A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ DialogInterface$OnClickListenerC47382Hq(DeviceChangeDialogFragment deviceChangeDialogFragment, String str, AnonymousClass02N r3, AnonymousClass02N r4) {
        this.A00 = deviceChangeDialogFragment;
        this.A03 = str;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceChangeDialogFragment deviceChangeDialogFragment = this.A00;
        String str = this.A03;
        AnonymousClass02N r4 = this.A01;
        AnonymousClass02N r3 = this.A02;
        Intent intent = new Intent(deviceChangeDialogFragment.A00(), IdentityVerificationActivity.class);
        if (((SecurityNotificationDialogFragment) deviceChangeDialogFragment).A01.A09(r4)) {
            str = r3.getRawString();
        }
        intent.putExtra("jid", str);
        deviceChangeDialogFragment.A0h(intent);
    }
}
