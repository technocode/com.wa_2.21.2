package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2hf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55852hf implements AnonymousClass1UE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass02N A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ AnonymousClass0XI A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C55852hf(AnonymousClass0XI r1, DeviceJid deviceJid, AnonymousClass02N r3, String str, long j) {
        this.A03 = r1;
        this.A02 = deviceJid;
        this.A01 = r3;
        this.A04 = str;
        this.A00 = j;
    }

    @Override // X.AnonymousClass1UE
    public final void AA9(byte[] bArr) {
        C02900Dx r0;
        AnonymousClass0XI r7 = this.A03;
        DeviceJid deviceJid = this.A02;
        AnonymousClass02N r10 = this.A01;
        String str = this.A04;
        long j = this.A00;
        byte[] A0N = AnonymousClass0ZG.A0N(bArr, null);
        if (A0N != null) {
            try {
                C02840Dr A09 = C02840Dr.A09(A0N);
                if ((A09.A00 & 65536) == 65536) {
                    AnonymousClass01S r8 = r7.A06;
                    UserJid userJid = deviceJid.userJid;
                    StringBuilder sb = new StringBuilder("LocationSharingManager/onReceiveFinalLocation/jid=");
                    sb.append(r10);
                    sb.append("; senderJid=");
                    sb.append(userJid);
                    sb.append("; msgId=");
                    sb.append(str);
                    Log.i(sb.toString());
                    C02850Ds A07 = r8.A07(new C007303n(r10, false, str));
                    if (A07 == null) {
                        StringBuilder sb2 = new StringBuilder("LocationSharingManager/onReceiveFinalLocation/Live location message not found; jid=");
                        sb2.append(r10);
                        sb2.append("; msgId=");
                        sb2.append(str);
                        Log.i(sb2.toString());
                        return;
                    }
                    C02900Dx A012 = AnonymousClass01S.A01(userJid, A09, A07);
                    if (j > 0) {
                        A012.A05 = j;
                    }
                    synchronized (r8.A0R) {
                        C02900Dx r02 = (C02900Dx) r8.A0c.get(userJid);
                        if (r02 != null && r02.A05 < A012.A05) {
                            r8.A0h(A012);
                        }
                        Map map = (Map) r8.A0C().get(r10);
                        if ((map == null || !map.containsKey(userJid)) && ((r0 = A07.A02) == null || r0.A05 < A012.A05)) {
                            r8.A0Y(A07, A012);
                        }
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder("RecvLocationMessageListener/onFinalLocationNotification/axolotl e2eMessage is missing live location message; senderJid=");
                sb3.append(deviceJid);
                Log.w(sb3.toString());
            } catch (C04190Jk e) {
                StringBuilder sb4 = new StringBuilder("RecvLocationMessageListener/onFinalLocationNotification/axolotl derived plaintext does not represent valid protocol buffer; senderJid=");
                sb4.append(deviceJid);
                Log.w(sb4.toString(), e);
            }
        }
    }
}
