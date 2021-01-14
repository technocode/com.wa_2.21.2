package com.whatsapp.gallery;

import X.AbstractC48922Oh;
import X.AnonymousClass037;
import X.C02070An;
import X.C02580Cq;
import X.C02590Cr;
import X.C02780Dk;
import X.C09030cB;
import X.C48032Kq;
import X.C59572nw;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class LinksGalleryFragment extends GalleryFragmentBase implements AbstractC48922Oh {
    public C09030cB A00;
    public final C02780Dk A01 = C02780Dk.A02();
    public final C02070An A02 = C02070An.A00();
    public final C48032Kq A03 = C48032Kq.A00();
    public final C02590Cr A04 = C02590Cr.A00();
    public final C02580Cq A05 = C02580Cq.A01();

    public LinksGalleryFragment() {
        super("linksgalleryfragment");
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        this.A00 = new C09030cB(((GalleryFragmentBase) this).A0E.ACN());
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.GalleryFragmentBase
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        C59572nw r1 = new C59572nw(this);
        ((GalleryFragmentBase) this).A03 = r1;
        ((GalleryFragmentBase) this).A02.setAdapter(r1);
        View view = ((AnonymousClass037) this).A0A;
        if (view != null) {
            ((TextView) view.findViewById(R.id.empty_text)).setText(((GalleryFragmentBase) this).A0A.A06(R.string.no_urls_found));
            return;
        }
        throw null;
    }
}
