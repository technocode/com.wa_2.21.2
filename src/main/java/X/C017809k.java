package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.09k  reason: invalid class name and case insensitive filesystem */
public class C017809k {
    public static volatile C017809k A04;
    public final C006903j A00;
    public final C017909l A01 = new C017909l();
    public final Map A02 = new ConcurrentHashMap();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public C017809k(C006903j r2) {
        this.A00 = r2;
    }

    public static C017809k A00() {
        if (A04 == null) {
            synchronized (C017809k.class) {
                if (A04 == null) {
                    A04 = new C017809k(C006903j.A00());
                }
            }
        }
        return A04;
    }

    public void A01(AbstractC28611Uz r3) {
        Collection<C08560bL> values;
        this.A01.A00(r3);
        for (AbstractC007503q r0 : this.A02.values()) {
            r3.AQo(r0);
        }
        C006903j r1 = this.A00;
        synchronized (r1) {
            values = r1.A0A().values();
        }
        for (C08560bL r02 : values) {
            AbstractC007503q r03 = r02.A0O;
            if (r03 != null) {
                r3.AQo(r03);
            }
        }
    }

    public void A02(AnonymousClass02N r6) {
        C017909l r4 = this.A01;
        synchronized (r4) {
            Iterator it = new HashSet(((LinkedHashMap) r4.A01.A05()).keySet()).iterator();
            while (it.hasNext()) {
                C007303n r1 = (C007303n) it.next();
                if (r6.equals(r1.A00)) {
                    r4.A01.A04(r1);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C007303n r12 : r4.A02.keySet()) {
                if (r6.equals(r12.A00)) {
                    arrayList.add(r12);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r4.A02.remove((C007303n) it2.next());
            }
        }
        Iterator it3 = new HashSet(this.A02.keySet()).iterator();
        while (it3.hasNext()) {
            C007303n r13 = (C007303n) it3.next();
            if (r6.equals(r13.A00)) {
                this.A02.remove(r13);
            }
        }
    }

    public void A03(C007303n r5) {
        C017909l r1 = this.A01;
        synchronized (r1) {
            r1.A02.remove(r5);
            r1.A01.A04(r5);
        }
        this.A02.remove(r5);
        C006903j r3 = this.A00;
        synchronized (r3) {
            C08560bL A05 = r3.A05(r5.A00);
            if (A05 != null) {
                AbstractC007503q r0 = A05.A0O;
                if (r0 != null && r0.A0n.equals(r5)) {
                    A05.A0O = null;
                }
                AbstractC007503q r02 = A05.A0N;
                if (r02 != null && r02.A0n.equals(r5)) {
                    A05.A0N = null;
                }
            }
        }
    }

    public void A04(AbstractC007503q r5) {
        C017909l r0 = this.A01;
        C007303n r3 = r5.A0n;
        r0.A01(r3, r5);
        C006903j r2 = this.A00;
        synchronized (r2) {
            C08560bL A05 = r2.A05(r3.A00);
            if (A05 != null) {
                AbstractC007503q r02 = A05.A0O;
                if (r02 != null && r02.A0n.equals(r3)) {
                    A05.A0O = r5;
                }
                AbstractC007503q r03 = A05.A0N;
                if (r03 != null && r03.A0n.equals(r3)) {
                    A05.A0N = r5;
                }
            }
        }
    }
}
