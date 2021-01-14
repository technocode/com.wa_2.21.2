package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.2hg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55862hg implements AnonymousClass1UE {
    public final /* synthetic */ AnonymousClass0E6 A00;
    public final /* synthetic */ AnonymousClass0XI A01;
    public final /* synthetic */ AnonymousClass1XX A02;

    public /* synthetic */ C55862hg(AnonymousClass0XI r1, AnonymousClass1XX r2, AnonymousClass0E6 r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass1UE
    public final void AA9(byte[] bArr) {
        AnonymousClass0XI r7 = this.A01;
        AnonymousClass1XX r3 = this.A02;
        AnonymousClass0E6 r6 = this.A00;
        byte[] A0N = AnonymousClass0ZG.A0N(bArr, null);
        if (A0N == null) {
            StringBuilder sb = new StringBuilder("axolotl derived invalid plaintext; stanzaKey=");
            sb.append(r3);
            Log.w(sb.toString());
            return;
        }
        try {
            C02840Dr A09 = C02840Dr.A09(A0N);
            List A0A = AnonymousClass0ZG.A0A(A09);
            if (((AbstractCollection) A0A).size() != 0) {
                StringBuilder sb2 = new StringBuilder("axolotl received an invalid protobuf; stanzaKey=");
                sb2.append(r3);
                sb2.append("; messageTypes=");
                sb2.append(A0A);
                Log.w(sb2.toString());
            } else if ((A09.A00 & 16384) == 16384) {
                StringBuilder sb3 = new StringBuilder("axolotl received sender key distribution message; stanzaKey=");
                sb3.append(r3);
                Log.i(sb3.toString());
                C76473eb r4 = A09.A0T;
                if (r4 == null) {
                    r4 = C76473eb.A03;
                }
                int i = r4.A00;
                if ((i & 1) == 1 && (i & 2) == 2) {
                    AnonymousClass0OE r5 = new AnonymousClass0OE(AnonymousClass2A2.A00.getRawString(), r6);
                    C001000o r2 = r7.A04;
                    byte[] A012 = r4.A01.A01();
                    r2.A0H.A00();
                    AnonymousClass05B r0 = r2.A00;
                    try {
                        new AnonymousClass1Yq(r0.A00.A01).A01(C002001d.A2L(r5), new AnonymousClass239(A012));
                    } catch (C29401Yi e) {
                        Log.w("axolotl", e);
                        StringBuilder sb4 = new StringBuilder("axolotl received legacy sender key distribution message; stanzaKey=");
                        sb4.append(r3);
                        Log.w(sb4.toString());
                    } catch (C29381Yg e2) {
                        Log.w("axolotl", e2);
                        StringBuilder sb5 = new StringBuilder("axolotl received invalid sender key distribution message; stanzaKey=");
                        sb5.append(r3);
                        Log.w(sb5.toString());
                    }
                } else {
                    StringBuilder sb6 = new StringBuilder("axolotl received incomplete sender key distribution message; stanzaKey=");
                    sb6.append(r3);
                    Log.w(sb6.toString());
                }
            }
        } catch (C04190Jk e3) {
            StringBuilder sb7 = new StringBuilder("axolotl derived plaintext does not represent valid protocol buffer; stanzaKey=");
            sb7.append(r3);
            Log.w(sb7.toString(), e3);
        }
    }
}
