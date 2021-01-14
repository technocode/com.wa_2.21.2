package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0rj  reason: invalid class name and case insensitive filesystem */
public final class C17550rj {
    public static final C17550rj A01;
    public static final String A02 = AbstractC17610rq.A01("Data");
    public Map A00;

    static {
        C17550rj r0 = new C17550rj(new HashMap());
        A01(r0);
        A01 = r0;
    }

    public C17550rj() {
    }

    public C17550rj(C17550rj r3) {
        this.A00 = new HashMap(r3.A00);
    }

    public C17550rj(Map map) {
        this.A00 = new HashMap(map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[SYNTHETIC, Splitter:B:20:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C17550rj A00(byte[] r7) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17550rj.A00(byte[]):X.0rj");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d A[SYNTHETIC, Splitter:B:42:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.C17550rj r7) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17550rj.A01(X.0rj):byte[]");
    }

    public int A02(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj == null || C17550rj.class != obj.getClass()) {
            return false;
        }
        C17550rj r7 = (C17550rj) obj;
        Set keySet = this.A00.keySet();
        if (!keySet.equals(r7.A00.keySet())) {
            return false;
        }
        for (Object obj2 : keySet) {
            Object obj3 = this.A00.get(obj2);
            Object obj4 = r7.A00.get(obj2);
            if (obj3 != null) {
                if (obj4 != null) {
                    if (!(obj3 instanceof Object[]) || !(obj4 instanceof Object[])) {
                        equals = obj3.equals(obj4);
                    } else {
                        equals = Arrays.deepEquals((Object[]) obj3, (Object[]) obj4);
                    }
                    if (!equals) {
                    }
                }
            } else if (obj3 == obj4) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.A00.isEmpty()) {
            for (String str : this.A00.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.A00.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
