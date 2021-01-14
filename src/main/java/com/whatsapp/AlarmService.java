package com.whatsapp;

import X.AbstractC000400g;
import X.AbstractC02190Az;
import X.AbstractC658131q;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass01K;
import X.AnonymousClass01P;
import X.AnonymousClass01T;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass03R;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass09D;
import X.AnonymousClass09E;
import X.AnonymousClass09H;
import X.AnonymousClass09V;
import X.AnonymousClass0A7;
import X.AnonymousClass0AI;
import X.AnonymousClass0AV;
import X.AnonymousClass0B3;
import X.AnonymousClass0BB;
import X.AnonymousClass0BV;
import X.AnonymousClass0BW;
import X.AnonymousClass0C2;
import X.AnonymousClass0C4;
import X.AnonymousClass0Ci;
import X.AnonymousClass0DH;
import X.AnonymousClass0DL;
import X.AnonymousClass0DX;
import X.AnonymousClass0EX;
import X.AnonymousClass0FL;
import X.AnonymousClass0FM;
import X.AnonymousClass0GW;
import X.AnonymousClass0HI;
import X.AnonymousClass0HO;
import X.AnonymousClass0I6;
import X.AnonymousClass0IB;
import X.AnonymousClass0IW;
import X.AnonymousClass0JM;
import X.AnonymousClass0JZ;
import X.AnonymousClass0Ja;
import X.AnonymousClass0OY;
import X.AnonymousClass0P2;
import X.AnonymousClass0PE;
import X.AnonymousClass2K4;
import X.AnonymousClass2L6;
import X.AnonymousClass2T9;
import X.AnonymousClass347;
import X.AnonymousClass34I;
import X.C000300f;
import X.C000800l;
import X.C001000o;
import X.C001400w;
import X.C002001d;
import X.C002101e;
import X.C002701k;
import X.C006503f;
import X.C014508d;
import X.C014708f;
import X.C017809k;
import X.C01970Ad;
import X.C02040Ak;
import X.C02110Ar;
import X.C02120As;
import X.C02180Ay;
import X.C02420Bx;
import X.C02580Cq;
import X.C02750Dh;
import X.C03120Ew;
import X.C03160Fa;
import X.C03210Ff;
import X.C03510Gn;
import X.C04330Jy;
import X.C04380Kd;
import X.C09270cb;
import X.C26481Lc;
import X.C26631Ls;
import X.C38351pj;
import X.C38651qE;
import X.C39221r9;
import X.C47992Km;
import X.C67893Ax;
import X.C68783En;
import X.C73193Vv;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import com.whatsapp.workers.ntp.NtpSyncWorker;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class AlarmService extends AnonymousClass0PE {
    public static volatile long A1C;
    public final AnonymousClass0C2 A00;
    public final AnonymousClass0AV A01;
    public final C03510Gn A02;
    public final AnonymousClass009 A03 = AnonymousClass009.A00();
    public final C26481Lc A04;
    public final C26631Ls A05;
    public final AnonymousClass088 A06;
    public final AnonymousClass01I A07 = AnonymousClass01I.A00();
    public final C000300f A08;
    public final C04380Kd A09;
    public final AnonymousClass01J A0A;
    public final AnonymousClass0HI A0B;
    public final AnonymousClass0IW A0C;
    public final AnonymousClass0Ja A0D;
    public final C02750Dh A0E;
    public final AnonymousClass0DH A0F;
    public final AnonymousClass0DX A0G;
    public final AnonymousClass0DL A0H;
    public final AnonymousClass01A A0I;
    public final AnonymousClass0AI A0J;
    public final AnonymousClass0IB A0K;
    public final AnonymousClass00C A0L;
    public final AnonymousClass03P A0M;
    public final AnonymousClass00S A0N = AnonymousClass00S.A00();
    public final AnonymousClass00G A0O;
    public final AnonymousClass00D A0P;
    public final AnonymousClass2K4 A0Q;
    public final C001000o A0R;
    public final C001400w A0S;
    public final C04330Jy A0T;
    public final AnonymousClass01K A0U;
    public final AnonymousClass0GW A0V;
    public final C02120As A0W;
    public final AnonymousClass01T A0X;
    public final AnonymousClass0HO A0Y;
    public final C014508d A0Z;
    public final C47992Km A0a;
    public final AnonymousClass0FL A0b;
    public final C02110Ar A0c;
    public final C03120Ew A0d;
    public final AnonymousClass09E A0e;
    public final AnonymousClass01P A0f;
    public final AnonymousClass0BW A0g;
    public final AnonymousClass0P2 A0h;
    public final AnonymousClass0JZ A0i;
    public final C000800l A0j = C000800l.A00();
    public final C002701k A0k = C002701k.A00();
    public final AnonymousClass0FM A0l;
    public final AnonymousClass0Ci A0m;
    public final AnonymousClass0EX A0n;
    public final AnonymousClass2T9 A0o;
    public final AnonymousClass09H A0p;
    public final C03160Fa A0q;
    public final C02040Ak A0r;
    public final C01970Ad A0s;
    public final C68783En A0t;
    public final C03210Ff A0u;
    public final C014708f A0v;
    public final AnonymousClass0BB A0w;
    public final AbstractC658131q A0x;
    public final AnonymousClass347 A0y;
    public final AnonymousClass34I A0z;
    public final AnonymousClass0JM A10;
    public final AnonymousClass09D A11;
    public final AnonymousClass00T A12;
    public final AbstractC02190Az A13;
    public final AbstractC02190Az A14;
    public final AbstractC02190Az A15;
    public final C09270cb A16;
    public final C006503f A17;
    public final AnonymousClass0C4 A18;
    public final C67893Ax A19;
    public final Random A1A = new Random();
    public volatile String A1B;

    public AlarmService() {
        AnonymousClass00G r4 = AnonymousClass00G.A01;
        this.A0O = r4;
        this.A12 = C002101e.A00();
        this.A06 = AnonymousClass088.A00();
        this.A18 = AnonymousClass0C4.A00();
        this.A08 = C000300f.A00();
        this.A0e = AnonymousClass09E.A00();
        this.A0F = AnonymousClass0DH.A00();
        this.A0u = C03210Ff.A00();
        this.A0A = AnonymousClass01J.A00();
        this.A0Q = AnonymousClass2K4.A00();
        this.A0p = AnonymousClass09H.A01();
        this.A0C = AnonymousClass0IW.A00();
        this.A0I = AnonymousClass01A.A00();
        this.A0q = C03160Fa.A00();
        this.A0S = C001400w.A02;
        if (AnonymousClass347.A0C == null) {
            synchronized (AnonymousClass347.class) {
                if (AnonymousClass347.A0C == null) {
                    AnonymousClass347.A0C = new AnonymousClass347(r4, AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass088.A00(), AnonymousClass00Y.A00(), AnonymousClass03R.A00(), C000300f.A00(), AnonymousClass00C.A00(), C014508d.A00(), AnonymousClass2L6.A00(), C014708f.A00(), AnonymousClass0I6.A00());
                }
            }
        }
        this.A0y = AnonymousClass347.A0C;
        this.A0M = AnonymousClass03P.A00();
        this.A0s = C01970Ad.A00();
        this.A0H = AnonymousClass0DL.A00();
        this.A0U = AnonymousClass01K.A00();
        this.A19 = C67893Ax.A00();
        this.A0G = AnonymousClass0DX.A00();
        this.A02 = C03510Gn.A00();
        this.A0w = AnonymousClass0BB.A00();
        this.A0m = AnonymousClass0Ci.A00();
        this.A0L = AnonymousClass00C.A00();
        this.A0R = C001000o.A00();
        this.A0B = AnonymousClass0HI.A00();
        this.A0E = C02750Dh.A00();
        this.A0Y = AnonymousClass0HO.A00();
        this.A0i = AnonymousClass0JZ.A00();
        this.A0d = C03120Ew.A00();
        this.A0l = AnonymousClass0FM.A00();
        this.A0Z = C014508d.A00();
        this.A0D = AnonymousClass0Ja.A00();
        this.A0g = AnonymousClass0BW.A00();
        this.A0c = C02110Ar.A00();
        this.A0f = AnonymousClass01P.A00();
        this.A0P = AnonymousClass00D.A00();
        this.A13 = new C02180Ay(C39221r9.A00, null);
        this.A01 = AnonymousClass0AV.A00();
        this.A04 = C26481Lc.A00();
        if (C26631Ls.A0B == null) {
            synchronized (C26631Ls.class) {
                if (C26631Ls.A0B == null) {
                    C26631Ls.A0B = new C26631Ls(r4, AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass088.A00(), AnonymousClass00Y.A00(), AnonymousClass03R.A00(), C000300f.A00(), AnonymousClass03S.A00(), AnonymousClass00D.A00(), C014708f.A00(), AnonymousClass0C2.A00());
                }
            }
        }
        this.A05 = C26631Ls.A0B;
        this.A0W = C02120As.A00();
        this.A0b = AnonymousClass0FL.A00();
        this.A09 = C04380Kd.A00();
        if (AnonymousClass2T9.A0A == null) {
            synchronized (AnonymousClass2T9.class) {
                if (AnonymousClass2T9.A0A == null) {
                    AnonymousClass2T9.A0A = new AnonymousClass2T9(AnonymousClass009.A00(), C002101e.A00(), AnonymousClass088.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass01K.A00(), AnonymousClass0BV.A00(), C014508d.A00(), AnonymousClass0B3.A00());
                }
            }
        }
        this.A0o = AnonymousClass2T9.A0A;
        this.A0r = C02040Ak.A00();
        this.A16 = C09270cb.A00();
        if (AnonymousClass34I.A06 == null) {
            synchronized (AnonymousClass00S.class) {
                if (AnonymousClass34I.A06 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass00T A003 = C002101e.A00();
                    AnonymousClass088 A004 = AnonymousClass088.A00();
                    C000300f.A00();
                    AnonymousClass34I.A06 = new AnonymousClass34I(A002, A003, A004, C73193Vv.A00(), AnonymousClass01K.A00(), AnonymousClass0BV.A00(), C02580Cq.A01(), C014508d.A00(), AnonymousClass2L6.A00());
                }
            }
        }
        this.A0z = AnonymousClass34I.A06;
        this.A0h = AnonymousClass0P2.A00();
        this.A14 = new C02180Ay(C38351pj.A00, null);
        this.A0V = AnonymousClass0GW.A00();
        this.A0X = AnonymousClass01T.A00();
        this.A0v = C014708f.A00();
        AnonymousClass022.A00();
        this.A00 = AnonymousClass0C2.A00();
        this.A0J = AnonymousClass0AI.A00();
        this.A0x = AbstractC658131q.A00();
        C02420Bx.A00();
        this.A10 = AnonymousClass0JM.A00();
        this.A17 = C006503f.A01();
        this.A0T = C04330Jy.A00();
        this.A0K = AnonymousClass0IB.A00();
        this.A11 = AnonymousClass09D.A00();
        if (C47992Km.A05 == null) {
            synchronized (C47992Km.class) {
                if (C47992Km.A05 == null) {
                    AnonymousClass00S A005 = AnonymousClass00S.A00();
                    C017809k.A00();
                    C47992Km.A05 = new C47992Km(A005, AnonymousClass01K.A00(), AnonymousClass09V.A00(), C014508d.A00(), AnonymousClass0A7.A00());
                }
            }
        }
        this.A0a = C47992Km.A05;
        this.A0t = C68783En.A00();
        this.A0n = AnonymousClass0EX.A00();
        this.A15 = new C02180Ay(C38651qE.A00, null);
    }

    public static void A00(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        } else if (i2 >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(45:280|281|282|283|302|304|(1:307)|308|(1:310)|311|(1:313)|314|(1:316)|317|(1:319)|320|(1:322)|323|(1:325)|326|(1:328)|329|(1:331)|332|(1:334)|335|(1:337)|338|(1:340)|341|(2:342|(3:344|(2:348|1069)|349)(1:1068))|350|(2:352|(1:354))(1:355)|356|(4:358|(1:360)|361|(1:363))|364|(3:366|(1:368)|369)|370|371|372|(1:374)|375|(2:378|(1:380))(1:381)|392|(3:428|b64|433)(1:396)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(46:284|285|300|301|304|(0)|308|(0)|311|(0)|314|(0)|317|(0)|320|(0)|323|(0)|326|(0)|329|(0)|332|(0)|335|(0)|338|(0)|341|(3:342|(0)(0)|349)|350|(0)(0)|356|(0)|364|(0)|370|371|372|(0)|375|(0)(0)|392|(1:394)|428|b64) */
    /* JADX WARNING: Code restructure failed: missing block: B:1001:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1002:0x1f22, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1031:0x1f40, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1032:0x1f41, code lost:
        if (r7 != null) goto L_0x1f43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1033:0x1f43, code lost:
        r4 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1034:0x1f49, code lost:
        if (r4.inTransaction() != false) goto L_0x1f4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1035:0x1f4b, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1147:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1148:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1149:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0634, code lost:
        if (new java.io.File("/dev/com.genymotion.superuser.daemon").exists() == false) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0777, code lost:
        if (r5 == false) goto L_0x0779;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0893, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0894, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x089e, code lost:
        if (r5 == null) goto L_0x08a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0aeb, code lost:
        if (java.lang.System.currentTimeMillis() < r4.A00.getLong("phoneid_last_sync_timestamp", -1)) goto L_0x0aed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x12a5, code lost:
        r5 = new X.C44031zO();
        r5.A0G = java.lang.Long.valueOf(r22);
        r5.A07 = java.lang.Long.valueOf(r4);
        r5.A06 = java.lang.Long.valueOf(r4);
        r5.A00 = java.lang.Boolean.valueOf(r4.A04.ABV());
        r5.A09 = java.lang.Long.valueOf(r4);
        r5.A08 = java.lang.Long.valueOf(r4);
        r5.A01 = java.lang.Boolean.valueOf(r4.A03.ABV());
        r5.A0B = java.lang.Long.valueOf(r4);
        r5.A0A = java.lang.Long.valueOf(r4);
        r5.A02 = java.lang.Boolean.valueOf(r4.A07.ABV());
        r5.A0F = java.lang.Long.valueOf(r4);
        r5.A0E = java.lang.Long.valueOf(r4);
        r5.A04 = java.lang.Boolean.valueOf(r4.A06.ABV());
        r5.A0D = java.lang.Long.valueOf(r4);
        r5.A0C = java.lang.Long.valueOf(r4);
        r5.A03 = java.lang.Boolean.valueOf(r4.A05.ABV());
        r5.A0I = java.lang.Long.valueOf(r4);
        r5.A0H = java.lang.Long.valueOf(r4);
        r5.A05 = java.lang.Boolean.valueOf(r4.A08.ABV());
        r4.A01.A0B(r5, null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x13a6, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x13a7, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:?, code lost:
        com.whatsapp.util.Log.e("mediajobdb/delete All Older than", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x13ad, code lost:
        if (r7 != null) goto L_0x13af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x13b5, code lost:
        if (r7.A00.inTransaction() != false) goto L_0x13be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x13bc, code lost:
        if (r11.inTransaction() != false) goto L_0x13be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x13be, code lost:
        r7.A00.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x1caa, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x1cae, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:947:0x1e5f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:949:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:950:0x1e63, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:976:0x1f07, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:978:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:979:0x1f0b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x1f0e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:985:0x1f0f, code lost:
        if (r10 != null) goto L_0x1f11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:987:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:988:0x1f14, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:998:0x1f1c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:999:0x1f1d, code lost:
        if (r7 != null) goto L_0x1f1f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:282:0x0881 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:300:0x08a0 */
    /* JADX WARNING: Removed duplicated region for block: B:1004:0x1f23  */
    /* JADX WARNING: Removed duplicated region for block: B:1030:0x1f3f  */
    /* JADX WARNING: Removed duplicated region for block: B:1068:0x09bb A[EDGE_INSN: B:1068:0x09bb->B:350:0x09bb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1135:0x1cdd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1145:? A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06c7  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0822 A[LOOP:0: B:266:0x0820->B:267:0x0822, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x087e A[SYNTHETIC, Splitter:B:280:0x087e] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0885 A[SYNTHETIC, Splitter:B:284:0x0885] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x089b A[SYNTHETIC, Splitter:B:296:0x089b] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x08e1  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x08ed  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0905  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0923  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x093b  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x094f  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x095b  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0967  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0973  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x09a8  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x09d8  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x09e8  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x09f3  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0a1c  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0a38 A[Catch:{ Exception -> 0x0a3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0a4a  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0a53  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0a5b A[SYNTHETIC, Splitter:B:385:0x0a5b] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0a60 A[SYNTHETIC, Splitter:B:389:0x0a60] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0b65 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x13d8  */
    /* JADX WARNING: Removed duplicated region for block: B:879:0x1ce9  */
    /* JADX WARNING: Removed duplicated region for block: B:901:0x1d42 A[LOOP:20: B:899:0x1d3c->B:901:0x1d42, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:904:0x1d52  */
    @Override // X.AnonymousClass0PF
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r55) {
        /*
        // Method dump skipped, instructions count: 8057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A05(android.content.Intent):void");
    }

    public final void A06() {
        long nextInt;
        Calendar instance = Calendar.getInstance();
        if (instance.get(11) >= 2) {
            instance.add(5, 1);
        }
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        C000300f r2 = this.A08;
        Random random = this.A1A;
        int A062 = r2.A06(AbstractC000400g.A3g);
        if (A062 <= 0) {
            nextInt = 0;
        } else {
            nextInt = ((long) random.nextInt(A062 << 1)) * 1000;
        }
        long j = nextInt + timeInMillis;
        StringBuilder A0S2 = AnonymousClass008.A0S("AlarmService/setupBackupMessagesAlarm; alarmTimeMillis=");
        A0S2.append(new Date(j));
        Log.i(A0S2.toString());
        Intent intent = new Intent("com.whatsapp.action.BACKUP_MESSAGES", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A022 = this.A0M.A02();
        if (A022 != null) {
            A00(A022, 0, j, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupBackupMessagesAlarm AlarmManager is null");
        }
    }

    public final void A07() {
        AlarmManager A022 = this.A0M.A02();
        if (A022 == null) {
            Log.w("AlarmService/dailyCatchupCron; AlarmManager is null");
            return;
        }
        Intent intent = new Intent("com.whatsapp.action.DAILY_CATCHUP_CRON", null, this, AlarmBroadcastReceiver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 536870912);
        if (A0E()) {
            Log.d("AlarmService/dailyCatchupCron; daily catchup alarm is not needed.");
            if (broadcast != null) {
                A022.cancel(broadcast);
                broadcast.cancel();
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.A0P.A00;
        long j = sharedPreferences.getLong("next_daily_cron_catchup", 0);
        long j2 = j - currentTimeMillis;
        if (broadcast == null || j2 <= 0 || j2 >= 900000) {
            long j3 = currentTimeMillis + 900000;
            A00(A022, 1, j3, PendingIntent.getBroadcast(this, 0, intent, 0));
            sharedPreferences.edit().putLong("next_daily_cron_catchup", j3).apply();
            StringBuilder sb = new StringBuilder("AlarmService/dailyCatchupCron; scheduled for ");
            sb.append(AnonymousClass0OY.A02(j3));
            sb.append(" (last run at: ");
            sb.append(AnonymousClass0OY.A02(sharedPreferences.getLong("last_daily_cron", 0)));
            AnonymousClass008.A1S(sb, ")");
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("AlarmService/dailyCatchupCron; already scheduled: ");
        A0S2.append(AnonymousClass0OY.A02(j));
        Log.d(A0S2.toString());
    }

    public final void A08() {
        long nextInt;
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        C000300f r2 = this.A08;
        Random random = this.A1A;
        int A062 = r2.A06(AbstractC000400g.A3g);
        if (A062 <= 0) {
            nextInt = 0;
        } else {
            nextInt = ((long) random.nextInt(A062 << 1)) * 1000;
        }
        long j = nextInt + timeInMillis;
        StringBuilder A0S2 = AnonymousClass008.A0S("AlarmService/setupDailyCronAlarm; alarmTimeMillis=");
        A0S2.append(new Date(j));
        Log.i(A0S2.toString());
        Intent intent = new Intent("com.whatsapp.action.DAILY_CRON", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A022 = this.A0M.A02();
        if (A022 != null) {
            A00(A022, 0, j, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupDailyCronAlarm AlarmManager is null");
        }
    }

    public final void A09() {
        long A052 = this.A0N.A05();
        int A062 = this.A08.A06(AbstractC000400g.A3B);
        SharedPreferences sharedPreferences = this.A0P.A00;
        if (!sharedPreferences.contains("last_heartbeat_login")) {
            long nextInt = A052 - (((long) this.A1A.nextInt(A062)) * 1000);
            sharedPreferences.edit().putLong("last_heartbeat_login", nextInt).apply();
            StringBuilder sb = new StringBuilder("no last heartbeat known; setting to ");
            sb.append(AnonymousClass0OY.A02(nextInt));
            Log.i(sb.toString());
        }
        long j = sharedPreferences.getLong("last_heartbeat_login", 0);
        if (j > A052 || ((long) (A062 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)) + j < A052) {
            StringBuilder A0V2 = AnonymousClass008.A0V("AlarmService/setupHeartbeatAlarm/last heart beat login=", j, " server time=");
            A0V2.append(A052);
            A0V2.append(" client time=");
            A0V2.append(System.currentTimeMillis());
            A0V2.append(" interval=");
            A0V2.append(A062);
            Log.i(A0V2.toString());
            A0B(null);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() + (((((long) A062) * 1000) + j) - A052);
        StringBuilder A0S2 = AnonymousClass008.A0S("AlarmService/setupHeartbeatAlarm; elapsedRealTimeHeartbeatLogin=");
        A0S2.append(AnonymousClass0OY.A02(elapsedRealtime));
        Log.i(A0S2.toString());
        Intent intent = new Intent("com.whatsapp.action.HEARTBEAT_WAKEUP", null, this, AlarmBroadcastReceiver.class);
        AlarmManager A022 = this.A0M.A02();
        if (A022 != null) {
            A00(A022, 2, elapsedRealtime, PendingIntent.getBroadcast(this, 0, intent, 134217728));
        } else {
            Log.w("AlarmService/setupHeartbeatAlarm AlarmManager is null");
        }
    }

    public final void A0A() {
        long A052 = this.A0N.A05();
        AnonymousClass00D r8 = this.A0P;
        SharedPreferences sharedPreferences = r8.A00;
        if (!sharedPreferences.contains("dithered_last_signed_prekey_rotation")) {
            long nextInt = A052 - (((long) this.A1A.nextInt(2592000)) * 1000);
            StringBuilder A0S2 = AnonymousClass008.A0S("no signed prekey rotation schedule established; setting last rotation time to ");
            A0S2.append(AnonymousClass0OY.A02(nextInt));
            Log.i(A0S2.toString());
            AnonymousClass008.A0l(r8, "dithered_last_signed_prekey_rotation", nextInt);
        }
        long j = sharedPreferences.getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A052) {
            long j2 = 2592000000L + j;
            if (j2 >= A052) {
                if (!sharedPreferences.getBoolean("bad_signed_pre_key_check_done", false)) {
                    Log.i("AlarmService/checking bad signed pre key");
                    C001400w r4 = this.A0S;
                    r4.A00.submit(new RunnableEBaseShape0S0100000_I0_0(this, 35));
                }
                long j3 = j2 - A052;
                StringBuilder A0S3 = AnonymousClass008.A0S("scheduling alarm to trigger signed prekey rotation; now=");
                A0S3.append(AnonymousClass0OY.A02(A052));
                A0S3.append("; lastSignedPrekeyRotation=");
                A0S3.append(AnonymousClass0OY.A02(j));
                A0S3.append("; deltaToAlarm=");
                A0S3.append(j3);
                Log.i(A0S3.toString());
                long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.whatsapp.action.ROTATE_SIGNED_PREKEY", null, this, AlarmBroadcastReceiver.class), 134217728);
                AlarmManager A022 = this.A0M.A02();
                if (A022 != null) {
                    A00(A022, 2, elapsedRealtime, broadcast);
                    return;
                } else {
                    Log.w("AlarmService/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
            }
        }
        StringBuilder A0S4 = AnonymousClass008.A0S("scheduling immediate signed prekey rotation; now=");
        A0S4.append(AnonymousClass0OY.A02(A052));
        A0S4.append("; lastSignedPrekeyRotation=");
        A0S4.append(AnonymousClass0OY.A02(j));
        Log.i(A0S4.toString());
        this.A12.ANF(new RunnableEBaseShape0S0100000_I0_0(this, 37));
    }

    public final void A0B(Intent intent) {
        StringBuilder sb = new StringBuilder("AlarmService/heartbeatWakeup; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        long A052 = this.A0N.A05();
        this.A0q.A0E(false, true, true, true, 0);
        AnonymousClass008.A10("AlarmService/heartbeatWakeup/setting last heart beat login time: ", A052);
        this.A0P.A00.edit().putLong("last_heartbeat_login", A052).apply();
        A09();
    }

    public final void A0C(Intent intent) {
        PowerManager.WakeLock wakeLock;
        StringBuilder sb = new StringBuilder("AlarmService/rotateSignedPrekeyAndSenderKeys; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0C2 = this.A0M.A0C();
        if (A0C2 == null) {
            Log.w("AlarmService/rotateSignedPrekeyAndSenderKeys pm=null");
            wakeLock = null;
        } else {
            wakeLock = C002001d.A0f(A0C2, 1, "AlarmService#rotateSignedPrekeyAndSenderKeys");
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            C001400w r2 = this.A0S;
            r2.A00.submit(new RunnableEBaseShape0S0100000_I0_0(this, 36)).get();
            A0A();
            if (wakeLock != null) {
                wakeLock.release();
            }
        } catch (InterruptedException e) {
            AssertionError assertionError = new AssertionError("interrupted during rotate keys alarm");
            assertionError.initCause(e);
            throw assertionError;
        } catch (ExecutionException e2) {
            AssertionError assertionError2 = new AssertionError("exception during rotate keys alarm");
            assertionError2.initCause(e2);
            throw assertionError2;
        } catch (Throwable th) {
            if (wakeLock != null) {
                wakeLock.release();
            }
            throw th;
        }
    }

    public final void A0D(Intent intent) {
        PowerManager.WakeLock wakeLock;
        StringBuilder sb = new StringBuilder("AlarmService#updateNtp; intent=");
        sb.append(intent);
        Log.i(sb.toString());
        PowerManager A0C2 = this.A0M.A0C();
        if (A0C2 == null) {
            Log.w("AlarmService/updateNtp pm=null");
            wakeLock = null;
        } else {
            wakeLock = C002001d.A0f(A0C2, 1, "AlarmService#updateNtp");
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            NtpSyncWorker.A00(this.A19, this.A0O.A00, this.A0j, this.A0N);
        } finally {
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    public final boolean A0E() {
        long j = this.A0P.A00.getLong("last_daily_cron", 0);
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        long j2 = 86400000 + timeInMillis;
        if (j >= timeInMillis && j < j2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 21600000) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0PF
    public void onCreate() {
        Log.d("AlarmService/onCreate");
        super.onCreate();
    }

    @Override // X.AnonymousClass0PF
    public void onDestroy() {
        Log.d("AlarmService/onDestroy");
        super.onDestroy();
    }
}
