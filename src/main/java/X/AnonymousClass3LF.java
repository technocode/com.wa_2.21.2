package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.3LF  reason: invalid class name */
public class AnonymousClass3LF implements AnonymousClass09O {
    public final AnonymousClass009 A00;
    public final AnonymousClass09H A01;
    public final AbstractC64602yS A02;
    public volatile UserJid A03;

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
    }

    public AnonymousClass3LF(AnonymousClass009 r1, AnonymousClass09H r2, AbstractC64602yS r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(UserJid userJid, long j) {
        this.A03 = userJid;
        AnonymousClass09H r13 = this.A01;
        String A022 = r13.A02();
        ArrayList arrayList = new ArrayList();
        long j2 = j / 1000;
        if (j2 == 0) {
            arrayList.add(new AnonymousClass0M5("user", new AnonymousClass0OS[]{new AnonymousClass0OS("jid", userJid)}, null, null));
        } else {
            arrayList.add(new AnonymousClass0M5("user", new AnonymousClass0OS[]{new AnonymousClass0OS("jid", userJid), new AnonymousClass0OS("t", Long.toString(j2), null, (byte) 0)}, null, null));
        }
        AnonymousClass0M5 r10 = new AnonymousClass0M5("status", null, (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null);
        r13.A0B(41, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "status", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r10), this, 0);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        this.A02.AFa(this.A03, C002001d.A0E(r5));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r10) {
        AnonymousClass0M5[] r2;
        AnonymousClass0M5 A0D = r10.A0D("status");
        if (A0D == null || (r2 = A0D.A03) == null || r2.length != 1) {
            this.A02.AI1(this.A03);
            return;
        }
        AnonymousClass0M5 r7 = r2[0];
        AnonymousClass0M5.A01(r7, "user");
        long A04 = C006803i.A04(r7.A0G("t", null), 0) * 1000;
        String A0G = r7.A0G("code", null);
        String A0G2 = r7.A0G("type", null);
        UserJid userJid = (UserJid) r7.A09(UserJid.class, "jid", this.A00);
        String A002 = AnonymousClass0M5.A00(r7.A01);
        if (A0G2 == null || !A0G2.equals("fail")) {
            this.A02.AKS(userJid, A002, A04);
        } else if ("401".equals(A0G) || "403".equals(A0G) || "404".equals(A0G)) {
            this.A02.AEs(userJid);
        } else {
            this.A02.AI1(userJid);
        }
    }
}
