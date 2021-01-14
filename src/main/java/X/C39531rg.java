package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1rg  reason: invalid class name and case insensitive filesystem */
public class C39531rg extends C26381Kq {
    public final /* synthetic */ C26441Kw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39531rg(C014308b r1, AnonymousClass01X r2, C26441Kw r3) {
        super(r1, r2);
        this.A00 = r3;
    }

    @Override // X.C26381Kq
    public int A00(C007003k r6, C007003k r7) {
        C26441Kw r4 = this.A00;
        boolean contains = r4.A02.contains(r6.A02(UserJid.class));
        if (contains == r4.A02.contains(r7.A02(UserJid.class))) {
            return super.compare(r6, r7);
        }
        return contains ? -1 : 1;
    }
}
