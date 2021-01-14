package X;

/* renamed from: X.1qG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38671qG implements AbstractC26941Ng {
    public final /* synthetic */ C26571Ll A00;
    public final /* synthetic */ C26621Lq A01;

    public /* synthetic */ C38671qG(C26621Lq r1, C26571Ll r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC26941Ng
    public final void AKD(int[] iArr) {
        C26621Lq r3 = this.A01;
        C26571Ll r2 = this.A00;
        r3.A0O.A0A(iArr);
        if (r3.A00 != 0) {
            r3.A0D[0].notifyDataSetChanged();
        }
        AbstractC26561Lk r0 = r3.A0B;
        if (r0 != null) {
            r0.AFR(iArr);
        }
        r2.setEmoji(iArr);
        C26621Lq.A01(r3.A0P, iArr);
        r2.invalidate();
    }
}
