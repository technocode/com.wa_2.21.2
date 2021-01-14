package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Sy  reason: invalid class name and case insensitive filesystem */
public class C28111Sy {
    public static List A02 = Arrays.asList("urn:xmpp:whatsapp:account", "w:pay");
    public static volatile C28111Sy A03;
    public final AnonymousClass02M A00;
    public final AnonymousClass09H A01;

    public C28111Sy(AnonymousClass02M r1, AnonymousClass09H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final AnonymousClass0M5 A00(String str, Map map, AbstractC28101Sx r10) {
        Map map2 = (Map) map.get("properties");
        Map map3 = (Map) map.get("children");
        if ("accept_pay".equals(str) && map2 != null && map2.containsKey("merchant")) {
            map2.containsKey("merchant-fees");
        }
        ArrayList arrayList = new ArrayList();
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new AnonymousClass0OS((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        AnonymousClass0OS[] r3 = (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]);
        ArrayList arrayList2 = new ArrayList();
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry entry2 : map3.entrySet()) {
                arrayList2.add(A00((String) entry2.getKey(), (Map) entry2.getValue(), r10));
            }
        }
        return new AnonymousClass0M5(str, r3, (AnonymousClass0M5[]) arrayList2.toArray(new AnonymousClass0M5[0]), null);
    }

    public final Map A01(AnonymousClass0M5 r8) {
        HashMap hashMap = new HashMap();
        if (r8 != null) {
            HashMap hashMap2 = new HashMap();
            AnonymousClass0OS[] A0I = r8.A0I();
            if (A0I != null) {
                for (AnonymousClass0OS r0 : A0I) {
                    hashMap2.put(r0.A02, r0.A03);
                }
            }
            hashMap.put("properties", C42971xa.A01(hashMap2));
            HashMap hashMap3 = new HashMap();
            AnonymousClass0M5[] r2 = r8.A03;
            if (r2 != null) {
                for (AnonymousClass0M5 r02 : r2) {
                    hashMap3.put(r02.A00, A01(r02));
                }
            }
            hashMap.put("children", C42971xa.A02(hashMap3));
        }
        return C42971xa.A02(hashMap);
    }
}
