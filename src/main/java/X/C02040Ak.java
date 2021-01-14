package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.0Ak  reason: invalid class name and case insensitive filesystem */
public class C02040Ak {
    public static volatile C02040Ak A05;
    public final C000300f A00;
    public final AnonymousClass00S A01;
    public final C02010Ah A02;
    public final C02020Ai A03;
    public final C02030Aj A04;

    public C02040Ak(AnonymousClass00S r1, C000300f r2, C02010Ah r3, C02020Ai r4, C02030Aj r5) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static C02040Ak A00() {
        if (A05 == null) {
            synchronized (C02040Ak.class) {
                if (A05 == null) {
                    A05 = new C02040Ak(AnonymousClass00S.A00(), C000300f.A00(), C02010Ah.A00(), C02020Ai.A00(), C02030Aj.A00);
                }
            }
        }
        return A05;
    }

    public void A01() {
        if (this.A00 == null) {
            throw null;
        }
    }

    public boolean A02() {
        if (!this.A03.A04()) {
            return false;
        }
        if (!this.A00.A0D(AbstractC000400g.A1q)) {
            if (this.A04 == null) {
                throw null;
            } else if (this.A01.A05() < this.A02.A01().getLong("payments_enabled_till", -1)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean A03() {
        return A02() && C05870Qv.A0D == this.A03.A02() && A05();
    }

    public boolean A04() {
        if (A02()) {
            return true;
        }
        A01();
        return false;
    }

    public boolean A05() {
        return this.A03.A04() && this.A00.A0D(AbstractC000400g.A1p);
    }

    public boolean A06(UserJid userJid) {
        if (this.A04 != null) {
            Set set = (Set) AnonymousClass1X0.A00.get(C05870Qv.A01(C001801b.A12(C12420i4.A02(userJid))));
            return set != null && set.contains(this.A03.A02());
        }
        throw null;
    }
}
