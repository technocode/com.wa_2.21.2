package X;

/* renamed from: X.3GF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GF implements AbstractC61922tx {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ AnonymousClass1PT A01;

    public /* synthetic */ AnonymousClass3GF(AnonymousClass1PT r1, C28021Sn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61922tx
    public final void AJZ(C61072sS r4) {
        C28021Sn r2 = this.A00;
        if (r4 == null) {
            r2.A00("on_success");
        } else {
            AnonymousClass1PT.A04(null, r4.code, r2);
        }
    }
}
