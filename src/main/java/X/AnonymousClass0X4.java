package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0X4  reason: invalid class name */
public class AnonymousClass0X4 implements AnonymousClass0C0 {
    public static volatile AnonymousClass0X4 A1J;
    public final AnonymousClass0GG A00;
    public final C03320Fs A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass0X5 A04;
    public final AnonymousClass01I A05;
    public final AnonymousClass0AH A06;
    public final C03250Fl A07;
    public final AnonymousClass09T A08;
    public final AnonymousClass09G A09;
    public final C000300f A0A;
    public final AnonymousClass0CL A0B;
    public final AnonymousClass0KZ A0C;
    public final AnonymousClass01J A0D;
    public final C017009c A0E;
    public final AnonymousClass0DH A0F;
    public final AnonymousClass01A A0G;
    public final AnonymousClass08B A0H;
    public final AnonymousClass0I9 A0I;
    public final AnonymousClass0EQ A0J;
    public final AnonymousClass04j A0K;
    public final AnonymousClass00S A0L;
    public final AnonymousClass00G A0M;
    public final AnonymousClass01X A0N;
    public final C001000o A0O;
    public final C001400w A0P;
    public final AnonymousClass09A A0Q;
    public final AnonymousClass0DG A0R;
    public final C006903j A0S;
    public final AnonymousClass0AQ A0T;
    public final AnonymousClass01K A0U;
    public final C02320Bn A0V;
    public final AnonymousClass01T A0W;
    public final AnonymousClass0AB A0X;
    public final AnonymousClass0BV A0Y;
    public final AnonymousClass0AC A0Z;
    public final AnonymousClass0DF A0a;
    public final AnonymousClass0FL A0b;
    public final C018609s A0c;
    public final C02090Ap A0d;
    public final AnonymousClass01N A0e;
    public final AnonymousClass09E A0f;
    public final AnonymousClass01P A0g;
    public final C02430Bz A0h;
    public final AnonymousClass0I8 A0i;
    public final AnonymousClass01L A0j;
    public final C03130Ex A0k;
    public final AnonymousClass0DR A0l;
    public final AnonymousClass00Y A0m;
    public final AnonymousClass0EO A0n;
    public final C02660Cy A0o;
    public final C04420Kh A0p;
    public final AnonymousClass0EN A0q;
    public final AnonymousClass0JN A0r;
    public final AnonymousClass0K7 A0s;
    public final C04450Kk A0t;
    public final AnonymousClass0X6 A0u;
    public final AnonymousClass09J A0v;
    public final C015808q A0w;
    public final AnonymousClass0AR A0x;
    public final AnonymousClass0IA A0y;
    public final C02360Br A0z;
    public final C28991Wn A10;
    public final AnonymousClass0FF A11;
    public final AnonymousClass0AD A12;
    public final AnonymousClass0GR A13;
    public final C02040Ak A14;
    public final C01970Ad A15;
    public final AnonymousClass0XD A16;
    public final AnonymousClass0AL A17;
    public final C64582yQ A18;
    public final AnonymousClass01R A19;
    public final AnonymousClass0C5 A1A;
    public final AbstractC658131q A1B;
    public final AbstractC658231r A1C;
    public final AnonymousClass09D A1D;
    public final AnonymousClass0X9 A1E;
    public final AnonymousClass00T A1F;
    public final AnonymousClass0XC A1G;
    public final Set A1H = new HashSet();
    public final Set A1I = new HashSet();

    public AnonymousClass0X4(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass02M r4, AnonymousClass009 r5, AnonymousClass01I r6, AnonymousClass00T r7, C006903j r8, AnonymousClass0CL r9, AnonymousClass00Y r10, AnonymousClass0DG r11, AnonymousClass0AR r12, C000300f r13, AnonymousClass09E r14, AnonymousClass0DH r15, AnonymousClass09G r16, AnonymousClass01J r17, AnonymousClass01A r18, AnonymousClass0AB r19, AnonymousClass0AH r20, C001400w r21, AnonymousClass0KZ r22, C02360Br r23, AnonymousClass01X r24, AnonymousClass0AL r25, C01970Ad r26, AnonymousClass0GG r27, AnonymousClass08B r28, AnonymousClass01K r29, C02320Bn r30, AnonymousClass0C5 r31, AnonymousClass0EO r32, AnonymousClass09J r33, AnonymousClass0AC r34, C03250Fl r35, AnonymousClass09T r36, AnonymousClass0EN r37, AnonymousClass0EQ r38, AnonymousClass0X5 r39, AnonymousClass0JN r40, AnonymousClass0BV r41, C015808q r42, AnonymousClass0DR r43, C001000o r44, AnonymousClass01L r45, AnonymousClass09A r46, AnonymousClass0DF r47, C02090Ap r48, AnonymousClass01N r49, C28991Wn r50, AnonymousClass04j r51, AnonymousClass0FF r52, C64582yQ r53, AnonymousClass01P r54, C02660Cy r55, C03320Fs r56, AnonymousClass0I8 r57, AnonymousClass0FL r58, AnonymousClass01R r59, AnonymousClass0X6 r60, C02040Ak r61, AnonymousClass0IA r62, AnonymousClass0I9 r63, AnonymousClass0K7 r64, C017009c r65, C02430Bz r66, C04450Kk r67, AnonymousClass0X9 r68, C03130Ex r69, C018609s r70, C04420Kh r71, AnonymousClass0XC r72, AnonymousClass01T r73, AbstractC658131q r74, AbstractC658231r r75, AnonymousClass0AQ r76, AnonymousClass0AD r77, AnonymousClass0GR r78, AnonymousClass0XD r79, AnonymousClass09D r80) {
        this.A0M = r2;
        this.A0L = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A1F = r7;
        this.A0S = r8;
        this.A0B = r9;
        this.A0m = r10;
        this.A0R = r11;
        this.A0x = r12;
        this.A0A = r13;
        this.A0f = r14;
        this.A0F = r15;
        this.A09 = r16;
        this.A0D = r17;
        this.A0G = r18;
        this.A0X = r19;
        this.A06 = r20;
        this.A0C = r22;
        this.A0z = r23;
        this.A0N = r24;
        this.A17 = r25;
        this.A15 = r26;
        this.A00 = r27;
        this.A0H = r28;
        this.A0U = r29;
        this.A0V = r30;
        this.A1A = r31;
        this.A0n = r32;
        this.A0v = r33;
        this.A0Z = r34;
        this.A07 = r35;
        this.A08 = r36;
        this.A0q = r37;
        this.A0J = r38;
        this.A04 = r39;
        this.A0r = r40;
        this.A0Y = r41;
        this.A0w = r42;
        this.A0l = r43;
        this.A0O = r44;
        this.A0j = r45;
        this.A0Q = r46;
        this.A0a = r47;
        this.A0d = r48;
        this.A0e = r49;
        this.A10 = r50;
        this.A0K = r51;
        this.A11 = r52;
        this.A18 = r53;
        this.A0g = r54;
        this.A0o = r55;
        this.A01 = r56;
        this.A0i = r57;
        this.A0b = r58;
        this.A19 = r59;
        this.A0u = r60;
        this.A14 = r61;
        this.A0y = r62;
        this.A0I = r63;
        this.A0s = r64;
        this.A0E = r65;
        this.A0h = r66;
        this.A0t = r67;
        this.A1E = r68;
        this.A0k = r69;
        this.A0c = r70;
        this.A0p = r71;
        this.A1G = r72;
        this.A0W = r73;
        this.A1B = r74;
        this.A1C = r75;
        this.A0T = r76;
        this.A12 = r77;
        this.A13 = r78;
        this.A1D = r80;
        this.A0P = r21;
        this.A16 = r79;
    }

    public static AnonymousClass0X4 A00() {
        if (A1J == null) {
            synchronized (AnonymousClass0X4.class) {
                if (A1J == null) {
                    AnonymousClass00G r9 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass009 A004 = AnonymousClass009.A00();
                    AnonymousClass01I A005 = AnonymousClass01I.A00();
                    AnonymousClass00T A006 = C002101e.A00();
                    C006903j A007 = C006903j.A00();
                    AnonymousClass0CL A008 = AnonymousClass0CL.A00();
                    AnonymousClass00Y A009 = AnonymousClass00Y.A00();
                    AnonymousClass0DG A0010 = AnonymousClass0DG.A00();
                    AnonymousClass0AR A0011 = AnonymousClass0AR.A00();
                    C000300f A0012 = C000300f.A00();
                    AnonymousClass09E A0013 = AnonymousClass09E.A00();
                    AnonymousClass0DH A0014 = AnonymousClass0DH.A00();
                    AnonymousClass09G A0015 = AnonymousClass09G.A00();
                    AnonymousClass01J A0016 = AnonymousClass01J.A00();
                    AnonymousClass01A A0017 = AnonymousClass01A.A00();
                    AnonymousClass0AB A0018 = AnonymousClass0AB.A00();
                    AnonymousClass0AH A032 = AnonymousClass0AH.A03();
                    C001400w r28 = C001400w.A02;
                    AnonymousClass0KZ A0019 = AnonymousClass0KZ.A00();
                    C02360Br A0020 = C02360Br.A00();
                    AnonymousClass01X A0021 = AnonymousClass01X.A00();
                    AnonymousClass0AL A012 = AnonymousClass0AL.A01();
                    C01970Ad A0022 = C01970Ad.A00();
                    AnonymousClass0GG A0023 = AnonymousClass0GG.A00();
                    AnonymousClass08B r35 = AnonymousClass08B.A00;
                    AnonymousClass01K A0024 = AnonymousClass01K.A00();
                    C02320Bn A0025 = C02320Bn.A00();
                    AnonymousClass0C5 A0026 = AnonymousClass0C5.A00();
                    AnonymousClass0EO A0027 = AnonymousClass0EO.A00();
                    AnonymousClass09J r40 = AnonymousClass09J.A02;
                    AnonymousClass0AC r41 = AnonymousClass0AC.A00;
                    C03250Fl A0028 = C03250Fl.A00();
                    AnonymousClass09T A0029 = AnonymousClass09T.A00();
                    AnonymousClass0EN A0030 = AnonymousClass0EN.A00();
                    AnonymousClass0EQ A0031 = AnonymousClass0EQ.A00();
                    if (AnonymousClass0X5.A0B == null) {
                        synchronized (AnonymousClass0X5.class) {
                            if (AnonymousClass0X5.A0B == null) {
                                AnonymousClass0X5.A0B = new AnonymousClass0X5(AnonymousClass00S.A00(), AnonymousClass0AR.A00(), C000300f.A00(), AnonymousClass098.A00(), AnonymousClass09G.A00(), AnonymousClass01J.A00(), C02360Br.A00(), AnonymousClass01X.A00(), AnonymousClass0AL.A01(), AnonymousClass01K.A00(), C04480Kn.A00());
                            }
                        }
                    }
                    AnonymousClass0X5 r46 = AnonymousClass0X5.A0B;
                    AnonymousClass0JN A0032 = AnonymousClass0JN.A00();
                    AnonymousClass0BV A0033 = AnonymousClass0BV.A00();
                    C015808q A0034 = C015808q.A00();
                    AnonymousClass0DR A0035 = AnonymousClass0DR.A00();
                    C001000o A0036 = C001000o.A00();
                    AnonymousClass01L A0037 = AnonymousClass01L.A00();
                    AnonymousClass09A r53 = AnonymousClass09A.A02;
                    AnonymousClass0DF A0038 = AnonymousClass0DF.A00();
                    C02090Ap A0039 = C02090Ap.A00();
                    AnonymousClass01N A0040 = AnonymousClass01N.A00();
                    C28991Wn A0041 = C28991Wn.A00();
                    AnonymousClass04j A0042 = AnonymousClass04j.A00();
                    AnonymousClass0FF A0043 = AnonymousClass0FF.A00();
                    if (C64582yQ.A0M == null) {
                        synchronized (C64582yQ.class) {
                            if (C64582yQ.A0M == null) {
                                C64582yQ.A0M = new C64582yQ(AnonymousClass00S.A00(), AnonymousClass01I.A00(), AnonymousClass00Y.A00(), AnonymousClass0AR.A00(), C000300f.A00(), AnonymousClass01J.A00(), AnonymousClass0AH.A03(), C02330Bo.A00(), r28, AnonymousClass01K.A00(), C03110Ev.A00(), C015808q.A00(), C001000o.A00(), AnonymousClass01N.A00(), AnonymousClass0FZ.A00(), AnonymousClass04v.A00(), C28991Wn.A00(), AnonymousClass0I8.A01(), AnonymousClass321.A00(), AnonymousClass01T.A00(), AnonymousClass0L3.A00);
                            }
                        }
                    }
                    C64582yQ r60 = C64582yQ.A0M;
                    AnonymousClass01P A0044 = AnonymousClass01P.A00();
                    C02660Cy A0045 = C02660Cy.A00();
                    C03320Fs r63 = C03320Fs.A00;
                    AnonymousClass0I8 A013 = AnonymousClass0I8.A01();
                    AnonymousClass0FL A0046 = AnonymousClass0FL.A00();
                    AnonymousClass01R A014 = AnonymousClass01R.A01();
                    if (AnonymousClass0X6.A07 == null) {
                        synchronized (AnonymousClass0X6.class) {
                            if (AnonymousClass0X6.A07 == null) {
                                AnonymousClass09G A0047 = AnonymousClass09G.A00();
                                AnonymousClass01K A0048 = AnonymousClass01K.A00();
                                C02320Bn A0049 = C02320Bn.A00();
                                if (AnonymousClass0X7.A04 == null) {
                                    synchronized (AnonymousClass0X7.class) {
                                        if (AnonymousClass0X7.A04 == null) {
                                            AnonymousClass0X7.A04 = new AnonymousClass0X7(C002101e.A00(), AnonymousClass0DH.A00(), AnonymousClass09G.A00(), AnonymousClass0DL.A00());
                                        }
                                    }
                                }
                                AnonymousClass0X7 r71 = AnonymousClass0X7.A04;
                                C28991Wn A0050 = C28991Wn.A00();
                                if (AnonymousClass0X8.A03 == null) {
                                    synchronized (AnonymousClass0X8.class) {
                                        if (AnonymousClass0X8.A03 == null) {
                                            AnonymousClass0X8.A03 = new AnonymousClass0X8(AnonymousClass0AL.A01(), AnonymousClass01K.A00(), C014508d.A00());
                                        }
                                    }
                                }
                                AnonymousClass0X6.A07 = new AnonymousClass0X6(A0047, A0048, A0049, r71, A0050, AnonymousClass0X8.A03, AnonymousClass0A3.A00());
                            }
                        }
                    }
                    AnonymousClass0X6 r67 = AnonymousClass0X6.A07;
                    C02040Ak A0051 = C02040Ak.A00();
                    AnonymousClass0IA A0052 = AnonymousClass0IA.A00();
                    AnonymousClass0I9 A0053 = AnonymousClass0I9.A00();
                    AnonymousClass0K7 A0054 = AnonymousClass0K7.A00();
                    C017009c A0055 = C017009c.A00();
                    C02430Bz A0056 = C02430Bz.A00();
                    C04450Kk A0057 = C04450Kk.A00();
                    AnonymousClass0X9 A0058 = AnonymousClass0X9.A00();
                    C03130Ex A0059 = C03130Ex.A00();
                    C018609s A042 = C018609s.A04();
                    C04420Kh A0060 = C04420Kh.A00();
                    if (AnonymousClass0XC.A02 == null) {
                        synchronized (AnonymousClass0XC.class) {
                            if (AnonymousClass0XC.A02 == null) {
                                AnonymousClass0XC.A02 = new AnonymousClass0XC(C03160Fa.A00(), AnonymousClass0Z0.A00());
                            }
                        }
                    }
                    A1J = new AnonymousClass0X4(r9, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A032, r28, A0019, A0020, A0021, A012, A0022, A0023, r35, A0024, A0025, A0026, A0027, r40, r41, A0028, A0029, A0030, A0031, r46, A0032, A0033, A0034, A0035, A0036, A0037, r53, A0038, A0039, A0040, A0041, A0042, A0043, r60, A0044, A0045, r63, A013, A0046, A014, r67, A0051, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A0059, A042, A0060, AnonymousClass0XC.A02, AnonymousClass01T.A00(), AbstractC658131q.A00(), AbstractC658231r.A00(), AnonymousClass0AQ.A00(), AnonymousClass0AD.A00, AnonymousClass0GR.A00(), AnonymousClass0XD.A00(), AnonymousClass09D.A00());
                }
            }
        }
        return A1J;
    }

    public final int A01(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null) {
            return 1;
        }
        if (bArr == null) {
            Log.e("MessagingXmppHandler/validateServerErrorEncData/badmediadata;");
            return 0;
        } else if (bArr3 == null) {
            Log.e("MessagingXmppHandler/validateServerErrorEncData/incomplete enc data");
            return 0;
        } else {
            C04450Kk.A01(bArr, bArr3);
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(1, str, bArr2, bArr, bArr3);
            if (nativeHolder != null) {
                C21000xw r1 = new C21000xw(nativeHolder);
                JniBridge instance = JniBridge.getInstance();
                NativeHolder nativeHolder2 = r1.A00;
                if (instance != null) {
                    long j = (long) 20;
                    if (str.equals(JniBridge.jvidispatchOIO(1, j, nativeHolder2))) {
                        return 1;
                    }
                    StringBuilder A0Z2 = AnonymousClass008.A0Z("MessagingXmppHandler/validateServerErrorEncData/incorrect stanza id; key=", str, "; stanzaId=");
                    if (JniBridge.getInstance() != null) {
                        A0Z2.append((String) JniBridge.jvidispatchOIO(1, j, nativeHolder2));
                        Log.e(A0Z2.toString());
                        return 0;
                    }
                    throw null;
                }
                throw null;
            }
            Log.e("MessagingXmppHandler/validateServerErrorEncData/malformed enc data");
            return 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0138, code lost:
        if (r5 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0144, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X4.A02():void");
    }

    public final void A03(DeviceJid deviceJid, AnonymousClass1XJ r57, Map map) {
        Set set = this.A1H;
        synchronized (set) {
            if (map.isEmpty() || !set.contains(map)) {
                if (!map.isEmpty() && this.A0A.A0D(AbstractC000400g.A1W)) {
                    set.add(map);
                }
                AnonymousClass02M r0 = this.A03;
                AnonymousClass009 r02 = this.A02;
                AnonymousClass01I r03 = this.A05;
                AnonymousClass00G r04 = this.A0M;
                AnonymousClass00T r05 = this.A1F;
                C006903j r06 = this.A0S;
                AnonymousClass0DG r07 = this.A0R;
                AnonymousClass0AR r08 = this.A0x;
                C000300f r09 = this.A0A;
                AnonymousClass09G r010 = this.A09;
                AnonymousClass01J r011 = this.A0D;
                AnonymousClass01A r012 = this.A0G;
                AnonymousClass0AH r013 = this.A06;
                AnonymousClass01X r014 = this.A0N;
                AnonymousClass0AL r015 = this.A17;
                C01970Ad r016 = this.A15;
                AnonymousClass08B r017 = this.A0H;
                AnonymousClass01K r018 = this.A0U;
                AnonymousClass0X5 r15 = this.A04;
                C001000o r14 = this.A0O;
                C28991Wn r12 = this.A10;
                C50492Ux r16 = new C50492Ux(r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r012, r013, r014, r015, r016, r017, r018, r15, r14, r12, this.A0g, this.A0u, this.A14, this.A0y, this.A0E, this.A1E, this.A0c, this.A12, this.A13, this.A1D);
                C448421w r1 = (C448421w) r12.A01(0, r57.A04);
                if (r1 != null) {
                    r1.A01(2);
                }
                C001400w r019 = this.A0P;
                r019.A00.execute(new RunnableEBaseShape0S0500000_I0(this, deviceJid, r57, r16, map, 3));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("messagingXmppHandler/onMessageForMe message in queue; skipping id:");
                sb.append((String) map.get("id"));
                Log.i(sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029d, code lost:
        if (r36.A08.A02(r8.A00) != false) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0201, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0205, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass2V1 r37, long r38) {
        /*
        // Method dump skipped, instructions count: 803
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X4.A04(X.2V1, long):void");
    }

    public final void A05(C007303n r7) {
        HashSet hashSet = new HashSet(this.A0e.A03(r7));
        AnonymousClass01I r0 = this.A05;
        r0.A04();
        hashSet.add(r0.A02);
        AnonymousClass009 r2 = this.A02;
        HashSet hashSet2 = new HashSet(hashSet.size());
        AnonymousClass1VY.A0M(r2, hashSet, hashSet2);
        this.A0J.A01(r7, (UserJid[]) hashSet2.toArray(new UserJid[0]), this.A0L.A05() + 300000);
    }

    public final void A06(AnonymousClass1XJ r13) {
        new AnonymousClass2V6(this.A0x, this.A0D, this.A07, this.A0O, this.A0Q, this.A0u, r13, null, null, null, true).A00();
    }

    public final void A07(Runnable runnable, int i) {
        if (this.A0A.A0D(AbstractC000400g.A2C)) {
            AnonymousClass09A r1 = this.A0Q;
            if (i < 52) {
                Handler handler = r1.A01;
                Message obtain = Message.obtain(handler, runnable);
                obtain.arg1 = i;
                handler.sendMessage(obtain);
                return;
            }
            throw new IllegalArgumentException("Not supported TaskId");
        }
        this.A0Q.A01(runnable, i);
    }

    public final void A08(boolean z, String str, Jid jid, AnonymousClass0M3 r13, int i, AnonymousClass02N r15, boolean z2, UserJid userJid) {
        AnonymousClass0M4 r0;
        if (z) {
            AnonymousClass01I r1 = this.A05;
            r1.A04();
            if (r1.A03 == null || !r1.A08(DeviceJid.of(jid))) {
                return;
            }
            if (r13 == null || !((r0 = r13.A02) == null || r0.A0U == null)) {
                this.A0t.A02(r13, i, jid, str, r15, z2, userJid, null);
            }
        }
    }

    public final boolean A09(C007303n r6, String str) {
        if (!this.A0w.A03()) {
            return false;
        }
        HashSet hashSet = new HashSet(this.A0e.A03(r6));
        AnonymousClass01I r0 = this.A05;
        r0.A04();
        hashSet.add(r0.A02);
        if (TextUtils.equals(C001801b.A18(hashSet), str)) {
            return false;
        }
        AnonymousClass009 r2 = this.A02;
        HashSet hashSet2 = new HashSet(hashSet.size());
        AnonymousClass1VY.A0M(r2, hashSet, hashSet2);
        this.A0J.A01(r6, (UserJid[]) hashSet2.toArray(new UserJid[0]), 0);
        return true;
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{0, 1, 2, 19, 3, 69, 86, 16, 15, 215};
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: com.whatsapp.jid.UserJid[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03d8, code lost:
        if (r4 != 7) goto L_0x03da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:362:? A[RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass0C0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAE(int r32, android.os.Message r33) {
        /*
        // Method dump skipped, instructions count: 2474
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X4.AAE(int, android.os.Message):boolean");
    }
}
