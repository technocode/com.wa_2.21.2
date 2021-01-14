package X;

import com.whatsapp.util.Log;

/* renamed from: X.2ku  reason: invalid class name and case insensitive filesystem */
public final class C57812ku implements AnonymousClass1UE {
    public final AnonymousClass01K A00;
    public final AnonymousClass1XJ A01;

    public C57812ku(AnonymousClass01K r1, AnonymousClass1XJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1UE
    public void AA9(byte[] bArr) {
        AbstractC007503q A03 = this.A01.A03((byte) 0);
        if (!A03.A0p()) {
            Log.i("decryptmessagerunnable/axolotl message decryption had no data; ciphertext only");
            A03.A0d(AnonymousClass0M5.A00(bArr));
        }
        this.A00.A0d(A03);
    }
}
