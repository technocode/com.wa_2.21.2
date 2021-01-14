package X;

import android.app.Application;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.022  reason: invalid class name */
public class AnonymousClass022 {
    public static volatile AnonymousClass022 A04;
    public final Application A00;
    public final AnonymousClass02E A01;
    public final Map A02 = new HashMap();
    public final AtomicInteger A03 = new AtomicInteger();

    public AnonymousClass022(AnonymousClass00G r3, AnonymousClass00T r4) {
        Application application = r3.A00;
        this.A00 = application;
        this.A01 = new AnonymousClass02E(r4);
    }

    public static AnonymousClass022 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass022.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass022(AnonymousClass00G.A01, C002101e.A00());
                }
            }
        }
        return A04;
    }

    public synchronized SharedPreferences A01(String str) {
        return A03(str, false);
    }

    public synchronized SharedPreferences A02(String str) {
        return A03(str, true);
    }

    public final SharedPreferences A03(String str, boolean z) {
        SharedPreferences sharedPreferences;
        Map map = this.A02;
        SharedPreferences sharedPreferences2 = (SharedPreferences) map.get(str);
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        String str2 = AnonymousClass020.A02;
        if (str2.equals(str)) {
            return this.A00.getSharedPreferences(str2, 0);
        }
        Application application = this.A00;
        File file = new File(application.getFilesDir().getParent(), "shared_prefs");
        if (!file.exists()) {
            try {
                file.mkdir();
                if (!file.exists()) {
                    StringBuilder A0S = AnonymousClass008.A0S("SharedPreferencesFactory/Failed to create preference dir ");
                    A0S.append(file.getAbsolutePath());
                    Log.e(A0S.toString());
                    sharedPreferences = application.getSharedPreferences(str, 0);
                } else if (!file.isDirectory() || !file.canRead() || !file.canWrite()) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("SharedPreferencesFactory/Invalid preference dir ");
                    A0S2.append(file.getAbsolutePath());
                    A0S2.append(", isDirectory=");
                    A0S2.append(file.isDirectory());
                    A0S2.append(", canRead=");
                    A0S2.append(file.canRead());
                    A0S2.append(", canWrite=");
                    A0S2.append(file.canWrite());
                    Log.e(A0S2.toString());
                    sharedPreferences = application.getSharedPreferences(str, 0);
                }
            } catch (SecurityException e) {
                StringBuilder A0S3 = AnonymousClass008.A0S("SharedPreferencesFactory/Unable to create LightSharedPreferences: ");
                A0S3.append(file.getAbsolutePath());
                Log.e(A0S3.toString(), e);
                sharedPreferences = application.getSharedPreferences(str, 0);
            }
            map.put(str, sharedPreferences);
            return sharedPreferences;
        }
        sharedPreferences = new AnonymousClass02G(new AnonymousClass02F(new File(file, AnonymousClass008.A0K(str, ".xml"))), z, this.A01, this.A03.getAndIncrement());
        map.put(str, sharedPreferences);
        return sharedPreferences;
    }
}
