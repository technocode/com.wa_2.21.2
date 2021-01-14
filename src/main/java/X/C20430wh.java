package X;

import java.util.LinkedHashMap;

/* renamed from: X.0wh  reason: invalid class name and case insensitive filesystem */
public class C20430wh {
    public int A00 = 0;
    public final AbstractC20480wm A01;
    public final LinkedHashMap A02 = new LinkedHashMap();

    public C20430wh(AbstractC20480wm r2) {
        this.A01 = r2;
    }

    public synchronized int A00() {
        return this.A02.size();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized Object A02(Object obj) {
        Object remove;
        int i;
        remove = this.A02.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.A97(remove);
        }
        this.A00 = i2 - i;
        return remove;
    }

    public synchronized void A03(Object obj, Object obj2) {
        int i;
        LinkedHashMap linkedHashMap = this.A02;
        Object remove = linkedHashMap.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.A97(remove);
        }
        this.A00 = i2 - i;
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.A97(obj2);
    }
}
