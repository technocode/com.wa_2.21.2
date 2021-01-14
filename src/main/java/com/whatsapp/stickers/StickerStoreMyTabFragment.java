package com.whatsapp.stickers;

import X.AbstractC16300pa;
import X.AbstractC662633n;
import X.AnonymousClass00T;
import X.AnonymousClass33N;
import X.AnonymousClass3R1;
import X.C002101e;
import X.C30511bT;
import X.C71823Ql;
import X.C74143aE;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StickerStoreMyTabFragment extends StickerStoreTabFragment implements AbstractC662633n {
    public View A00;
    public C30511bT A01;
    public AnonymousClass3R1 A02;
    public boolean A03;
    public final AnonymousClass00T A04 = C002101e.A00();

    @Override // X.AbstractC662633n
    public void AIA(AnonymousClass33N r5) {
        C71823Ql r3 = ((StickerStoreTabFragment) this).A05;
        if ((r3 instanceof C74143aE) && r3.A00 != null) {
            String str = r5.A0D;
            for (int i = 0; i < r3.A00.size(); i++) {
                if (str.equals(((AnonymousClass33N) r3.A00.get(i)).A0D)) {
                    r3.A00.set(i, r5);
                    r3.A02(i);
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC662633n
    public void AIB(List list) {
        ((StickerStoreTabFragment) this).A06 = list;
        C71823Ql r0 = ((StickerStoreTabFragment) this).A05;
        if (r0 == null) {
            C74143aE r2 = new C74143aE(this, list);
            ((StickerStoreTabFragment) this).A05 = r2;
            RecyclerView recyclerView = ((StickerStoreTabFragment) this).A04;
            if (recyclerView != null) {
                recyclerView.setLayoutFrozen(false);
                recyclerView.A0i(r2, true, true);
                recyclerView.A0t(true);
                recyclerView.requestLayout();
            }
            A0n();
            return;
        }
        r0.A00 = list;
        ((AbstractC16300pa) r0).A01.A00();
    }

    @Override // X.AbstractC662633n
    public void AIC() {
        this.A02 = null;
    }

    @Override // X.AbstractC662633n
    public void AID(String str) {
        if (((StickerStoreTabFragment) this).A06 != null) {
            for (int i = 0; i < ((StickerStoreTabFragment) this).A06.size(); i++) {
                if (((AnonymousClass33N) ((StickerStoreTabFragment) this).A06.get(i)).A0D.equals(str)) {
                    ((StickerStoreTabFragment) this).A06.remove(i);
                    C71823Ql r1 = ((StickerStoreTabFragment) this).A05;
                    if (r1 instanceof C74143aE) {
                        r1.A00 = ((StickerStoreTabFragment) this).A06;
                        ((AbstractC16300pa) r1).A01.A00();
                        return;
                    }
                    return;
                }
            }
        }
    }
}
