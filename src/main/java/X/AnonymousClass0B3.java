package X;

import android.net.Uri;
import android.provider.MediaStore;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0B3  reason: invalid class name */
public class AnonymousClass0B3 {
    public static volatile AnonymousClass0B3 A07;
    public AnonymousClass02H A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass0B4 A04;
    public final AnonymousClass022 A05;
    public final AnonymousClass00T A06;

    public AnonymousClass0B3(AnonymousClass00G r1, AnonymousClass00T r2, AnonymousClass088 r3, AnonymousClass03P r4, AnonymousClass0B4 r5, AnonymousClass022 r6) {
        this.A03 = r1;
        this.A06 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static AnonymousClass0B3 A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0B3.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0B3(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass088.A00(), AnonymousClass03P.A00(), AnonymousClass0B4.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A07;
    }

    public File A01() {
        AnonymousClass088 r0 = this.A01;
        if (r0 != null) {
            File file = new File(r0.A03.A00.getFilesDir(), "Stickers");
            AnonymousClass089.A03(file, false);
            return file;
        }
        throw null;
    }

    public File A02(String str) {
        File A032 = A03(str);
        if (!A032.exists()) {
            return null;
        }
        A07(A032, 1, true);
        return A032;
    }

    public File A03(String str) {
        File A012 = A01();
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace('/', '-'));
        sb.append(".webp");
        return new File(A012, sb.toString());
    }

    public void A04(byte b, File file) {
        Uri uri;
        AnonymousClass02H r2;
        if (b == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (b == 2) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (b == 3 || b == 13) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = null;
        }
        synchronized (this) {
            r2 = this.A00;
            if (r2 == null) {
                r2 = new AnonymousClass02H(this.A06, false);
                this.A00 = r2;
            }
        }
        r2.execute(new RunnableEBaseShape0S0300000_I0_0(this, uri, file, 11));
    }

    public void A05(File file, byte b, boolean z, int i) {
        if (A09(file) && A0A(file, z, i)) {
            A04(b, file);
        }
    }

    public void A06(File file, int i, boolean z) {
        if (A09(file)) {
            A07(file, i, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.io.File r8, int r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B3.A07(java.io.File, int, boolean):void");
    }

    public void A08(String str) {
        A0A(A03(str), true, 1);
    }

    public final boolean A09(File file) {
        try {
            AnonymousClass088 r2 = this.A01;
            if (r2.A0L(file) || r2.A0K(file) || file.getCanonicalPath().startsWith(r2.A04().A06.getCanonicalPath())) {
                return true;
            }
            return false;
        } catch (IOException e) {
            Log.e("ReferenceCountedFileManager/isExternalManagedMediaFile ", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r0 != 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(java.io.File r15, boolean r16, int r17) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B3.A0A(java.io.File, boolean, int):boolean");
    }
}
