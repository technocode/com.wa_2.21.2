package com.whatsapp.search;

import X.AbstractC16300pa;
import X.AnonymousClass0VR;
import X.C16480ps;
import X.C71103Np;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public class SearchGridLayoutManager extends GridLayoutManager {
    public final AbstractC16300pa A00;

    public SearchGridLayoutManager(Context context, AbstractC16300pa r3) {
        super(6);
        this.A00 = r3;
        ((GridLayoutManager) this).A01 = new C71103Np(this, context);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, X.AnonymousClass0VT, androidx.recyclerview.widget.LinearLayoutManager
    public void A0p(C16480ps r2, AnonymousClass0VR r3) {
        try {
            super.A0p(r2, r3);
        } catch (IndexOutOfBoundsException e) {
            Log.e(e);
        }
    }
}
