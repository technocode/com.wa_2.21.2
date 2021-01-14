package X;

import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import java.util.List;

/* renamed from: X.1xE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42751xE implements AnonymousClass0SG {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ C42751xE(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ProductDetailActivity productDetailActivity = this.A00;
        productDetailActivity.A04 = productDetailActivity.A02.A02((List) obj);
        productDetailActivity.invalidateOptionsMenu();
    }
}
