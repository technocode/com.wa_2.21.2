package X;

import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.1xD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42741xD implements AnonymousClass0SG {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ C42741xD(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ProductDetailActivity productDetailActivity = this.A00;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (productDetailActivity == null) {
            throw null;
        } else if (booleanValue) {
            productDetailActivity.finishAffinity();
        }
    }
}
