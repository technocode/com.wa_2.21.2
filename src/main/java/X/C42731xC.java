package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.1xC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42731xC implements AnonymousClass0SG {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ C42731xC(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        View view;
        ProductDetailActivity productDetailActivity = this.A00;
        if (((Boolean) obj).booleanValue() && (view = ((ActivityC004702f) productDetailActivity).A04) != null) {
            C36901n6.A00(view, productDetailActivity.getResources().getString(R.string.catalog_something_went_wrong_error), 0).A04();
            productDetailActivity.A00.setEnabled(true);
        }
    }
}
