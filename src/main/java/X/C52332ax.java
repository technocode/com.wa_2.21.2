package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.2ax  reason: invalid class name and case insensitive filesystem */
public class C52332ax implements AnonymousClass35S {
    public final /* synthetic */ ConversationsFragment.DeleteBroadcastListDialogFragment A00;
    public final /* synthetic */ C007003k A01;

    public C52332ax(ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment, C007003k r2) {
        this.A00 = deleteBroadcastListDialogFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass35S
    public void AHs() {
        this.A00.A0w(false, false);
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        Log.i("conversations/delete-list");
        ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = this.A00;
        deleteBroadcastListDialogFragment.A0w(false, false);
        C007003k r0 = this.A01;
        C28051Sr.A1X((ActivityC004702f) deleteBroadcastListDialogFragment.A0A(), Collections.singletonList(r0), z, deleteBroadcastListDialogFragment.A07, deleteBroadcastListDialogFragment.A00, deleteBroadcastListDialogFragment.A03, deleteBroadcastListDialogFragment.A05);
    }
}
