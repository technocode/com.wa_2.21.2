package X;

import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ds  reason: invalid class name and case insensitive filesystem */
public class C10000ds extends AnonymousClass0JW {
    public WeakReference A00;
    public final C018609s A01;

    public C10000ds(AnonymousClass3IB r2, C018609s r3) {
        this.A01 = r3;
        this.A00 = new WeakReference(r2);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int i;
        boolean z;
        List list = (List) obj;
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            AnonymousClass3IB r8 = (AnonymousClass3IB) weakReference.get();
            r8.A00.A07(Boolean.FALSE);
            r8.A01.A07(Boolean.TRUE);
            AnonymousClass2w3 r5 = r8.A07;
            AnonymousClass3HZ r6 = null;
            if (r5 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass3HZ A012 = r5.A01(((AnonymousClass0MH) it.next()).A04);
                    if (r6 != null) {
                        if (r6.get(2) == A012.get(2) && r6.get(1) == A012.get(1)) {
                            r6.count++;
                        } else {
                            arrayList.add(r6);
                        }
                    }
                    A012.count = 0;
                    r6 = A012;
                    r6.count++;
                }
                if (r6 != null) {
                    arrayList.add(r6);
                }
                ArrayList arrayList2 = new ArrayList();
                for (i = 0; i < list.size(); i++) {
                    AnonymousClass0MH r9 = (AnonymousClass0MH) list.get(i);
                    C69553Hm r62 = new C69553Hm();
                    r62.A01 = C001801b.A0e(r8.A05, r8.A04.A06(r9.A04));
                    r62.A00 = r8.A08.A09(r9);
                    if (i < list.size() - 1) {
                        AnonymousClass3HZ A013 = r5.A01(r9.A04);
                        AnonymousClass3HZ A014 = r5.A01(((AnonymousClass0MH) list.get(i + 1)).A04);
                        z = true;
                        if (A013.get(2) != A014.get(2) || A013.get(1) != A014.get(1)) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                    r62.A02 = z;
                    arrayList2.add(r62);
                }
                r8.A02.A07(Pair.create(arrayList2, arrayList));
                return;
            }
            throw null;
        }
    }
}
