package X;

import android.content.SharedPreferences;

/* renamed from: X.0KV  reason: invalid class name */
public class AnonymousClass0KV {
    public static volatile AnonymousClass0KV A02;
    public SharedPreferences A00;
    public final AnonymousClass022 A01;

    public AnonymousClass0KV(AnonymousClass022 r1) {
        this.A01 = r1;
    }

    public final SharedPreferences A00() {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = this.A01.A01("privatestats_props");
            }
        }
        return this.A00;
    }

    public void A01(int i) {
        A00().edit().putInt("first_token_stage", i).apply();
    }

    public void A02(int i) {
        SharedPreferences.Editor edit = A00().edit();
        if (i >= 0) {
            edit.putInt("redeem_count", i).apply();
        } else {
            edit.remove("redeem_count").apply();
        }
    }

    public void A03(int i) {
        SharedPreferences.Editor edit = A00().edit();
        if (i > 0) {
            edit.putInt("token_not_ready_reason", i).apply();
        } else {
            edit.remove("token_not_ready_reason").apply();
        }
    }

    public final void A04(String str, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        SharedPreferences.Editor edit = A00().edit();
        if (i > 0) {
            edit.putLong(str, j).apply();
        } else {
            edit.remove(str).apply();
        }
    }

    public final void A05(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        if (str2 != null) {
            edit.putString(str, str2).apply();
        } else {
            edit.remove(str).apply();
        }
    }
}
