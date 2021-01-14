package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Kq  reason: invalid class name and case insensitive filesystem */
public class C26381Kq implements Comparator {
    public final C014308b A00;
    public final Collator A01;
    public final Map A02 = new HashMap();

    public C26381Kq(C014308b r3, AnonymousClass01X r4) {
        this.A00 = r3;
        Collator instance = Collator.getInstance(r4.A0I());
        this.A01 = instance;
        instance.setDecomposition(1);
    }

    /* renamed from: A00 */
    public int compare(C007003k r7, C007003k r8) {
        String A012 = A01(r7);
        String A013 = A01(r8);
        if (A012 == null && A013 == null) {
            return 0;
        }
        if (A012 == null) {
            return 1;
        }
        if (A013 == null) {
            return -1;
        }
        int compare = this.A01.compare(A012, A013);
        if (compare != 0) {
            return compare;
        }
        Jid jid = r7.A09;
        if (jid == null && r8.A09 == null) {
            return 0;
        }
        if (jid == null) {
            return 1;
        }
        Jid jid2 = r8.A09;
        if (jid2 == null) {
            return -1;
        }
        return jid.getRawString().compareTo(jid2.getRawString());
    }

    public final String A01(C007003k r5) {
        if (r5 == null) {
            return null;
        }
        String str = r5.A0K;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (r5.A09 == null) {
            return null;
        }
        Map map = this.A02;
        String str2 = (String) map.get(r5.A02(UserJid.class));
        if (str2 != null) {
            return str2;
        }
        String A08 = this.A00.A08(r5, false);
        map.put(r5.A02(UserJid.class), A08);
        return A08;
    }
}
