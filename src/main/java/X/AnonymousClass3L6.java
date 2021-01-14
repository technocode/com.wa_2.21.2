package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.3L6  reason: invalid class name */
public class AnonymousClass3L6 implements AnonymousClass09O {
    public final AnonymousClass0GG A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass09H A04;
    public final AbstractC03810Hu A05;
    public final boolean A06;

    public AnonymousClass3L6(AnonymousClass02M r3, AnonymousClass009 r4, AnonymousClass09H r5, AnonymousClass0GG r6, AnonymousClass00D r7, AbstractC03810Hu r8) {
        this.A02 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A00 = r6;
        this.A03 = r7;
        this.A05 = r8;
        this.A06 = r6.A07.A0D(AbstractC000400g.A1O);
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        AnonymousClass008.A18("getblocklistprotocolhelper/onDeliveryFailure iq=", str);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        int A0E = C002001d.A0E(r5);
        if (A0E != 404 || this.A06) {
            StringBuilder sb = new StringBuilder("getblocklistprotocolhelper/onError, iq=");
            sb.append(str);
            sb.append("; errorCode=");
            sb.append(A0E);
            Log.i(sb.toString());
            return;
        }
        this.A02.A0E(new RunnableEBaseShape12S0100000_I1_7(this, 1));
        AbstractC03810Hu r1 = this.A05;
        if (r1 != null) {
            ((AnonymousClass3LC) r1).A00(4);
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r12) {
        Jid A08;
        int i = 0;
        if (this.A06) {
            AnonymousClass0M5 A0D = r12.A0D("list");
            if (A0D != null) {
                HashSet hashSet = new HashSet();
                String A0G = A0D.A0G("dhash", null);
                AnonymousClass0M5[] r3 = A0D.A03;
                if (r3 != null) {
                    while (i < r3.length) {
                        AnonymousClass0M5 r2 = r3[i];
                        AnonymousClass0M5.A01(r2, "item");
                        hashSet.add(r2.A08(UserJid.class, "jid", this.A01));
                        i++;
                    }
                }
                this.A02.A0E(new RunnableEBaseShape1S1200000_I1(this, hashSet, A0G, 26));
            } else {
                Log.d("getblocklistprotocolhelper/handleSuccessResponseV2/hash matched.");
            }
        } else {
            AnonymousClass0M5 A0B = r12.A0B();
            AnonymousClass0M5.A01(A0B, "query");
            AnonymousClass0M5 A0B2 = A0B.A0B();
            AnonymousClass0M5.A01(A0B2, "list");
            HashSet hashSet2 = new HashSet();
            AnonymousClass0M5[] r9 = A0B2.A03;
            if (r9 != null) {
                while (i < r9.length) {
                    AnonymousClass0M5 r32 = r9[i];
                    AnonymousClass0M5.A01(r32, "item");
                    if ("jid".equals(r32.A0G("type", null)) && (A08 = r32.A08(UserJid.class, "value", this.A01)) != null) {
                        hashSet2.add(A08);
                    }
                    i++;
                }
            }
            this.A02.A0E(new RunnableEBaseShape9S0200000_I1_4(this, hashSet2, 1));
        }
        AbstractC03810Hu r1 = this.A05;
        if (r1 != null) {
            ((AnonymousClass3LC) r1).A00(4);
        }
    }
}
