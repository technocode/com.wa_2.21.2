package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0B5  reason: invalid class name */
public class AnonymousClass0B5 {
    public static volatile AnonymousClass0B5 A0B;
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass00S A02;
    public final C001000o A03;
    public final C001400w A04;
    public final C014508d A05;
    public final AnonymousClass090 A06;
    public final C015208k A07;
    public final AnonymousClass09E A08;
    public final AnonymousClass01P A09;
    public final AnonymousClass01L A0A;

    public AnonymousClass0B5(AnonymousClass00S r1, AnonymousClass01I r2, AnonymousClass09E r3, AnonymousClass01A r4, C001400w r5, C001000o r6, AnonymousClass01L r7, AnonymousClass01P r8, C014508d r9, C015208k r10, AnonymousClass090 r11) {
        this.A02 = r1;
        this.A00 = r2;
        this.A08 = r3;
        this.A04 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A0A = r7;
        this.A09 = r8;
        this.A05 = r9;
        this.A07 = r10;
        this.A06 = r11;
    }

    public final Set A00(int i, ArrayList arrayList) {
        HashSet hashSet;
        if (i == 2 || i == 0) {
            HashSet hashSet2 = new HashSet();
            if (i != 0) {
                Iterator it = ((AbstractCollection) this.A08.A09()).iterator();
                while (it.hasNext()) {
                    hashSet2.add(UserJid.of((Jid) it.next()));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            this.A01.A04.A0S(arrayList2, 1, false, false);
            hashSet = new HashSet(arrayList2.size(), 1.0f);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C007003k r2 = (C007003k) it2.next();
                UserJid userJid = (UserJid) r2.A02(UserJid.class);
                if (userJid != null && !hashSet2.contains(userJid) && !this.A09.A02(userJid)) {
                    hashSet.add(userJid);
                    arrayList.add(r2);
                }
            }
        } else if (i == 1) {
            hashSet = new HashSet();
            Iterator it3 = ((AbstractCollection) this.A08.A0A()).iterator();
            while (it3.hasNext()) {
                AnonymousClass02N r1 = (AnonymousClass02N) it3.next();
                UserJid of = UserJid.of(r1);
                C007003k A092 = this.A01.A09(r1);
                if (!(of == null || A092 == null || A092.A08 == null || this.A09.A02(of))) {
                    hashSet.add(of);
                    arrayList.add(A092);
                }
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        return hashSet;
    }
}
