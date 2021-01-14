package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.1vp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41901vp implements AnonymousClass0SG {
    public final /* synthetic */ CartFragment A00;

    public /* synthetic */ C41901vp(CartFragment cartFragment) {
        this.A00 = cartFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        CartFragment cartFragment = this.A00;
        String str = (String) obj;
        C41831vi r1 = cartFragment.A0F;
        int i = 0;
        while (true) {
            if (i >= r1.A00.size()) {
                break;
            } else if (str.equals(((C27711Rc) r1.A00.get(i)).A01.A06)) {
                r1.A00.remove(i);
                ((AbstractC16300pa) r1).A01.A03(i, 1);
                break;
            } else {
                i++;
            }
        }
        cartFragment.A0z();
    }
}
