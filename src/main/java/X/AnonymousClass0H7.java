package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: X.0H7  reason: invalid class name */
public class AnonymousClass0H7 {
    public static volatile AnonymousClass0H7 A07;
    public C002701k A00;
    public final AnonymousClass009 A01;
    public final C000300f A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass0AX A04;
    public final AnonymousClass00G A05;
    public final WebpUtils A06;

    public AnonymousClass0H7(AnonymousClass00G r1, C002701k r2, AnonymousClass009 r3, WebpUtils webpUtils, C000300f r5, AnonymousClass00C r6, AnonymousClass0AX r7) {
        this.A05 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = webpUtils;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
    }

    public static Pair A00(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf < 0) {
            return null;
        }
        return new Pair(URLDecoder.decode(str.substring(0, indexOf)), str.substring(indexOf + 1));
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(URLEncoder.encode(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final boolean A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!str.matches("[\\w-.,'\\s]+")) {
            StringBuilder sb = new StringBuilder();
            sb.append("ThirdPartyStickerFetcher/stringInvalid/string ");
            sb.append(str);
            sb.append(" contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character");
            Log.e(sb.toString());
            return true;
        } else if (!str.contains("..")) {
            return false;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ThirdPartyStickerFetcher/stringInvalid/string ");
            sb2.append(str);
            sb2.append(" cannot contain ..");
            Log.e(sb2.toString());
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        if (r2 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A03(android.content.Context r9, X.AnonymousClass33N r10) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H7.A03(android.content.Context, X.33N):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0185, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass33N A04(java.lang.String r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 526
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H7.A04(java.lang.String, java.lang.String):X.33N");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0321, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0325, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01db, code lost:
        if (r14.getShort(r2) <= 0) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass33N A05(java.lang.String r28, java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 957
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0H7.A05(java.lang.String, java.lang.String):X.33N");
    }
}
