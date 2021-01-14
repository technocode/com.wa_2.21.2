package X;

import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: X.0GI  reason: invalid class name */
public class AnonymousClass0GI {
    public static volatile AnonymousClass0GI A02;
    public SharedPreferences A00;
    public final AnonymousClass022 A01;

    public AnonymousClass0GI(AnonymousClass022 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        if (this.A00 == null) {
            AnonymousClass022 r2 = this.A01;
            SharedPreferences A012 = r2.A01("block_reasons_prefs");
            this.A00 = A012;
            if (A012.getBoolean("biz_block_reasons_migration_pending", true)) {
                HashMap hashMap = new HashMap();
                hashMap.put("biz_block_reasons", String.class);
                hashMap.put("biz_block_reasons_country", String.class);
                hashMap.put("biz_block_reasons_version", Integer.class);
                hashMap.put("biz_block_reasons_language", String.class);
                AnonymousClass1VY.A0K(r2.A01(AnonymousClass00D.A04), this.A00, hashMap, false);
                this.A00.edit().putBoolean("biz_block_reasons_migration_pending", false).apply();
            }
        }
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            throw null;
        }
        return sharedPreferences;
    }

    public void A01(int i) {
        A00().edit().putInt("biz_block_reasons_api_back_off_days", i).apply();
    }

    public void A02(long j) {
        A00().edit().putLong("biz_block_reasons_api_cooling_timestamp", j).apply();
    }
}
