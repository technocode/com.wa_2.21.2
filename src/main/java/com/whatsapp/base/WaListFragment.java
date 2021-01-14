package com.whatsapp.base;

import X.C001901c;
import androidx.fragment.app.ListFragment;

public class WaListFragment extends ListFragment {
    public final C001901c A00 = C001901c.A00();

    @Override // X.AnonymousClass037
    public void A0T(boolean z) {
        super.A0T(z);
        if (z) {
            this.A00.A03(this, "visible");
        } else {
            this.A00.A03(this, "invisible");
        }
    }
}
