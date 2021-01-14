package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2JS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JS implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationsFragment.ExitGroupDialogFragment A00;

    public /* synthetic */ AnonymousClass2JS(ConversationsFragment.ExitGroupDialogFragment exitGroupDialogFragment) {
        this.A00 = exitGroupDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A0w(false, false);
    }
}
