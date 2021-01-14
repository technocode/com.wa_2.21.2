package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.09D  reason: invalid class name */
public class AnonymousClass09D {
    public static volatile AnonymousClass09D A03;
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final AnonymousClass022 A02;

    public AnonymousClass09D(AnonymousClass022 r1) {
        this.A02 = r1;
    }

    public static AnonymousClass09D A00() {
        if (A03 == null) {
            synchronized (AnonymousClass09D.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass09D(AnonymousClass022.A00());
                }
            }
        }
        return A03;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("triggered_block_prefs");
            this.A00 = sharedPreferences;
        }
        if (sharedPreferences == null) {
            throw null;
        }
        return sharedPreferences;
    }

    public final JSONObject A02(AnonymousClass02N r4) {
        String string = A01().getString(r4.getRawString(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new JSONObject(string);
    }

    public final void A03(AnonymousClass02N r4, JSONObject jSONObject) {
        A01().edit().putString(r4.getRawString(), jSONObject.toString()).apply();
    }
}
