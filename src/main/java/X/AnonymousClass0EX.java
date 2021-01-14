package X;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import java.net.URL;
import java.util.HashMap;

/* renamed from: X.0EX  reason: invalid class name */
public class AnonymousClass0EX {
    public static volatile AnonymousClass0EX A0A;
    public final C000300f A00;
    public final AnonymousClass0CL A01;
    public final AnonymousClass0EV A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass0ET A05;
    public final AnonymousClass0CW A06;
    public final AnonymousClass0CT A07;
    public final AnonymousClass00T A08;
    public final HashMap A09 = new HashMap();

    public AnonymousClass0EX(AnonymousClass00G r2, AnonymousClass00T r3, AnonymousClass0CL r4, C000300f r5, AnonymousClass0CT r6, AnonymousClass0ET r7, AnonymousClass00C r8, AnonymousClass0EV r9, AnonymousClass0CW r10) {
        this.A04 = r2;
        this.A08 = r3;
        this.A01 = r4;
        this.A00 = r5;
        this.A07 = r6;
        this.A05 = r7;
        this.A03 = r8;
        this.A02 = r9;
        this.A06 = r10;
    }

    public static AnonymousClass0EX A00() {
        if (A0A == null) {
            synchronized (AnonymousClass0EX.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass0EX(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass0CL.A00(), C000300f.A00(), AnonymousClass0CT.A00(), AnonymousClass0ET.A00(), AnonymousClass00C.A00(), AnonymousClass0EV.A00(), AnonymousClass0CW.A00());
                }
            }
        }
        return A0A;
    }

    public static File A01(Context context, URL url) {
        File file = new File(context.getCacheDir(), "ProfilePictureTemp");
        file.mkdirs();
        return new File(file, URLUtil.guessFileName(url.toString(), null, null));
    }
}
