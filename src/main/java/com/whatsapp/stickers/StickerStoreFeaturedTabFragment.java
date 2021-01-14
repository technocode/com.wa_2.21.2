package com.whatsapp.stickers;

import X.AbstractC16300pa;
import X.AnonymousClass33N;
import X.C02780Dk;
import X.C03570Gt;
import X.C09790dX;
import X.C71713Qa;
import android.view.View;
import com.whatsapp.util.Log;

public class StickerStoreFeaturedTabFragment extends StickerStoreTabFragment {
    public static final C02780Dk A03 = C02780Dk.A02();
    public View A00;
    public boolean A01;
    public boolean A02;

    @Override // com.whatsapp.stickers.StickerStoreTabFragment
    public void A0n() {
        super.A0n();
        View view = ((StickerStoreTabFragment) this).A02;
        if (view != null) {
            int i = 8;
            if (this.A02) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    @Override // com.whatsapp.stickers.StickerStoreTabFragment
    public void A0o(AnonymousClass33N r5, int i) {
        super.A0o(r5, i);
        r5.A06 = false;
        ((AbstractC16300pa) ((StickerStoreTabFragment) this).A05).A01.A04(i, 1, null);
        C03570Gt r3 = ((StickerStoreTabFragment) this).A0D;
        if (r3 != null) {
            Log.d("StickerRepository/markStickerPackAsSeenAsync/begin");
            r3.A0R.ANF(new RunnableEBaseShape9S0200000_I1_4(r3, r5, 15));
            return;
        }
        throw null;
    }

    public final void A0q() {
        this.A02 = true;
        C03570Gt r3 = ((StickerStoreTabFragment) this).A0D;
        C71713Qa r1 = new C71713Qa(this);
        if (r3 != null) {
            Log.d("StickerRepository/getDownloadableStickerPacksAsync/begin");
            r3.A0R.ANC(new C09790dX(r3, r1), new Object[0]);
            return;
        }
        throw null;
    }
}
