package X;

import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.1Mc  reason: invalid class name and case insensitive filesystem */
public class C26701Mc implements Comparator {
    public Set A00;
    public final C49352Qd A01;

    public C26701Mc(AnonymousClass01I r2, C014308b r3) {
        this.A01 = new C49352Qd(r2, r3);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C007003k r4 = (C007003k) obj;
        C007003k r5 = (C007003k) obj2;
        Set set = this.A00;
        if (set == null) {
            throw null;
        } else if (set.contains(r4.A02(UserJid.class)) && this.A00.contains(r5.A02(UserJid.class))) {
            return this.A01.compare(r4, r5);
        } else {
            if (this.A00.contains(r4.A02(UserJid.class))) {
                return -1;
            }
            if (this.A00.contains(r5.A02(UserJid.class))) {
                return 1;
            }
            return this.A01.compare(r4, r5);
        }
    }
}
