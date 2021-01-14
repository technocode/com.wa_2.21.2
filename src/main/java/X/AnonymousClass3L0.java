package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3L0  reason: invalid class name */
public class AnonymousClass3L0 implements AbstractC64602yS {
    public final AnonymousClass02M A00;
    public final AnonymousClass0DH A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass08B A03;
    public final AnonymousClass0I9 A04;
    public final AnonymousClass00T A05;

    public AnonymousClass3L0(AnonymousClass02M r1, AnonymousClass00T r2, AnonymousClass0DH r3, AnonymousClass01A r4, AnonymousClass08B r5, AnonymousClass0I9 r6) {
        this.A00 = r1;
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    @Override // X.AbstractC64602yS
    public void AEs(UserJid userJid) {
        AnonymousClass008.A14("getstatus/delete jid=", userJid);
        C007003k A09 = this.A02.A09(userJid);
        if (A09 != null) {
            A09.A0L = null;
            A09.A07 = 0;
            this.A05.ANF(new RunnableEBaseShape2S0300000_I1(this, A09, userJid, 38));
        }
    }

    @Override // X.AbstractC64602yS
    public void AFa(UserJid userJid, int i) {
        StringBuilder sb = new StringBuilder("getstatus/failed jid=");
        sb.append(userJid);
        sb.append(" code=");
        sb.append(i);
        Log.w(sb.toString());
    }

    @Override // X.AbstractC64602yS
    public void AI1(UserJid userJid) {
        AnonymousClass008.A14("getstatus/nochange jid=", userJid);
    }

    @Override // X.AbstractC64602yS
    public void AKS(UserJid userJid, String str, long j) {
        C007003k A09 = this.A02.A09(userJid);
        if (A09 != null) {
            A09.A0L = str;
            A09.A07 = j;
            StringBuilder A0X = AnonymousClass008.A0X("getstatus/received  jid=", userJid, " status=");
            A0X.append(A09.A0L);
            A0X.append(" timestamp=");
            AnonymousClass008.A1P(A0X, A09.A07);
            this.A05.ANF(new RunnableEBaseShape2S0300000_I1(this, A09, userJid, 38));
        }
    }
}
