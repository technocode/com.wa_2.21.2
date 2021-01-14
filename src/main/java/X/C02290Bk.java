package X;

import android.os.Environment;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0Bk  reason: invalid class name and case insensitive filesystem */
public class C02290Bk {
    public static volatile C02290Bk A0Z;
    public int A00;
    public final C02270Bi A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final C000300f A05;
    public final C02300Bl A06;
    public final AnonymousClass03R A07;
    public final AnonymousClass00C A08;
    public final AnonymousClass00G A09;
    public final AnonymousClass03C A0A;
    public final AnonymousClass03S A0B;
    public final AnonymousClass00D A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass0BD A0E;
    public final AnonymousClass0FS A0F;
    public final C02100Aq A0G;
    public final C02320Bn A0H;
    public final AnonymousClass0GW A0I;
    public final C014608e A0J;
    public final AnonymousClass094 A0K;
    public final C014508d A0L;
    public final AnonymousClass0GY A0M;
    public final C015708p A0N;
    public final AnonymousClass00Y A0O;
    public final AnonymousClass0FZ A0P;
    public final AnonymousClass022 A0Q;
    public final AnonymousClass0FU A0R;
    public final AnonymousClass0BE A0S;
    public final AnonymousClass0GV A0T;
    public final AnonymousClass0BC A0U;
    public final File A0V;
    public final File A0W;
    public final File A0X;
    public final Set A0Y = new HashSet();

    public C02290Bk(AnonymousClass00G r6, AnonymousClass02M r7, AnonymousClass009 r8, AnonymousClass0BC r9, AnonymousClass01I r10, AnonymousClass00Y r11, C000300f r12, AnonymousClass03R r13, AnonymousClass01X r14, AnonymousClass0BD r15, C02300Bl r16, C02320Bn r17, AnonymousClass0FS r18, AnonymousClass00C r19, C015708p r20, AnonymousClass0FU r21, C014608e r22, AnonymousClass0FZ r23, C014508d r24, C02100Aq r25, AnonymousClass03S r26, AnonymousClass00D r27, AnonymousClass03C r28, AnonymousClass0GV r29, AnonymousClass0GW r30, AnonymousClass022 r31, AnonymousClass0GY r32, AnonymousClass0BE r33, AnonymousClass094 r34) {
        this.A09 = r6;
        this.A03 = r7;
        this.A02 = r8;
        this.A0U = r9;
        this.A04 = r10;
        this.A0O = r11;
        this.A05 = r12;
        this.A07 = r13;
        this.A0D = r14;
        this.A0E = r15;
        this.A06 = r16;
        this.A0H = r17;
        this.A0F = r18;
        this.A08 = r19;
        this.A0N = r20;
        this.A0R = r21;
        this.A0J = r22;
        this.A0P = r23;
        this.A0L = r24;
        this.A0G = r25;
        this.A0B = r26;
        this.A0C = r27;
        this.A0A = r28;
        this.A0T = r29;
        this.A0I = r30;
        this.A0Q = r31;
        this.A0M = r32;
        this.A0S = r33;
        this.A0K = r34;
        this.A0V = r6.A00.getDatabasePath("msgstore.db-backup");
        this.A01 = new C02270Bi();
        this.A0W = new File(new File(r13.A02, "Databases"), "msgstore.db");
        this.A0X = new File(new File(new File(Environment.getExternalStorageDirectory(), "WhatsApp"), "Databases"), "msgstore.db");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        if (r2 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.io.File r4) {
        /*
            r3 = -1
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0044 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r1, r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "SELECT COUNT(*) from messages"
            android.database.Cursor r1 = r2.rawQuery(r0, r1)     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0019
            r2.close()
            return r3
        L_0x0019:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x002d
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0034 }
            int r0 = r0 + -1
            r1.close()
            r2.close()
            return r0
        L_0x002d:
            r1.close()
            r2.close()
            return r3
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        L_0x0044:
            r2 = move-exception
            java.lang.String r0 = "msgstore/getMessageCountInDb error while trying to retrieve messages count in "
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = r4.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02290Bk.A00(java.io.File):int");
    }

    public static int A01(String str) {
        if ("msgstore.db".equals(str)) {
            return 0;
        }
        if (str.endsWith(".crypt")) {
            return 1;
        }
        String[] split = str.split(".crypt");
        if (split.length != 2) {
            AnonymousClass008.A17("msgstore/get-version/unexpected-filename ", str);
            return -1;
        }
        try {
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/get-version/unexpected-filename ");
            sb.append(str);
            Log.e(sb.toString(), e);
            return -1;
        }
    }

    public static C02290Bk A02() {
        if (A0Z == null) {
            synchronized (C02290Bk.class) {
                if (A0Z == null) {
                    AnonymousClass00S.A00();
                    A0Z = new C02290Bk(AnonymousClass00G.A01, AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass0BC.A00(), AnonymousClass01I.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass03R.A00(), AnonymousClass01X.A00(), AnonymousClass0BD.A00(), C02300Bl.A00(), C02320Bn.A00(), AnonymousClass0FS.A00(), AnonymousClass00C.A00(), C015708p.A00(), AnonymousClass0FU.A01(), C014608e.A01, AnonymousClass0FZ.A00(), C014508d.A00(), C02100Aq.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), AnonymousClass03C.A00(), AnonymousClass0GV.A00(), AnonymousClass0GW.A00(), AnonymousClass022.A00(), AnonymousClass0GY.A00(), AnonymousClass0BE.A01(), AnonymousClass094.A00());
                }
            }
        }
        return A0Z;
    }

    public static AnonymousClass1Y3 A03(String str) {
        AnonymousClass1Y3 r0;
        int A012 = A01(str);
        if (A012 <= 0) {
            return null;
        }
        synchronized (AnonymousClass1Y3.class) {
            if (AnonymousClass1Y3.A00 == null) {
                AnonymousClass1Y3.A02();
            }
            r0 = (AnonymousClass1Y3) AnonymousClass1Y3.A00.get(A012);
        }
        return r0;
    }

    public static String[] A04(AnonymousClass1Y3 r5, AnonymousClass1Y3 r6) {
        if (r5.version <= r6.version) {
            AnonymousClass1Y3[] A032 = AnonymousClass1Y3.A03(r5, r6);
            int length = A032.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass1Y3 r2 = A032[i];
                StringBuilder A0S2 = AnonymousClass008.A0S(".crypt");
                A0S2.append(r2.version);
                strArr[i] = A0S2.toString();
            }
            return strArr;
        }
        StringBuilder sb = new StringBuilder("msgstore/get-db-crypt-extension-range/illegal-range [");
        sb.append(r5);
        sb.append(", ");
        sb.append(r6);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public int A05() {
        long length = A0D().length();
        long A022 = this.A08.A02();
        if (A022 > 7 * length) {
            return 7;
        }
        int max = Math.max((int) (A022 / length), 2);
        StringBuilder sb = new StringBuilder("msgstore/backup/backupexpirationInDays not enough space to store full backup history, saving backups only for ");
        sb.append(max);
        sb.append(" days");
        Log.i(sb.toString());
        return max;
    }

    public int A06() {
        AnonymousClass1Y3[] values = AnonymousClass1Y3.values();
        for (AnonymousClass1Y3 r3 : values) {
            StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/getbackupfilecount/backupfile/");
            StringBuilder A0S3 = AnonymousClass008.A0S(".crypt");
            A0S3.append(r3.version);
            A0S2.append(A0S3.toString());
            A0S2.append(" ");
            A0S2.append(A0E(r3));
            Log.d(A0S2.toString());
        }
        return A0F().size();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:145|146|147|148|149) */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r23.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04f7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x04f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0501 */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0551 A[Catch:{ all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x061c  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x06d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.AbstractC27651Qw r46) {
        /*
        // Method dump skipped, instructions count: 1815
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02290Bk.A07(X.1Qw):int");
    }

    public long A08() {
        try {
            File A0B2 = A0B();
            if (A0B2 != null) {
                return A0B2.lastModified();
            }
            return 0;
        } catch (IOException e) {
            Log.i("msgstore/lastbackupfiletime", e);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b8, code lost:
        if (r5.getMessage().contains("mac check in GCM failed") != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x036e, code lost:
        if (r1 != false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04be, code lost:
        if (r8 != null) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04c3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c7, code lost:
        if (r9 != null) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04cc, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x056c, code lost:
        if (r12.A01.size() != 0) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0606, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0607, code lost:
        if (r6 != null) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x060c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0924, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0928, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0930, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0934, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0c6f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0c73, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0c7b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0c7f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0d8f, code lost:
        if (r6 != false) goto L_0x0d9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0daa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0dab, code lost:
        if (r1 != null) goto L_0x0dad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0db0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0db3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0db7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0e13, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0e17, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0e1a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0e1e, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0299 A[Catch:{ Exception -> 0x0e1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a8 A[Catch:{ Exception -> 0x0e1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d4 A[Catch:{ Exception -> 0x0e1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0680 A[LOOP:6: B:250:0x05aa->B:287:0x0680, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0de7  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0dea  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0e37  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0e4b  */
    /* JADX WARNING: Removed duplicated region for block: B:537:0x0eda  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0f09  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0f3d  */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x02e8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:598:0x068e A[EDGE_INSN: B:598:0x068e->B:290:0x068e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1V1 A09(int r55, java.util.List r56, X.C39171r4 r57) {
        /*
        // Method dump skipped, instructions count: 4067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02290Bk.A09(int, java.util.List, X.1r4):X.1V1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0125, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1V1 A0A(boolean r35, X.AbstractC47972Kk r36) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02290Bk.A0A(boolean, X.2Kk):X.1V1");
    }

    public File A0B() {
        String externalStorageState = Environment.getExternalStorageState();
        AnonymousClass03S r1 = this.A0B;
        if (r1 == null) {
            throw null;
        } else if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && r1.A02("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            ArrayList A0F2 = A0F();
            for (int size = A0F2.size() - 1; size >= 0; size--) {
                File file = (File) A0F2.get(size);
                if (file.length() > 0) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/lastbackupfile/file ");
                    A0S2.append(file.getName());
                    A0S2.append(" size=");
                    A0S2.append(file.length());
                    Log.i(A0S2.toString());
                    return file;
                }
            }
            return null;
        } else {
            StringBuilder sb = new StringBuilder("msgstore/lastbackupfiletime/media_unavailable ");
            sb.append(externalStorageState);
            Log.i(sb.toString());
            throw new IOException("External media not readable");
        }
    }

    public File A0C() {
        File[] A0I2 = A0I();
        int length = A0I2.length;
        if (length != 0) {
            for (File file : A0I2) {
                if (file.exists()) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/get-latest-db-backup-for-gdrive ");
                    A0S2.append(file.getAbsolutePath());
                    Log.i(A0S2.toString());
                    return file;
                }
            }
            StringBuilder A0S3 = AnonymousClass008.A0S("msgstore/get-latest-db-backup-for-gdrive/no-file-exists ");
            A0S3.append(A0I2[0].getAbsolutePath());
            Log.i(A0S3.toString());
            return A0I2[0];
        }
        throw new IllegalStateException("msgstore/backup/list-of-backup-files-is-null");
    }

    public final File A0D() {
        C014508d r0 = this.A0L;
        r0.A05();
        return r0.A08;
    }

    public File A0E(AnonymousClass1Y3 r5) {
        File file = new File(this.A07.A02, "Databases");
        StringBuilder A0S2 = AnonymousClass008.A0S("msgstore.db");
        StringBuilder A0S3 = AnonymousClass008.A0S(".crypt");
        A0S3.append(r5.version);
        A0S2.append(A0S3.toString());
        return new File(file, A0S2.toString());
    }

    public ArrayList A0F() {
        Log.d("msgstore/getbackupfiles/includeolderfiles");
        File file = this.A0W;
        ArrayList A072 = AnonymousClass0HY.A07(file, A04(AnonymousClass1Y3.A01(), AnonymousClass1Y3.A00()));
        Collections.sort(A072, new AnonymousClass1QF(AnonymousClass0HY.A04(file.getName()), new SimpleDateFormat("yyyy-MM-dd", Locale.US)));
        return A072;
    }

    public final void A0G() {
        if (A0D().exists() && !A0D().delete()) {
            Log.w("msgstore/copybackuptodb/failed to delete db before copying from backup up.");
        }
        File file = this.A0V;
        if (file.exists()) {
            C006803i.A0k(this.A08, file, A0D(), false);
        } else {
            Log.w("msgstore/copybackuptodb/no backup db to copy.");
        }
    }

    public final void A0H(boolean z) {
        if (z) {
            this.A0P.A04(true);
        }
        this.A01.A08(Boolean.FALSE);
        C014508d r0 = this.A0L;
        r0.A05();
        r0.A09.unlock();
    }

    public File[] A0I() {
        AnonymousClass1Y3[] A032 = AnonymousClass1Y3.A03(AnonymousClass1Y3.A01(), AnonymousClass1Y3.A00());
        int length = A032.length;
        File[] fileArr = new File[length];
        for (int i = 0; i < length; i++) {
            fileArr[i] = A0E(A032[(length - i) - 1]);
        }
        TextUtils.join(", ", fileArr);
        return fileArr;
    }
}
