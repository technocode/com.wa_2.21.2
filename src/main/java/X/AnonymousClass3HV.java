package X;

/* renamed from: X.3HV  reason: invalid class name */
public class AnonymousClass3HV implements AbstractC61562tN {
    public final /* synthetic */ AnonymousClass3HW A00;
    public final /* synthetic */ byte[] A01;

    public AnonymousClass3HV(AnonymousClass3HW r1, byte[] bArr) {
        this.A00 = r1;
        this.A01 = bArr;
    }

    @Override // X.AbstractC61562tN
    public void AFb(C61072sS r2) {
        AbstractC63192w0.A00(this.A00.A01);
    }

    @Override // X.AbstractC61562tN
    public void AJa(C68653Ea r8) {
        byte[] bArr = this.A01;
        AnonymousClass0M5 r2 = new AnonymousClass0M5("pin", new AnonymousClass0OS[]{new AnonymousClass0OS("key-type", r8.A03, null, (byte) 0), new AnonymousClass0OS("key-version", r8.A04, null, (byte) 0), new AnonymousClass0OS("provider", r8.A05, null, (byte) 0)}, null, r8.A00.A44(bArr, C007603r.A0C(16)));
        AnonymousClass3HW r1 = this.A00;
        r1.A00.A0r();
        r1.A01.A04(r2, null);
    }
}
