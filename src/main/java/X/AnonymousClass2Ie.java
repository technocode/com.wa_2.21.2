package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.2Ie  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Ie implements DialogInterface.OnClickListener {
    public final /* synthetic */ StarredMessagesActivity.UnstarAllDialogFragment A00;

    public /* synthetic */ AnonymousClass2Ie(StarredMessagesActivity.UnstarAllDialogFragment unstarAllDialogFragment) {
        this.A00 = unstarAllDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004902h A0A = this.A00.A0A();
        if (A0A instanceof StarredMessagesActivity) {
            StarredMessagesActivity starredMessagesActivity = (StarredMessagesActivity) A0A;
            starredMessagesActivity.A0G(R.string.register_wait_message);
            starredMessagesActivity.A0b.ANC(new C51972aN(starredMessagesActivity, starredMessagesActivity.A04), new Void[0]);
        }
    }
}
