package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1kt  reason: invalid class name and case insensitive filesystem */
public final class C35761kt {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public static String A00(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Number) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Number) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Number) obj).doubleValue() == 0.0d) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object obj2 : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(A00(obj2, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String A002 = A00(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(A002)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    AnonymousClass008.A1W(sb2, (String) entry.getKey(), '=', A002);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.A00);
        hashMap.put("appVersion", this.A01);
        hashMap.put("appId", this.A02);
        hashMap.put("appInstallerId", this.A03);
        return A00(hashMap, 0);
    }
}
