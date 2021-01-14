package X;

import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.3YE  reason: invalid class name */
public class AnonymousClass3YE extends AbstractC41241ui {
    public byte[] A00;
    public final ActivityC004702f A01;
    public final FingerprintBottomSheet A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final C61892tu A05;
    public final C61942tz A06;
    public final AnonymousClass3HW A07;

    public AnonymousClass3YE(AnonymousClass00S r1, AnonymousClass01X r2, C61942tz r3, ActivityC004702f r4, FingerprintBottomSheet fingerprintBottomSheet, C61892tu r6, AnonymousClass3HW r7) {
        this.A03 = r1;
        this.A04 = r2;
        this.A06 = r3;
        this.A01 = r4;
        this.A02 = fingerprintBottomSheet;
        this.A05 = r6;
        this.A07 = r7;
    }

    @Override // X.AnonymousClass1Pz
    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A0v(true);
        AnonymousClass3HW r1 = this.A07;
        byte[] bArr = this.A00;
        FingerprintBottomSheet fingerprintBottomSheet2 = r1.A00;
        fingerprintBottomSheet2.A0r();
        AbstractC63192w0 r3 = r1.A01;
        ActivityC004602e r8 = r3.A04;
        AnonymousClass02M r9 = r3.A02;
        AnonymousClass04j r10 = r3.A05;
        C03340Fu r11 = r3.A0C;
        AnonymousClass0GP r12 = r3.A0A;
        C61762th r13 = r3.A0E;
        C61572tO r7 = new C61572tO(r8, r9, r10, r11, r12, r13, "PIN");
        C68653Ea A022 = r13.A02("FB", "PIN", true);
        if (A022 != null) {
            AnonymousClass0M5 r0 = new AnonymousClass0M5("pin", new AnonymousClass0OS[]{new AnonymousClass0OS("key-type", A022.A03, null, (byte) 0), new AnonymousClass0OS("key-version", A022.A04, null, (byte) 0), new AnonymousClass0OS("provider", A022.A05, null, (byte) 0)}, null, A022.A00.A44(bArr, C007603r.A0C(16)));
            fingerprintBottomSheet2.A0r();
            r3.A04(r0, null);
        } else {
            r7.A00("FB", new AnonymousClass3HV(r1, bArr));
        }
        fingerprintBottomSheet.A0r();
    }
}
