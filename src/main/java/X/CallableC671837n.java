package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.37n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC671837n implements Callable {
    public final /* synthetic */ AnonymousClass0E6 A00;
    public final /* synthetic */ DeviceJid A01;
    public final /* synthetic */ AnonymousClass02P A02;
    public final /* synthetic */ AnonymousClass392 A03;
    public final /* synthetic */ byte[] A04;

    public /* synthetic */ CallableC671837n(AnonymousClass392 r1, DeviceJid deviceJid, byte[] bArr, AnonymousClass02P r4, AnonymousClass0E6 r5) {
        this.A03 = r1;
        this.A01 = deviceJid;
        this.A04 = bArr;
        this.A02 = r4;
        this.A00 = r5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnonymousClass392 r5 = this.A03;
        DeviceJid deviceJid = this.A01;
        byte[] bArr = this.A04;
        AnonymousClass02P r4 = this.A02;
        AnonymousClass0E6 r3 = this.A00;
        if (r5.A0B.A08(deviceJid, bArr, r4)) {
            int i = r4.A00;
            if (i == 0) {
                return r5.A07.A04(r3, r4.A02, null);
            }
            if (i == 1) {
                return r5.A07.A05(r3, r4.A02, null);
            }
            StringBuilder A0S = AnonymousClass008.A0S("invalid ciphertext type; ciphertextType=");
            A0S.append(i);
            throw new IllegalArgumentException(A0S.toString());
        }
        Log.e("voip/encryption/decryptCallKey/invalid device identity");
        return new AnonymousClass1UF(null, -1010);
    }
}
