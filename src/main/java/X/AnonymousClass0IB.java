package X;

import android.content.SharedPreferences;

/* renamed from: X.0IB  reason: invalid class name */
public class AnonymousClass0IB {
    public static volatile AnonymousClass0IB A01;
    public final SharedPreferences A00;

    public AnonymousClass0IB(AnonymousClass022 r2) {
        this.A00 = r2.A01("contact_sync_prefs");
    }

    public static AnonymousClass0IB A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0IB.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0IB(AnonymousClass022.A00());
                }
            }
        }
        return A01;
    }

    public long A01() {
        return this.A00.getLong("contact_full_sync_wait", 86400000);
    }

    public void A02() {
        AnonymousClass008.A0g(this, "contact_sync_backoff", -1);
        AnonymousClass008.A0g(this, "sidelist_sync_backoff", -1);
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putLong("status_sync_backoff", -1).apply();
        sharedPreferences.edit().putLong("picture_sync_backoff", -1).apply();
        sharedPreferences.edit().putLong("business_sync_backoff", -1).apply();
        sharedPreferences.edit().putLong("devices_sync_backoff", -1).apply();
        sharedPreferences.edit().putLong("payment_sync_backoff", -1).apply();
    }
}
