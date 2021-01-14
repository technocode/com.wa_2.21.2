package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.2NI  reason: invalid class name */
public class AnonymousClass2NI {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public AnonymousClass2NI(String str, String str2, String str3, String str4, Map map) {
        this.A01 = str;
        this.A00 = str3;
        this.A02 = str4;
        if (map == null) {
            map = new HashMap();
            this.A03 = map;
        } else {
            this.A03 = map;
        }
        map.put("0", str2);
    }

    public AnonymousClass2NI(String str, String str2, String str3, Map map) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        if (map == null) {
            this.A03 = new HashMap();
        } else {
            this.A03 = map;
        }
    }

    public static AnonymousClass2NI A00(String str) {
        HashMap hashMap;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject optJSONObject = jSONObject.optJSONObject("bundles");
        if (optJSONObject != null) {
            hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, optJSONObject.getString(obj));
            }
        } else {
            hashMap = null;
        }
        return new AnonymousClass2NI(jSONObject.getString("name"), jSONObject.optString("locale_lang", null), jSONObject.optString("url", null), hashMap);
    }

    public String A01(int i) {
        String str = (String) this.A03.get(Integer.toString(i));
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2NI)) {
            return false;
        }
        AnonymousClass2NI r4 = (AnonymousClass2NI) obj;
        if (!this.A01.equals(r4.A01)) {
            return false;
        }
        String str = this.A00;
        if ((str != null || r4.A00 != null) && (str == null || !str.equals(r4.A00))) {
            return false;
        }
        String str2 = this.A02;
        if ((str2 != null || r4.A02 != null) && (str2 == null || !str2.equals(r4.A02))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.A01.hashCode() + 159) * 53;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 53;
        String str2 = this.A02;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
