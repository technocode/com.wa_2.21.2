package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0dt  reason: invalid class name and case insensitive filesystem */
public class C10010dt extends AnonymousClass0JW {
    public final AnonymousClass0BA A00;
    public final C04560Kv A01;
    public final C01970Ad A02;
    public final AnonymousClass00T A03;
    public final WeakReference A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C10010dt(ActivityC004602e r2, AnonymousClass00T r3, C01970Ad r4, AnonymousClass0BA r5, C04560Kv r6, boolean z, boolean z2, boolean z3) {
        this.A03 = r3;
        this.A02 = r4;
        this.A00 = r5;
        this.A01 = r6;
        this.A04 = new WeakReference(r2);
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C63172vy r6 = (C63172vy) obj;
        synchronized (this) {
            ActivityC004602e r4 = (ActivityC004602e) this.A04.get();
            if (r4 != null) {
                r4.A0K.A00();
                if (r4 instanceof AbstractC63162vx) {
                    List<AnonymousClass1VM> list = r6.A00;
                    ((AbstractC63162vx) r4).AQs(list);
                    if (this.A05) {
                        ArrayList arrayList = new ArrayList();
                        for (AnonymousClass1VM r1 : list) {
                            if (!TextUtils.isEmpty(r1.A07)) {
                                arrayList.add(r1.A07);
                            }
                        }
                        this.A03.ANF(new RunnableEBaseShape3S0100000_I0_3(this.A01, 38));
                    }
                }
                if (this.A07 && (r4 instanceof AbstractC63202w1)) {
                    AbstractC63202w1 r0 = (AbstractC63202w1) r4;
                    List list2 = r6.A02;
                    r0.AQx(list2);
                    List list3 = r6.A01;
                    r0.AQv(list3);
                    if (this.A05) {
                        A04(list2);
                        A04(list3);
                    }
                }
                r4.invalidateOptionsMenu();
            }
        }
    }

    public final void A04(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0MH r1 = (AnonymousClass0MH) it.next();
            if (!TextUtils.isEmpty(r1.A0G)) {
                arrayList.add(r1.A0G);
            }
        }
        this.A03.ANF(new RunnableEBaseShape3S0200000_I0_2(this, arrayList, 35));
    }
}
