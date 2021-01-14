package X;

import android.content.DialogInterface;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.group.GroupChatInfo;

/* renamed from: X.2QJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ GroupChatInfo.ExitGroupDialogFragment A00;
    public final /* synthetic */ AnonymousClass02U A01;

    public /* synthetic */ AnonymousClass2QJ(GroupChatInfo.ExitGroupDialogFragment exitGroupDialogFragment, AnonymousClass02U r2) {
        this.A00 = exitGroupDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GroupChatInfo.ExitGroupDialogFragment exitGroupDialogFragment = this.A00;
        MuteDialogFragment A002 = MuteDialogFragment.A00(this.A01);
        AnonymousClass0LW r1 = exitGroupDialogFragment.A0H;
        if (r1 != null) {
            A002.A0u(r1, null);
            exitGroupDialogFragment.A0w(false, false);
            return;
        }
        throw null;
    }
}
