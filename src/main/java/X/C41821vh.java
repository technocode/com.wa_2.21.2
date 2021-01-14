package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.cart.view.fragment.QuantityPickerDialogFragment;

/* renamed from: X.1vh  reason: invalid class name and case insensitive filesystem */
public class C41821vh extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ C27711Rc A00;
    public final /* synthetic */ C41831vi A01;

    public C41821vh(C41831vi r1, C27711Rc r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        CartFragment cartFragment = this.A01.A02;
        C27711Rc r2 = this.A00;
        int i = (int) r2.A00;
        String str = r2.A01.A06;
        if (cartFragment.A0G.A0E != null) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_product_id", str);
            bundle.putInt("extra_initial_quantity", i);
            QuantityPickerDialogFragment quantityPickerDialogFragment = new QuantityPickerDialogFragment();
            quantityPickerDialogFragment.A0N(bundle);
            AnonymousClass0LW r1 = ((AnonymousClass037) cartFragment).A0H;
            if (r1 != null) {
                quantityPickerDialogFragment.A0u(r1, QuantityPickerDialogFragment.class.getName());
                return;
            }
            return;
        }
        throw null;
    }
}
