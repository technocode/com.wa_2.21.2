package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.0Kh  reason: invalid class name and case insensitive filesystem */
public class C04420Kh {
    public static volatile C04420Kh A0J;
    public final AnonymousClass02M A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass0AH A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass0AC A05;
    public final AnonymousClass00Y A06;
    public final AnonymousClass0EJ A07;
    public final C04430Ki A08;
    public final AnonymousClass0FM A09;
    public final AnonymousClass0EK A0A;
    public final C02550Cn A0B;
    public final AnonymousClass0EL A0C;
    public final C04440Kj A0D;
    public final C04340Jz A0E;
    public final AnonymousClass00T A0F;
    public final Object A0G = new Object();
    public final WeakHashMap A0H = new WeakHashMap();
    public final Executor A0I;

    public C04420Kh(AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass01I r4, AnonymousClass00T r5, AnonymousClass00Y r6, AnonymousClass0EK r7, AnonymousClass0AH r8, C02550Cn r9, AnonymousClass0EJ r10, AnonymousClass01K r11, AnonymousClass0EL r12, AnonymousClass0AC r13, AnonymousClass0FM r14, C04340Jz r15, C04430Ki r16, C04440Kj r17) {
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A0F = r5;
        this.A06 = r6;
        this.A0A = r7;
        this.A02 = r8;
        this.A0B = r9;
        this.A07 = r10;
        this.A04 = r11;
        this.A0C = r12;
        this.A05 = r13;
        this.A09 = r14;
        this.A0E = r15;
        this.A08 = r16;
        this.A0D = r17;
        this.A0I = new ExecutorC03090Et(r3);
    }

    public static C04420Kh A00() {
        if (A0J == null) {
            synchronized (C04420Kh.class) {
                if (A0J == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k.A00();
                    C04370Kc.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass01I A004 = AnonymousClass01I.A00();
                    AnonymousClass00T A005 = C002101e.A00();
                    AnonymousClass00Y A006 = AnonymousClass00Y.A00();
                    AnonymousClass0EK A007 = AnonymousClass0EK.A00();
                    AnonymousClass01J.A00();
                    AnonymousClass0AH A032 = AnonymousClass0AH.A03();
                    C02550Cn A012 = C02550Cn.A01();
                    AnonymousClass0EJ A013 = AnonymousClass0EJ.A01();
                    AnonymousClass01K A008 = AnonymousClass01K.A00();
                    AnonymousClass0EL A009 = AnonymousClass0EL.A00();
                    AnonymousClass0AC r15 = AnonymousClass0AC.A00;
                    AnonymousClass0FM A0010 = AnonymousClass0FM.A00();
                    C04340Jz A0011 = C04340Jz.A00();
                    if (C04430Ki.A07 == null) {
                        synchronized (C04430Ki.class) {
                            if (C04430Ki.A07 == null) {
                                C04430Ki.A07 = new C04430Ki(C002701k.A00(), AnonymousClass01I.A00(), C02220Bc.A00(), C02450Cb.A00(), C02580Cq.A01(), AnonymousClass0AK.A00(), AnonymousClass0B3.A00());
                            }
                        }
                    }
                    C04430Ki r18 = C04430Ki.A07;
                    if (C04440Kj.A0D == null) {
                        synchronized (C04440Kj.class) {
                            if (C04440Kj.A0D == null) {
                                C04440Kj.A0D = new C04440Kj(AnonymousClass00G.A01, C04370Kc.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass01K.A00(), AnonymousClass0C5.A00(), C02800Dm.A00(), C04380Kd.A00(), C04340Jz.A00(), C04450Kk.A00());
                            }
                        }
                    }
                    A0J = new C04420Kh(A002, A003, A004, A005, A006, A007, A032, A012, A013, A008, A009, r15, A0010, A0011, r18, C04440Kj.A0D);
                }
            }
        }
        return A0J;
    }

    public final C40531tQ A01(AnonymousClass0M3 r6) {
        synchronized (this.A0G) {
            for (Map.Entry entry : this.A0H.entrySet()) {
                boolean z = false;
                if (((C40531tQ) entry.getKey()).A01(r6.A0n) != null) {
                    z = true;
                    continue;
                }
                if (z) {
                    return (C40531tQ) entry.getKey();
                }
            }
            return null;
        }
    }

    public C56862jJ A02(C40531tQ r3) {
        C56862jJ r0;
        synchronized (this.A0G) {
            r0 = (C56862jJ) this.A0H.get(r3);
        }
        return r0;
    }

    public final void A03(C40531tQ r3, C56862jJ r4) {
        synchronized (this.A0G) {
            if (r4 == null) {
                this.A0H.remove(r3);
            } else {
                this.A0H.put(r3, r4);
            }
        }
    }

    public void A04(C40531tQ r11, C50132Tn r12, AnonymousClass2T4 r13, AnonymousClass0M3 r14, boolean z, boolean z2, byte[] bArr) {
        C56862jJ r4;
        if (r14 == null || (r4 = A02(A01(r14))) == null) {
            r4 = (C56862jJ) r13;
        }
        this.A0I.execute(new RunnableEBaseShape3S0200000_I0_2(this, r11, 21));
        this.A0F.ANF(new RunnableC49862Sm(this, r4, r11, r12, z2, z, bArr));
    }

    public void A05(C56862jJ r5, C40531tQ r6) {
        StringBuilder sb = new StringBuilder("mediajobmanager/attach/job=");
        sb.append(r5);
        sb.append("; messages=");
        sb.append(r6.A02());
        Log.d(sb.toString());
        A03(r6, r5);
        r5.A0S = "mms";
        C56462if r1 = new C56462if(this, r6, r5);
        Executor executor = this.A0I;
        r5.A08.A03(r1, executor);
        r5.A06.A03(new C56452ie(this, r6), null);
        r5.A07.A03(new C56432ic(this, r6, r5), null);
        r5.A0B.A03(new C56602it(this, r6, r5), executor);
        r5.A0A.A03(new C56492ii(this, r6, r5), executor);
        r5.A0C.A03(new C56512ik(this, r6, r5), null);
        r5.A0E.A03(new C56472ig(this, r6, r5), executor);
        r5.A0F.A03(new C56612iu(this, r6, r5), executor);
        r5.A05.A03(new C56422ib(this, r6, r5), null);
        r5.A09.A03(new C56482ih(this, r6, r5), executor);
    }

    public final void A06(C56862jJ r4, C40531tQ r5) {
        StringBuilder sb = new StringBuilder("mediajobmanager/reupload/attach/job=");
        sb.append(r4);
        sb.append("; messages=");
        sb.append(r5.A02());
        Log.d(sb.toString());
        A03(r5, r4);
        r4.A0S = "mms";
        r4.A09.A03(new C56482ih(this, r5, r4), this.A0I);
    }

    public void A07(AbstractC007503q r5, boolean z) {
        if (!(r5 instanceof AnonymousClass0M3)) {
            StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/cancelmessage; attempt to cancel non-media message: ");
            A0S.append(r5.A0n);
            Log.e(A0S.toString());
        } else if (C12080hW.A00(r5.A08, 2) >= 0) {
            StringBuilder A0S2 = AnonymousClass008.A0S("mediajobmanager/cancelmessage; attempt to cancel uploaded message: ");
            A0S2.append(r5.A0n);
            Log.e(A0S2.toString());
            if (z) {
                this.A00.A06(R.string.file_uploaded, 0);
            }
        } else {
            StringBuilder A0S3 = AnonymousClass008.A0S("mediajobmanager/cancelmessage: ");
            A0S3.append(r5.A0n);
            Log.e(A0S3.toString());
            AnonymousClass0M3 r1 = (AnonymousClass0M3) r5;
            this.A0E.A02(r5);
            C60592pm r3 = new C60592pm(this, Collections.singletonList(r1));
            this.A0F.ANF(r3);
            ((C41191ud) r3).A01.A03(new C56522il(this, r1), this.A0I);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r1 == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.AnonymousClass0M3 r6) {
        /*
            r5 = this;
            X.0M4 r0 = r6.A02
            r4 = 1
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x000a
            return r4
        L_0x000a:
            X.1tQ r0 = r5.A01(r6)
            X.2jJ r3 = r5.A02(r0)
            if (r3 == 0) goto L_0x0056
            X.0EJ r0 = r5.A07
            X.0Ed r2 = r0.A0B
            X.2TT r0 = r3.A02()
            X.1XO r1 = r0.A05
            X.0Ek r0 = r2.A04
            X.0Eq r1 = r0.A00(r1)
            monitor-enter(r1)
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0053 }
            X.2is r0 = (X.RunnableC56592is) r0     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0032
            java.lang.Runnable r2 = r0.A02     // Catch:{ all -> 0x0053 }
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            monitor-exit(r1)
            X.2jl r2 = (X.AbstractRunnableC57132jl) r2
            if (r2 == 0) goto L_0x0056
            monitor-enter(r2)
            X.2TS r1 = r2.A00     // Catch:{ all -> 0x0050 }
            monitor-enter(r1)     // Catch:{ all -> 0x0050 }
            X.0JH r0 = r1.A00     // Catch:{ all -> 0x004d }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0048
            boolean r1 = r0.AAL()
            r0 = 1
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0056
            return r4
        L_0x004d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0050:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0056:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04420Kh.A08(X.0M3):boolean");
    }

    public boolean A09(AnonymousClass0M3 r4) {
        boolean containsKey;
        C56862jJ A022 = A02(A01(r4));
        if (A022 != null) {
            AnonymousClass0EL r2 = this.A07.A0F;
            synchronized (r2) {
                containsKey = r2.A01.containsKey(A022);
            }
            return containsKey;
        }
    }
}
