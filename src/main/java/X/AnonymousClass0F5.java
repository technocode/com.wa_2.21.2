package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0F5  reason: invalid class name */
public class AnonymousClass0F5 {
    public static volatile AnonymousClass0F5 A01;
    public final C02410Bw A00;

    public AnonymousClass0F5(C02410Bw r1) {
        this.A00 = r1;
    }

    public synchronized void A00(String str) {
        SharedPreferences sharedPreferences = this.A00.A00;
        Set<String> stringSet = sharedPreferences.getStringSet("syncd_out_of_date_collections", null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        stringSet.remove(str);
        sharedPreferences.edit().putStringSet("syncd_out_of_date_collections", stringSet).apply();
    }

    public synchronized void A01(Set set) {
        SharedPreferences sharedPreferences = this.A00.A00;
        Set<String> stringSet = sharedPreferences.getStringSet("syncd_out_of_date_collections", null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        stringSet.addAll(set);
        sharedPreferences.edit().putStringSet("syncd_out_of_date_collections", stringSet).apply();
    }
}
