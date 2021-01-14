package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1tB  reason: invalid class name and case insensitive filesystem */
public class C40381tB implements AbstractC64602yS {
    public final AbstractC03810Hu A00;
    public final /* synthetic */ C03490Gl A01;

    public C40381tB(C03490Gl r1, AbstractC03810Hu r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC64602yS
    public void AEs(UserJid userJid) {
        AbstractC03810Hu r1 = this.A00;
        if (r1 != null) {
            ((AnonymousClass3LC) r1).A00(1);
        }
    }

    @Override // X.AbstractC64602yS
    public void AFa(UserJid userJid, int i) {
        AnonymousClass02M r2 = this.A01.A03;
        r2.A02.post(new RunnableEBaseShape6S0100000_I1_1(this, 19));
    }

    @Override // X.AbstractC64602yS
    public void AI1(UserJid userJid) {
        AbstractC03810Hu r1 = this.A00;
        if (r1 != null) {
            ((AnonymousClass3LC) r1).A00(1);
        }
    }

    @Override // X.AbstractC64602yS
    public void AKS(UserJid userJid, String str, long j) {
        AbstractC03810Hu r1 = this.A00;
        if (r1 != null) {
            ((AnonymousClass3LC) r1).A00(1);
        }
        AnonymousClass02M r2 = this.A01.A03;
        r2.A02.post(new RunnableEBaseShape1S1100000_I1(this, str, 7));
    }
}
