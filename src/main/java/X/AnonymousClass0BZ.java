package X;

import com.whatsapp.util.Log;
import java.util.AbstractList;

/* renamed from: X.0BZ  reason: invalid class name */
public class AnonymousClass0BZ {
    public static volatile AnonymousClass0BZ A0D;
    public C663333u A00;
    public AnonymousClass33w A01;
    public C663533x A02;
    public C03590Gv A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass0B3 A05;
    public final AnonymousClass03R A06;
    public final AnonymousClass00C A07;
    public final AnonymousClass00G A08;
    public final AnonymousClass0BD A09;
    public final AnonymousClass04q A0A;
    public final AnonymousClass0BE A0B;
    public final AnonymousClass0BC A0C;

    public AnonymousClass0BZ(AnonymousClass00G r1, AnonymousClass0BC r2, AnonymousClass009 r3, AnonymousClass03R r4, AnonymousClass04q r5, AnonymousClass0BD r6, AnonymousClass00C r7, AnonymousClass0BE r8, AnonymousClass0B3 r9) {
        this.A08 = r1;
        this.A0C = r2;
        this.A04 = r3;
        this.A06 = r4;
        this.A0A = r5;
        this.A09 = r6;
        this.A07 = r7;
        this.A0B = r8;
        this.A05 = r9;
    }

    public static AnonymousClass0BZ A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0BZ.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0BZ(AnonymousClass00G.A01, AnonymousClass0BC.A00(), AnonymousClass009.A00(), AnonymousClass03R.A00(), AnonymousClass04q.A00(), AnonymousClass0BD.A00(), AnonymousClass00C.A00(), AnonymousClass0BE.A01(), AnonymousClass0B3.A00());
                }
            }
        }
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(java.util.zip.ZipOutputStream r3, java.io.File r4) {
        /*
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0030
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
            java.lang.String r1 = r4.getName()     // Catch:{ all -> 0x0026 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0026 }
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            r3.putNextEntry(r0)     // Catch:{ all -> 0x0026 }
            X.C006803i.A0d(r2, r3)     // Catch:{ all -> 0x0026 }
            r3.closeEntry()     // Catch:{ all -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0
        L_0x002d:
            r2.close()
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BZ.A01(java.util.zip.ZipOutputStream, java.io.File):void");
    }

    public AnonymousClass33N A02(String str) {
        AnonymousClass00E.A00();
        Log.d("StickerPackDBTableHelper/getDownloadableStickerPacks");
        AbstractList abstractList = (AbstractList) A05().A00("downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)", new String[]{str}, "id = ?", "getDownloadableStickerPacks/QUERY");
        if (abstractList.isEmpty()) {
            return null;
        }
        if (abstractList.size() < 2) {
            return (AnonymousClass33N) abstractList.get(0);
        }
        throw new IllegalStateException(AnonymousClass008.A0K("StickerPack/getDownloadablePackById/there should only be one sticker that matches this id:", str));
    }

    public AnonymousClass33N A03(String str) {
        String[] strArr;
        String str2;
        AnonymousClass00E.A00();
        AnonymousClass33w A052 = A05();
        if (str == null) {
            strArr = null;
            str2 = "";
        } else {
            strArr = new String[]{str};
            str2 = "installed_id= ?";
        }
        Log.d("StickerPackDBTableHelper/getInstalledStickerPacks");
        AbstractList abstractList = (AbstractList) A052.A00("installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", strArr, str2, "getInstalledStickerPacks/QUERY");
        if (abstractList.size() <= 0) {
            return null;
        }
        if (abstractList.size() < 2) {
            AnonymousClass33N r1 = (AnonymousClass33N) abstractList.get(0);
            if (r1 == null) {
                return r1;
            }
            r1.A04 = A04().A00(str);
            return r1;
        }
        throw new IllegalStateException(AnonymousClass008.A0K("StickerPack/getInstalledPackById/there should only be one sticker that matches this id:", str));
    }

    public final synchronized C663333u A04() {
        C663333u r2;
        r2 = this.A00;
        if (r2 == null) {
            r2 = new C663333u(A07(), A07().A04.readLock());
            this.A00 = r2;
        }
        return r2;
    }

    public final synchronized AnonymousClass33w A05() {
        AnonymousClass33w r2;
        r2 = this.A01;
        if (r2 == null) {
            r2 = new AnonymousClass33w(A07(), A07().A04.readLock());
            this.A01 = r2;
        }
        return r2;
    }

    public final synchronized C663533x A06() {
        C663533x r2;
        r2 = this.A02;
        if (r2 == null) {
            r2 = new C663533x(A07(), A07().A04.readLock());
            this.A02 = r2;
        }
        return r2;
    }

    public synchronized C03590Gv A07() {
        C03590Gv r3;
        r3 = this.A03;
        if (r3 == null) {
            r3 = new C03590Gv(this.A08.A00, this.A04, this.A0A);
            this.A03 = r3;
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0150, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0154, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A08(X.AnonymousClass1Y4 r12) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BZ.A08(X.1Y4):java.io.File");
    }

    public final synchronized void A09() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        C03590Gv r0 = this.A03;
        if (r0 != null) {
            r0.close();
            this.A03 = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r5 <= 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(X.AnonymousClass33N r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BZ.A0A(X.33N, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0195, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0199, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0167, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0172, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0B(X.AnonymousClass1Y4 r13) {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BZ.A0B(X.1Y4):boolean");
    }
}
