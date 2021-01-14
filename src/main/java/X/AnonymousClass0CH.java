package X;

import android.os.ConditionVariable;
import com.whatsapp.Mp4Ops;
import com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0CH  reason: invalid class name */
public class AnonymousClass0CH {
    public static volatile AnonymousClass0CH A0n;
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final AnonymousClass0CM A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass088 A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass0AH A05;
    public final Mp4Ops A06;
    public final AnonymousClass0B3 A07;
    public final C000300f A08;
    public final AnonymousClass0CL A09;
    public final AnonymousClass01J A0A;
    public final AnonymousClass00C A0B;
    public final AnonymousClass00S A0C;
    public final AnonymousClass00G A0D;
    public final AnonymousClass01K A0E;
    public final AnonymousClass0BV A0F;
    public final AnonymousClass0AC A0G;
    public final AnonymousClass0DF A0H;
    public final C002701k A0I;
    public final AnonymousClass0CW A0J;
    public final AnonymousClass0CP A0K;
    public final AnonymousClass0CK A0L;
    public final C02460Cc A0M;
    public final AnonymousClass0FM A0N;
    public final AnonymousClass0Ci A0O;
    public final AnonymousClass0EN A0P;
    public final C02560Co A0Q;
    public final AnonymousClass0FQ A0R = new AnonymousClass0FQ(this);
    public final AnonymousClass0FP A0S;
    public final C02240Be A0T;
    public final C02550Cn A0U;
    public final AnonymousClass0AR A0V;
    public final AnonymousClass022 A0W;
    public final AnonymousClass0D7 A0X;
    public final AnonymousClass0AK A0Y;
    public final AnonymousClass0CT A0Z;
    public final AnonymousClass0BB A0a;
    public final C02570Cp A0b;
    public final WebpUtils A0c;
    public final C02220Bc A0d;
    public final C02580Cq A0e;
    public final AnonymousClass0FO A0f;
    public final AnonymousClass00T A0g;
    public final AnonymousClass0CN A0h;
    public final HashMap A0i = new HashMap();
    public final HashMap A0j = new HashMap();
    public final Set A0k = new HashSet();
    public final Executor A0l;
    public final Executor A0m;

    public AnonymousClass0CH(AnonymousClass00G r3, AnonymousClass00S r4, Mp4Ops mp4Ops, C002701k r6, AnonymousClass02M r7, AnonymousClass009 r8, AnonymousClass00T r9, WebpUtils webpUtils, AnonymousClass088 r11, AnonymousClass0CK r12, AnonymousClass0CL r13, AnonymousClass0CM r14, AnonymousClass0AR r15, C000300f r16, AnonymousClass0CN r17, AnonymousClass0CP r18, AnonymousClass01J r19, AnonymousClass0CT r20, C02220Bc r21, AnonymousClass0AH r22, C02550Cn r23, C02560Co r24, C02570Cp r25, C02460Cc r26, C02240Be r27, AnonymousClass01K r28, AnonymousClass0AC r29, AnonymousClass0BB r30, AnonymousClass0Ci r31, AnonymousClass0BV r32, AnonymousClass00C r33, C02580Cq r34, AnonymousClass0DF r35, AnonymousClass0EN r36, AnonymousClass0FM r37, AnonymousClass0FO r38, AnonymousClass0CW r39, AnonymousClass022 r40, AnonymousClass0FP r41, AnonymousClass0AK r42, AnonymousClass0B3 r43, AnonymousClass0D7 r44) {
        this.A0C = r4;
        this.A06 = mp4Ops;
        this.A0I = r6;
        this.A04 = r7;
        this.A02 = r8;
        this.A0c = webpUtils;
        this.A0D = r3;
        this.A0g = r9;
        this.A03 = r11;
        this.A0L = r12;
        this.A09 = r13;
        this.A01 = r14;
        this.A0V = r15;
        this.A08 = r16;
        this.A0h = r17;
        this.A0K = r18;
        this.A0A = r19;
        this.A0Z = r20;
        this.A0d = r21;
        this.A05 = r22;
        this.A0U = r23;
        this.A0Q = r24;
        this.A0b = r25;
        this.A0M = r26;
        this.A0T = r27;
        this.A0E = r28;
        this.A0G = r29;
        this.A0a = r30;
        this.A0O = r31;
        this.A0F = r32;
        this.A0B = r33;
        this.A0e = r34;
        this.A0H = r35;
        this.A0P = r36;
        this.A0N = r37;
        this.A0f = r38;
        this.A0J = r39;
        this.A0W = r40;
        this.A0S = r41;
        this.A0Y = r42;
        this.A07 = r43;
        this.A0X = r44;
        this.A0l = new ExecutorC03090Et(r7);
        this.A0m = new AnonymousClass0FR(r9);
    }

    public static AnonymousClass0CH A00() {
        if (A0n == null) {
            synchronized (AnonymousClass0CH.class) {
                if (A0n == null) {
                    AnonymousClass00G r6 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    Mp4Ops A003 = Mp4Ops.A00();
                    C002701k A004 = C002701k.A00();
                    AnonymousClass02M A005 = AnonymousClass02M.A00();
                    AnonymousClass009 A006 = AnonymousClass009.A00();
                    AnonymousClass00T A007 = C002101e.A00();
                    WebpUtils A008 = WebpUtils.A00();
                    AnonymousClass088 A009 = AnonymousClass088.A00();
                    AnonymousClass0CK A0010 = AnonymousClass0CK.A00();
                    AnonymousClass0CL A0011 = AnonymousClass0CL.A00();
                    AnonymousClass0CM A0012 = AnonymousClass0CM.A00();
                    AnonymousClass0AR A0013 = AnonymousClass0AR.A00();
                    C000300f A0014 = C000300f.A00();
                    AnonymousClass0CN A0015 = AnonymousClass0CN.A00();
                    AnonymousClass0CP A0016 = AnonymousClass0CP.A00();
                    AnonymousClass01J A0017 = AnonymousClass01J.A00();
                    AnonymousClass0CT A0018 = AnonymousClass0CT.A00();
                    C02220Bc A0019 = C02220Bc.A00();
                    AnonymousClass0AH A032 = AnonymousClass0AH.A03();
                    C02550Cn A012 = C02550Cn.A01();
                    C02560Co r27 = C02560Co.A01;
                    C02570Cp A013 = C02570Cp.A01();
                    C02460Cc A014 = C02460Cc.A01();
                    C02240Be A0020 = C02240Be.A00();
                    AnonymousClass01K A0021 = AnonymousClass01K.A00();
                    AnonymousClass0AC r32 = AnonymousClass0AC.A00;
                    AnonymousClass0BB A0022 = AnonymousClass0BB.A00();
                    AnonymousClass0Ci A0023 = AnonymousClass0Ci.A00();
                    AnonymousClass0BV A0024 = AnonymousClass0BV.A00();
                    AnonymousClass00C A0025 = AnonymousClass00C.A00();
                    C02580Cq A015 = C02580Cq.A01();
                    AnonymousClass0DF A0026 = AnonymousClass0DF.A00();
                    AnonymousClass0EN A0027 = AnonymousClass0EN.A00();
                    AnonymousClass0FM A0028 = AnonymousClass0FM.A00();
                    AnonymousClass0FO A016 = AnonymousClass0FO.A01();
                    AnonymousClass0CW A0029 = AnonymousClass0CW.A00();
                    AnonymousClass022 A0030 = AnonymousClass022.A00();
                    if (AnonymousClass0FP.A01 == null) {
                        synchronized (AnonymousClass0FP.class) {
                            if (AnonymousClass0FP.A01 == null) {
                                AnonymousClass0FP.A01 = new AnonymousClass0FP(C002701k.A00(), C002101e.A00());
                            }
                        }
                    }
                    A0n = new AnonymousClass0CH(r6, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A032, A012, r27, A013, A014, A0020, A0021, r32, A0022, A0023, A0024, A0025, A015, A0026, A0027, A0028, A016, A0029, A0030, AnonymousClass0FP.A01, AnonymousClass0AK.A00(), AnonymousClass0B3.A00(), AnonymousClass0D7.A00());
                }
            }
        }
        return A0n;
    }

    public static final void A01(boolean z, C49982Sy r6, AnonymousClass0M3 r7, AnonymousClass1WA r8) {
        Boolean bool;
        boolean z2;
        String str;
        byte[] bArr;
        Integer num;
        Integer num2;
        Long l;
        String str2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l2;
        Long l3;
        Integer num6;
        Integer num7;
        Integer num8;
        String str3;
        Long l4;
        Integer num9;
        Integer num10;
        byte[] bArr2;
        String str4;
        Boolean bool2;
        synchronized (r7) {
            AnonymousClass0M4 r1 = r7.A02;
            if (r1 != null) {
                AnonymousClass1W8 A012 = r6.A01();
                if (A012 != null) {
                    r1.A0a = false;
                    r1.A0Z = false;
                    r1.A0Y = false;
                    r1.A0X = false;
                    r1.A0W = z;
                    synchronized (r6) {
                        bool = r6.A04;
                    }
                    if (bool != null) {
                        synchronized (r6) {
                            bool2 = r6.A04;
                        }
                        r1.A0L = bool2.booleanValue();
                    }
                    if (r6.A04() != null) {
                        r1.A0P = r6.A04().booleanValue();
                    }
                    synchronized (r6) {
                        z2 = r6.A0I;
                    }
                    if (z2) {
                        if (r7.A0u() != null) {
                            r7.A0u().A01();
                        }
                        r1.A0K = null;
                        r1.A0J = null;
                    }
                    r1.A07 = r6.A00();
                    synchronized (r6) {
                        str = r6.A0F;
                    }
                    if (str != null) {
                        synchronized (r6) {
                            str4 = r6.A0F;
                        }
                        r1.A0I = str4;
                    }
                    synchronized (r6) {
                        bArr = r6.A0K;
                    }
                    if (bArr != null) {
                        AnonymousClass0ZE r2 = (AnonymousClass0ZE) r7;
                        synchronized (r6) {
                            bArr2 = r6.A0K;
                        }
                        r2.A01 = C29251Xr.A00(bArr2);
                    }
                    synchronized (r6) {
                        num = r6.A09;
                    }
                    if (num != null) {
                        synchronized (r6) {
                            num10 = r6.A09;
                        }
                        r1.A02 = num10.intValue();
                    }
                    synchronized (r6) {
                        num2 = r6.A0A;
                    }
                    if (num2 != null) {
                        synchronized (r6) {
                            num9 = r6.A0A;
                        }
                        r1.A03 = num9.intValue();
                    }
                    synchronized (r6) {
                        l = r6.A0D;
                    }
                    if (l != null) {
                        synchronized (r6) {
                            l4 = r6.A0D;
                        }
                        r1.A09 = l4.longValue();
                    }
                    synchronized (r6) {
                        str2 = r6.A0G;
                    }
                    if (str2 != null) {
                        synchronized (r6) {
                            str3 = r6.A0G;
                        }
                        r1.A0G = str3;
                    }
                    synchronized (r6) {
                        num3 = r6.A07;
                    }
                    if (num3 != null) {
                        synchronized (r6) {
                            num8 = r6.A07;
                        }
                        r1.A01 = num8.intValue();
                    }
                    if (!z || A012.A02()) {
                        synchronized (r6) {
                            num4 = r6.A0C;
                        }
                        if (num4 != null) {
                            synchronized (r6) {
                                num7 = r6.A0C;
                            }
                            r1.A08 = num7.intValue();
                        }
                        synchronized (r6) {
                            num5 = r6.A0B;
                        }
                        if (num5 != null) {
                            synchronized (r6) {
                                num6 = r6.A0B;
                            }
                            r1.A06 = num6.intValue();
                        }
                        synchronized (r6) {
                            l2 = r6.A0E;
                        }
                        if (l2 != null) {
                            synchronized (r6) {
                                l3 = r6.A0E;
                            }
                            r1.A0A = l3.longValue();
                        }
                        if (!(r7.A0B() == null || r6.A0B() == null)) {
                            r7.A0B().A03(r6.A0B());
                        }
                    }
                    StringBuilder sb = new StringBuilder("MediaDownloadManager/applyDownloadDataInMainThread/");
                    sb.append("mediaHash=");
                    sb.append(r8.A0C);
                    sb.append("transferred=");
                    sb.append(r1.A0P);
                    sb.append(",transferring=");
                    sb.append(r1.A0a);
                    sb.append(",prefetching=");
                    sb.append(r1.A0Y);
                    sb.append(",autodownloadRetryEnabled=");
                    sb.append(r1.A0L);
                    sb.append(",streamViewable=");
                    sb.append(r1.A0Z);
                    sb.append(",fileReadError=");
                    sb.append(r1.A0X);
                    sb.append(",dedupeDownload=");
                    sb.append(r1.A0W);
                    sb.append(",suspiciousContent=");
                    sb.append(r1.A07);
                    Log.d(sb.toString());
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public C60602pn A02(AnonymousClass0M3 r4) {
        AnonymousClass1W9 r1;
        HashMap hashMap = this.A0j;
        synchronized (hashMap) {
            r1 = (AnonymousClass1W9) hashMap.get(r4.A06);
        }
        if (r1 instanceof C60602pn) {
            return (C60602pn) r1;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e3, code lost:
        if (r92.A0p == -1) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017e, code lost:
        if (r1 == 2) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0184, code lost:
        if (r2 == 2) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0187, code lost:
        if (r9 == false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0189, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019e, code lost:
        if (r16 == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d4, code lost:
        if (r92.A0B().A05() == false) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C60602pn A03(X.AnonymousClass0M3 r92, int r93, X.AnonymousClass1W7 r94, long r95, boolean r97, boolean r98) {
        /*
        // Method dump skipped, instructions count: 911
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CH.A03(X.0M3, int, X.1W7, long, boolean, boolean):X.2pn");
    }

    public Collection A04() {
        ArrayList arrayList;
        AnonymousClass0FQ r2 = this.A0R;
        synchronized (r2) {
            arrayList = new ArrayList(r2.values());
        }
        return arrayList;
    }

    public void A05(AnonymousClass0M3 r13) {
        C60602pn A002;
        StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownloadManager/unmarkAsUrgent/download message.key=");
        A0S2.append(r13.A0n);
        A0S2.append(", message.mediaHash=");
        AnonymousClass008.A1S(A0S2, r13.A06);
        if (r13.A02 != null) {
            C60602pn A003 = this.A0Q.A00(r13.A02);
            if (A003 != null) {
                A003.A0q = false;
                synchronized (this.A0i) {
                    for (Map.Entry entry : this.A0i.entrySet()) {
                        A07((AnonymousClass0M3) entry.getKey(), 1, null, ((Long) entry.getValue()).longValue(), true);
                    }
                    this.A0i.clear();
                }
                synchronized (this.A0R) {
                    Iterator it = ((ArrayList) A04()).iterator();
                    while (it.hasNext()) {
                        AnonymousClass0M3 r2 = (AnonymousClass0M3) it.next();
                        if (!(r2.A02 == null || (A002 = this.A0Q.A00(r2.A02)) == null || !A002.A0q)) {
                            Log.d("MediaDownloadManager/unmarkAsUrgent/exists urgent download");
                            return;
                        }
                    }
                    Log.d("MediaDownloadManager/unmarkAsUrgent/unblocking");
                    this.A00.open();
                    return;
                }
            }
            return;
        }
        throw null;
    }

    public void A06(AnonymousClass0M3 r12, int i, AnonymousClass1W7 r14) {
        C60602pn A032 = A03(r12, i, r14, -1, true, false);
        if (A032 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownloadManager/start manual download ");
            A0S2.append(r12.A0n);
            A0S2.append(", message.mediaHash=");
            AnonymousClass008.A1U(A0S2, r12.A06);
            this.A0g.ANF(A032);
        }
    }

    public void A07(AnonymousClass0M3 r12, int i, AnonymousClass1W7 r14, long j, boolean z) {
        C60602pn A032 = A03(r12, i, r14, j, z, true);
        if (r12.A0m == 0 || A032 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownloadManager/queueDownload auto download ");
            A0S2.append(r12.A0n);
            A0S2.append(", message.mediaHash=");
            AnonymousClass008.A1U(A0S2, r12.A06);
            this.A0S.A07(r12, A032);
        }
    }

    public final void A08(AnonymousClass0M3 r4, boolean z, boolean z2) {
        AnonymousClass1W9 r2;
        HashMap hashMap = this.A0j;
        synchronized (hashMap) {
            r2 = (AnonymousClass1W9) hashMap.get(r4.A06);
        }
        if (r2 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("MediaDownloadManager/cancelDownload/message.key=");
            A0S2.append(r4.A0n);
            A0S2.append(", message.mediaHash=");
            A0S2.append(r4.A06);
            Log.i(A0S2.toString());
            r2.A2Z(z2);
        }
        this.A0S.A06(r4);
        if (z) {
            Set set = this.A0k;
            synchronized (set) {
                set.add(r4.A0n);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r22.A01 != r20.A00) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r20.A01().A02 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(boolean r19, X.C49982Sy r20, X.AnonymousClass0M3 r21, X.AnonymousClass1WA r22) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CH.A09(boolean, X.2Sy, X.0M3, X.1WA):void");
    }

    public final void A0A(boolean z, AnonymousClass0M3 r6, int i) {
        if (z) {
            if (AnonymousClass0FI.A0g(r6)) {
                AnonymousClass01J r0 = this.A0A;
                r0.A00.A01(new ProcessVCardMessageJob(r6.A0p));
                this.A0G.A06(r6, 20);
            }
            AnonymousClass01K r2 = this.A0E;
            int i2 = 3;
            if (i == 13) {
                i2 = -1;
            }
            r2.A0Q(r6, i2);
        }
    }

    public boolean A0B(AnonymousClass0M3 r5, AnonymousClass1WA r6, AnonymousClass1W7 r7, boolean z, String str, AnonymousClass1W9 r10) {
        C60602pn A022;
        HashMap hashMap = this.A0j;
        synchronized (hashMap) {
            if (((AnonymousClass1W9) hashMap.get(str)) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaDownloadManager/addAndDedupeDownload/No existing MMS download in progress, creating new download instance for mediaHash=");
                sb.append(str);
                Log.i(sb.toString());
                hashMap.put(str, r10);
                r10.A1j(new C56822jF(this, str));
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaDownloadManager/addAndDedupeDownload/MMS download already in progress (according to current downloads) mediaHash=");
            sb2.append(str);
            Log.i(sb2.toString());
            if (!(r5 == null || r6 == null || (A022 = A02(r5)) == null)) {
                A022.A0G.A03(new C56682j1(this, r5, r6, r7, z), this.A0m);
            }
            return true;
        }
    }
}
