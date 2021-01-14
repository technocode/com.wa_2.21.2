package X;

/* renamed from: X.2hi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55882hi {
    public final /* synthetic */ AbstractC49792Sd A00;

    public /* synthetic */ C55882hi(AbstractC49792Sd r1) {
        this.A00 = r1;
    }

    public final void A00(float f) {
        AbstractC49792Sd r3 = this.A00;
        int i = (int) f;
        r3.A00 = i;
        int max = Math.max(i, r3.A02);
        r3.A0K.setPadding(0, 0, 0, max);
        r3.A0K.requestLayout();
        r3.A0F(max);
    }
}
