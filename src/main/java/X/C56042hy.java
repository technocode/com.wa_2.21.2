package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2hy  reason: invalid class name and case insensitive filesystem */
public class C56042hy implements AnonymousClass0EF {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    public C56042hy(AbstractView$OnCreateContextMenuListenerC56112i5 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0EF
    public void AJ5(C02900Dx r10) {
        C02920Dz r1;
        AbstractView$OnCreateContextMenuListenerC56112i5 r8 = this.A00;
        AnonymousClass01S r3 = r8.A1D;
        AnonymousClass02N r2 = r8.A0e;
        UserJid userJid = r10.A06;
        synchronized (r3.A0R) {
            Map map = (Map) r3.A0C().get(r2);
            if (map != null) {
                if (userJid == null) {
                    r1 = (C02920Dz) map.get(r2);
                } else {
                    r1 = (C02920Dz) map.get(userJid);
                }
                if (r1 != null) {
                    long A05 = r3.A0F.A05();
                    long j = r1.A00;
                    if (j == 0 || j > A05) {
                        r8.A0S(r10);
                    }
                }
            }
        }
    }

    @Override // X.AnonymousClass0EF
    public void AJ6(AnonymousClass02N r3, UserJid userJid) {
        AbstractView$OnCreateContextMenuListenerC56112i5 r1 = this.A00;
        if (r1.A0e.equals(r3)) {
            r1.A0I();
        }
    }

    @Override // X.AnonymousClass0EF
    public void AJ7(AnonymousClass02N r4, UserJid userJid) {
        AbstractView$OnCreateContextMenuListenerC56112i5 r2 = this.A00;
        if (r2.A0e.equals(r4)) {
            if (userJid == null) {
                userJid = UserJid.of(r4);
            }
            C02900Dx r0 = r2.A0o;
            if (r0 != null && r0.A06.equals(userJid)) {
                r2.A0o = null;
            }
            Set set = r2.A1P;
            synchronized (set) {
                set.add(userJid);
            }
            r2.A0I();
        }
    }
}
