package X;

import com.whatsapp.WaButton;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.1x8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42701x8 implements AnonymousClass0SG {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ C42701x8(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ProductDetailActivity productDetailActivity = this.A00;
        if (((Boolean) obj).booleanValue()) {
            WaButton waButton = productDetailActivity.A00;
            if (!productDetailActivity.A0U() || productDetailActivity.A05.A09(((AnonymousClass2D8) productDetailActivity).A0C)) {
                waButton.setVisibility(8);
            } else {
                waButton.setVisibility(0);
            }
        }
    }
}
