package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextData;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Kb  reason: invalid class name and case insensitive filesystem */
public class C04360Kb {
    public static volatile C04360Kb A1C;
    public PowerManager.WakeLock A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass0EW A02;
    public final AnonymousClass0C1 A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass0CD A05;
    public final AnonymousClass01I A06;
    public final AnonymousClass0I5 A07;
    public final C000300f A08;
    public final C04380Kd A09;
    public final AnonymousClass0HI A0A;
    public final AnonymousClass09K A0B;
    public final C27331Pi A0C;
    public final C017009c A0D;
    public final AnonymousClass0DH A0E;
    public final AnonymousClass01A A0F;
    public final AnonymousClass0AI A0G;
    public final C014308b A0H;
    public final C04410Kg A0I;
    public final AnonymousClass00C A0J;
    public final AnonymousClass03P A0K;
    public final AnonymousClass00S A0L;
    public final AnonymousClass00G A0M;
    public final AnonymousClass03S A0N;
    public final AnonymousClass01X A0O;
    public final AnonymousClass09A A0P;
    public final AnonymousClass09W A0Q;
    public final AnonymousClass0DG A0R;
    public final C006903j A0S;
    public final AnonymousClass0AQ A0T;
    public final AnonymousClass0A8 A0U;
    public final AnonymousClass01Q A0V;
    public final AnonymousClass01K A0W;
    public final C02320Bn A0X;
    public final AnonymousClass0EP A0Y;
    public final AnonymousClass01T A0Z;
    public final C04480Kn A0a;
    public final AnonymousClass0AP A0b;
    public final C017809k A0c;
    public final AnonymousClass0AC A0d;
    public final AnonymousClass01N A0e;
    public final AnonymousClass0CG A0f;
    public final C03120Ew A0g;
    public final C019109x A0h;
    public final AnonymousClass0BW A0i;
    public final C002701k A0j;
    public final AnonymousClass0AS A0k;
    public final AnonymousClass00Y A0l;
    public final C02660Cy A0m;
    public final AnonymousClass01S A0n;
    public final AnonymousClass0CP A0o;
    public final C04420Kh A0p;
    public final C02530Cl A0q;
    public final AnonymousClass0FM A0r;
    public final AnonymousClass0CH A0s;
    public final C02550Cn A0t;
    public final C02520Ck A0u;
    public final C04340Jz A0v;
    public final AnonymousClass09H A0w;
    public final AnonymousClass0FZ A0x;
    public final AnonymousClass0AR A0y;
    public final C02360Br A0z;
    public final AnonymousClass0FE A10;
    public final C03110Ev A11;
    public final AnonymousClass0AL A12;
    public final AnonymousClass0CT A13;
    public final AnonymousClass0BB A14;
    public final C04230Jo A15;
    public final C03570Gt A16;
    public final C04470Km A17;
    public final C04370Kc A18;
    public final C02220Bc A19;
    public final AnonymousClass00T A1A;
    public final AnonymousClass0C4 A1B;

    public C04360Kb(AnonymousClass00G r2, AnonymousClass00S r3, C002701k r4, C04370Kc r5, AnonymousClass02M r6, AnonymousClass009 r7, AnonymousClass01I r8, AnonymousClass00T r9, C006903j r10, AnonymousClass00Y r11, AnonymousClass0C4 r12, AnonymousClass0DG r13, AnonymousClass0AR r14, C000300f r15, AnonymousClass0DH r16, AnonymousClass09W r17, AnonymousClass0CP r18, AnonymousClass09H r19, AnonymousClass0CT r20, C27331Pi r21, AnonymousClass01A r22, AnonymousClass0EP r23, C02220Bc r24, C04230Jo r25, AnonymousClass03P r26, C02550Cn r27, C014308b r28, C02360Br r29, AnonymousClass01X r30, AnonymousClass0EW r31, AnonymousClass0AL r32, AnonymousClass0I5 r33, AnonymousClass0AS r34, AnonymousClass01K r35, C02320Bn r36, AnonymousClass0AP r37, AnonymousClass0AC r38, AnonymousClass09K r39, AnonymousClass0BB r40, AnonymousClass0CD r41, AnonymousClass00C r42, C03110Ev r43, C03570Gt r44, AnonymousClass0HI r45, AnonymousClass09A r46, AnonymousClass01N r47, C02520Ck r48, AnonymousClass0FZ r49, C03120Ew r50, AnonymousClass0FM r51, C017809k r52, AnonymousClass0FE r53, AnonymousClass0CG r54, C02660Cy r55, AnonymousClass03S r56, AnonymousClass0BW r57, AnonymousClass01Q r58, AnonymousClass0C1 r59, AnonymousClass0CH r60, C04380Kd r61, C02530Cl r62, C019109x r63, AnonymousClass0A8 r64, C04340Jz r65, C017009c r66, AnonymousClass01S r67, C04410Kg r68, C04420Kh r69, AnonymousClass01T r70, AnonymousClass0AI r71, AnonymousClass0AQ r72, C04470Km r73, C04480Kn r74) {
        this.A0M = r2;
        this.A0L = r3;
        this.A0j = r4;
        this.A18 = r5;
        this.A04 = r6;
        this.A01 = r7;
        this.A06 = r8;
        this.A1A = r9;
        this.A0S = r10;
        this.A0l = r11;
        this.A1B = r12;
        this.A0R = r13;
        this.A0y = r14;
        this.A08 = r15;
        this.A0E = r16;
        this.A0Q = r17;
        this.A0o = r18;
        this.A13 = r20;
        this.A0C = r21;
        this.A0F = r22;
        this.A0Y = r23;
        this.A0w = r19;
        this.A19 = r24;
        this.A15 = r25;
        this.A0K = r26;
        this.A0t = r27;
        this.A0H = r28;
        this.A0z = r29;
        this.A0O = r30;
        this.A02 = r31;
        this.A12 = r32;
        this.A07 = r33;
        this.A0k = r34;
        this.A0W = r35;
        this.A0X = r36;
        this.A0b = r37;
        this.A0d = r38;
        this.A0B = r39;
        this.A14 = r40;
        this.A05 = r41;
        this.A0J = r42;
        this.A11 = r43;
        this.A16 = r44;
        this.A0A = r45;
        this.A0P = r46;
        this.A0e = r47;
        this.A0u = r48;
        this.A0x = r49;
        this.A0g = r50;
        this.A0r = r51;
        this.A0c = r52;
        this.A10 = r53;
        this.A0f = r54;
        this.A0m = r55;
        this.A0N = r56;
        this.A0i = r57;
        this.A0V = r58;
        this.A03 = r59;
        this.A0s = r60;
        this.A09 = r61;
        this.A0q = r62;
        this.A0h = r63;
        this.A0U = r64;
        this.A0v = r65;
        this.A0n = r67;
        this.A0D = r66;
        this.A0I = r68;
        this.A0p = r69;
        this.A0Z = r70;
        this.A0G = r71;
        this.A0T = r72;
        this.A17 = r73;
        this.A0a = r74;
    }

    public static C04360Kb A00() {
        if (A1C == null) {
            synchronized (C04360Kb.class) {
                if (A1C == null) {
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k A003 = C002701k.A00();
                    C04370Kc A004 = C04370Kc.A00();
                    AnonymousClass02M A005 = AnonymousClass02M.A00();
                    AnonymousClass009 A006 = AnonymousClass009.A00();
                    AnonymousClass01I A007 = AnonymousClass01I.A00();
                    AnonymousClass00T A008 = C002101e.A00();
                    C006903j A009 = C006903j.A00();
                    AnonymousClass00Y A0010 = AnonymousClass00Y.A00();
                    AnonymousClass0C4 A0011 = AnonymousClass0C4.A00();
                    AnonymousClass0DG A0012 = AnonymousClass0DG.A00();
                    AnonymousClass0AR A0013 = AnonymousClass0AR.A00();
                    C000300f A0014 = C000300f.A00();
                    AnonymousClass0DH A0015 = AnonymousClass0DH.A00();
                    AnonymousClass09W A0016 = AnonymousClass09W.A00();
                    AnonymousClass0CP A0017 = AnonymousClass0CP.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    AnonymousClass0CT A0018 = AnonymousClass0CT.A00();
                    C27331Pi A0019 = C27331Pi.A00();
                    AnonymousClass01A A0020 = AnonymousClass01A.A00();
                    AnonymousClass0EP A0021 = AnonymousClass0EP.A00();
                    C02220Bc A0022 = C02220Bc.A00();
                    C04230Jo A0023 = C04230Jo.A00();
                    AnonymousClass03P A0024 = AnonymousClass03P.A00();
                    C02550Cn A013 = C02550Cn.A01();
                    C014308b A0025 = C014308b.A00();
                    C02360Br A0026 = C02360Br.A00();
                    AnonymousClass01X A0027 = AnonymousClass01X.A00();
                    AnonymousClass0EW r33 = AnonymousClass0EW.A01;
                    AnonymousClass0AL A014 = AnonymousClass0AL.A01();
                    AnonymousClass0I5 A0028 = AnonymousClass0I5.A00();
                    AnonymousClass0AS A0029 = AnonymousClass0AS.A00();
                    AnonymousClass01K A0030 = AnonymousClass01K.A00();
                    C02320Bn A0031 = C02320Bn.A00();
                    AnonymousClass0AP A0032 = AnonymousClass0AP.A00();
                    AnonymousClass0AC r40 = AnonymousClass0AC.A00;
                    AnonymousClass09K r41 = AnonymousClass09K.A07;
                    AnonymousClass0BB A0033 = AnonymousClass0BB.A00();
                    AnonymousClass0CD A0034 = AnonymousClass0CD.A00();
                    AnonymousClass00C A0035 = AnonymousClass00C.A00();
                    C03110Ev A0036 = C03110Ev.A00();
                    C03570Gt A0037 = C03570Gt.A00();
                    AnonymousClass0HI A0038 = AnonymousClass0HI.A00();
                    AnonymousClass09A r48 = AnonymousClass09A.A02;
                    AnonymousClass01N A0039 = AnonymousClass01N.A00();
                    C02520Ck A0040 = C02520Ck.A00();
                    AnonymousClass0FZ A0041 = AnonymousClass0FZ.A00();
                    C03120Ew A0042 = C03120Ew.A00();
                    AnonymousClass0FM A0043 = AnonymousClass0FM.A00();
                    C017809k A0044 = C017809k.A00();
                    AnonymousClass0FE A0045 = AnonymousClass0FE.A00();
                    AnonymousClass0CG A0046 = AnonymousClass0CG.A00();
                    C02660Cy A0047 = C02660Cy.A00();
                    AnonymousClass03S A0048 = AnonymousClass03S.A00();
                    AnonymousClass0BW A0049 = AnonymousClass0BW.A00();
                    AnonymousClass01Q A0050 = AnonymousClass01Q.A00();
                    AnonymousClass0C1 A015 = AnonymousClass0C1.A01();
                    AnonymousClass0CH A0051 = AnonymousClass0CH.A00();
                    C04380Kd A0052 = C04380Kd.A00();
                    C02530Cl r0 = C02530Cl.A01;
                    if (r0 == null) {
                        r0 = new C02530Cl(AnonymousClass00D.A00());
                        C02530Cl.A01 = r0;
                    }
                    A1C = new C04360Kb(r4, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A012, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A013, A0025, A0026, A0027, r33, A014, A0028, A0029, A0030, A0031, A0032, r40, r41, A0033, A0034, A0035, A0036, A0037, A0038, r48, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A015, A0051, A0052, r0, C019109x.A00(), AnonymousClass0A8.A00, C04340Jz.A00(), C017009c.A00(), AnonymousClass01S.A00(), C04410Kg.A00(), C04420Kh.A00(), AnonymousClass01T.A00(), AnonymousClass0AI.A00(), AnonymousClass0AQ.A00(), C04470Km.A00, C04480Kn.A00());
                }
            }
        }
        return A1C;
    }

    public static String A01(AnonymousClass009 r5, AnonymousClass0M3 r6) {
        File file;
        if (!TextUtils.isEmpty(r6.A07)) {
            return r6.A07;
        }
        AnonymousClass0M4 r0 = r6.A02;
        if (!(r0 == null || (file = r0.A0F) == null)) {
            try {
                byte b = r6.A0m;
                if (b == 2) {
                    return C02510Ch.A09(C02510Ch.A05(r5, file));
                }
                if (b == 3 || b == 13) {
                    int i = C02510Ch.A06(r5, file, false).A01;
                    if (i == 7) {
                        return "video/quicktime";
                    }
                    return i == 3 ? "video/3gpp" : "video/mp4";
                }
            } catch (C667135n | IOException e) {
                Log.e("useractions/getmediamimetype exception", e);
            }
        }
        byte b2 = r6.A0m;
        if (b2 == 1) {
            return "image/jpeg";
        }
        if (b2 == 2) {
            return "audio/*";
        }
        if (b2 == 3 || b2 == 13) {
            return "video/*";
        }
        if (b2 == 23 || b2 == 25 || b2 == 37 || b2 == 42) {
            return "image/jpeg";
        }
        if (b2 != 43) {
            return "*/*";
        }
        return "video/*";
    }

    public final PowerManager.WakeLock A02() {
        if (this.A00 == null) {
            PowerManager A0C2 = this.A0K.A0C();
            if (A0C2 == null) {
                Log.w("useractions/get-web-wakelock pm=null");
            } else {
                PowerManager.WakeLock A0f2 = C002001d.A0f(A0C2, 1, "Web Client");
                this.A00 = A0f2;
                A0f2.setReferenceCounted(false);
            }
        }
        return this.A00;
    }

    public final C007003k A03(AbstractC007503q r3) {
        AnonymousClass02N r1 = r3.A0n.A00;
        if (AnonymousClass1VY.A0Y(r1) || AnonymousClass1VY.A0b(r1)) {
            r1 = r3.A07();
        }
        if (r1 != null) {
            return this.A0T.A02(r1);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r17.A0Z.A04((com.whatsapp.jid.GroupJid) r20) == false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(long r18, X.AnonymousClass02N r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A04(long, X.02N, boolean):void");
    }

    public void A05(Activity activity, C02780Dk r9, AbstractC007503q r10) {
        File file;
        if (!(r10 instanceof AnonymousClass0M3)) {
            Log.w("app/share/message-is-not-media-message");
            this.A04.A06(this.A18.A01(), 0);
            return;
        }
        AnonymousClass0M3 r6 = (AnonymousClass0M3) r10;
        AnonymousClass0M4 r0 = r6.A02;
        if (r0 == null || (file = r0.A0F) == null || !file.exists()) {
            Log.w("app/share/media-does-not-exist");
            this.A04.A06(this.A18.A01(), 0);
            return;
        }
        AnonymousClass00T r5 = this.A1A;
        r5.ANF(new RunnableEBaseShape1S0200000_I0_0(this, r10, 34));
        WeakReference weakReference = new WeakReference(activity);
        AnonymousClass02M r4 = this.A04;
        r4.A05(0, R.string.loading_spinner);
        AnonymousClass009 r1 = this.A01;
        AnonymousClass0BW r02 = this.A0i;
        C39151r2 r3 = new C39151r2(this, weakReference, r9, r6);
        C60322pF r2 = new C60322pF(r1, r02, r6);
        ((C41191ud) r2).A01.A03(r3, r4.A06);
        r5.ANF(r2);
    }

    public void A06(ActivityC004702f r10, AnonymousClass0M3 r11, boolean z) {
        AnonymousClass00C r6 = this.A0J;
        if (r6.A09(new C56812jE(r6, r10))) {
            AnonymousClass1W7 r2 = null;
            if (z) {
                boolean z2 = r11 instanceof AnonymousClass0Z9;
                AnonymousClass02M r3 = this.A04;
                AnonymousClass00Y r4 = this.A0l;
                C014308b r5 = this.A0H;
                C007003k A032 = A03(r11);
                if (z2) {
                    r2 = new C60202oy(r3, r4, r5, r6, r10, A032);
                } else {
                    r2 = new C56772jA(r3, r4, r5, r6, r10, A032);
                }
            }
            this.A0s.A06(r11, 0, r2);
        }
    }

    public void A07(C40531tQ r7, byte[] bArr) {
        A08(r7, bArr, null, null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r0 != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C40531tQ r20, byte[] r21, X.AnonymousClass0M3 r22, X.AnonymousClass2T4 r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A08(X.1tQ, byte[], X.0M3, X.2T4, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, X.0Kb] */
    /* JADX WARN: Type inference failed for: r1v48, types: [X.0Z9, X.0M3] */
    /* JADX WARN: Type inference failed for: r1v50, types: [X.0MI, X.0M3] */
    /* JADX WARN: Type inference failed for: r1v52, types: [X.0Z9, X.0M3] */
    /* JADX WARN: Type inference failed for: r1v54, types: [X.0hj, X.0M3] */
    /* JADX WARN: Type inference failed for: r1v55, types: [X.0MI, X.0M3] */
    /* JADX WARN: Type inference failed for: r1v61, types: [X.0M3, X.0ZC] */
    /* JADX WARN: Type inference failed for: r1v62, types: [X.0M3, X.0ZC] */
    /* JADX WARN: Type inference failed for: r1v66, types: [X.0M3, X.0ZB] */
    /* JADX WARN: Type inference failed for: r1v67, types: [X.0M3, X.0ZB] */
    /* JADX WARN: Type inference failed for: r1v70, types: [X.0M2] */
    /* JADX WARN: Type inference failed for: r1v71, types: [X.0M2] */
    /* JADX WARN: Type inference failed for: r1v72, types: [X.0MP] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0227, code lost:
        if (X.AnonymousClass0FI.A0M(r2, r41) != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0229, code lost:
        r5 = ((long) r7.A06(X.AbstractC000400g.A2s)) * 1000;
        r1 = r41.A0E + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023a, code lost:
        if (r5 == 0) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023e, code lost:
        if (r12 >= r1) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0240, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0251, code lost:
        if (X.AnonymousClass0FI.A0t((X.AnonymousClass0ZC) r41) == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0270, code lost:
        if (r20 != false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0192, code lost:
        if (((X.AnonymousClass0M3) r41).A05 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c3, code lost:
        if (r2.A04 == null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f7, code lost:
        if (r1 == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fa, code lost:
        if (r15 != false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fc, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0206, code lost:
        if (android.text.TextUtils.isEmpty(((X.AnonymousClass0M3) r41).A09) == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0208, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0209, code lost:
        if (r14 == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020b, code lost:
        if (r5 == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020d, code lost:
        if (r1 == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020f, code lost:
        r2 = r39.A06;
        r12 = r39.A0L.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021b, code lost:
        if (X.AnonymousClass0FI.A0H(r1) != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0221, code lost:
        if (X.AnonymousClass0FI.A0F(r1) == false) goto L_0x0242;
     */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C04350Ka r40, X.AbstractC007503q r41, java.util.List r42) {
        /*
        // Method dump skipped, instructions count: 1538
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A09(X.0Ka, X.03q, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C48052Ks r19, java.util.List r20, com.whatsapp.jid.UserJid r21, android.net.Uri r22, X.AbstractC007503q r23) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A0A(X.2Ks, java.util.List, com.whatsapp.jid.UserJid, android.net.Uri, X.03q):void");
    }

    public void A0B(AnonymousClass02N r6) {
        if (r6 != null && !AnonymousClass1VY.A0T(r6) && !this.A06.A09(r6)) {
            boolean A092 = this.A07.A09(r6);
            AnonymousClass0CD r0 = this.A05;
            r0.A00.obtainMessage(1, A092 ? 1 : 0, 0, r0.A01(r6)).sendToTarget();
        }
    }

    public final void A0C(AnonymousClass02N r7) {
        AnonymousClass0BB r5 = this.A14;
        if (r5.A08(r7).A0E) {
            AnonymousClass0DH r4 = this.A0E;
            Set A062 = r4.A06(r7, false);
            r5.A0C(r7, false, 0);
            r4.A0J(A062);
        }
    }

    public void A0D(AnonymousClass02N r5, int i) {
        if (r5 != null && !AnonymousClass1VY.A0T(r5)) {
            if (AnonymousClass1VY.A0Y(r5)) {
                this.A07.A06(r5);
            }
            if (!this.A06.A09(r5)) {
                boolean A092 = this.A07.A09(r5);
                AnonymousClass0CD r0 = this.A05;
                r0.A00.obtainMessage(0, A092 ? 1 : 0, i, r0.A01(r5)).sendToTarget();
            }
        }
    }

    public void A0E(AnonymousClass02N r5, int i) {
        if (r5 != null) {
            PowerManager.WakeLock A022 = A02();
            if (A022 != null) {
                A022.acquire(30000);
            }
            if (!AnonymousClass1VY.A0T(r5)) {
                if (AnonymousClass1VY.A0Y(r5)) {
                    this.A07.A06(r5);
                }
                if (!this.A06.A09(r5)) {
                    AnonymousClass0CD r0 = this.A05;
                    r0.A00.obtainMessage(3, 0, i, r0.A01(r5)).sendToTarget();
                }
            }
        }
    }

    public void A0F(AnonymousClass02N r12, long j, boolean z, boolean z2) {
        A04(j, r12, z);
        AnonymousClass0DH r6 = this.A0E;
        long j2 = -1;
        if (j != -1) {
            AnonymousClass00S r2 = this.A0L;
            j2 = r2.A05() + (j - r2.A01());
        }
        Set A082 = r6.A08(r12, true, j2);
        if (this.A14.A0N(r12, j, z)) {
            r6.A0J(A082);
            if (z2) {
                this.A0z.A01(5, r12, j, 0);
                return;
            }
            return;
        }
        r6.A0I(A082);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04cd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ce, code lost:
        if (r13 != null) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04d3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r11 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x054a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x054b, code lost:
        if (r11 != null) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0550, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0553, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0557, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x055c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x055d, code lost:
        if (r2 != null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0562, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0565, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0569, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fd, code lost:
        if (r9 != null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0116, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0429 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass02N r32, java.lang.String r33, X.AnonymousClass1Xa r34, boolean r35) {
        /*
        // Method dump skipped, instructions count: 1448
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A0G(X.02N, java.lang.String, X.1Xa, boolean):void");
    }

    public void A0H(AnonymousClass02N r9, boolean z) {
        A04(0, r9, false);
        AnonymousClass0DH r2 = this.A0E;
        Set A082 = r2.A08(r9, false, 0);
        if (this.A14.A0M(r9)) {
            r2.A0J(A082);
            if (z) {
                this.A0z.A01(5, r9, 0, 0);
                return;
            }
            return;
        }
        r2.A0I(A082);
    }

    public void A0I(AnonymousClass02N r27, boolean z, boolean z2) {
        Set emptySet;
        this.A0k.A01(6, r27);
        C007003k A092 = this.A0F.A09(r27);
        AnonymousClass0FE r6 = this.A10;
        r6.A07(r27, null);
        if (z2) {
            AnonymousClass0DH r3 = this.A0E;
            AnonymousClass0DT r4 = r3.A0E;
            C51202Xt r5 = (C51202Xt) r4.A02("deleteChat");
            if (!r3.A0O(r5)) {
                emptySet = Collections.emptySet();
            } else if (!r3.A0K()) {
                emptySet = Collections.emptySet();
            } else {
                C52702bc r9 = new C52702bc(null, r27, z, r5.A01.A05(), null, false, C28191Tg.A02(r5.A03, r27, true));
                AnonymousClass0DU r32 = ((AnonymousClass0DZ) r5).A00;
                C52702bc r8 = (C52702bc) r32.A07(AbstractC48162Ld.A00(r9.A03()));
                if (!(r8 == null && (r8 = (C52702bc) r32.A08(AbstractC48162Ld.A00(r9.A03()))) == null)) {
                    AnonymousClass02N r7 = r8.A00;
                    boolean z3 = r8.A02;
                    long j = r9.A04;
                    C04820Ly A032 = C28191Tg.A03(r9.A01, r8.A01);
                    r9 = r17;
                    C52702bc r17 = new C52702bc(null, r7, z3, j, null, false, A032);
                }
                emptySet = r4.A03(Collections.singletonList(r9));
            }
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0W.A0F(r27, z);
        this.A0E.A0J(emptySet);
        if (A092 != null) {
            if (A092.A09() || AnonymousClass1VY.A0T(A092.A09)) {
                this.A0A.A07(A092);
            }
            this.A0A.A08(r27);
            AnonymousClass0BB r72 = this.A14;
            boolean A093 = A092.A09();
            AnonymousClass0BG A082 = r72.A08(r27);
            if (AnonymousClass0BB.A0Q && A082.A0H) {
                r72.A0L.A0G(r27.getRawString());
            }
            if (A093) {
                if (A082.A0H) {
                    A082.A01 = r72.A09.A01();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("deleted", Long.valueOf(A082.A01));
                    r72.A0A().A02().A00("settings", contentValues, "jid = ?", new String[]{r27.getRawString()}, "setChatDeleted/UPDATE_CHAT_SETTINGS");
                } else {
                    r72.A0O.remove(r27.getRawString());
                    r72.A0A().A02().A01("settings", "jid = ?", new String[]{r27.getRawString()}, "setChatDeleted/DELETE_CHAT_SETTINGS");
                }
            }
            A0C(r27);
            this.A0I.A03((AnonymousClass02N) A092.A02(AnonymousClass02N.class), true, true);
            r6.A04();
            if (A092.A08 == null || A092.A09() || AnonymousClass1VY.A0T(A092.A09)) {
                this.A02.A00.post(new RunnableEBaseShape1S0200000_I0_0(this, A092, 37));
            }
            if (z2) {
                this.A0z.A01(2, r27, 0, 0);
            }
        }
        if (AnonymousClass1VY.A0U(r27)) {
            AnonymousClass0AR r62 = this.A0y;
            RunnableC39421rV r33 = new RunnableC39421rV(this.A1B, this.A0U, (AnonymousClass0OP) r27);
            if (r62.A04.A06) {
                Log.i("sendmethods/sendDeleteBroadcastList");
                r62.A08.A09(Message.obtain(null, 0, 60, 0, r33));
            }
        }
        this.A0A.A04();
    }

    public void A0J(AnonymousClass02N r4, boolean z, boolean z2, boolean z3) {
        Set emptySet;
        this.A0k.A01(4, r4);
        C007003k A092 = this.A0F.A09(r4);
        if (z3) {
            emptySet = this.A0E.A09(r4, !z, z2);
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0W.A0G(r4, z, z2);
        this.A0E.A0J(emptySet);
        if (A092 != null && z3) {
            this.A0z.A0C(new AnonymousClass3L3(r4, !z), 0);
        }
    }

    public void A0K(AbstractC007503q r4) {
        AnonymousClass02N r2 = r4.A0n.A00;
        if (AnonymousClass1VY.A0b(r2)) {
            r4.A0Y(AnonymousClass02Z.A00);
        } else if (AnonymousClass1VY.A0T(r2)) {
            r4.A0f = true;
            C05340Od A012 = this.A0Z.A01((AnonymousClass02X) r2);
            r4.A0Z = this.A0T.A02(r2).A0F;
            ArrayList arrayList = new ArrayList(A012.A03().A02());
            AnonymousClass01I r0 = this.A06;
            r0.A04();
            arrayList.remove(r0.A03);
            r4.A0m(arrayList);
        }
    }

    public void A0L(AbstractC007503q r4) {
        byte b = r4.A0m;
        AnonymousClass00E.A07(!AnonymousClass0FI.A0F(b));
        AnonymousClass00E.A07(!AnonymousClass0FI.A0H(b));
        this.A0x.A03(r4, false, null);
        this.A0d.A06(r4, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r0 != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.AbstractC007503q r6, java.util.Collection r7, byte[] r8, java.lang.Runnable r9) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A0M(X.03q, java.util.Collection, byte[], java.lang.Runnable):void");
    }

    public void A0N(AbstractC02860Dt r15) {
        this.A1A.ANC(new C10240eJ(this.A0L, this.A01, this.A0W, this.A0d, this.A0e, this.A0m, this.A0N, this.A03, this.A0n, this.A0Z, r15), new Void[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.C29241Xq r20, X.AnonymousClass02N r21, X.AbstractC007503q r22, boolean r23, java.lang.Integer r24) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04360Kb.A0O(X.1Xq, X.02N, X.03q, boolean, java.lang.Integer):void");
    }

    public /* synthetic */ void A0P(WeakReference weakReference, C02780Dk r19, AnonymousClass0M3 r20, Uri uri) {
        String str;
        String obj;
        Intent intent;
        int i;
        this.A04.A02();
        if (weakReference.get() != null) {
            Context context = (Context) weakReference.get();
            boolean z = false;
            if (((AbstractC007503q) r20).A03 >= 127) {
                z = true;
            }
            AnonymousClass01X r6 = this.A0O;
            AnonymousClass01I r12 = this.A06;
            byte b = r20.A0m;
            if (b == 23) {
                str = ((AnonymousClass0Z9) r20).A07;
            } else if (b != 44) {
                if (b == 1) {
                    i = R.string.share_email_subject_image;
                } else if (b == 2) {
                    i = R.string.share_email_subject_audio;
                } else if (b == 3) {
                    i = R.string.share_email_subject_video;
                } else if (b != 9) {
                    i = R.string.share_email_subject_gif;
                    if (b != 13) {
                        i = R.string.share_email_subject_file;
                    }
                } else {
                    i = R.string.share_email_subject_document;
                }
                str = r6.A0D(i, r12.A02());
            } else {
                str = ((AnonymousClass0ZA) r20).A06;
            }
            if (b == 23) {
                AnonymousClass0Z9 r13 = (AnonymousClass0Z9) r20;
                StringBuilder A0S2 = AnonymousClass008.A0S(r6.A0D(R.string.share_email_body_item_link, String.format("%s/p/%s/%s", "https://wa.me", r13.A04, r13.A01.user)));
                BigDecimal bigDecimal = r13.A08;
                String str2 = "";
                String str3 = str2;
                if (bigDecimal != null) {
                    str3 = r6.A0D(R.string.share_email_body_item_price, new C05910Qz(r13.A02).A03(r6, bigDecimal, true));
                }
                A0S2.append(str3);
                String str4 = r13.A03;
                if (str4 != null && !TextUtils.isEmpty(str4)) {
                    str2 = r6.A0D(R.string.share_email_body_item_description, r13.A03);
                }
                A0S2.append(str2);
                obj = A0S2.toString();
            } else if (b != 44) {
                obj = r20.A0v();
            } else {
                obj = C59202nF.A04((AnonymousClass0ZA) r20, r6);
            }
            String A012 = A01(this.A01, r20);
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType(A012);
            if (!TextUtils.isEmpty(str)) {
                intent2.putExtra("android.intent.extra.SUBJECT", str);
            }
            if (!TextUtils.isEmpty(obj)) {
                intent2.putExtra("android.intent.extra.TEXT", obj);
            }
            intent2.putExtra("origin", 3);
            intent2.putExtra("android.intent.extra.STREAM", uri);
            if (Build.VERSION.SDK_INT >= 29 || !z) {
                intent = Intent.createChooser(intent2, null);
            } else {
                ArrayList arrayList = new ArrayList();
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str5 = activityInfo.name;
                        String str6 = activityInfo.applicationInfo.packageName;
                        Intent intent3 = new Intent(intent2);
                        intent3.setClassName(str6, str5);
                        intent3.setPackage(str6);
                        arrayList.add(intent3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Intent intent4 = (Intent) it.next();
                    if ("com.whatsapp".equals(intent4.getPackage()) || "com.whatsapp.w4b".equals(intent4.getPackage())) {
                        intent4.putExtra("enforce_hfm_limit", z);
                    }
                }
                intent = C002001d.A0S(arrayList, null, null);
            }
            intent.setFlags(1);
            r19.A05(context, intent);
        }
    }

    public void A0Q(Collection collection, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC007503q r2 = (AbstractC007503q) it.next();
            if (r2.A0m == 20) {
                AnonymousClass0ZE r22 = (AnonymousClass0ZE) r2;
                AnonymousClass0M4 r0 = ((AnonymousClass0M3) r22).A02;
                if (r0 != null && r0.A0P) {
                    arrayList.add(r22.A11());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            if (C003701u.A0D()) {
                this.A16.A0K(arrayList);
            } else {
                this.A16.A0L(arrayList, true);
            }
            if (z) {
                AnonymousClass02M r23 = this.A04;
                r23.A02.post(new RunnableEBaseShape1S0100000_I0_1(this, 37));
            }
        }
    }

    public void A0R(Collection collection, boolean z) {
        StringBuilder A0S2 = AnonymousClass008.A0S("useractions/userActionDeleteMessages ");
        A0S2.append(collection.size());
        Log.i(A0S2.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0c.A03(((AbstractC007503q) it.next()).A0n);
        }
        this.A0P.A01(new RunnableEBaseShape0S0210000_I0(this, collection, z, 1), 20);
    }

    public void A0S(Collection collection, boolean z) {
        long j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC007503q r3 = (AbstractC007503q) it.next();
            C007303n r2 = r3.A0n;
            if (r2.A02 && r3.A0m != 15) {
                AnonymousClass02N r4 = r2.A00;
                if (AnonymousClass1VY.A0b(r4)) {
                    C04380Kd r8 = this.A09;
                    if (r8 != null) {
                        AnonymousClass219 r22 = new AnonymousClass219();
                        AnonymousClass1Ny r0 = r8.A00;
                        if (r0 == null) {
                            j = 0;
                        } else {
                            j = r0.A05;
                        }
                        r22.A02 = Long.valueOf(j);
                        r22.A00 = Integer.valueOf(AnonymousClass0AH.A01(r3));
                        r22.A01 = Long.valueOf(r8.A03.A05() - r3.A0E);
                        r8.A04.A09(r22, 1);
                        AnonymousClass00Y.A01(r22, "");
                    } else {
                        throw null;
                    }
                }
                if (r3 instanceof AnonymousClass0ZF) {
                    AnonymousClass0ZF r10 = (AnonymousClass0ZF) r3;
                    if (this.A0L.A05() < r10.A00 * 1000 && !r10.A06) {
                        AnonymousClass0AR r23 = this.A0y;
                        AnonymousClass02U r1 = r10.A01;
                        if (r1 != null) {
                            r23.A01(r1, Collections.singletonList(r10.A0n.A00), null, null);
                        } else {
                            throw null;
                        }
                    }
                }
                AnonymousClass0A6 r02 = this.A12.A07;
                AnonymousClass0ZJ r42 = new AnonymousClass0ZJ(AnonymousClass0FI.A07(r02.A01, r02.A00, r4, true), r3);
                C02320Bn r32 = this.A0X;
                r32.A03.A01(new RunnableEBaseShape0S0210000_I0(r32, r42, z, 5), 31);
            }
        }
    }

    public void A0T(List list, String str, C27241Os r14, AbstractC007503q r15, List list2, boolean z, boolean z2) {
        A0U(list, str, r14, r15, list2, z, z2, null, null, null);
    }

    public void A0U(List list, String str, C27241Os r17, AbstractC007503q r18, List list2, boolean z, boolean z2, String str2, String str3, C05420Ol r24) {
        Log.d("useractions/userActionSendTextMessages");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass02N r7 = (AnonymousClass02N) it.next();
            C05490Ot A042 = this.A12.A04(r7, str, this.A0L.A05(), r17, list2, r18);
            if (r24 != null) {
                A042.A0H = r24;
                A042.A0O(1024);
            }
            A042.A0V = str2;
            A042.A0W = str3;
            A0K(A042);
            if (z) {
                A042.A0O(4);
            }
            if (z2) {
                A042.A0O(2);
            }
            if (AnonymousClass1VY.A0b(r7)) {
                TextData textData = new TextData();
                int[] iArr = C660232m.A01;
                textData.backgroundColor = iArr[Math.abs(C660232m.A00.nextInt()) % iArr.length];
                textData.textColor = -1;
                textData.fontStyle = 0;
                A042.A0v(textData);
                A042.A0d(C660232m.A02(A042.A0D()));
                this.A09.A04(A042, 0, 1);
            }
            this.A0W.A0J(A042);
        }
    }

    public void A0V(List list, String str, String str2, AbstractC007503q r27, boolean z) {
        AnonymousClass01X r1;
        String str3 = str;
        byte[] bArr = null;
        if (str2 != null) {
            try {
                bArr = str2.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        if (bArr != null) {
            long length = (long) bArr.length;
            C000300f r9 = this.A08;
            if (length > ((long) r9.A06(AbstractC000400g.A47)) * 1024) {
                this.A04.A0D(this.A0O.A08(R.plurals.contact_too_large, 1), 1);
                return;
            }
            long A062 = ((long) r9.A06(AbstractC000400g.A46)) * 1024;
            if (A062 > 0 && length > A062) {
                if (str == null && (str3 = AnonymousClass1Z4.A00(this.A0M, this.A0F, (r1 = this.A0O), this.A0D, str2)) == null) {
                    str3 = r1.A06(R.string.contact);
                }
                this.A1A.ANF(new RunnableEBaseShape0S1411000_I0(this, list, bArr, str3, 1, r27, z, 1));
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0AL r2 = this.A12;
            long A052 = this.A0L.A05();
            AnonymousClass0A6 r0 = r2.A07;
            C04830Lz r12 = new C04830Lz(AnonymousClass0FI.A07(r0.A01, r0.A00, (AnonymousClass02N) it.next(), true), A052, str2, str3);
            r2.A05(r12, r27);
            if (z) {
                r12.A0O(4);
            }
            A0K(r12);
            this.A0W.A0J(r12);
        }
    }

    public void A0W(List list, List list2, AbstractC007503q r31, boolean z) {
        String A062;
        String join = TextUtils.join("\n", list2);
        byte[] bArr = null;
        if (join != null) {
            try {
                bArr = join.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        char c = 0;
        if (bArr != null) {
            int length = bArr.length;
            int size = list2.size();
            long j = (long) length;
            C000300f r10 = this.A08;
            if (j > ((long) r10.A06(AbstractC000400g.A47)) * 1024) {
                this.A04.A0D(this.A0O.A08(R.plurals.contact_too_large, (long) size), 1);
                return;
            }
            long A063 = ((long) r10.A06(AbstractC000400g.A46)) * 1024;
            if (A063 > 0 && j > A063 && list2.size() > 0) {
                AnonymousClass00G r3 = this.A0M;
                AnonymousClass01A r2 = this.A0F;
                AnonymousClass01X r9 = this.A0O;
                C017009c r1 = this.A0D;
                int size2 = list2.size();
                String A002 = AnonymousClass1Z4.A00(r3, r2, r9, r1, (String) list2.get(0));
                if (A002 != null) {
                    int i = size2 - 1;
                    A062 = r9.A0A(R.plurals.contacts_array_title, (long) i, A002, Integer.valueOf(i));
                } else {
                    A062 = r9.A06(R.string.contacts);
                }
                this.A1A.ANF(new RunnableEBaseShape0S1411000_I0(this, list, bArr, A062, size, r31, z, 1));
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0AL r7 = this.A12;
            long A052 = this.A0L.A05();
            Object[] objArr = new Object[1];
            objArr[c] = Integer.valueOf(list2.size());
            String A0A2 = this.A0O.A0A(R.plurals.n_contacts_message_title, (long) list2.size(), objArr);
            AnonymousClass00G r5 = r7.A03;
            AnonymousClass01A r32 = r7.A02;
            AnonymousClass01X r22 = r7.A04;
            C017009c r0 = r7.A01;
            AnonymousClass0A6 r12 = r7.A07;
            AnonymousClass0M1 r13 = new AnonymousClass0M1(r5, r32, r22, r0, AnonymousClass0FI.A07(r12.A01, r12.A00, (AnonymousClass02N) it.next(), true), A052);
            r13.A00 = A0A2;
            r13.A0v(list2);
            r7.A05(r13, r31);
            if (z) {
                r13.A0O(4);
            }
            A0K(r13);
            this.A0W.A0J(r13);
            c = 0;
        }
    }
}
