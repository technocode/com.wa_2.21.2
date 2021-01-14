package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Rm  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06040Rm {
    public C13820l4 A00;
    public C06050Rn A01;
    public C13840l6 A02;

    public static boolean A00(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public int A01() {
        if (!(this instanceof C06030Rl)) {
            return ((AnonymousClass05W) ((C29741a7) this).A00).A00;
        }
        return ((C06030Rl) this).A00.A00;
    }

    public int A02(Object obj) {
        if (!(this instanceof C06030Rl)) {
            return ((C29741a7) this).A00.A02(obj);
        }
        AnonymousClass03V r1 = ((C06030Rl) this).A00;
        if (obj == null) {
            return r1.A01();
        }
        return r1.A02(obj, obj.hashCode());
    }

    public int A03(Object obj) {
        if (!(this instanceof C06030Rl)) {
            return ((C29741a7) this).A00.A03(obj);
        }
        AnonymousClass03V r1 = ((C06030Rl) this).A00;
        if (obj == null) {
            return r1.A01();
        }
        return r1.A02(obj, obj.hashCode());
    }

    public Object A04(int i, int i2) {
        if (!(this instanceof C06030Rl)) {
            return ((C29741a7) this).A00.A02[(i << 1) + i2];
        }
        return ((C06030Rl) this).A00.A03[i];
    }

    public void A05() {
        if (!(this instanceof C06030Rl)) {
            ((C29741a7) this).A00.clear();
        } else {
            ((C06030Rl) this).A00.clear();
        }
    }

    public void A06(int i) {
        if (!(this instanceof C06030Rl)) {
            ((C29741a7) this).A00.A05(i);
        } else {
            ((C06030Rl) this).A00.A03(i);
        }
    }

    public Object[] A07(Object[] objArr, int i) {
        int A012 = A01();
        if (objArr.length < A012) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), A012);
        }
        for (int i2 = 0; i2 < A012; i2++) {
            objArr[i2] = A04(i2, i);
        }
        if (objArr.length > A012) {
            objArr[A012] = null;
        }
        return objArr;
    }
}
