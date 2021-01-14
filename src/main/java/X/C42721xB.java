package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.Iterator;

/* renamed from: X.1xB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42721xB implements AnonymousClass0SG {
    public final /* synthetic */ ProductDetailActivity A00;

    public /* synthetic */ C42721xB(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        View view;
        ProductDetailActivity productDetailActivity = this.A00;
        if (((Boolean) obj).booleanValue() && (view = ((ActivityC004702f) productDetailActivity).A04) != null) {
            C36901n6 A002 = C36901n6.A00(view, productDetailActivity.getResources().getString(R.string.item_added_to_cart), 0);
            A002.A06(A002.A02.getText(R.string.view_cart), new ViewOnClickCListenerShape11S0100000_I1_0(productDetailActivity, 39));
            A002.A04();
            productDetailActivity.A00.setEnabled(true);
            C41771vc r0 = productDetailActivity.A09;
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass1RX) r1.next()).A00();
                } else {
                    return;
                }
            }
        }
    }
}
