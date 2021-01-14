package X;

/* renamed from: X.2ZR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZR implements AbstractC03150Ez {
    public final /* synthetic */ C59062mz A00;

    public /* synthetic */ AnonymousClass2ZR(C59062mz r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        String A07;
        C59062mz r3 = this.A00;
        AnonymousClass36V r5 = (AnonymousClass36V) obj;
        if (r5.A01.A0n.equals(r3.A02.getTag())) {
            int i = r5.A00;
            AnonymousClass1Z4 r0 = r5.A03;
            if (r0 == null) {
                A07 = null;
            } else {
                A07 = r0.A07();
            }
            r3.A0k(i, A07, r5.A02);
        }
    }
}
