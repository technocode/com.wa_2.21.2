package X;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.1f2  reason: invalid class name and case insensitive filesystem */
public class C32491f2 {
    public static final C32491f2 A02 = new C32491f2();
    public int A00 = 5;
    public String A01 = "unknown";

    public final void A00(int i, String str, String str2) {
        Log.println(i, AnonymousClass008.A0P(new StringBuilder(), "unknown", ":", str), str2);
    }

    public final void A01(int i, String str, String str2, Throwable th) {
        String A0P = AnonymousClass008.A0P(new StringBuilder(), "unknown", ":", str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        Log.println(i, A0P, sb.toString());
    }
}
