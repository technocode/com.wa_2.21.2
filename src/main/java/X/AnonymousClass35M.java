package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.35M  reason: invalid class name */
public class AnonymousClass35M {
    public static File A00;

    public static synchronized File A00(Context context, AnonymousClass088 r10, AnonymousClass022 r11, AnonymousClass1XO r12, String str) {
        File file;
        synchronized (AnonymousClass35M.class) {
            A00 = C02230Bd.A0J(r10, r11, str, r12, 0, 1);
            SharedPreferences.Editor edit = r11.A01(AnonymousClass020.A02).edit();
            edit.putString("external_file_image", A00.getAbsolutePath());
            edit.apply();
            file = A00;
        }
        return file;
    }

    public static synchronized File A01(AnonymousClass022 r4) {
        File file;
        String string;
        synchronized (AnonymousClass35M.class) {
            if (A00 == null && (string = r4.A01(AnonymousClass020.A02).getString("external_file_image", null)) != null) {
                A00 = new File(string);
            }
            file = A00;
        }
        return file;
    }
}
