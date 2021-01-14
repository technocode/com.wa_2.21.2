package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Nz  reason: invalid class name and case insensitive filesystem */
public class C27091Nz {
    public UserJid A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass00S A04 = AnonymousClass00S.A00();
    public final List A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final Map A09;

    public C27091Nz(long j, long j2, List list, List list2, List list3, Map map) {
        this.A03 = j2;
        this.A02 = j;
        this.A07 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A08 = map;
        this.A01 = 60000;
        this.A09 = new HashMap();
    }

    public static int A00(UserJid userJid, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (userJid.equals(((AnonymousClass1VC) it.next()).A0A)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean A01(AbstractC007503q r10) {
        long A052 = this.A04.A05();
        Map map = this.A08;
        C007303n r5 = r10.A0n;
        Number number = (Number) map.get(r5);
        if (number != null && A052 - number.longValue() <= this.A01) {
            return false;
        }
        map.put(r5, Long.valueOf(A052));
        return true;
    }
}
