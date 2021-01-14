package X;

import android.content.DialogInterface;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1IY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IY implements DialogInterface.OnCancelListener {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass1IY(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.finish();
    }
}
