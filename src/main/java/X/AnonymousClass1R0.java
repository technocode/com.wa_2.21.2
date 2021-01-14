package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.1R0  reason: invalid class name */
public class AnonymousClass1R0 {
    public static volatile AnonymousClass1R0 A02;
    public SharedPreferences A00;
    public final AnonymousClass022 A01;

    public AnonymousClass1R0(AnonymousClass022 r1) {
        this.A01 = r1;
    }

    public static AnonymousClass1R0 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass1R0.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass1R0(AnonymousClass022.A00());
                }
            }
        }
        return A02;
    }

    public final SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A012 = this.A01.A01(AnonymousClass020.A02);
        this.A00 = A012;
        return A012;
    }

    public void A02(String str, String str2) {
        StringBuilder sb = new StringBuilder("gdrive-api/remove-uri ");
        sb.append(str2);
        Log.d(sb.toString());
        SharedPreferences.Editor edit = A01().edit();
        edit.remove(AnonymousClass008.A0M("gbackup-ResumableUrl-", str, "-", str2));
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-resumable-uri unable to commit resumable uri to shared prefs.");
        }
    }
}
