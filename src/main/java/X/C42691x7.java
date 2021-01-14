package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

/* renamed from: X.1x7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42691x7 implements AnonymousClass0SG {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ C42691x7(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        View view;
        ProductDetailActivity productDetailActivity = this.A00;
        if (((Boolean) obj).booleanValue() && (view = ((ActivityC004702f) productDetailActivity).A04) != null) {
            C36901n6 A002 = C36901n6.A00(view, productDetailActivity.getResources().getString(R.string.cant_add_more_items), -2);
            A002.A06(A002.A02.getText(R.string.ok), new ViewOnClickCListenerShape11S0100000_I1_0(productDetailActivity, A002, 38));
            A002.A04();
            productDetailActivity.A00.setEnabled(true);
        }
    }
}
