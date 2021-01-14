package X;

import android.content.DialogInterface;
import com.whatsapp.Conversation;

/* renamed from: X.1Hr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnDismissListenerC25621Hr implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Conversation A00;
    public final /* synthetic */ C007003k A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ DialogInterface$OnDismissListenerC25621Hr(Conversation conversation, C007003k r2, boolean z) {
        this.A00 = conversation;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.A18(this.A01, this.A02);
    }
}
