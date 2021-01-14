package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Bw  reason: invalid class name and case insensitive filesystem */
public class C02410Bw {
    public static final Set A01;
    public static volatile C02410Bw A02;
    public final SharedPreferences A00;

    static {
        HashSet hashSet = new HashSet();
        A01 = hashSet;
        hashSet.add("disabled_version");
        Set set = A01;
        set.add("first_transient_server_failure_timestamp");
        set.add("syncd_dirty");
        set.add("syncd_last_companion_dereg_time");
        set.add("syncd_out_of_date_collections");
    }

    public C02410Bw(AnonymousClass022 r2) {
        this.A00 = r2.A01("syncd_prefs");
    }

    public static C02410Bw A00() {
        if (A02 == null) {
            synchronized (C02410Bw.class) {
                if (A02 == null) {
                    A02 = new C02410Bw(AnonymousClass022.A00());
                }
            }
        }
        return A02;
    }

    public synchronized long A01(String str) {
        long j;
        SharedPreferences sharedPreferences = this.A00;
        j = sharedPreferences.getLong(str, 0);
        sharedPreferences.edit().remove(str).apply();
        return j;
    }

    public void A02(int i) {
        this.A00.edit().putInt("syncd_dirty", i).apply();
    }

    public synchronized void A03(String str, long j) {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putLong(str, sharedPreferences.getLong(str, 0) + j).apply();
    }
}
