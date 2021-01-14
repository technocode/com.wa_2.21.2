package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2JT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JT implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConversationsFragment.ExitGroupDialogFragment A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ AnonymousClass2JT(ConversationsFragment.ExitGroupDialogFragment exitGroupDialogFragment, C007003k r2) {
        this.A00 = exitGroupDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationsFragment.ExitGroupDialogFragment exitGroupDialogFragment = this.A00;
        C007003k r6 = this.A01;
        Log.i("conversations/user-try-leaveGroup");
        if (exitGroupDialogFragment.A04.A05()) {
            StringBuilder sb = new StringBuilder("conversations/exit/group:");
            sb.append(r6);
            Log.i(sb.toString());
            exitGroupDialogFragment.A08.A07((AnonymousClass02N) r6.A02(AnonymousClass02N.class), true);
            exitGroupDialogFragment.A0D.ANF(new RunnableEBaseShape7S0200000_I1_2(exitGroupDialogFragment, r6, 34));
        } else {
            exitGroupDialogFragment.A00.A06(R.string.failed_to_leave_group, 0);
        }
        AnonymousClass00D r2 = exitGroupDialogFragment.A05;
        r2.A0N(r2.A00.getInt("delete_chat_count", 0) + 1);
        exitGroupDialogFragment.A08.A03(2);
        exitGroupDialogFragment.A0w(false, false);
    }
}
