package X;

/* renamed from: X.3NF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NF implements AnonymousClass0SG {
    public final /* synthetic */ C08740bd A00;

    public /* synthetic */ AnonymousClass3NF(C08740bd r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C08740bd r2 = this.A00;
        C08680bX r0 = r2.A0G;
        int intValue = ((Number) obj).intValue();
        r0.A02 = intValue;
        r2.A0H.A02 = intValue;
        boolean z = false;
        if (intValue == 0) {
            z = true;
        }
        r2.A00(z);
    }
}
