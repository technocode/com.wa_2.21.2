package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1wr  reason: invalid class name and case insensitive filesystem */
public class C42531wr implements AnonymousClass0O4 {
    public final AnonymousClass1SA A00;
    public final AnonymousClass1SD A01;
    public final UserJid A02;

    public C42531wr(AnonymousClass1SD r1, UserJid userJid, AnonymousClass1SA r3) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        return new C42521wq(this.A01, this.A02, this.A00);
    }
}
