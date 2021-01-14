package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0eA  reason: invalid class name and case insensitive filesystem */
public class C10150eA extends AnonymousClass0JW {
    public int A00;
    public AnonymousClass0MH A01;
    public UserJid A02;
    public Runnable A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0AB A06;
    public final C03340Fu A07;
    public final C01970Ad A08;
    public final AnonymousClass0AL A09;

    public C10150eA(AnonymousClass00S r1, AnonymousClass0AB r2, AnonymousClass0AL r3, C01970Ad r4, AnonymousClass01K r5, C03340Fu r6, AnonymousClass0MH r7, UserJid userJid, int i, Runnable runnable) {
        this.A04 = r1;
        this.A06 = r2;
        this.A09 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A01 = r7;
        this.A02 = userJid;
        this.A00 = i;
        this.A03 = runnable;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC007503q A092 = this.A05.A09(this.A01);
        if (A092 != null) {
            AnonymousClass0MH r2 = A092.A0F;
            r2.A01 = this.A00;
            r2.A05 = this.A04.A05();
            this.A06.A02(A092, 16);
        }
        this.A03.run();
    }
}
