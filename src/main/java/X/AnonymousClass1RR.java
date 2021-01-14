package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1RR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1RR extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C04520Kr A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ AnonymousClass0OB A06;
    public final /* synthetic */ AnonymousClass0OB A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public /* synthetic */ AnonymousClass1RR(C04520Kr r1, UserJid userJid, int i, int i2, String str, String str2, AnonymousClass0OB r7, AnonymousClass0OB r8, int i3, int i4) {
        this.A04 = r1;
        this.A05 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final void run() {
        C04520Kr r3 = this.A04;
        UserJid userJid = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        AnonymousClass0OB r9 = this.A06;
        AnonymousClass0OB r10 = this.A07;
        int i3 = this.A02;
        int i4 = this.A03;
        AnonymousClass01A r0 = r3.A01;
        C007003k A0A = r0.A0A(userJid);
        r0.A0H();
        r3.A05.A03(A0A);
        r3.A03.A0E(userJid, new AnonymousClass1YN(i, i2, str, str2, r9, r10, false, i3, i4));
    }
}
