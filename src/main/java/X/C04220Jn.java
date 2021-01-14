package X;

import android.app.ActivityManager;
import android.text.TextUtils;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Jn  reason: invalid class name and case insensitive filesystem */
public final class C04220Jn extends AnonymousClass019 {
    public static volatile C04220Jn A0f;
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0EW A02;
    public final C04250Jq A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass0I5 A05;
    public final AnonymousClass09G A06;
    public final AnonymousClass0B3 A07;
    public final AnonymousClass01A A08;
    public final AnonymousClass08B A09;
    public final AnonymousClass0JS A0A;
    public final C03270Fn A0B;
    public final AnonymousClass00G A0C;
    public final AnonymousClass00D A0D;
    public final AnonymousClass09A A0E;
    public final AnonymousClass0AQ A0F;
    public final AnonymousClass01K A0G;
    public final C02090Ap A0H;
    public final AnonymousClass0CF A0I;
    public final AnonymousClass0ET A0J;
    public final AnonymousClass01S A0K;
    public final AnonymousClass0FM A0L;
    public final AnonymousClass0JN A0M;
    public final AnonymousClass0CH A0N;
    public final AnonymousClass0K7 A0O;
    public final C04310Jw A0P;
    public final C04340Jz A0Q;
    public final C03160Fa A0R;
    public final AnonymousClass0FZ A0S;
    public final AnonymousClass0AR A0T;
    public final AnonymousClass0IA A0U;
    public final AnonymousClass0K1 A0V;
    public final AnonymousClass0K0 A0W;
    public final C02360Br A0X;
    public final AnonymousClass0FE A0Y;
    public final AnonymousClass0AL A0Z;
    public final C04230Jo A0a;
    public final C04260Jr A0b;
    public final C02220Bc A0c;
    public final AnonymousClass00T A0d;
    public final C02400Bv A0e;

    public C04220Jn(AnonymousClass00G r2, AnonymousClass01I r3, AnonymousClass00T r4, C02400Bv r5, AnonymousClass0AR r6, AnonymousClass09G r7, AnonymousClass01A r8, C02220Bc r9, C03160Fa r10, C04230Jo r11, C02360Br r12, AnonymousClass0EW r13, AnonymousClass0AL r14, C04250Jq r15, AnonymousClass0I5 r16, AnonymousClass0CF r17, C04260Jr r18, AnonymousClass08B r19, AnonymousClass01K r20, AnonymousClass0ET r21, AnonymousClass0JN r22, C03270Fn r23, AnonymousClass09A r24, C02090Ap r25, AnonymousClass0FZ r26, AnonymousClass0FM r27, AnonymousClass0FE r28, AnonymousClass00D r29, AnonymousClass0CH r30, C04310Jw r31, C04340Jz r32, AnonymousClass0K7 r33, AnonymousClass0IA r34, AnonymousClass0K0 r35, AnonymousClass01S r36, AnonymousClass0AQ r37, AnonymousClass0B3 r38, AnonymousClass0K1 r39, AnonymousClass0JS r40) {
        this.A0C = r2;
        this.A04 = r3;
        this.A0d = r4;
        this.A0e = r5;
        this.A0T = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A0c = r9;
        this.A0R = r10;
        this.A0a = r11;
        this.A0X = r12;
        this.A02 = r13;
        this.A0Z = r14;
        this.A03 = r15;
        this.A05 = r16;
        this.A0I = r17;
        this.A0b = r18;
        this.A09 = r19;
        this.A0G = r20;
        this.A0J = r21;
        this.A0M = r22;
        this.A0B = r23;
        this.A0E = r24;
        this.A0H = r25;
        this.A0S = r26;
        this.A0L = r27;
        this.A0Y = r28;
        this.A0D = r29;
        this.A0N = r30;
        this.A0P = r31;
        this.A0Q = r32;
        this.A0O = r33;
        this.A0U = r34;
        this.A0W = r35;
        this.A0K = r36;
        this.A0F = r37;
        this.A07 = r38;
        this.A0V = r39;
        this.A0A = r40;
    }

    public static C04220Jn A00() {
        if (A0f == null) {
            synchronized (C04220Jn.class) {
                if (A0f == null) {
                    AnonymousClass00G r7 = AnonymousClass00G.A01;
                    AnonymousClass01I A002 = AnonymousClass01I.A00();
                    AnonymousClass00T A003 = C002101e.A00();
                    C02400Bv A004 = C02400Bv.A00();
                    AnonymousClass0AR A005 = AnonymousClass0AR.A00();
                    AnonymousClass09G A006 = AnonymousClass09G.A00();
                    AnonymousClass01A A007 = AnonymousClass01A.A00();
                    C02220Bc A008 = C02220Bc.A00();
                    C03160Fa A009 = C03160Fa.A00();
                    C04230Jo A0010 = C04230Jo.A00();
                    C02360Br A0011 = C02360Br.A00();
                    AnonymousClass0EW r18 = AnonymousClass0EW.A01;
                    AnonymousClass0AL A012 = AnonymousClass0AL.A01();
                    C04250Jq r20 = C04250Jq.A03;
                    AnonymousClass0I5 A0012 = AnonymousClass0I5.A00();
                    AnonymousClass0CF A0013 = AnonymousClass0CF.A00();
                    C04260Jr A0014 = C04260Jr.A00();
                    AnonymousClass08B r24 = AnonymousClass08B.A00;
                    AnonymousClass01K A0015 = AnonymousClass01K.A00();
                    AnonymousClass0ET A0016 = AnonymousClass0ET.A00();
                    AnonymousClass0JN A0017 = AnonymousClass0JN.A00();
                    C03270Fn A0018 = C03270Fn.A00();
                    AnonymousClass09A r29 = AnonymousClass09A.A02;
                    C02090Ap A0019 = C02090Ap.A00();
                    AnonymousClass0FZ A0020 = AnonymousClass0FZ.A00();
                    AnonymousClass0FM A0021 = AnonymousClass0FM.A00();
                    AnonymousClass0FE A0022 = AnonymousClass0FE.A00();
                    AnonymousClass00D A0023 = AnonymousClass00D.A00();
                    AnonymousClass0CH A0024 = AnonymousClass0CH.A00();
                    if (C04310Jw.A02 == null) {
                        synchronized (C04310Jw.class) {
                            if (C04310Jw.A02 == null) {
                                AnonymousClass00Y A0025 = AnonymousClass00Y.A00();
                                if (C04320Jx.A01 == null) {
                                    synchronized (C04320Jx.class) {
                                        if (C04320Jx.A01 == null) {
                                            C04320Jx.A01 = new C04320Jx(C04330Jy.A00());
                                        }
                                    }
                                }
                                C04310Jw.A02 = new C04310Jw(A0025, C04320Jx.A01);
                            }
                        }
                    }
                    A0f = new C04220Jn(r7, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, r18, A012, r20, A0012, A0013, A0014, r24, A0015, A0016, A0017, A0018, r29, A0019, A0020, A0021, A0022, A0023, A0024, C04310Jw.A02, C04340Jz.A00(), AnonymousClass0K7.A00(), AnonymousClass0IA.A00(), AnonymousClass0K0.A00(), AnonymousClass01S.A00(), AnonymousClass0AQ.A00(), AnonymousClass0B3.A00(), AnonymousClass0K1.A00(), AnonymousClass0JS.A00());
                }
            }
        }
        return A0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011c, code lost:
        if (r16.A00 == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e6, code lost:
        if (r16.A00 == false) goto L_0x01e8;
     */
    @Override // X.AnonymousClass019
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AbstractC007503q r17, int r18) {
        /*
        // Method dump skipped, instructions count: 1105
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04220Jn.A03(X.03q, int):void");
    }

    public final void A04(long j) {
        C04250Jq r3 = this.A03;
        if (!r3.A02 && j > 900000 && this.A0R.A0H()) {
            RegistrationIntentService.A00(this.A0C.A00);
            C03270Fn r0 = this.A0B;
            if (r0 != null) {
                try {
                    ActivityManager A012 = r0.A00.A01();
                    if (A012 == null) {
                        Log.i("app/logprocess am=null");
                    } else {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A012.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (TextUtils.equals(next.processName, "com.google.process.gapps")) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("app/logprocess/procinfo ");
                                    sb.append(next.processName);
                                    sb.append(' ');
                                    sb.append(next.pid);
                                    Log.i(sb.toString());
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.w("app/logprocess/error", e);
                }
                r3.A02 = true;
                return;
            }
            throw null;
        }
    }

    public final void A05(AbstractC007503q r6) {
        AnonymousClass0ZE r4 = (AnonymousClass0ZE) r6.A09();
        if (r4 != null) {
            AnonymousClass01K r0 = this.A0G;
            AbstractC007503q A052 = r0.A0J.A05(r4.A0n);
            if (A052 == null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("mainmessageobserver/downloadQuotedMessageForSticker/downloading quoted message, parent message");
                A0S2.append(r6.A0n);
                Log.d(A0S2.toString());
                this.A0M.A02(r4, 1, new C40261su(this, r6), false);
            } else if (A052 instanceof AnonymousClass0M3) {
                C60602pn A022 = this.A0N.A02((AnonymousClass0M3) A052);
                if (A022 != null) {
                    A022.A1j(new C40271sv(this, r4, r6));
                } else {
                    Log.e("MainMessageObserver/downloadQuotedMessageForSticker original downloader is null");
                }
            } else {
                StringBuilder A0S3 = AnonymousClass008.A0S("MainMessageObserver/downloadQuotedMessageForSticker originalMessage not mediaMessage: ");
                A0S3.append(A052.getClass().getName());
                Log.e(A0S3.toString());
            }
        }
    }
}
