package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: X.1fb  reason: invalid class name and case insensitive filesystem */
public class C32791fb implements AbstractC19970vu {
    public long A00 = SystemClock.uptimeMillis();
    public C20460wk A01;
    public final AbstractC19950vs A02;
    public final C20430wh A03;
    public final C20430wh A04;
    public final AbstractC20480wm A05;

    public C32791fb(AbstractC20480wm r3, AbstractC19950vs r4) {
        new WeakHashMap();
        this.A05 = r3;
        this.A04 = new C20430wh(new C32771fZ(r3));
        this.A03 = new C20430wh(new C32771fZ(r3));
        this.A02 = r4;
        this.A01 = (C20460wk) r4.get();
    }

    public static void A00(C20440wi r2) {
        C32701fR r0;
        if (r2 != null && (r0 = r2.A03) != null) {
            Object obj = r2.A04;
            C20360wa r1 = r0.A00;
            synchronized (r1) {
                r1.A03.remove(obj);
            }
        }
    }

    public final synchronized AbstractC20030w0 A01(C20440wi r4) {
        boolean z = false;
        if (!r4.A01) {
            z = true;
        }
        AnonymousClass0N2.A1Z(z);
        r4.A00++;
        return AbstractC20030w0.A01(r4.A02.A04(), new C32781fa(this, r4), AbstractC20030w0.A04);
    }

    public final synchronized AbstractC20030w0 A02(C20440wi r3) {
        AbstractC20030w0 r1;
        r1 = null;
        if (r3 == null) {
            throw null;
        } else if (r3.A01 && r3.A00 == 0) {
            r1 = r3.A02;
        }
        return r1;
    }

    public final void A03() {
        ArrayList arrayList;
        Object next;
        synchronized (this) {
            C20460wk r0 = this.A01;
            int i = r0.A03;
            int i2 = r0.A00;
            C20430wh r7 = this.A03;
            int A002 = r7.A00();
            C20430wh r6 = this.A04;
            int min = Math.min(i, i2 - (A002 - r6.A00()));
            C20460wk r02 = this.A01;
            int min2 = Math.min(r02.A04, r02.A02 - (r7.A01() - r6.A01()));
            int max = Math.max(min, 0);
            int max2 = Math.max(min2, 0);
            arrayList = null;
            if (r6.A00() > max || r6.A01() > max2) {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (r6.A00() > max || r6.A01() > max2) {
                        synchronized (r6) {
                            LinkedHashMap linkedHashMap = r6.A02;
                            next = linkedHashMap.isEmpty() ? null : linkedHashMap.keySet().iterator().next();
                        }
                        r6.A02(next);
                        arrayList2.add(r7.A02(next));
                    } else {
                        arrayList = arrayList2;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            A05((C20440wi) it.next());
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC20030w0 A022 = A02((C20440wi) it2.next());
                if (A022 != null) {
                    A022.close();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                A00((C20440wi) it3.next());
            }
        }
    }

    public final synchronized void A04() {
        if (this.A00 + this.A01.A05 <= SystemClock.uptimeMillis()) {
            this.A00 = SystemClock.uptimeMillis();
            this.A01 = (C20460wk) this.A02.get();
        }
    }

    public final synchronized void A05(C20440wi r4) {
        if (r4 != null) {
            boolean z = false;
            if (!r4.A01) {
                z = true;
            }
            AnonymousClass0N2.A1Z(z);
            r4.A01 = true;
        } else {
            throw null;
        }
    }
}
