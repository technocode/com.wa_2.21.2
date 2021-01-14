package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.03A  reason: invalid class name */
public class AnonymousClass03A {
    public static volatile AnonymousClass03A A03;
    public String A00;
    public String A01;
    public final AnonymousClass00G A02;

    public AnonymousClass03A(AnonymousClass00G r1) {
        this.A02 = r1;
    }

    public static AnonymousClass03A A00() {
        if (A03 == null) {
            synchronized (AnonymousClass03A.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass03A(AnonymousClass00G.A01);
                }
            }
        }
        return A03;
    }

    public static final String A01(AnonymousClass00G r10, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5 = "unknown";
        Pattern compile = Pattern.compile("[^,\\.\\w\\-\\(\\)]");
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(' ', '_'));
        if (z) {
            str2 = ".beta";
        } else {
            str2 = "";
        }
        sb.append(str2);
        String obj = sb.toString();
        String replace = "Android".replace(' ', '_');
        String replace2 = C001801b.A0V(r10.A00).replace(' ', '_');
        try {
            str3 = compile.matcher(Build.VERSION.RELEASE).replaceAll("_");
        } catch (NoSuchFieldError e) {
            Log.e("app/user-agent/release", e);
            str3 = str5;
        }
        try {
            str4 = compile.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (NoSuchFieldError e2) {
            Log.e("app/user-agent/manufacturer", e2);
            str4 = str5;
        }
        try {
            str5 = compile.matcher(Build.MODEL).replaceAll("_");
        } catch (NoSuchFieldError e3) {
            Log.e("app/user-agent/model", e3);
        }
        StringBuilder A0a = AnonymousClass008.A0a(replace2, "/", obj, " ", replace);
        AnonymousClass008.A1Y(A0a, "/", str3, " Device/", str4);
        return AnonymousClass008.A0O(A0a, "-", str5);
    }

    public synchronized String A02() {
        if (this.A00 == null) {
            this.A00 = A01(this.A02, "2.21.2.4", false);
        }
        return this.A00;
    }
}
