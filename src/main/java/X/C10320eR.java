package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.0eR  reason: invalid class name and case insensitive filesystem */
public class C10320eR extends AnonymousClass0JW {
    public Set A00;
    public Set A01;
    public final UserJid A02;
    public final WeakReference A03;
    public final /* synthetic */ AnonymousClass0CB A04;

    public C10320eR(AnonymousClass0CB r2, UserJid userJid, AbstractC49432Ql r4) {
        this.A04 = r2;
        this.A02 = userJid;
        this.A03 = new WeakReference(r4);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AbstractC49432Ql r0 = (AbstractC49432Ql) this.A03.get();
        if (r0 != null) {
            r0.AIg();
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass1UI r4 = (AnonymousClass1UI) obj;
        AbstractC49432Ql r2 = (AbstractC49432Ql) this.A03.get();
        if (r2 != null) {
            r2.AG9(r4, this.A00, this.A01);
        }
    }
}
