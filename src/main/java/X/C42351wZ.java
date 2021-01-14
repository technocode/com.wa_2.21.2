package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

/* renamed from: X.1wZ  reason: invalid class name and case insensitive filesystem */
public class C42351wZ implements AbstractC03690Hg {
    public final /* synthetic */ CatalogMediaCard A00;

    public C42351wZ(CatalogMediaCard catalogMediaCard) {
        this.A00 = catalogMediaCard;
    }

    @Override // X.AbstractC03690Hg
    public void AFu(UserJid userJid, int i) {
        CatalogMediaCard catalogMediaCard = this.A00;
        if (C006803i.A0q(catalogMediaCard.A03, userJid) && !catalogMediaCard.A0D.A06(catalogMediaCard.A03)) {
            AnonymousClass008.A0w("CatalogMediaCard/requestCatalogBeginning/FetchFailed/Error: ", i);
            if (i == 406) {
                catalogMediaCard.A04.setError(catalogMediaCard.A0I.A06(R.string.catalog_hidden));
            } else if (i != 404) {
                catalogMediaCard.A04.setError(catalogMediaCard.A0I.A06(R.string.catalog_error_retrieving_products));
            } else if (!catalogMediaCard.A06) {
                catalogMediaCard.A04.setError(catalogMediaCard.A0I.A06(R.string.catalog_error_no_products));
            } else {
                MediaCard mediaCard = catalogMediaCard.A04;
                ViewOnClickCListenerShape11S0100000_I1_0 viewOnClickCListenerShape11S0100000_I1_0 = new ViewOnClickCListenerShape11S0100000_I1_0(catalogMediaCard, 32);
                mediaCard.A04.removeAllViews();
                mediaCard.A01(4, viewOnClickCListenerShape11S0100000_I1_0);
            }
        }
    }

    @Override // X.AbstractC03690Hg
    public void AFv(UserJid userJid) {
        CatalogMediaCard catalogMediaCard = this.A00;
        if (C006803i.A0q(catalogMediaCard.A03, userJid)) {
            catalogMediaCard.A01(userJid);
        }
    }
}
