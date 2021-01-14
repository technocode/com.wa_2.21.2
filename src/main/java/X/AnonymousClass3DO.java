package X;

/* renamed from: X.3DO  reason: invalid class name */
public class AnonymousClass3DO implements AbstractC29071Wx {
    public static volatile AnonymousClass3DO A02;
    public final C01980Ae A00;
    public final C02010Ah A01;

    public AnonymousClass3DO(C02010Ah r1, C01980Ae r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC29071Wx
    public void A3Z() {
        AnonymousClass008.A0q(this.A01, "payments_setup_country_specific_info", null);
    }

    @Override // X.AbstractC29071Wx
    public boolean APX(AbstractC43791yx r4) {
        if (!this.A01.A01().getBoolean("payments_card_can_receive_payment", false) || !this.A00.A09()) {
            return true;
        }
        return false;
    }
}
