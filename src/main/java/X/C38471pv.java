package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1pv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38471pv implements AnonymousClass1O8 {
    public final /* synthetic */ AnonymousClass2DH A00;
    public final /* synthetic */ C007003k A01;

    public /* synthetic */ C38471pv(AnonymousClass2DH r1, C007003k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1O8
    public final void AQl() {
        AnonymousClass2DH r3 = this.A00;
        C007003k r1 = this.A01;
        AnonymousClass0GG r2 = r3.A0D;
        Jid A02 = r1.A02(UserJid.class);
        if (A02 != null) {
            r2.A07(r3, null, (UserJid) A02);
            return;
        }
        throw null;
    }
}
