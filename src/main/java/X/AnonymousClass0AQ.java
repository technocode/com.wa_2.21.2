package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0AQ  reason: invalid class name */
public class AnonymousClass0AQ {
    public static volatile AnonymousClass0AQ A06;
    public List A00;
    public Map A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass01Q A03;
    public final AnonymousClass0AR A04;
    public final Object A05 = new Object();

    public AnonymousClass0AQ(AnonymousClass0AR r2, AnonymousClass01A r3, AnonymousClass01Q r4) {
        this.A04 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass0AQ A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0AQ.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0AQ(AnonymousClass0AR.A00(), AnonymousClass01A.A00(), AnonymousClass01Q.A00());
                }
            }
        }
        return A06;
    }

    public static boolean A01(List list, AnonymousClass02N r2) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((AbstractC28321Tw) it.next()).A4E(r2)) {
                return false;
            }
        }
        return true;
    }

    public C007003k A02(AnonymousClass02N r4) {
        C007003k A0A = this.A02.A0A(r4);
        Jid jid = A0A.A09;
        if (AnonymousClass1VY.A0Y(jid) && !AnonymousClass1VY.A0d(jid) && (A0A.A07() || TextUtils.isEmpty(A0A.A0J))) {
            this.A04.A0F((AnonymousClass02U) r4, null);
        }
        return A0A;
    }

    public List A03() {
        List list;
        synchronized (this.A05) {
            if (this.A00 == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A00 = copyOnWriteArrayList;
                this.A02.A04.A0S(copyOnWriteArrayList, 0, false, false);
            }
            list = this.A00;
        }
        return list;
    }

    public List A04(int i) {
        AbstractList abstractList = (AbstractList) this.A03.A0A();
        ArrayList arrayList = new ArrayList(Math.min(abstractList.size(), i));
        for (int i2 = 0; i2 < abstractList.size() && arrayList.size() < i; i2++) {
            StringBuilder A0S = AnonymousClass008.A0S("getConversationContact/");
            A0S.append(abstractList.get(i2));
            Log.d(A0S.toString());
            C007003k A022 = A02((AnonymousClass02N) abstractList.get(i2));
            if (!TextUtils.isEmpty(A022.A0F)) {
                arrayList.add(A022);
            }
        }
        return arrayList;
    }

    public Map A05() {
        Map map;
        AnonymousClass02N r1;
        synchronized (this.A05) {
            if (this.A01 == null) {
                List<C007003k> A032 = A03();
                this.A01 = new HashMap(A032.size(), 1.0f);
                for (C007003k r6 : A032) {
                    C007003k r0 = (C007003k) this.A01.get(r6.A02(AnonymousClass02N.class));
                    if ((r0 == null || r0.A01() > r6.A01()) && (r1 = (AnonymousClass02N) r6.A02(AnonymousClass02N.class)) != null) {
                        this.A01.put(r1, r6);
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) this.A03.A0A()).iterator();
                while (it.hasNext()) {
                    AnonymousClass02N r2 = (AnonymousClass02N) it.next();
                    if (this.A01.get(r2) == null) {
                        C007003k A022 = A02(r2);
                        arrayList.add(A022);
                        this.A01.put(r2, A022);
                    }
                }
                List list = this.A00;
                if (list != null) {
                    list.addAll(arrayList);
                } else {
                    throw null;
                }
            }
            map = this.A01;
        }
        return map;
    }
}
