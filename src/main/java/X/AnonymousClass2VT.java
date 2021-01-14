package X;

import com.whatsapp.util.Log;
import java.io.PrintStream;

/* renamed from: X.2VT  reason: invalid class name */
public class AnonymousClass2VT {
    public static AnonymousClass2VV A00 = new C58152lS();

    public static void A00(AnonymousClass2VU r4, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AnonymousClass2VV r1 = A00;
        String obj = stackTrace[2].toString();
        if (!(r1 instanceof AnonymousClass3WJ)) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append(r4);
            sb.append(": ");
            sb.append(obj);
            sb.append(" : ");
            sb.append(str);
            printStream.println(sb.toString());
            return;
        }
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" :");
            sb2.append(str);
            Log.d(sb2.toString());
        } else if (ordinal == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" :");
            sb3.append(str);
            Log.i(sb3.toString());
        } else if (ordinal == 3) {
            AnonymousClass008.A1C(obj, " :", str);
        } else if (ordinal == 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append(" :");
            sb4.append(str);
            Log.e(sb4.toString());
        } else if (ordinal == 5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj);
            sb5.append(" :");
            sb5.append(str);
            Log.a(sb5.toString());
        }
    }
}
