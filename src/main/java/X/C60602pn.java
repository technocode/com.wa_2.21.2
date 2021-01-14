package X;

import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.FileUtils$OsRename;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: X.2pn  reason: invalid class name and case insensitive filesystem */
public final class C60602pn extends AbstractRunnableC459527e implements Comparable, AnonymousClass1W9 {
    public AnonymousClass1W6 A00;
    public AnonymousClass1WB A01;
    public File A02;
    public URL A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final long A07;
    public final ConditionVariable A08;
    public final AnonymousClass0CM A09;
    public final AnonymousClass009 A0A;
    public final AnonymousClass088 A0B;
    public final AnonymousClass0AH A0C;
    public final Mp4Ops A0D;
    public final C000300f A0E;
    public final AnonymousClass0CL A0F;
    public final C03140Ey A0G = new C03140Ey();
    public final C03140Ey A0H = new C03140Ey();
    public final C03140Ey A0I = new C03140Ey();
    public final C03140Ey A0J = new C03140Ey();
    public final C03140Ey A0K = new C03140Ey();
    public final C03140Ey A0L = new C03140Ey();
    public final AnonymousClass00C A0M;
    public final AnonymousClass00S A0N;
    public final AnonymousClass00G A0O;
    public final AnonymousClass0BV A0P;
    public final C002701k A0Q;
    public final AnonymousClass0CW A0R;
    public final AnonymousClass0CP A0S;
    public final AnonymousClass0CK A0T;
    public final C02460Cc A0U;
    public final AnonymousClass0FM A0V;
    public final AnonymousClass0Ci A0W;
    public final AnonymousClass0EN A0X;
    public final C49982Sy A0Y;
    public final AnonymousClass1WA A0Z;
    public final C02240Be A0a;
    public final C02550Cn A0b;
    public final AnonymousClass022 A0c;
    public final AnonymousClass0CT A0d;
    public final AnonymousClass0BB A0e;
    public final C02570Cp A0f;
    public final WebpUtils A0g;
    public final AnonymousClass34N A0h;
    public final C02220Bc A0i;
    public final AnonymousClass0FO A0j;
    public final AnonymousClass00T A0k;
    public final AnonymousClass0CN A0l;
    public final LinkedList A0m = new LinkedList();
    public final CountDownLatch A0n = new CountDownLatch(1);
    public final boolean A0o;
    public volatile int A0p;
    public volatile boolean A0q;

    public C60602pn(AnonymousClass00G r8, AnonymousClass00S r9, Mp4Ops mp4Ops, C002701k r11, AnonymousClass02M r12, AnonymousClass009 r13, WebpUtils webpUtils, AnonymousClass00T r15, AnonymousClass0CK r16, AnonymousClass088 r17, AnonymousClass0CL r18, AnonymousClass0CM r19, C000300f r20, AnonymousClass0CN r21, AnonymousClass0CP r22, AnonymousClass0CT r23, C02220Bc r24, AnonymousClass0AH r25, C02550Cn r26, C02570Cp r27, C02460Cc r28, C02240Be r29, AnonymousClass0BB r30, AnonymousClass0BV r31, AnonymousClass0Ci r32, AnonymousClass00C r33, AnonymousClass0EN r34, AnonymousClass0FM r35, AnonymousClass0FO r36, AnonymousClass0CW r37, AnonymousClass022 r38, ConditionVariable conditionVariable, AnonymousClass1WA r40, int i, long j, int i2, boolean z) {
        boolean z2 = true;
        this.A0O = r8;
        this.A0N = r9;
        this.A0D = mp4Ops;
        this.A0Q = r11;
        this.A0A = r13;
        this.A0g = webpUtils;
        this.A0k = r15;
        this.A0T = r16;
        this.A0B = r17;
        this.A0F = r18;
        this.A09 = r19;
        this.A0E = r20;
        this.A0l = r21;
        this.A0S = r22;
        this.A0d = r23;
        this.A0i = r24;
        this.A0C = r25;
        this.A0b = r26;
        this.A0f = r27;
        this.A0U = r28;
        this.A0a = r29;
        this.A0e = r30;
        this.A0P = r31;
        this.A0W = r32;
        this.A0M = r33;
        this.A0X = r34;
        this.A0j = r36;
        this.A0R = r37;
        this.A0c = r38;
        this.A08 = conditionVariable;
        this.A0Z = r40;
        this.A0p = i;
        this.A0V = r35;
        AnonymousClass1WB r4 = new AnonymousClass1WB(r40.A08, this.A0p, r37.A06() ? 4 : 0);
        this.A01 = r4;
        boolean z3 = r40.A0B != null;
        this.A0o = z3;
        r4.A0N = z3;
        this.A0q = false;
        this.A07 = j;
        this.A06 = i2;
        this.A0Y = new C49982Sy();
        StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownload/initialized;mediaHash=");
        A0S2.append(r40.A0C);
        A0S2.append(" autoDownload=");
        A0S2.append(this.A0p);
        A0S2.append(" streamable=");
        boolean A002 = r40.A00();
        A0S2.append(A002);
        Log.i(A0S2.toString());
        C56722j5 r1 = new C56722j5(this);
        Executor executor = r12.A06;
        ((C41191ud) this).A01.A03(r1, executor);
        ((AbstractRunnableC459527e) this).A00.A03(new C56762j9(this), executor);
        ((C41191ud) this).A00.A03(new C56752j8(this), executor);
        if (A002) {
            AnonymousClass34N r2 = new AnonymousClass34N();
            this.A0h = r2;
            long j2 = r40.A06;
            synchronized (r2) {
                r2.A04 = j2;
            }
        }
        C03140Ey r210 = this.A0H;
        if (!(2 == this.A0p || 3 == this.A0p)) {
            z2 = false;
        }
        r210.A04(new C49992Sz(z2, A002));
        this.A04 = z;
    }

    public static boolean A00(AnonymousClass088 r2, File file) {
        File A0C2 = r2.A0C(file);
        if (A0C2.exists() && !A0C2.delete()) {
            StringBuilder sb = new StringBuilder("MediaDownload/MMS failed to delete stream check success file ");
            sb.append(A0C2);
            Log.w(sb.toString());
        }
        return file.delete();
    }

    public static boolean A01(File file, File file2) {
        if (Build.VERSION.SDK_INT < 21) {
            boolean renameTo = file.renameTo(file2);
            if (!renameTo) {
                Log.i("media-file-utils/download file rename failed");
            }
            return renameTo;
        }
        if (FileUtils$OsRename.attempt(file, file2) > 0) {
            if (FileUtils$OsRename.attempt(file, file2) > 0) {
                Log.i("media-file-utils/Second try rename failed");
                return false;
            }
            Log.i("media-file-utils/Second try rename succeeded");
        }
        return true;
    }

    @Override // X.AbstractRunnableC459527e, X.C41191ud
    public void A02() {
        super.A02();
        this.A0J.A01();
        this.A0I.A01();
        this.A0K.A01();
        this.A0H.A01();
        this.A0G.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0255, code lost:
        if (r2 == r18) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r14 = java.security.MessageDigest.getInstance("SHA-256");
        r7 = new java.io.BufferedInputStream(new java.io.FileInputStream(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r13 = new X.AnonymousClass2KL(new X.AnonymousClass35K(r7, r2), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r14 = new X.AnonymousClass35R(r13, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r5 = java.security.MessageDigest.getInstance("SHA-256");
        X.C002001d.A32(r14, r5);
        r16 = android.util.Base64.encodeToString(r5.digest(), 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028d, code lost:
        if (r16.equals(r0) == false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028f, code lost:
        com.whatsapp.util.Log.d("MediaDownload/call/file exists for hash and full hash matches");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0294, code lost:
        r14.close();
        r13.close();
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a7, code lost:
        if (r13.A00().equals(r15) == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a9, code lost:
        com.whatsapp.util.Log.d("MediaDownload/call/file exists for hash and partial hash matches");
        r14.close();
        r13.close();
        r7.close();
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ba, code lost:
        r15 = new java.lang.StringBuilder();
        r15.append("MediaDownload/call/file exists for hash, but existing file hash (");
        r15.append(r16);
        r15.append(") does not match to stored value (");
        r15.append(r0);
        r15.append("), probably the file has been replaced");
        com.whatsapp.util.Log.i(r15.toString());
        r14.close();
        r13.close();
        r7.close();
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ea, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ee, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f1, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f5, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f8, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fc, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02fd, code lost:
        r13 = X.C002001d.A1P(r7, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0307, code lost:
        if (r13.equals(r0) == false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0309, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x030b, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("MediaDownload/call/file exists for hash, but existing file hash (");
        r7.append(r13);
        r7.append(") does not match to stored value (");
        r7.append(r0);
        r7.append("), probably the file has been replaced");
        com.whatsapp.util.Log.i(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x032e, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("MediaDownload/call/could not get hash for existing file; file=");
        r5.append(r12);
        com.whatsapp.util.Log.e(r5.toString(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0341, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0342, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("MediaDownload/call/could not get hash for existing file; file=");
        r5.append(r12);
        com.whatsapp.util.Log.e(r5.toString(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0354, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0356, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0357, code lost:
        if (r5 != false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0359, code lost:
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x035d, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035e, code lost:
        if (r8 != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0360, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0367, code lost:
        r3 = r8.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0518, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0519, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0227, code lost:
        if (r8 == 2) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022a, code lost:
        if (r5 == false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022d, code lost:
        if (r13 == 2) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022f, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023a, code lost:
        if (X.AnonymousClass1XO.A01(r11.A0m, ((X.AbstractC007503q) r11).A04) == X.AnonymousClass1XO.A0I) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023c, code lost:
        if (r12 == false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023e, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0241, code lost:
        if (r7 != r6.A01) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0243, code lost:
        r8 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0245, code lost:
        if (r8 == null) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0247, code lost:
        r7 = r29.A0A;
        r12 = r8.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024b, code lost:
        if (r12 == null) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024d, code lost:
        r15 = r6.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0251, code lost:
        if (r15 == null) goto L_0x02fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0367 A[SYNTHETIC] */
    @Override // X.AbstractRunnableC459527e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03() {
        /*
        // Method dump skipped, instructions count: 1315
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60602pn.A03():java.lang.Object");
    }

    public final int A05(File file, URL url, AnonymousClass2T0 r8, String str) {
        AnonymousClass1WA r4 = this.A0Z;
        String str2 = r4.A0B;
        if (str2 == null) {
            AnonymousClass008.A1V(AnonymousClass008.A0S("MediaDownload/checkMediaHash/message-supplied media hash is null mediaHash="), r4.A0C);
        }
        if (str2 == null) {
            str2 = r8.A01;
        }
        if (str == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownload/MMS download failed to calculate hash; mediaHash=");
            A0S2.append(r4.A0C);
            A0S2.append("; url=");
            A0S2.append(url);
            A0S2.append("; downloadFile=");
            A0S2.append(file.getAbsolutePath());
            A0S2.append("; downloadFile.exists?=");
            A0S2.append(file.exists());
            Log.w(A0S2.toString());
            return 1;
        } else if (str.equals(str2)) {
            return 0;
        } else {
            StringBuilder A0S3 = AnonymousClass008.A0S("MediaDownload/MMS download failed due to hash mismatch; mediaHash=");
            A0S3.append(r4.A0C);
            A0S3.append("; url=");
            A0S3.append(url);
            A0S3.append("; receivedHash=");
            A0S3.append(str2);
            A0S3.append("; localHash=");
            A0S3.append(str);
            Log.w(A0S3.toString());
            return 7;
        }
    }

    public final int A06(String str, URL url) {
        if (str == null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownload/MMS download failed during media decryption due to plaintext hash not calculated properly; mediaHash=");
            AnonymousClass1WA r1 = this.A0Z;
            String str2 = r1.A0C;
            A0S2.append(str2);
            A0S2.append("; url=");
            A0S2.append(url);
            A0S2.append("; mediaHash=");
            AnonymousClass008.A1Y(A0S2, str2, "; calculatedHash=", str, "; mediaSize=");
            A0S2.append(r1.A06);
            Log.w(A0S2.toString());
            return 1;
        }
        AnonymousClass1WA r3 = this.A0Z;
        String str3 = r3.A0C;
        if (str.equals(str3)) {
            return 0;
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("MediaDownload/MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
        A0S3.append(str3);
        A0S3.append("; url=");
        A0S3.append(url);
        A0S3.append("; mediaHash=");
        AnonymousClass008.A1Y(A0S3, str3, "; calculatedHash=", str, "; mediaSize=");
        A0S3.append(r3.A06);
        Log.w(A0S3.toString());
        return 2;
    }

    public final AnonymousClass1W8 A07(File file, File file2, URL url, AnonymousClass2T0 r11, String str, String str2) {
        int A052 = A05(file2, url, r11, str);
        FutureTask futureTask = ((AbstractRunnableC459527e) this).A02;
        if (futureTask.isCancelled()) {
            return new AnonymousClass1W8(13, null, false);
        }
        if (A052 != 0) {
            return new AnonymousClass1W8(A052, null, true);
        }
        if (file.equals(file2)) {
            return new AnonymousClass1W8(0, r11.A02, true, null);
        }
        int A062 = A06(str2, url);
        if (futureTask.isCancelled()) {
            return new AnonymousClass1W8(13, null, false);
        }
        if (A062 == 0) {
            String str3 = this.A0Z.A0E;
            String str4 = "enc";
            if (str3 != null) {
                String A012 = C02220Bc.A01(str3);
                if (!TextUtils.isEmpty(A012)) {
                    str4 = A012;
                }
            }
            return new AnonymousClass1W8(0, str4, true, null);
        } else if (A062 == 1) {
            return new AnonymousClass1W8(1, null, true);
        } else {
            if (A062 == 2) {
                return new AnonymousClass1W8(7, null, true);
            }
            throw new AssertionError("unknown result encountered in switch");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0212, code lost:
        if (r2.A04(r2, r2, false, r31, r0.A03, r0.A0P, r0.A0O) != false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x034f, code lost:
        if (r3 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0542, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0546, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:?, code lost:
        r3 = new X.AnonymousClass1W8(1, r9, r43.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x070c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x070f, code lost:
        if (r2.A0E != null) goto L_0x0711;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0711, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0712, code lost:
        if (r0 == false) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0714, code lost:
        r2.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0717, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x07d9, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x07da, code lost:
        r2 = r43.A01;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x07df, code lost:
        if (r2.A08 != null) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x07e1, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x07e2, code lost:
        if (r0 == false) goto L_0x07e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x07e4, code lost:
        r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x07e7, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        if (r0 > 0) goto L_0x01f8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:423:0x06e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:436:0x06f7 */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0571 A[Catch:{ all -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x06f7 A[PHI: r9 
      PHI: (r9v4 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String), (r9v9 java.lang.String), (r9v9 java.lang.String), (r9v12 java.lang.String), (r9v12 java.lang.String), (r9v12 java.lang.String), (r9v12 java.lang.String), (r9v12 java.lang.String), (r9v12 java.lang.String), (r9v14 java.lang.String), (r9v14 java.lang.String) binds: [B:19:0x0082, B:430:0x06ee, B:423:0x06e2, B:424:?, B:397:0x06ad, B:398:?, B:297:0x0586, B:298:?, B:203:0x040d, B:204:?, B:70:0x01a9, B:71:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:436:0x06f7] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0754  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0757  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x075f  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0762  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0797  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x07a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0185 A[SYNTHETIC, Splitter:B:66:0x0185] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1W8 A08(java.io.File r44, java.net.URL r45, X.AnonymousClass0J5 r46, boolean r47) {
        /*
        // Method dump skipped, instructions count: 2117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60602pn.A08(java.io.File, java.net.URL, X.0J5, boolean):X.1W8");
    }

    public final File A09() {
        StringBuilder sb = new StringBuilder();
        String str = this.A0Z.A0C;
        if (str != null) {
            sb.append(str.replace('/', '-'));
            sb.append(".chk.tmp");
            return AnonymousClass089.A01(this.A0B.A07(), sb.toString());
        }
        throw null;
    }

    public void A0A(int i) {
        this.A0p = i;
        AnonymousClass1WB r1 = this.A01;
        synchronized (r1) {
            r1.A00 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(int r27, java.io.File r28, X.AnonymousClass2KK r29) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60602pn.A0B(int, java.io.File, X.2KK):void");
    }

    public void A0C(AnonymousClass1W8 r27) {
        StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownload/updateMessageAfterExecution/mediaHash=");
        AnonymousClass1WA r8 = this.A0Z;
        String str = r8.A0C;
        A0S2.append(str);
        A0S2.append(" url=");
        A0S2.append(this.A03);
        A0S2.append(" status=");
        A0S2.append(r27);
        Log.i(A0S2.toString());
        boolean A022 = r27.A02();
        C49982Sy r5 = this.A0Y;
        int i = r8.A01;
        r5.A0A(A022, r27, i);
        if (A022) {
            long length = this.A02.length();
            synchronized (r5) {
                r5.A0E = Long.valueOf(length);
            }
            AnonymousClass34N r9 = this.A0h;
            if (r9 != null) {
                r9.A05(2);
            }
            if (!r8.A0Q && r5.A00() != 1) {
                if (r5.A00() == 3) {
                    Log.i("MediaDownload/updateMessageAfterExecution/keeping suspicious download file");
                }
                File file = r27.A02;
                if (file != null) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("MediaDownload/set downloadData.file to ");
                    A0S3.append(file.getAbsolutePath());
                    A0S3.append(", delete downloadFile=");
                    A0S3.append(this.A02.getAbsolutePath());
                    Log.d(A0S3.toString());
                    StringBuilder sb = new StringBuilder("MediaDownload/delete downloadFile ");
                    sb.append(this.A02.getAbsolutePath());
                    Log.d(sb.toString());
                    r5.A09(file);
                    this.A02.delete();
                } else {
                    File file2 = r8.A09;
                    if (file2 == null || file2.exists() || !A01(this.A02, file2)) {
                        boolean z = r8.A0P;
                        boolean z2 = r8.A0L;
                        boolean z3 = r8.A0R;
                        AnonymousClass1XO r14 = r8.A08;
                        int i2 = r8.A03;
                        String str2 = r8.A0F;
                        String str3 = r27.A03;
                        String str4 = r8.A0G;
                        if (str3 == null) {
                            if (str4 != null) {
                                str3 = C006803i.A0K(str4);
                            } else {
                                str3 = null;
                            }
                        }
                        File A0L2 = C02230Bd.A0L(z, z2, z3, r14, i2, i, str2, str3, this.A0O, this.A0B, this.A0c);
                        r5.A09(A0L2);
                        A01(this.A02, A0L2);
                    } else {
                        r5.A09(file2);
                    }
                }
            }
            if (r9 != null) {
                r9.A07(r5.A03());
                r9.A05(3);
                synchronized (r9) {
                    r9.A0F.clear();
                }
                r9.A03();
                File A0G2 = this.A0B.A0G(r8.A0L, r8.A0B, str, r8.A0G);
                if (A0G2 != null) {
                    A0G2.delete();
                } else {
                    throw null;
                }
            }
        } else {
            AnonymousClass34N r2 = this.A0h;
            if (r2 != null) {
                int i3 = r27.A01;
                boolean A012 = AnonymousClass1W8.A01(i3);
                synchronized (r2) {
                    r2.A0B = A012;
                    r2.A02 = i3;
                }
                r2.A05(4);
                synchronized (r2) {
                    r2.A0F.clear();
                }
            }
            File file3 = this.A02;
            if (file3 != null && file3.length() == 0) {
                A00(this.A0B, this.A02);
            }
            int i4 = r27.A01;
            if (i4 == 5 || i4 == 12 || i4 == 4) {
                r5.A05();
            }
        }
        A0F(r5);
        StringBuilder sb2 = new StringBuilder("MediaDownload/populateDuplicatesWithResult/status=");
        sb2.append(r27);
        Log.d(sb2.toString());
        LinkedList linkedList = this.A0m;
        synchronized (linkedList) {
            C49982Sy A023 = r5.A02();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1W7) it.next()).AFG(r27, A023);
            }
            linkedList.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r1 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011b, code lost:
        if (r1 == 3) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0194, code lost:
        if (r10 == 15) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.AnonymousClass1W8 r19) {
        /*
        // Method dump skipped, instructions count: 656
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60602pn.A0D(X.1W8):void");
    }

    public final void A0E(AnonymousClass1W8 r3, File file, File file2) {
        if (r3.A02() && !file.equals(file2)) {
            file.delete();
        } else if (r3.A01 == 1) {
            file.delete();
            A00(this.A0B, file2);
        }
    }

    public void A0F(C49982Sy r3) {
        StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownload/publishDownloadDataWhenComplete; mediaHash=");
        A0S2.append(this.A0Z.A0C);
        A0S2.append(" downloadData=");
        A0S2.append(r3.toString());
        Log.i(A0S2.toString());
        this.A0G.A04(r3.A02());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 == X.AnonymousClass1XO.A0J) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60602pn.A0G(java.io.File):void");
    }

    public final void A0H(File file) {
        C49982Sy r1 = this.A0Y;
        if (r1.A00() != 1 || !AnonymousClass0CK.A02(this.A0Z.A08)) {
            AnonymousClass1WA r5 = this.A0Z;
            AnonymousClass2TL A002 = new AnonymousClass2TM(this.A0g, this.A0A, this.A0E, this.A0i, this.A0f, this.A0a).A00(new AnonymousClass2TK(r5.A08, file, r5.A0E, r5.A0J));
            if (A002 != null) {
                byte[] bArr = A002.A02;
                if (bArr != null) {
                    AnonymousClass008.A1S(AnonymousClass008.A0S("mediadownload/createMessageThumbnailToStoreInDB/updated for mediaHash="), r5.A0C);
                    synchronized (r1) {
                        r1.A0J = bArr;
                    }
                }
                Pair pair = A002.A01;
                if (pair != null) {
                    int intValue = ((Number) pair.first).intValue();
                    synchronized (r1) {
                        r1.A0C = Integer.valueOf(intValue);
                    }
                    int intValue2 = ((Number) pair.second).intValue();
                    synchronized (r1) {
                        r1.A0B = Integer.valueOf(intValue2);
                    }
                }
                Pair pair2 = A002.A00;
                if (pair2 != null) {
                    int intValue3 = ((Number) pair2.first).intValue();
                    synchronized (r1) {
                        r1.A09 = Integer.valueOf(intValue3);
                    }
                    int intValue4 = ((Number) pair2.second).intValue();
                    synchronized (r1) {
                        r1.A09 = Integer.valueOf(intValue4);
                    }
                }
                byte[] bArr2 = A002.A03;
                synchronized (r1) {
                    r1.A0K = bArr2;
                }
            }
        }
    }

    public final void A0I(File file) {
        C000300f r2 = this.A0E;
        int i = this.A0Z.A03;
        long length = file.length();
        if (i == 7 && length < ((long) r2.A06(AbstractC000400g.A47)) * 1024) {
            AnonymousClass0CN r22 = this.A0l;
            Uri fromFile = Uri.fromFile(file);
            if (r22 != null) {
                try {
                    List A002 = C05500Ov.A00(r22.A02(fromFile));
                    if (A002 != null) {
                        C49982Sy r1 = this.A0Y;
                        Integer valueOf = Integer.valueOf(A002.size());
                        synchronized (r1) {
                            r1.A07 = valueOf;
                        }
                    }
                } catch (IOException e) {
                    Log.e("vcardloader/splitvcards/exception", e);
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass1W9
    public void A1j(AnonymousClass1W7 r3) {
        LinkedList linkedList = this.A0m;
        synchronized (linkedList) {
            linkedList.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r3 == false) goto L_0x003c;
     */
    @Override // X.AnonymousClass1W9
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2Z(boolean r8) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60602pn.A2Z(boolean):void");
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof C60602pn)) {
            return 0;
        }
        long j = ((C60602pn) obj).A07;
        long j2 = this.A07;
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }
}
