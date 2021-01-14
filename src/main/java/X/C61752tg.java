package X;

import android.content.SharedPreferences;

/* renamed from: X.2tg  reason: invalid class name and case insensitive filesystem */
public class C61752tg {
    public static volatile C61752tg A03;
    public SharedPreferences A00;
    public final C018809u A01 = C018809u.A00("PaymentProviderKeySharedPrefs", "infra", "COMMON");
    public final AnonymousClass022 A02;

    public C61752tg(AnonymousClass022 r4) {
        this.A02 = r4;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("com.whatsapp_payment_provider_key_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
