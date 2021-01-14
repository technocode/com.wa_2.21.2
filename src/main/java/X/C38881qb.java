package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.1qb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38881qb implements AnonymousClass1W0 {
    public final /* synthetic */ AnonymousClass0L0 A00;

    public /* synthetic */ C38881qb(AnonymousClass0L0 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1W0
    public final void ANA(Jid jid) {
        AnonymousClass0L0 r2 = this.A00;
        AnonymousClass02N r4 = (AnonymousClass02N) jid;
        if (r4 != null) {
            if (!AnonymousClass1VY.A0Y(r4) || r2.A0N.A04((GroupJid) r4)) {
                r2.A0M.A0a(r4, null);
            }
            r2.A0W.A04(r4);
        }
    }
}
