package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0BM  reason: invalid class name */
public class AnonymousClass0BM {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public synchronized String A00(String str) {
        return (String) this.A01.get(str);
    }

    public synchronized String A01(String str) {
        return (String) this.A00.get(str);
    }

    public synchronized void A02(String str, String str2) {
        this.A01.put(str, str2);
        this.A00.put(str2, str);
    }

    public synchronized void A03(String str, String str2) {
        this.A01.remove(str);
        this.A00.remove(str2);
    }

    public synchronized boolean A04(String str) {
        return this.A01.containsKey(str);
    }
}
