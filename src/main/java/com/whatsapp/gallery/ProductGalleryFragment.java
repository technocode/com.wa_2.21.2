package com.whatsapp.gallery;

import X.AbstractC48922Oh;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0AM;
import X.C018109n;
import X.C02580Cq;
import X.C27831Rq;
import X.C59602nz;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class ProductGalleryFragment extends GalleryFragmentBase implements AbstractC48922Oh {
    public final AnonymousClass01I A00 = AnonymousClass01I.A00();
    public final C27831Rq A01 = C27831Rq.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass01K A03 = AnonymousClass01K.A00();
    public final AnonymousClass0AM A04 = AnonymousClass0AM.A00();
    public final C018109n A05 = C018109n.A00();
    public final C02580Cq A06 = C02580Cq.A01();

    public ProductGalleryFragment() {
        super("productgalleryfragment");
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.GalleryFragmentBase
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        C59602nz r1 = new C59602nz(this);
        ((GalleryFragmentBase) this).A03 = r1;
        ((GalleryFragmentBase) this).A02.setAdapter(r1);
        View view = ((AnonymousClass037) this).A0A;
        if (view != null) {
            ((TextView) view.findViewById(R.id.empty_text)).setText(R.string.no_products_found);
            return;
        }
        throw null;
    }
}
