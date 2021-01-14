package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41921vr implements AnonymousClass0SG {
    public final /* synthetic */ CartFragment A00;

    public /* synthetic */ C41921vr(CartFragment cartFragment) {
        this.A00 = cartFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        CartFragment cartFragment = this.A00;
        C36901n6 A002 = C36901n6.A00(cartFragment.A07(), cartFragment.A02().getString(((Number) obj).intValue()), -2);
        A002.A06(A002.A02.getText(R.string.ok), new ViewOnClickCListenerShape11S0100000_I1_0(A002));
        A002.A04();
    }
}
