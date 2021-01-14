package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.0EJ  reason: invalid class name */
public class AnonymousClass0EJ {
    public static volatile AnonymousClass0EJ A0L;
    public final AnonymousClass009 A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass0B3 A02;
    public final C000300f A03;
    public final AnonymousClass00C A04;
    public final AnonymousClass04j A05;
    public final C002701k A06;
    public final AnonymousClass00Y A07;
    public final AnonymousClass0CP A08;
    public final AnonymousClass0Ci A09;
    public final AnonymousClass0EN A0A;
    public final C02950Ed A0B;
    public final C02240Be A0C;
    public final AnonymousClass0EK A0D;
    public final C02550Cn A0E;
    public final AnonymousClass0EL A0F;
    public final C02570Cp A0G;
    public final WebpUtils A0H;
    public final C02220Bc A0I;
    public final AnonymousClass00T A0J;
    public final Executor A0K;

    public AnonymousClass0EJ(C002701k r2, AnonymousClass02M r3, AnonymousClass009 r4, AnonymousClass00T r5, WebpUtils webpUtils, AnonymousClass00Y r7, C000300f r8, AnonymousClass0EK r9, AnonymousClass0CP r10, C02220Bc r11, C02550Cn r12, C02570Cp r13, C02240Be r14, AnonymousClass0EL r15, AnonymousClass0Ci r16, AnonymousClass00C r17, AnonymousClass0EN r18, C02950Ed r19, AnonymousClass04j r20, AnonymousClass0B3 r21) {
        this.A06 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A0J = r5;
        this.A0H = webpUtils;
        this.A07 = r7;
        this.A03 = r8;
        this.A0D = r9;
        this.A08 = r10;
        this.A0I = r11;
        this.A0E = r12;
        this.A0G = r13;
        this.A0C = r14;
        this.A0F = r15;
        this.A09 = r16;
        this.A04 = r17;
        this.A0A = r18;
        this.A0B = r19;
        this.A05 = r20;
        this.A02 = r21;
        this.A0K = new ExecutorC03090Et(r3);
    }

    public static AnonymousClass2KO A00(AnonymousClass2TE r1) {
        AnonymousClass2TF r0 = r1.A00;
        AnonymousClass1XO r12 = r0.A05;
        return r0.A0A ? new C52482bC(r12) : new C52492bD(r12);
    }

    public static AnonymousClass0EJ A01() {
        C03000Ek r56;
        if (A0L == null) {
            synchronized (AnonymousClass0EJ.class) {
                if (A0L == null) {
                    C002701k A002 = C002701k.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass009 A004 = AnonymousClass009.A00();
                    AnonymousClass00T A005 = C002101e.A00();
                    WebpUtils A006 = WebpUtils.A00();
                    AnonymousClass00Y A007 = AnonymousClass00Y.A00();
                    C000300f A008 = C000300f.A00();
                    AnonymousClass0EK A009 = AnonymousClass0EK.A00();
                    AnonymousClass0CP A0010 = AnonymousClass0CP.A00();
                    C02220Bc A0011 = C02220Bc.A00();
                    C02550Cn A012 = C02550Cn.A01();
                    C02570Cp A013 = C02570Cp.A01();
                    C02240Be A0012 = C02240Be.A00();
                    AnonymousClass0EL A0013 = AnonymousClass0EL.A00();
                    AnonymousClass0Ci A0014 = AnonymousClass0Ci.A00();
                    AnonymousClass00C A0015 = AnonymousClass00C.A00();
                    AnonymousClass0EN A0016 = AnonymousClass0EN.A00();
                    if (C02950Ed.A06 == null) {
                        synchronized (C02950Ed.class) {
                            if (C02950Ed.A06 == null) {
                                AnonymousClass00G r11 = AnonymousClass00G.A01;
                                AnonymousClass00Y A0017 = AnonymousClass00Y.A00();
                                C02220Bc A0018 = C02220Bc.A00();
                                if (AnonymousClass0Ee.A01 == null) {
                                    synchronized (AnonymousClass0Ee.class) {
                                        if (AnonymousClass0Ee.A01 == null) {
                                            C002701k.A00();
                                            AnonymousClass0Ee.A01 = new AnonymousClass0Ee(AnonymousClass0Eg.A00(), C002101e.A00());
                                        }
                                    }
                                }
                                AnonymousClass0Ee r55 = AnonymousClass0Ee.A01;
                                synchronized (C03000Ek.class) {
                                    if (C03000Ek.A04 == null) {
                                        AnonymousClass00T A0019 = C002101e.A00();
                                        if (C03010El.A0O == null) {
                                            synchronized (C03010El.class) {
                                                if (C03010El.A0O == null) {
                                                    Mp4Ops A0020 = Mp4Ops.A00();
                                                    C002701k A0021 = C002701k.A00();
                                                    AnonymousClass009 A0022 = AnonymousClass009.A00();
                                                    WebpUtils A0023 = WebpUtils.A00();
                                                    AnonymousClass088 A0024 = AnonymousClass088.A00();
                                                    AnonymousClass00Y A0025 = AnonymousClass00Y.A00();
                                                    C000300f A0026 = C000300f.A00();
                                                    C02220Bc A0027 = C02220Bc.A00();
                                                    AnonymousClass03P A0028 = AnonymousClass03P.A00();
                                                    C02550Cn A014 = C02550Cn.A01();
                                                    C02570Cp A015 = C02570Cp.A01();
                                                    C02240Be A0029 = C02240Be.A00();
                                                    C03020Em A0030 = C03020Em.A00();
                                                    AnonymousClass0BV A0031 = AnonymousClass0BV.A00();
                                                    AnonymousClass00C A0032 = AnonymousClass00C.A00();
                                                    C02510Ch A082 = C02510Ch.A08();
                                                    AnonymousClass00D A0033 = AnonymousClass00D.A00();
                                                    C007703s A0034 = C007703s.A00();
                                                    if (C03030En.A04 == null) {
                                                        synchronized (C03030En.class) {
                                                            if (C03030En.A04 == null) {
                                                                C03030En.A04 = new C03030En(r11, C002701k.A00(), AnonymousClass009.A00(), C000300f.A00());
                                                            }
                                                        }
                                                    }
                                                    C03010El.A0O = new C03010El(r11, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A014, A015, A0029, A0030, A0031, A0032, A082, A0033, A0034, C03030En.A04, AnonymousClass0AK.A00(), AnonymousClass0B3.A00(), AnonymousClass0D7.A00());
                                                }
                                            }
                                        }
                                        C03000Ek.A04 = new C03000Ek(A0019, C03010El.A0O);
                                    }
                                    r56 = C03000Ek.A04;
                                }
                                if (C03080Es.A05 == null) {
                                    synchronized (C03080Es.class) {
                                        if (C03080Es.A05 == null) {
                                            C002701k.A00();
                                            C03080Es.A05 = new C03080Es(C002101e.A00(), AnonymousClass088.A00(), C02590Cr.A00(), C000300f.A00(), AnonymousClass01X.A00(), AnonymousClass0D1.A00());
                                        }
                                    }
                                }
                                C02950Ed.A06 = new C02950Ed(r11, A0017, A0018, r55, r56, C03080Es.A05);
                            }
                        }
                    }
                    A0L = new AnonymousClass0EJ(A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A012, A013, A0012, A0013, A0014, A0015, A0016, C02950Ed.A06, AnonymousClass04j.A00(), AnonymousClass0B3.A00());
                }
            }
        }
        return A0L;
    }

    public static String A02(File file) {
        if (file == null) {
            return "null";
        }
        StringBuilder A0S = AnonymousClass008.A0S("size=");
        A0S.append(file.length());
        A0S.append(" exists=");
        A0S.append(file.exists());
        return A0S.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x026f A[SYNTHETIC, Splitter:B:144:0x026f] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C444320c A03(X.AnonymousClass1W6 r18, X.AnonymousClass2T3 r19, X.C50152Tp r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 960
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EJ.A03(X.1W6, X.2T3, X.2Tp, int, int):X.20c");
    }

    public C444320c A04(C56862jJ r7, int i, int i2) {
        AnonymousClass1W6 r1 = r7.A0I;
        if (r1 != null) {
            return A03(r1, r7.A00(), (C50152Tp) r7.A0G.A00(), i, i2);
        }
        throw null;
    }

    public C56862jJ A05(AnonymousClass2TE r7, boolean z) {
        AnonymousClass2KO A002 = A00(r7);
        AnonymousClass0CP r4 = this.A08;
        AnonymousClass0Ci r2 = r4.A0J;
        AnonymousClass1W6 A022 = r2.A02(0, UUID.randomUUID().toString());
        C56862jJ r22 = new C56862jJ(A022, r7, new AnonymousClass2T3(r4.A0Q, r2, A022, z), A002);
        AnonymousClass1W6 r0 = r22.A0I;
        if (r0 != null) {
            r22.A08.A04(r0.A09);
            r22.A00().A01();
            return r22;
        }
        throw null;
    }

    public C56862jJ A06(AnonymousClass2TE r6, boolean z) {
        AnonymousClass0Ci r2;
        AnonymousClass1W6 A032;
        AnonymousClass0CP r4 = this.A08;
        String str = r6.A03;
        if (str == null || (A032 = (r2 = r4.A0J).A03(str, 0)) == null) {
            return A05(r6, z);
        }
        C56862jJ r22 = new C56862jJ(A032, r6, new AnonymousClass2T3(r4.A0Q, r2, A032, z), A00(r6));
        if (z) {
            AnonymousClass1W6 r1 = r22.A0I;
            if (r1 != null) {
                r1.A02++;
            } else {
                throw null;
            }
        }
        AnonymousClass0Ci r12 = this.A09;
        AnonymousClass1W6 r0 = r22.A0I;
        if (r0 != null) {
            r12.A04(r0);
            if (r0 != null) {
                r22.A08.A04(r0.A09);
                r22.A00().A01();
                return r22;
            }
            throw null;
        }
        throw null;
    }

    public void A07(C56862jJ r4) {
        boolean A062;
        r4.A02 = true;
        C02950Ed r2 = this.A0B;
        if (r2.A03.A06(r4) || (r2.A04.A00(r4.A02().A05).A06(r4) | r2.A02.A06(r4))) {
            StringBuilder sb = new StringBuilder("mediajobmanager/cancelled transcoding job: ");
            sb.append(r4);
            Log.d(sb.toString());
        }
        AnonymousClass0EL r22 = this.A0F;
        if (r22.A06(r4)) {
            StringBuilder sb2 = new StringBuilder("mediajobmanager/cancelled uploading job: ");
            sb2.append(r4);
            Log.d(sb2.toString());
        }
        C56872jK r0 = r4.A01;
        if (r0 != null && r22.A06(r0)) {
            StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/cancelled thumbnail uploading job: ");
            A0S.append(r4.A01);
            Log.d(A0S.toString());
        }
    }

    public void A08(C56862jJ r4) {
        C50152Tp r2 = (C50152Tp) r4.A0G.A00();
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("app/mediajobmanager/continueMediaJob found upload response for jobId=");
            sb.append(r4);
            Log.d(sb.toString());
            A0D(r4, r2);
            return;
        }
        AnonymousClass2TV r22 = (AnonymousClass2TV) r4.A0C.A00();
        if (r22 != null) {
            StringBuilder sb2 = new StringBuilder("app/mediajobmanager/continueMediaJob found transcoding response for jobId=");
            sb2.append(r4);
            Log.d(sb2.toString());
            A0F(r22, r4);
        }
    }

    public void A09(C56862jJ r26) {
        AnonymousClass2TT A022 = r26.A02();
        C02950Ed r5 = this.A0B;
        AnonymousClass1O7 r3 = new AnonymousClass1O7(r5.A01);
        AnonymousClass2TG r2 = new AnonymousClass2TG(r3);
        if (A022.A0C || A022.A07 != null) {
            AnonymousClass1XO r6 = A022.A05;
            if (r6 == AnonymousClass1XO.A04) {
                r5.A02.A07(r26, A022.A08, r5.A00.A00, new C56942jR(r5, r26, A022, r2, r3));
            } else if (r6 == AnonymousClass1XO.A0N || r6 == AnonymousClass1XO.A0Q) {
                r5.A02.A07(r26, A022.A08, r5.A00.A00, new C56952jS(r5, r26, r3, A022, r2));
            } else {
                AnonymousClass1XO r8 = AnonymousClass1XO.A05;
                if (r6 == r8 || r6 == AnonymousClass1XO.A0D) {
                    AnonymousClass2TQ r9 = r2.A07;
                    C56982jV r7 = r2.A06;
                    C56912jO r62 = r2.A05;
                    File file = A022.A07;
                    if (file != null) {
                        boolean z = A022.A0G;
                        StringBuilder sb = new StringBuilder();
                        sb.append(UUID.randomUUID().toString());
                        sb.append(".aac");
                        r5.A04.A01(new C57062je(r26, r3, r9, r7, r62, file, z, r5.A00(file, sb.toString())), r8);
                    } else {
                        throw null;
                    }
                } else {
                    AnonymousClass1XO r11 = AnonymousClass1XO.A0A;
                    if (r6 == r11 || r6 == AnonymousClass1XO.A0P || r6 == AnonymousClass1XO.A0C || r6 == AnonymousClass1XO.A0H || r6 == AnonymousClass1XO.A06) {
                        String str = A022.A0B;
                        if (str != null) {
                            AnonymousClass2TQ r10 = r2.A07;
                            C56982jV r92 = r2.A06;
                            C56912jO r82 = r2.A05;
                            File A002 = A022.A00();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(UUID.randomUUID().toString());
                            sb2.append(".jpg");
                            File A003 = r5.A00(A002, sb2.toString());
                            AnonymousClass2TP r72 = A022.A04;
                            if (r72 != null) {
                                r5.A04.A01(new C57102ji(r26, str, r3, r10, r92, r82, A003, r72, A022.A0E, A022.A0D), r11);
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        AnonymousClass1XO r112 = AnonymousClass1XO.A0I;
                        if (r6 == r112) {
                            File file2 = A022.A07;
                            String str2 = A022.A0B;
                            String str3 = A022.A09;
                            C29251Xr r83 = A022.A06;
                            AnonymousClass2TQ r73 = r2.A07;
                            C56982jV r63 = r2.A06;
                            C56912jO r0 = r2.A05;
                            File A004 = A022.A00();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(UUID.randomUUID().toString());
                            sb3.append(".webp");
                            r5.A04.A01(new C57142jm(r26, file2, str2, str3, r83, r3, r73, r63, r0, r5.A00(A004, sb3.toString())), r112);
                        }
                    }
                }
            }
        } else {
            AnonymousClass2TQ r93 = r2.A07;
            C56982jV r84 = r2.A06;
            C56912jO r74 = r2.A05;
            String str4 = A022.A0B;
            if (str4 != null) {
                File A005 = A022.A00();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(UUID.randomUUID().toString());
                sb4.append(".tmp");
                r5.A04.A01(new C57072jf(r26, r3, r93, r84, r74, str4, r5.A00(A005, sb4.toString())), A022.A05);
            } else {
                throw null;
            }
        }
        r26.A00().A03(r2.A00);
        A0C(r26, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r4.A0G.A00() != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C56862jJ r4, int r5) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EJ.A0A(X.2jJ, int):void");
    }

    public void A0B(C56862jJ r7, AnonymousClass1WC r8) {
        AnonymousClass0EL r2 = this.A0F;
        StringBuilder sb = new StringBuilder("mediauploadqueue/enqueue ");
        sb.append(r8);
        Log.i(sb.toString());
        C60622pp r5 = (C60622pp) r2.A01(r7, r8);
        r7.A00().A04(r5.A0P.A04);
        int A002 = r8.A00();
        boolean z = true;
        if (!(A002 == 3 || A002 == 1)) {
            z = false;
        }
        if (!z) {
            r5.A0B.A03(r7.A0N, this.A0K);
        }
        C56382iX r1 = new C56382iX(this, r7, r5);
        Executor executor = this.A0K;
        r5.A0E.A03(r1, executor);
        r5.A0C.A03(new C56392iY(this, r7), null);
        if (!z) {
            r5.A0D.A03(r7.A0O, executor);
        }
    }

    public final void A0C(C56862jJ r4, AnonymousClass2TG r5) {
        r5.A02.A03(r4.A0L, null);
        r5.A03.A03(r4.A0M, null);
        r5.A04.A03(new C56332iS(this, r4, r5), null);
        r5.A01.A03(new C56342iT(this, r4), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (r5 == 0) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019f A[SYNTHETIC, Splitter:B:63:0x019f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf A[Catch:{ FileNotFoundException -> 0x01f7, IOException -> 0x01eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C56862jJ r27, X.C50152Tp r28) {
        /*
        // Method dump skipped, instructions count: 818
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EJ.A0D(X.2jJ, X.2Tp):void");
    }

    public void A0E(C56862jJ r10, String str) {
        StringBuilder sb = new StringBuilder("app/mediajobmanager/enqueuemediaupload ");
        sb.append(str);
        Log.i(sb.toString());
        AnonymousClass2TT A022 = r10.A02();
        AnonymousClass1XO r6 = A022.A05;
        boolean z = A022.A0G;
        boolean z2 = A022.A0C;
        File file = A022.A07;
        if (z && !C02550Cn.A02(r6, file)) {
            StringBuilder sb2 = new StringBuilder("app/mediajobmanager/enqueuemediaupload we cannot transcode media that needs transcoding ");
            sb2.append(str);
            Log.e(sb2.toString());
            r10.A04(21);
        } else if (r6 == AnonymousClass1XO.A07 && C02230Bd.A05(A022.A0A) == -1) {
            StringBuilder sb3 = new StringBuilder("app/mediajobmanager/enqueuemediaupload we are unable to determine the mimetype of this document ");
            sb3.append(str);
            Log.e(sb3.toString());
            r10.A04(21);
        } else if (r10.A0C.A00() != null) {
            A08(r10);
        } else {
            if (z || r6 == AnonymousClass1XO.A0N || r6 == AnonymousClass1XO.A0Q || r6 == AnonymousClass1XO.A04 || r6 == AnonymousClass1XO.A0M || r6 == AnonymousClass1XO.A0K || this.A0E.A04(r6, file)) {
                if (z2) {
                    A09(r10);
                    return;
                }
            } else if (z2) {
                if (file == null) {
                    StringBuilder A0S = AnonymousClass008.A0S("app/mediajobmanager queuing media into upload queue with null file, media_type=");
                    A0S.append(r6);
                    A0S.append("; media_name=");
                    A0S.append(A022.A0B);
                    A0S.append(" ");
                    A0S.append(str);
                    Log.e(A0S.toString());
                    r10.A04(7);
                    return;
                }
                A0B(r10, new AnonymousClass1WC(r10.A01(), r10));
            }
            if (file == null) {
                A09(r10);
                return;
            }
            A0B(r10, new AnonymousClass1WC(r10.A01(), r10));
        }
    }

    public final void A0F(AnonymousClass2TV r4, C56862jJ r5) {
        if (!r5.A0Q.compareAndSet(false, true)) {
            StringBuilder sb = new StringBuilder("mediajobmanager/handleProcessMediaResponse already handled; skipping: ");
            sb.append(r5);
            Log.d(sb.toString());
        } else if (r5.A02) {
            StringBuilder sb2 = new StringBuilder("mediajobmanager/handleProcessMediaResponse handling cancellation: ");
            sb2.append(r5);
            Log.d(sb2.toString());
            A0A(r5, 1);
        } else {
            StringBuilder sb3 = new StringBuilder("mediajobmanager/handleProcessMediaResponse mediaJob continuing: ");
            sb3.append(r5);
            Log.d(sb3.toString());
            if (r4.A02) {
                AnonymousClass1WC r1 = new AnonymousClass1WC(r5.A01(), r5);
                if (!r5.A02) {
                    A0B(r5, r1);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("mediatranscodequeue/success/all-cancelled ");
                sb4.append(r5);
                Log.i(sb4.toString());
                return;
            }
            StringBuilder sb5 = new StringBuilder("app/mediajobmanager/handleProcessMediaFailure remove mediaJob jobId=");
            sb5.append(r5);
            Log.d(sb5.toString());
            A0A(r5, 20);
        }
    }
}
