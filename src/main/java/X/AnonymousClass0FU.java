package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0FU  reason: invalid class name */
public class AnonymousClass0FU {
    public static volatile AnonymousClass0FU A09;
    public final AnonymousClass088 A00;
    public final C000300f A01;
    public final AnonymousClass03R A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass03S A05;
    public final AnonymousClass00D A06;
    public final AnonymousClass0FV A07;
    public final AnonymousClass0FY A08;

    public AnonymousClass0FU(AnonymousClass00G r1, AnonymousClass088 r2, AnonymousClass03R r3, C000300f r4, AnonymousClass00C r5, AnonymousClass03S r6, AnonymousClass00D r7, AnonymousClass0FV r8, AnonymousClass0FY r9) {
        this.A04 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
    }

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath("media");
        if (str != null) {
            appendPath.appendQueryParameter("query_param_country_code", str);
        }
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("path", str3);
        }
        return appendPath.build();
    }

    public static AnonymousClass0FU A01() {
        if (A09 == null) {
            synchronized (AnonymousClass0FU.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0FU(AnonymousClass00G.A01, AnonymousClass088.A00(), AnonymousClass03R.A00(), C000300f.A00(), AnonymousClass00C.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), AnonymousClass0FV.A00(), AnonymousClass0FY.A00());
                }
            }
        }
        return A09;
    }

    public static boolean A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/no-files-in-folder: ");
            sb.append(file);
            Log.i(sb.toString());
            return true;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory() && !A02(file2)) {
                StringBuilder sb2 = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/is-directory-and-contain-media-file-name: ");
                sb2.append(file2);
                Log.i(sb2.toString());
                return false;
            } else if (!file2.isDirectory() && !".nomedia".equals(file2.getName())) {
                StringBuilder sb3 = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/is-file-and-is-media-file-file-name: ");
                sb3.append(file2);
                Log.i(sb3.toString());
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0260, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r0.A0H().equals(r5.getString("registration_sibling_app_phone_number", null)) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0204, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0208, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0218, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FU.A03():void");
    }
}
