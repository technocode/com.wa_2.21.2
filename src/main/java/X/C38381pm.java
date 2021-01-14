package X;

import com.whatsapp.BlockList;

/* renamed from: X.1pm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38381pm implements AbstractC60992sK {
    public final /* synthetic */ BlockList A00;

    public /* synthetic */ C38381pm(BlockList blockList) {
        this.A00 = blockList;
    }

    @Override // X.AbstractC60992sK
    public final void AJZ(C61072sS r2) {
        BlockList blockList = this.A00;
        if (r2 == null) {
            blockList.A0V();
            blockList.A00.notifyDataSetChanged();
        }
    }
}
