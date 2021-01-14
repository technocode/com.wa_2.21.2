package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.util.Log;

/* renamed from: X.2QI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QI implements DialogInterface.OnClickListener {
    public final /* synthetic */ GroupChatInfo.ExitGroupDialogFragment A00;
    public final /* synthetic */ AnonymousClass02U A01;

    public /* synthetic */ AnonymousClass2QI(GroupChatInfo.ExitGroupDialogFragment exitGroupDialogFragment, AnonymousClass02U r2) {
        this.A00 = exitGroupDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GroupChatInfo.ExitGroupDialogFragment exitGroupDialogFragment = this.A00;
        AnonymousClass02U r8 = this.A01;
        Log.i("group_info/onclick_leaveGroup");
        ActivityC004702f r9 = (ActivityC004702f) exitGroupDialogFragment.A0A();
        if (exitGroupDialogFragment.A03.A05()) {
            r9.APv(R.string.participant_removing, R.string.register_wait_message);
            exitGroupDialogFragment.A08.A08(new C59972oa(exitGroupDialogFragment.A0A, exitGroupDialogFragment.A07, exitGroupDialogFragment.A05, r8, r9));
        } else {
            exitGroupDialogFragment.A00.A06(R.string.failed_to_leave_group, 0);
        }
        exitGroupDialogFragment.A0w(false, false);
    }
}
