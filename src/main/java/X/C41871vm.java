package X;

import android.util.Pair;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

/* renamed from: X.1vm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41871vm implements AnonymousClass0SG {
    public final /* synthetic */ CartFragment A00;

    public /* synthetic */ C41871vm(CartFragment cartFragment) {
        this.A00 = cartFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        CartFragment cartFragment = this.A00;
        Pair pair = (Pair) obj;
        C41831vi r3 = cartFragment.A0F;
        if (r3 != null) {
            String str = (String) pair.first;
            Number number = (Number) pair.second;
            if (str != null && number != null) {
                int i = 0;
                while (true) {
                    if (i >= r3.A00.size()) {
                        break;
                    } else if (str.equals(((C27711Rc) r3.A00.get(i)).A01.A06)) {
                        ((C27711Rc) r3.A00.get(i)).A00 = (long) number.intValue();
                        r3.A02(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            cartFragment.A0z();
            return;
        }
        throw null;
    }
}
