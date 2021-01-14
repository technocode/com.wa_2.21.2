package X;

import android.content.Context;
import android.os.RemoteException;
import java.util.Collections;

/* renamed from: X.26M  reason: invalid class name */
public final class AnonymousClass26M extends AbstractC35671kk {
    public AnonymousClass1AA A00;
    public final AnonymousClass19x A01 = new AnonymousClass19x(this);
    public final AnonymousClass1A3 A02;
    public final AnonymousClass1AI A03;

    public AnonymousClass26M(C242819u r3) {
        super(r3);
        this.A03 = new AnonymousClass1AI(r3.A03);
        this.A02 = new C35681kl(this, r3);
    }

    public final void A0D() {
        AnonymousClass16M.A00();
        A0C();
        try {
            C239618g A002 = C239618g.A00();
            Context context = ((C242619s) this).A00.A00;
            AnonymousClass19x r0 = this.A01;
            if (A002 != null) {
                context.unbindService(r0);
                if (this.A00 != null) {
                    this.A00 = null;
                    AnonymousClass26L r02 = ((C242619s) this).A00.A04;
                    C242819u.A01(r02);
                    r02.A0C();
                    AnonymousClass16M.A00();
                    AnonymousClass26P r1 = r02.A00;
                    AnonymousClass16M.A00();
                    r1.A0C();
                    r1.A03("Service disconnected");
                    return;
                }
                return;
            }
            throw null;
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public final void A0E() {
        this.A03.A00();
        this.A02.A01(((Number) AnonymousClass1A5.A05.A00).longValue());
    }

    public final boolean A0F() {
        AnonymousClass16M.A00();
        A0C();
        return this.A00 != null;
    }

    public final boolean A0G(AnonymousClass1A9 r9) {
        String str;
        C001801b.A1Q(r9);
        AnonymousClass16M.A00();
        A0C();
        AnonymousClass1AA r2 = this.A00;
        if (r2 == null) {
            return false;
        }
        if (r9.A04) {
            str = (String) AnonymousClass1A5.A0K.A00;
        } else {
            str = (String) AnonymousClass1A5.A0J.A00;
        }
        try {
            r2.AS2(r9.A03, r9.A02, str, Collections.emptyList());
            A0E();
            return true;
        } catch (RemoteException unused) {
            A03("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
