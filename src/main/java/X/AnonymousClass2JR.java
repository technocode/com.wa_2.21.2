package X;

import android.content.DialogInterface;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Collections;

/* renamed from: X.2JR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JR implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationsFragment.ExitGroupDialogFragment A00;
    public final /* synthetic */ AnonymousClass02N A01;

    public /* synthetic */ AnonymousClass2JR(ConversationsFragment.ExitGroupDialogFragment exitGroupDialogFragment, AnonymousClass02N r2) {
        this.A00 = exitGroupDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationsFragment.ExitGroupDialogFragment exitGroupDialogFragment = this.A00;
        MuteDialogFragment A012 = MuteDialogFragment.A01(Collections.singleton(this.A01));
        AnonymousClass0LW r1 = exitGroupDialogFragment.A0H;
        if (r1 != null) {
            A012.A0u(r1, null);
            exitGroupDialogFragment.A0w(false, false);
            return;
        }
        throw null;
    }
}
