package X;

import android.net.Uri;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;
import java.util.Comparator;

/* renamed from: X.0H5  reason: invalid class name */
public class AnonymousClass0H5 {
    public static final Comparator A03 = AnonymousClass336.A00;
    public static volatile AnonymousClass0H5 A04;
    public final AnonymousClass088 A00;
    public final AnonymousClass0H6 A01;
    public final WebpUtils A02;

    public AnonymousClass0H5(AnonymousClass088 r1, AnonymousClass0H6 r2, WebpUtils webpUtils) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = webpUtils;
    }

    public final File A00(String str, String str2) {
        AnonymousClass088 r0 = this.A00;
        if (r0 != null) {
            File file = new File(r0.A03.A00.getCacheDir(), "stickers_cache");
            AnonymousClass089.A03(file, false);
            StringBuilder sb = new StringBuilder();
            sb.append(Uri.encode(str));
            sb.append(File.separatorChar);
            sb.append(Uri.encode(str2));
            return new File(file, sb.toString());
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        if (r4 != null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(java.lang.String r9, java.lang.String r10, java.util.List r11) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H5.A01(java.lang.String, java.lang.String, java.util.List):void");
    }
}
