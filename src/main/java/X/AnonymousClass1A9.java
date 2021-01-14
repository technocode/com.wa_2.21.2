package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1A9  reason: invalid class name */
public final class AnonymousClass1A9 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Map A03;
    public final boolean A04;

    public AnonymousClass1A9(C242619s r7, Map map, long j, boolean z, long j2, int i) {
        String A002;
        String A003;
        C001801b.A1Q(r7);
        C001801b.A1Q(map);
        this.A02 = j;
        this.A04 = z;
        this.A01 = j2;
        this.A00 = i;
        TextUtils.isEmpty(null);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (!(key == null || !key.toString().startsWith("&") || (A003 = A00(r7, entry.getKey())) == null)) {
                hashMap.put(A003, A01(r7, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key2 = entry2.getKey();
            if ((key2 == null || !key2.toString().startsWith("&")) && (A002 = A00(r7, entry2.getKey())) != null) {
                hashMap.put(A002, A01(r7, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.A03 = Collections.unmodifiableMap(hashMap);
    }

    public static String A00(C242619s r5, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            r5.A0A("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    public static String A01(C242619s r4, Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = "";
        } else {
            obj2 = obj.toString();
        }
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, 8192);
        r4.A0A("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    public final String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ht=");
        A0S.append(this.A02);
        long j = this.A01;
        if (j != 0) {
            A0S.append(", dbId=");
            A0S.append(j);
        }
        int i = this.A00;
        if (i != 0) {
            A0S.append(", appUID=");
            A0S.append(i);
        }
        Map map = this.A03;
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            A0S.append(", ");
            A0S.append(str);
            A0S.append("=");
            A0S.append((String) map.get(str));
        }
        return A0S.toString();
    }
}
