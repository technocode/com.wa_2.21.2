package com.whatsapp.gallery;

import X.AbstractC48922Oh;
import X.AnonymousClass009;
import X.AnonymousClass00T;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0BW;
import X.C000300f;
import X.C002101e;
import X.C02780Dk;
import X.C04370Kc;
import X.C47892Kc;
import X.C59562nv;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class DocumentsGalleryFragment extends GalleryFragmentBase implements AbstractC48922Oh {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass009 A01 = AnonymousClass009.A00();
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final C000300f A03 = C000300f.A00();
    public final C47892Kc A04 = C47892Kc.A00();
    public final AnonymousClass0BW A05 = AnonymousClass0BW.A00();
    public final C04370Kc A06 = C04370Kc.A00();
    public final AnonymousClass00T A07 = C002101e.A00();

    public DocumentsGalleryFragment() {
        super("documentsgalleryfragment");
    }

    @Override // X.AnonymousClass037, com.whatsapp.gallery.GalleryFragmentBase
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        C59562nv r1 = new C59562nv(this);
        ((GalleryFragmentBase) this).A03 = r1;
        ((GalleryFragmentBase) this).A02.setAdapter(r1);
        View view = ((AnonymousClass037) this).A0A;
        if (view != null) {
            ((TextView) view.findViewById(R.id.empty_text)).setText(R.string.no_documents_found);
            return;
        }
        throw null;
    }
}
