package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0ZD  reason: invalid class name */
public class AnonymousClass0ZD {
    public static final AnonymousClass00Z A00 = new AnonymousClass00Z(1, 1, 1, true);
    public static final Object A01 = new Object();
    public static final Set A02 = new HashSet(Arrays.asList("wmv", "aif", "cda", "mpa", "opus", "ogg", "wlp", "amr", "mp3", "m4a", "aac", "wav", "wma"));
    public static final Set A03 = new HashSet(Arrays.asList("7z", "arj", "deb", "pkg", "rar", "rpm", "gz", "z", "zip"));
    public static final Set A04 = new HashSet(Arrays.asList("pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "txt", "rtf", "tex", "csv", "wpd"));
    public static final Set A05 = new HashSet(Arrays.asList("apk", "bat", "bin", "cgi", "pl", "com", "exe", "gadget", "jar", "msi", "py", "wsf"));
    public static final Set A06 = new HashSet(Arrays.asList("ai", "ico", "jpeg", "jpg", "png", "ps", "psd", "svg", "tif", "tiff"));
    public static final Set A07 = new HashSet(Arrays.asList("3g2", "3gp", "avi", "flv", "h264", "m4v", "mkv", "mov", "mp4", "mpg", "mpeg", "rm", "vob"));

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0146, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.String r5, java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A00(java.lang.String, java.io.File):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r3 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.util.zip.ZipFile r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A01(java.util.zip.ZipFile, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c5, code lost:
        if (r5 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A02(java.lang.String r11, int r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A02(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public static Drawable A03(Context context, AnonymousClass0M2 r4) {
        String upperCase = C02220Bc.A01(((AnonymousClass0M3) r4).A07).toUpperCase(Locale.US);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r4.A0w())) {
            upperCase = C006803i.A0K(r4.A0w()).toUpperCase(Locale.US);
        }
        return A04(context, ((AnonymousClass0M3) r4).A07, upperCase, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r5.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r5.equals("application/msword") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r5.equals("application/vnd.ms-excel") != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_xls;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r7 == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_xls_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        return X.C004302a.A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r5.equals("text/rtf") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r5.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        if (r5.equals("application/vnd.ms-powerpoint") != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if (r5.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_ppt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r7 == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_ppt_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        return X.C004302a.A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        if (r5.equals("application/rtf") != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_doc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r7 == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r0 = com.google.android.search.verification.client.R.drawable.icon_file_doc_large;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        return X.C004302a.A03(r4, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A04(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A04(android.content.Context, java.lang.String, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A05(X.AnonymousClass03P r7, android.net.Uri r8) {
        /*
            r4 = r8
            java.io.File r0 = X.C006803i.A0B(r8)
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.getName()
            return r0
        L_0x000c:
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r0 = "_display_name"
            r2 = 0
            r5[r2] = r0
            r1 = 1
            java.lang.String r0 = "_size"
            r5[r1] = r0
            android.content.ContentResolver r3 = r7.A06()
            r6 = 0
            if (r3 != 0) goto L_0x0026
            java.lang.String r0 = "document-utils/get-document-title cr=null"
            com.whatsapp.util.Log.w(r0)
            return r6
        L_0x0026:
            r7 = r6
            r8 = r6
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ IllegalArgumentException -> 0x0050, UnsupportedOperationException -> 0x004e }
            if (r1 != 0) goto L_0x002f
            return r6
        L_0x002f:
            int r0 = r1.getColumnCount()     // Catch:{ all -> 0x0047 }
            if (r0 <= 0) goto L_0x0043
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x0047 }
            r1.close()
            return r0
        L_0x0043:
            r1.close()
            return r6
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        L_0x004e:
            r1 = move-exception
            goto L_0x0051
        L_0x0050:
            r1 = move-exception
        L_0x0051:
            java.lang.String r0 = "document-utils/get-document-title/unexpected exception"
            com.whatsapp.util.Log.w(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A05(X.03P, android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r7.equals("application/vnd.ms-excel") != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r4 = com.google.android.search.verification.client.R.plurals.number_of_sheets;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r7.equals("application/vnd.ms-powerpoint") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4 = com.google.android.search.verification.client.R.plurals.number_of_slides;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r7.equals("application/pdf") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r4 = com.google.android.search.verification.client.R.plurals.number_of_pages;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        return r6.A0A(r4, (long) r8, java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r7.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.equals("application/msword") != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A06(X.AnonymousClass01X r6, java.lang.String r7, int r8) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A06(X.01X, java.lang.String, int):java.lang.String");
    }

    public static void A07(C04370Kc r7, AnonymousClass02M r8, AnonymousClass009 r9, AnonymousClass00T r10, AnonymousClass0BW r11, ActivityC004702f r12, AnonymousClass0M2 r13, C02780Dk r14) {
        AnonymousClass0M4 r2 = ((AnonymousClass0M3) r13).A02;
        if (r2 != null) {
            File file = r2.A0F;
            if (file == null || !file.exists()) {
                r7.A03(r12);
            } else if (!r13.A0n.A02 && "apk".equalsIgnoreCase(C006803i.A0K(r2.A0F.getAbsolutePath()))) {
                long j = r13.A0p;
                DocumentWarningDialogFragment documentWarningDialogFragment = new DocumentWarningDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putLong("message_id", j);
                bundle.putInt("warning_id", R.string.warning_opening_apk);
                documentWarningDialogFragment.A0N(bundle);
                documentWarningDialogFragment.A0u(r12.A04(), null);
            } else if (r2.A07 == 3) {
                long j2 = r13.A0p;
                DocumentWarningDialogFragment documentWarningDialogFragment2 = new DocumentWarningDialogFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("message_id", j2);
                bundle2.putInt("warning_id", R.string.warning_opening_document);
                documentWarningDialogFragment2.A0N(bundle2);
                documentWarningDialogFragment2.A0u(r12.A04(), null);
            } else {
                WeakReference weakReference = new WeakReference(r12);
                r8.A05(0, R.string.loading_spinner);
                AnonymousClass3S7 r3 = new AnonymousClass3S7(weakReference, r8, r14, r13);
                C60322pF r22 = new C60322pF(r9, r11, r13);
                ((C41191ud) r22).A01.A03(r3, r8.A06);
                r10.ANF(r22);
            }
        } else {
            throw null;
        }
    }

    public static byte[] A08(Bitmap bitmap) {
        byte[] byteArray;
        int i = 80;
        do {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder A0S = AnonymousClass008.A0S("documentutils/docthumb ");
            int length = byteArray.length;
            A0S.append(length);
            A0S.append(" ");
            A0S.append(i);
            Log.i(A0S.toString());
            i -= 5;
            if (length <= 20480) {
                break;
            }
        } while (i > 0);
        return byteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r4 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A09(java.lang.String r12, java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZD.A09(java.lang.String, java.io.File):byte[]");
    }
}
