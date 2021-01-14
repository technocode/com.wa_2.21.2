package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2xb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC64082xb extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C07320Xb A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ RunnableC64082xb(C07320Xb r1, UserJid userJid, long j, String str, String str2) {
        this.A02 = r1;
        this.A01 = userJid;
        this.A00 = j;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void run() {
        C07320Xb r6 = this.A02;
        UserJid userJid = this.A01;
        long j = this.A00;
        String str = this.A03;
        String str2 = this.A04;
        r6.A08.A0M(userJid, j, str);
        r6.A04.A09(str2, userJid, "status");
        AnonymousClass02M r2 = r6.A03;
        r2.A02.post(new RunnableEBaseShape3S0200000_I0_2(r6, userJid, 39));
    }
}
