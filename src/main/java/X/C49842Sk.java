package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Sk  reason: invalid class name and case insensitive filesystem */
public class C49842Sk {
    public final int A00;
    public final int A01;
    public final C02900Dx A02;
    public final String A03;
    public final List A04;

    public C49842Sk(C02900Dx r2, int i) {
        this.A04 = Collections.singletonList(r2);
        this.A02 = r2;
        this.A01 = 2;
        this.A00 = i;
        this.A03 = r2.A06.getRawString();
    }

    public C49842Sk(List list, int i, C02770Dj r9) {
        this.A04 = new ArrayList(list);
        C02900Dx r0 = (C02900Dx) list.get(0);
        this.A02 = r0;
        this.A01 = r9.A05.A05() - r0.A05 >= 600000 ? 1 : 0;
        this.A00 = i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C02900Dx) it.next()).A06.getRawString());
        }
        this.A03 = TextUtils.join("|", arrayList);
    }

    public LatLng A00() {
        List<C02900Dx> list = this.A04;
        double d = 0.0d;
        double d2 = 0.0d;
        for (C02900Dx r6 : list) {
            d += r6.A00;
            d2 += r6.A01;
        }
        return new LatLng(d / ((double) list.size()), d2 / ((double) list.size()));
    }
}
