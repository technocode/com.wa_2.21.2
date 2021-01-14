package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2sT  reason: invalid class name and case insensitive filesystem */
public class C61082sT {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public String A03;
    public final ArrayList A04 = new ArrayList();
    public final HashMap A05 = new HashMap();
    public final CopyOnWriteArrayList A06 = new CopyOnWriteArrayList();

    public int A00(String str) {
        Number number = (Number) this.A05.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public synchronized void A01(String str) {
        this.A06.add(str);
    }

    public synchronized void A02(String str) {
        this.A06.add(str);
    }

    public synchronized void A03(String str) {
        this.A06.add(str);
    }

    public synchronized void A04(String str) {
        this.A04.add(str);
        CopyOnWriteArrayList copyOnWriteArrayList = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-success");
        copyOnWriteArrayList.add(sb.toString());
    }

    public synchronized void A05(String str, int i) {
        int i2;
        HashMap hashMap = this.A05;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        Integer valueOf = Integer.valueOf(Integer.valueOf(i2).intValue() + 1);
        hashMap.put(str, valueOf);
        this.A00 = i;
        this.A03 = str;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-error-");
        sb.append(valueOf);
        sb.append("-");
        sb.append(i);
        copyOnWriteArrayList.add(sb.toString());
    }

    public boolean A06(String str) {
        Number number = (Number) this.A05.get(str);
        if (!this.A04.contains(str)) {
            return number == null || number.intValue() < 3;
        }
        return false;
    }

    public String toString() {
        return this.A06.toString();
    }
}
