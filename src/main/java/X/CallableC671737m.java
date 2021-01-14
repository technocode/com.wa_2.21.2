package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.37m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC671737m implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ AnonymousClass392 A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ CallableC671737m(AnonymousClass392 r1, DeviceJid deviceJid, String str, int i, int i2) {
        this.A03 = r1;
        this.A02 = deviceJid;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnonymousClass392 r6 = this.A03;
        DeviceJid deviceJid = this.A02;
        String str = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        C007303n r5 = new C007303n(deviceJid.userJid, true, str);
        AnonymousClass0E6 A0A = C001801b.A0A(deviceJid);
        C001000o r3 = r6.A07;
        AnonymousClass1UN A0D = r3.A0D(A0A);
        AnonymousClass1UO r1 = A0D.A01;
        byte[] A012 = r1.A00.A05.A01();
        if (A0D.A00 || r1.A00.A03 != i) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/receive_message/onPeerE2EDecryptionFailed registration id is not equal. stored= ");
            AnonymousClass008.A1O(A0S, r1.A00.A03, ", incoming=", i, ". Fetching new prekey for: ");
            A0S.append(r5);
            Log.i(A0S.toString());
            r6.A01(deviceJid);
            return null;
        } else if (i2 <= 2 || !r3.A0X(A0A, r5)) {
            if (i2 == 2) {
                StringBuilder sb = new StringBuilder("voip/receive_message/onPeerE2EDecryptionFailed recording base key. ");
                sb.append(r5);
                Log.i(sb.toString());
                r3.A0Q(A0A, r5, A012);
            }
            return deviceJid;
        } else {
            StringBuilder sb2 = new StringBuilder("voip/receive_message/onPeerE2EDecryptionFailed reg id is equal and has same basekey. Fetching new prekey for: ");
            sb2.append(r5);
            Log.i(sb2.toString());
            r6.A01(deviceJid);
            return null;
        }
    }
}
