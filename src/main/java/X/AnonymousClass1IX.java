package X;

import android.content.DialogInterface;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1IX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IX implements DialogInterface.OnClickListener {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass1IX(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MessageReplyActivity messageReplyActivity = this.A00;
        messageReplyActivity.A0X(true);
        C002001d.A2N(messageReplyActivity, 17);
    }
}
