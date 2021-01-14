package X;

import android.os.Bundle;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1xI  reason: invalid class name and case insensitive filesystem */
public class C42791xI extends AnonymousClass0SD {
    public boolean A00;
    public final C02270Bi A01;
    public final C02270Bi A02 = new C02270Bi();
    public final C02270Bi A03 = new C02270Bi();
    public final C02270Bi A04 = new C02270Bi();
    public final C02270Bi A05 = new C02270Bi();
    public final C02270Bi A06 = new C02270Bi();
    public final C000300f A07;
    public final C42651x3 A08;
    public final AnonymousClass1SS A09;
    public final UserJid A0A;

    public C42791xI(AnonymousClass1SS r3, UserJid userJid, C000300f r5, C42651x3 r6) {
        C02270Bi r1 = new C02270Bi();
        this.A01 = r1;
        this.A09 = r3;
        this.A0A = userJid;
        this.A07 = r5;
        this.A08 = r6;
        r6.A02 = this.A04;
        r6.A01 = this.A02;
        r6.A04 = this.A06;
        r6.A00 = r1;
        r6.A03 = this.A05;
    }

    public void A02(ActivityC004702f r5) {
        AnonymousClass1SS r0 = this.A09;
        UserJid userJid = this.A0A;
        if (r0 != null) {
            CartFragment cartFragment = new CartFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_business_id", userJid);
            cartFragment.A0N(bundle);
            r5.APm(cartFragment);
            return;
        }
        throw null;
    }
}
