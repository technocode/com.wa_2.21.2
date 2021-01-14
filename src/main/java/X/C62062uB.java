package X;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: X.2uB  reason: invalid class name and case insensitive filesystem */
public class C62062uB {
    public static volatile C62062uB A02;
    public SharedPreferences A00;
    public final AnonymousClass022 A01;

    public C62062uB(AnonymousClass022 r1) {
        this.A01 = r1;
    }

    public void A00(C62082uD r4, String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A01("com.whatsapp_payment_sync_preferences");
                this.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putString(r4.A01.A00(), str).apply();
        for (C62082uD r0 : Collections.unmodifiableList(r4.A00)) {
            A00(r0, str);
        }
    }
}
