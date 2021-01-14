package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1xJ  reason: invalid class name and case insensitive filesystem */
public class C42801xJ implements AnonymousClass0O4 {
    public final C000300f A00;
    public final C42651x3 A01;
    public final AnonymousClass1SS A02;
    public final UserJid A03;

    public C42801xJ(AnonymousClass1SS r1, UserJid userJid, C000300f r3, C42651x3 r4) {
        this.A02 = r1;
        this.A03 = userJid;
        this.A00 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        return new C42791xI(this.A02, this.A03, this.A00, this.A01);
    }
}
