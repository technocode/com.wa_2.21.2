package X;

import android.media.MediaScannerConnection;
import com.whatsapp.NativeMediaHandler;
import com.whatsapp.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.089  reason: invalid class name */
public abstract class AnonymousClass089 {
    public static SimpleDateFormat A06 = new SimpleDateFormat("yyyyww", Locale.US);
    public static final String A07 = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Animated Gifs");
    public static final String A08 = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Audio");
    public static final String A09 = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Calls");
    public static final String A0A = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Documents");
    public static final String A0B = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Images");
    public static final String A0C = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Profile Photos");
    public static final String A0D = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Stickers");
    public static final String A0E = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Video");
    public static final String A0F = AnonymousClass008.A0O(new StringBuilder(), "WhatsApp", " Voice Notes");
    public C05780Qb A00;
    public final NativeMediaHandler A01;
    public final AnonymousClass03R A02;
    public final AnonymousClass00G A03;
    public final C007703s A04;
    public final Object A05 = new Object();

    public AnonymousClass089(AnonymousClass00G r2, AnonymousClass03R r3, NativeMediaHandler nativeMediaHandler, C007703s r5) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = nativeMediaHandler;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.isDirectory() != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A01(java.io.File r1, java.lang.String r2) {
        /*
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0020
            r1.delete()
        L_0x000f:
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "app/extsharedfile/folder/created/false"
            com.whatsapp.util.Log.e(r0)
        L_0x001a:
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            return r0
        L_0x0020:
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L_0x000f
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass089.A01(java.io.File, java.lang.String):java.io.File");
    }

    public static final File A02(File file, String str, String str2, String str3) {
        String name;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace('/', '-'));
            sb.append(str3);
            name = sb.toString();
        } else if (str2 != null) {
            name = new File(str2).getName();
        } else {
            Log.e("fmessageio/getDownloadFile/no_url");
            return null;
        }
        return A01(file, name);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r3.isDirectory() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(java.io.File r3, boolean r4) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass089.A03(java.io.File, boolean):void");
    }

    public C05780Qb A04() {
        C05780Qb r0;
        synchronized (this.A05) {
            if (this.A00 == null) {
                A0H();
            }
            r0 = this.A00;
            if (r0 == null) {
                throw null;
            }
        }
        return r0;
    }

    public File A05() {
        File file = new File(this.A03.A00.getCacheDir(), "export_chats");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A06() {
        File file = new File(this.A03.A00.getCacheDir(), "export_gdpr");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public File A07() {
        File file = A04().A03;
        A03(file, true);
        return file;
    }

    public File A08() {
        File file = new File(this.A03.A00.getFilesDir(), "Gifs");
        A03(file, false);
        return file;
    }

    public File A09() {
        File file = A04().A08;
        A03(file, false);
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b8, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0A(byte r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass089.A0A(byte, int, int):java.io.File");
    }

    public File A0B(AnonymousClass0M3 r5) {
        if (AnonymousClass1VY.A0X(r5.A0n.A00)) {
            return new File(this.A03.A00.getFilesDir(), "gdpr.zip.tmp");
        }
        return A02(A07(), r5.A06, r5.A09, ".tmp");
    }

    public File A0C(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append(".chck");
        return A01(A07(), sb.toString());
    }

    public File A0D(String str) {
        File A052 = A05();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".txt");
        return new File(A052, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0E(String str) {
        File A062 = A06();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return new File(A062, sb.toString().replaceAll("[?:\\\\/*\"<>|]", ""));
    }

    public File A0F(String str, String str2) {
        File file = new File(this.A02.A02, ".StickerThumbs");
        A03(file, false);
        return A02(file, str, str2, ".thumb.webp");
    }

    public File A0G(boolean z, String str, String str2, String str3) {
        if (z) {
            return new File(this.A03.A00.getFilesDir(), "gdpr.zip.enc.tmp");
        }
        if (str != null) {
            return A02(A07(), str, str3, ".enc.tmp");
        }
        return A02(A07(), str2, str3, ".enc.tmp");
    }

    public void A0H() {
        synchronized (this.A05) {
            this.A00 = new C05780Qb(this);
            C007703s r4 = this.A04;
            AnonymousClass00G r6 = this.A03;
            File file = new File(r6.A00.getFilesDir(), "Stickers");
            A03(file, false);
            Set set = r4.A01;
            set.add(file);
            set.add(A05());
            set.add(A06());
            File file2 = A04().A07;
            A03(file2, false);
            set.add(file2);
            set.add(A08());
            File file3 = new File(r6.A00.getCacheDir(), "stickers_cache");
            A03(file3, false);
            set.add(file3);
            set.add(A04().A06);
            NativeMediaHandler nativeMediaHandler = this.A01;
            if (nativeMediaHandler != null) {
                NativeMediaHandler.initFileHandlingCallbacks(nativeMediaHandler);
            } else {
                throw null;
            }
        }
    }

    public final void A0I(File file) {
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.delete()) {
            StringBuilder sb = new StringBuilder("fmessageio/deletenomedia/deleted ");
            sb.append(file2);
            Log.d(sb.toString());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                A0J(Arrays.asList(listFiles), null);
            }
        }
    }

    public void A0J(List list, Runnable runnable) {
        int size = list.size();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((File) list.get(i)).getAbsolutePath();
        }
        MediaScannerConnection.scanFile(this.A03.A00, strArr, null, new AnonymousClass1HS(new AtomicInteger(size), runnable));
    }

    public boolean A0K(File file) {
        return file.getCanonicalPath().startsWith(A04().A08.getCanonicalPath());
    }

    public boolean A0L(File file) {
        return file.getCanonicalPath().startsWith(A04().A03.getCanonicalPath()) || file.getCanonicalPath().startsWith(A04().A07.getCanonicalPath());
    }

    public boolean A0M(File file) {
        if (!A0K(file)) {
            return false;
        }
        String canonicalPath = file.getCanonicalPath();
        C05780Qb A042 = A04();
        if (canonicalPath.startsWith(A042.A0F.getCanonicalPath()) || canonicalPath.startsWith(A042.A0G.getCanonicalPath()) || canonicalPath.startsWith(A042.A0H.getCanonicalPath()) || canonicalPath.startsWith(A042.A0I.getCanonicalPath()) || canonicalPath.startsWith(A042.A0J.getCanonicalPath()) || canonicalPath.startsWith(A042.A0K.getCanonicalPath()) || canonicalPath.startsWith(A042.A09.getCanonicalPath()) || canonicalPath.startsWith(A042.A0A.getCanonicalPath()) || canonicalPath.startsWith(A042.A0B.getCanonicalPath()) || canonicalPath.startsWith(A042.A0C.getCanonicalPath()) || canonicalPath.startsWith(A042.A0D.getCanonicalPath()) || canonicalPath.startsWith(A042.A04.getCanonicalPath()) || canonicalPath.startsWith(A042.A0M.getCanonicalPath())) {
            return false;
        }
        return true;
    }
}
