package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.1vs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41931vs implements AnonymousClass0SG {
    public final /* synthetic */ CartFragment A00;

    public /* synthetic */ C41931vs(CartFragment cartFragment) {
        this.A00 = cartFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        CartFragment cartFragment = this.A00;
        if (((Boolean) obj).booleanValue()) {
            cartFragment.A0L = false;
            ((ActivityC004702f) cartFragment.A0B()).AMi();
            C36901n6.A00(cartFragment.A07(), cartFragment.A01().getString(R.string.catalog_something_went_wrong_error), 0).A04();
        }
    }
}
