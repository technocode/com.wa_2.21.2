package X;

/* renamed from: X.1sJ  reason: invalid class name and case insensitive filesystem */
public class C39911sJ extends AnonymousClass0JW {
    public final /* synthetic */ AnonymousClass1LO A00;
    public final /* synthetic */ AbstractC02860Dt A01;

    public C39911sJ(AnonymousClass1LO r1, AbstractC02860Dt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC02860Dt r2 = this.A01;
        r2.A02 = 2;
        if (bArr != null) {
            r2.A0B().A03(bArr);
            this.A00.A0D.A0Q(r2, -1);
            return;
        }
        this.A00.A0F.A06(r2, -1);
    }
}
