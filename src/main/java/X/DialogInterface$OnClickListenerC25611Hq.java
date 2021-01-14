package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.Conversation;

/* renamed from: X.1Hq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25611Hq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Conversation.CallConfirmationFragment A01;
    public final /* synthetic */ C007003k A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ DialogInterface$OnClickListenerC25611Hq(Conversation.CallConfirmationFragment callConfirmationFragment, Activity activity, C007003k r3, boolean z) {
        this.A01 = callConfirmationFragment;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Conversation.CallConfirmationFragment callConfirmationFragment = this.A01;
        Activity activity = this.A00;
        C007003k r5 = this.A02;
        boolean z = this.A03;
        AnonymousClass00D r3 = callConfirmationFragment.A01;
        AnonymousClass008.A0k(r3, "call_confirmation_dialog_count", r3.A00.getInt("call_confirmation_dialog_count", 0) + 1);
        if (activity instanceof Conversation) {
            ((Conversation) activity).A17(r5, z);
        }
    }
}
