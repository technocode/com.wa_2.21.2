package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import java.util.List;

/* renamed from: X.3aE  reason: invalid class name and case insensitive filesystem */
public class C74143aE extends C71823Ql {
    public final /* synthetic */ StickerStoreMyTabFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74143aE(StickerStoreMyTabFragment stickerStoreMyTabFragment, List list) {
        super(stickerStoreMyTabFragment, list);
        this.A00 = stickerStoreMyTabFragment;
    }

    @Override // X.C71823Ql, X.AbstractC16300pa
    public int A05() {
        int A05 = super.A05();
        return A05 > 0 ? A05 + 1 : A05;
    }

    @Override // X.C71823Ql, X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C71733Qc(LayoutInflater.from(this.A00.A00()).inflate(R.layout.sticker_store_my_drag_footer, viewGroup, false));
        }
        return super.A06(viewGroup, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r3.A04.size() != 0) goto L_0x0023;
     */
    @Override // X.C71823Ql, X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r8, int r9) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74143aE.A07(X.0hD, int):void");
    }
}
