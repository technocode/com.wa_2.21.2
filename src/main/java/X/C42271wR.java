package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogImageListActivity;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;

/* renamed from: X.1wR  reason: invalid class name and case insensitive filesystem */
public class C42271wR extends AbstractC16300pa {
    public final /* synthetic */ CatalogImageListActivity A00;

    public C42271wR(CatalogImageListActivity catalogImageListActivity) {
        this.A00 = catalogImageListActivity;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.A06.A0A.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        CatalogImageListActivity catalogImageListActivity = this.A00;
        return new C42291wT(catalogImageListActivity, catalogImageListActivity.getLayoutInflater().inflate(R.layout.business_product_catalog_image_list_item, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r10, int i) {
        C42291wT r102 = (C42291wT) r10;
        boolean z = false;
        if (i == this.A00.A00) {
            z = true;
        }
        r102.A00 = z;
        CatalogImageListActivity catalogImageListActivity = r102.A03;
        C42201wJ r6 = new C42201wJ(r102);
        C42041w3 r7 = new C42041w3(r102);
        ImageView imageView = r102.A01;
        catalogImageListActivity.A05.A01((C48072Ku) catalogImageListActivity.A06.A0A.get(i), 1, r6, r7, imageView);
        imageView.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(r102, i, 2));
        AnonymousClass0Q7.A0g(imageView, AnonymousClass008.A0K("thumb-transition-", AnonymousClass1S6.A01(catalogImageListActivity.A06.A06, i)));
    }
}
