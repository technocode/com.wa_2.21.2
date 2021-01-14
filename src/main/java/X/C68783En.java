package X;

import android.text.TextUtils;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3En  reason: invalid class name and case insensitive filesystem */
public class C68783En implements AnonymousClass1LC {
    public static volatile C68783En A07;
    public HashSet A00 = new HashSet();
    public HashSet A01 = new HashSet();
    public List A02 = new ArrayList();
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final C01970Ad A05;
    public final C61592tQ A06;

    public C68783En(AnonymousClass02M r2, AnonymousClass01I r3, C01970Ad r4, C61592tQ r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
    }

    public static C68783En A00() {
        if (A07 == null) {
            synchronized (C68783En.class) {
                if (A07 == null) {
                    A07 = new C68783En(AnonymousClass02M.A00(), AnonymousClass01I.A00(), C01970Ad.A00(), C61592tQ.A00());
                }
            }
        }
        return A07;
    }

    public static void A01(C68783En r2, String str, AbstractC61862tr r4) {
        r2.A00.add(str);
        r2.A01.remove(str);
        if (r4 != null) {
            r4.AEo(str);
        }
        int size = r2.A02.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((Reference) r2.A02.get(size)).get() == null) {
                r2.A02.remove(size);
            }
        }
        for (Reference reference : r2.A02) {
            AbstractC61862tr r0 = (AbstractC61862tr) reference.get();
            if (r0 != null) {
                r0.AEo(str);
            }
        }
    }

    public void A02(AbstractC61862tr r3) {
        for (int size = this.A02.size() - 1; size >= 0; size--) {
            Object obj = ((Reference) this.A02.get(size)).get();
            if (obj == null || obj == r3) {
                this.A02.remove(size);
            }
        }
    }

    public final void A03(String str, C007303n r14) {
        if (!TextUtils.isEmpty(str) && r14 != null) {
            AnonymousClass02N r4 = r14.A00;
            if (AnonymousClass1VY.A0Y(r4) && !this.A01.contains(str) && !this.A00.contains(str)) {
                this.A01.add(str);
                C61592tQ r5 = this.A06;
                C68773Em r10 = new C68773Em(this, str);
                if (r5 != null) {
                    r5.A07.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "get-missing-group-transaction-details"), new AnonymousClass0OS("id", str), new AnonymousClass0OS("group", r4)}), new C73593Xy(r5, r5.A02.A00, r5.A00, r5.A01, r5.A04, r10, r14), 0);
                    return;
                }
                throw null;
            }
        }
    }

    public void A04(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0MH r2 = (AnonymousClass0MH) it.next();
            if (r2.A02 == 1000 && !TextUtils.isEmpty(r2.A0G)) {
                arrayList.add(r2.A0G);
            }
        }
        if (!arrayList.isEmpty()) {
            A05(arrayList, null);
        }
    }

    public final void A05(List list, AbstractC61862tr r7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!this.A01.contains(str) && !this.A00.contains(str)) {
                this.A01.add(str);
                this.A06.A02(str, true, new C68763El(this, str, r7));
            }
        }
    }

    @Override // X.AnonymousClass1LC
    public void AIe(AbstractC007503q r4) {
        AnonymousClass0MH r2;
        if (r4 != null && (r2 = r4.A0F) != null && r2.A02 == 1000) {
            AnonymousClass01I r1 = this.A04;
            if (r1.A09(r2.A09) || r1.A09(r4.A0F.A0A)) {
                String str = r4.A0F.A0G;
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    A05(arrayList, null);
                    return;
                }
                return;
            }
            A03(r4.A0F.A0G, r4.A0n);
        }
    }
}
