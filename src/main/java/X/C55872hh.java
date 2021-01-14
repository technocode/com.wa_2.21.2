package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2hh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55872hh implements AnonymousClass1UE {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ AnonymousClass0XI A02;

    public /* synthetic */ C55872hh(AnonymousClass0XI r1, UserJid userJid, long j) {
        this.A02 = r1;
        this.A01 = userJid;
        this.A00 = j;
    }

    @Override // X.AnonymousClass1UE
    public final void AA9(byte[] bArr) {
        AnonymousClass0XI r5 = this.A02;
        UserJid userJid = this.A01;
        long j = this.A00;
        byte[] A0N = AnonymousClass0ZG.A0N(bArr, null);
        if (A0N != null) {
            try {
                C02840Dr A09 = C02840Dr.A09(A0N);
                if ((A09.A00 & 65536) == 65536) {
                    AnonymousClass01S r11 = r5.A06;
                    AnonymousClass008.A14("LocationSharingManager/onReceiveLocation; location.jid=", userJid);
                    long A05 = r11.A0F.A05();
                    C02900Dx A012 = AnonymousClass01S.A01(userJid, A09, null);
                    A012.A05 = A05 - (1000 * j);
                    if (r11.A0h(A012)) {
                        for (AnonymousClass0EF r0 : r11.A0X) {
                            r0.AJ5(A012);
                        }
                        r11.A0P.A09(userJid, A09, j);
                        return;
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("LocationSharingManager/onReceiveLocation/sharer not in any group; remote_resource=");
                    A0S.append(A012.A06);
                    Log.w(A0S.toString());
                    return;
                }
                StringBuilder sb = new StringBuilder("axolotl e2eMessage is missing live location message; jid=");
                sb.append(userJid);
                Log.w(sb.toString());
            } catch (C04190Jk e) {
                StringBuilder sb2 = new StringBuilder("axolotl derived plaintext does not represent valid protocol buffer; jid=");
                sb2.append(userJid);
                Log.w(sb2.toString(), e);
            }
        }
    }
}
