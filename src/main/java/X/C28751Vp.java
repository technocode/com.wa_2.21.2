package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Vp  reason: invalid class name and case insensitive filesystem */
public class C28751Vp {
    public static volatile C28751Vp A02;
    public final SharedPreferences A00;
    public final AnonymousClass00S A01;

    public C28751Vp(AnonymousClass00S r2, AnonymousClass022 r3) {
        this.A01 = r2;
        this.A00 = r3.A01("instrumentation");
    }

    public static C28751Vp A00() {
        if (A02 == null) {
            synchronized (C28751Vp.class) {
                if (A02 == null) {
                    A02 = new C28751Vp(AnonymousClass00S.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A02;
    }

    public static String A01(String str, String str2) {
        return AnonymousClass008.A0M("/package/", str, "/", str2);
    }

    public Set A02() {
        String substring;
        int indexOf;
        String substring2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        SharedPreferences sharedPreferences = this.A00;
        for (String str : sharedPreferences.getAll().keySet()) {
            if (str.startsWith("/package/") && (indexOf = (substring = str.substring(9)).indexOf("/")) >= 0 && (substring2 = substring.substring(0, indexOf)) != null) {
                hashSet2.add(substring2);
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (sharedPreferences.getString(A01(str2, "auth/token"), null) != null) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    public void A03(String str) {
        String A012 = A01(str, "auth/token");
        String A013 = A01(str, "auth/token_ts");
        String A014 = A01(str, "auth/encryption_key");
        this.A00.edit().remove(A012).remove(A013).remove(A014).remove(A01(str, "metadata/last_active_time")).apply();
    }
}
