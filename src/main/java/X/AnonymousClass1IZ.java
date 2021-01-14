package X;

import android.content.DialogInterface;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1IZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass1IZ(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MessageReplyActivity messageReplyActivity = this.A00;
        C002001d.A2N(messageReplyActivity, 106);
        messageReplyActivity.finish();
    }
}
