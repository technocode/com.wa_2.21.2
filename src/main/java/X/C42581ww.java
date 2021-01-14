package X;

import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.order.view.fragment.OrderDetailFragment;

/* renamed from: X.1ww  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42581ww implements AnonymousClass0SG {
    public final /* synthetic */ OrderDetailFragment A00;

    public /* synthetic */ C42581ww(OrderDetailFragment orderDetailFragment) {
        this.A00 = orderDetailFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        OrderDetailFragment orderDetailFragment = this.A00;
        orderDetailFragment.A01.setVisibility(8);
        int intValue = ((Number) ((Pair) obj).first).intValue();
        int i = R.string.order_deleted_error;
        if (intValue != 404) {
            i = R.string.catalog_something_went_wrong_error;
        }
        C36901n6.A00(orderDetailFragment.A07(), orderDetailFragment.A01().getString(i), 0).A04();
    }
}
