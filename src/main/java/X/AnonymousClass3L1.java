package X;

import java.io.Writer;

/* renamed from: X.3L1  reason: invalid class name */
public final class AnonymousClass3L1 implements AnonymousClass0GM {
    public final AnonymousClass0GM A00;
    public final AnonymousClass0GM A01;
    public final AnonymousClass0GO A02;
    public final Writer A03;
    public final String A04;

    public AnonymousClass3L1(AnonymousClass0GM r2, AnonymousClass0GM r3, Writer writer, String str) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = writer;
        this.A02 = new AnonymousClass3L5(writer);
        this.A04 = str;
    }

    @Override // X.AnonymousClass0GM
    public String ABj() {
        return this.A00.ABj();
    }

    @Override // X.AnonymousClass0GM
    public AnonymousClass0M5 ACR() {
        AnonymousClass0M5 ACR = this.A00.ACR();
        try {
            this.A03.write(this.A04);
            this.A02.ARM(ACR);
        } catch (Exception unused) {
        }
        return ACR;
    }

    @Override // X.AnonymousClass0GM
    public AnonymousClass0M5 ACS(byte[] bArr) {
        AnonymousClass0M5 ACS = this.A01.ACS(bArr);
        try {
            this.A03.write(this.A04);
            this.A02.ARM(ACS);
        } catch (Exception unused) {
        }
        return ACS;
    }
}
