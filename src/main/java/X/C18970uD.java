package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0uD  reason: invalid class name and case insensitive filesystem */
public class C18970uD {
    public static final Map A00;

    static {
        EnumC18880u4 r3 = EnumC18880u4.percent;
        EnumC18880u4 r4 = EnumC18880u4.pt;
        HashMap hashMap = new HashMap(9);
        A00 = hashMap;
        hashMap.put("xx-small", new C18700tm(0.694f, r4));
        Map map = A00;
        map.put("x-small", new C18700tm(0.833f, r4));
        map.put("small", new C18700tm(10.0f, r4));
        map.put("medium", new C18700tm(12.0f, r4));
        map.put("large", new C18700tm(14.4f, r4));
        map.put("x-large", new C18700tm(17.3f, r4));
        map.put("xx-large", new C18700tm(20.7f, r4));
        map.put("smaller", new C18700tm(83.33f, r3));
        map.put("larger", new C18700tm(120.0f, r3));
    }
}
