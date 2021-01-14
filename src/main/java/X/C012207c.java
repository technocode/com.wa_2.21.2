package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.07c  reason: invalid class name and case insensitive filesystem */
public final class C012207c {
    public final Context A00;
    public final SharedPreferences A01;
    public final C012307d A02;
    public final Map A03 = new AnonymousClass05V();

    public C012207c(Context context) {
        boolean isEmpty;
        C012307d r2 = new C012307d();
        this.A00 = context;
        this.A01 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.A02 = r2;
        File file = new File(C004302a.A04(this.A00), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = this.A01.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseInstanceId", "App restored, clearing state");
                        A02();
                        FirebaseInstanceId.getInstance(AnonymousClass05T.A00()).A08();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf("").length() + 3);
        sb.append("");
        sb.append("|S|");
        sb.append(str);
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        int length = String.valueOf("").length() + 4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + length);
        sb.append("");
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void A02() {
        this.A03.clear();
        Context context = this.A00;
        File A04 = C004302a.A04(context);
        if (A04 == null || !A04.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A04 = context.getFilesDir();
        }
        File[] listFiles = A04.listFiles();
        for (File file : listFiles) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }
}
