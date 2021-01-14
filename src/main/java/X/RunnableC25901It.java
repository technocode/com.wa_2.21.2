package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1It  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25901It extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0XK A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ C70573Lo A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ RunnableC25901It(AnonymousClass0XK r1, C70573Lo r2, String str, int i, Jid jid) {
        this.A01 = r1;
        this.A03 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A02 = jid;
    }

    public final void run() {
        AnonymousClass0XK r4 = this.A01;
        String str = this.A04;
        Jid jid = this.A02;
        r4.A13.A0E(str, 501);
        r4.A0B.A09(str, jid, "web");
    }
}
