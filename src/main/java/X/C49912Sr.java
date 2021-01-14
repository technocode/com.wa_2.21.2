package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Sr  reason: invalid class name and case insensitive filesystem */
public class C49912Sr {
    public final int A00 = 20;
    public final int A01 = 10;
    public final List A02;

    public C49912Sr(List list) {
        this.A02 = list;
    }

    public static double A00(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) ((Number) it.next()).intValue();
        }
        return ((double) j) / ((double) list.size());
    }

    public final Pair A01() {
        List<Number> list = this.A02;
        double A002 = A00(list);
        double A003 = A00(list);
        double d = 0.0d;
        for (Number number : list) {
            double intValue = ((double) number.intValue()) - A003;
            d += intValue * intValue;
        }
        double sqrt = Math.sqrt(d / ((double) list.size()));
        return new Pair(Integer.valueOf((int) (A002 - (2.0d * sqrt))), Integer.valueOf((int) ((sqrt * 1.0d) + A002)));
    }

    public void A02(int i) {
        List list;
        if (A03()) {
            Pair A012 = A01();
            Object obj = A012.first;
            if (i < ((Number) obj).intValue()) {
                list = this.A02;
                list.add(obj);
            } else {
                Object obj2 = A012.second;
                if (i > ((Number) obj2).intValue()) {
                    list = this.A02;
                    list.add(obj2);
                } else {
                    list = this.A02;
                    list.add(Integer.valueOf(i));
                }
            }
            if (list.size() > this.A00) {
                list.remove(0);
                return;
            }
            return;
        }
        List list2 = this.A02;
        list2.add(Integer.valueOf(i));
        if (list2.size() >= this.A01) {
            Pair A013 = A01();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                int intValue = ((Number) list2.get(i2)).intValue();
                Object obj3 = A013.first;
                if (intValue < ((Number) obj3).intValue()) {
                    list2.set(i2, obj3);
                } else {
                    Object obj4 = A013.second;
                    if (intValue > ((Number) obj4).intValue()) {
                        list2.set(i2, obj4);
                    }
                }
            }
        }
    }

    public boolean A03() {
        return this.A02.size() >= this.A01;
    }
}
