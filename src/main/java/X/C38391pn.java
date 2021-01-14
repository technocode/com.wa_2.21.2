package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.BlockList;

/* renamed from: X.1pn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38391pn implements AbstractC60992sK {
    public final /* synthetic */ BlockList A00;

    public /* synthetic */ C38391pn(BlockList blockList) {
        this.A00 = blockList;
    }

    @Override // X.AbstractC60992sK
    public final void AJZ(C61072sS r4) {
        BlockList blockList = this.A00;
        if (r4 == null) {
            blockList.A0V();
            blockList.A00.notifyDataSetChanged();
            return;
        }
        blockList.APr(((AnonymousClass2C0) blockList).A01.A06(R.string.payment_unblock_error));
    }
}
