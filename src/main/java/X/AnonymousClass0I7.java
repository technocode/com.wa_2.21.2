package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0I7  reason: invalid class name */
public class AnonymousClass0I7 implements AnonymousClass0DJ {
    public static volatile AnonymousClass0I7 A0U;
    public Handler A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass01I A03;
    public final AnonymousClass09K A04;
    public final AnonymousClass0IS A05;
    public final C017009c A06;
    public final C017109d A07;
    public final AnonymousClass01A A08;
    public final AnonymousClass08B A09;
    public final C014308b A0A;
    public final AnonymousClass0IL A0B;
    public final AnonymousClass0IR A0C;
    public final AnonymousClass0IB A0D;
    public final AnonymousClass0IQ A0E;
    public final AnonymousClass0IV A0F;
    public final AnonymousClass0IU A0G;
    public final AnonymousClass00C A0H;
    public final AnonymousClass04j A0I;
    public final AnonymousClass03P A0J;
    public final AnonymousClass00G A0K;
    public final AnonymousClass03S A0L;
    public final AnonymousClass01Q A0M;
    public final AnonymousClass01L A0N;
    public final C02040Ak A0O;
    public final C014708f A0P;
    public final AnonymousClass02H A0Q;
    public final AnonymousClass0Fh A0R;
    public final Runnable A0S;
    public final AtomicBoolean A0T = new AtomicBoolean(false);

    public AnonymousClass0I7(AnonymousClass00G r6, AnonymousClass02M r7, AnonymousClass009 r8, AnonymousClass01I r9, AnonymousClass00T r10, AnonymousClass0Fh r11, AnonymousClass01A r12, AnonymousClass03P r13, C014308b r14, AnonymousClass08B r15, AnonymousClass09K r16, AnonymousClass00C r17, AnonymousClass01L r18, AnonymousClass08C r19, AnonymousClass04j r20, AnonymousClass03S r21, C017109d r22, AnonymousClass01Q r23, C02040Ak r24, C017009c r25, C014708f r26, AnonymousClass0IB r27, AnonymousClass0EU r28, AnonymousClass0IL r29, AnonymousClass0IQ r30, AnonymousClass0IR r31, AnonymousClass0IS r32) {
        this.A0K = r6;
        this.A02 = r7;
        this.A01 = r8;
        this.A03 = r9;
        this.A0R = r11;
        this.A08 = r12;
        this.A0J = r13;
        this.A0A = r14;
        this.A09 = r15;
        this.A04 = r16;
        this.A0H = r17;
        this.A0N = r18;
        this.A0E = r30;
        this.A0I = r20;
        this.A0L = r21;
        this.A07 = r22;
        this.A0M = r23;
        this.A0O = r24;
        this.A06 = r25;
        this.A0P = r26;
        this.A0D = r27;
        this.A0B = r29;
        this.A0C = r31;
        this.A05 = r32;
        this.A0S = new RunnableEBaseShape2S0100000_I0_2(r19, 29);
        this.A0Q = new AnonymousClass02H(r10, false);
        this.A0G = new AnonymousClass0IU(r27);
        this.A0F = new AnonymousClass0IV();
        r28.A00(this);
    }

    public static AnonymousClass0I7 A00() {
        if (A0U == null) {
            synchronized (AnonymousClass0I7.class) {
                if (A0U == null) {
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass009 A004 = AnonymousClass009.A00();
                    AnonymousClass01I A005 = AnonymousClass01I.A00();
                    AnonymousClass00T A006 = C002101e.A00();
                    AnonymousClass00Y A007 = AnonymousClass00Y.A00();
                    AnonymousClass0DH A008 = AnonymousClass0DH.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    AnonymousClass0Fh A009 = AnonymousClass0Fh.A00();
                    AnonymousClass01A A0010 = AnonymousClass01A.A00();
                    AnonymousClass03P A0011 = AnonymousClass03P.A00();
                    AnonymousClass01X A0012 = AnonymousClass01X.A00();
                    C014308b A0013 = C014308b.A00();
                    C01970Ad A0014 = C01970Ad.A00();
                    AnonymousClass08B r13 = AnonymousClass08B.A00;
                    AnonymousClass09K r14 = AnonymousClass09K.A07;
                    AnonymousClass00C A0015 = AnonymousClass00C.A00();
                    AnonymousClass01L A0016 = AnonymousClass01L.A00();
                    AnonymousClass08C A0017 = AnonymousClass08C.A00();
                    AnonymousClass04j A0018 = AnonymousClass04j.A00();
                    AnonymousClass01P A0019 = AnonymousClass01P.A00();
                    AnonymousClass03S A0020 = AnonymousClass03S.A00();
                    AnonymousClass00D A0021 = AnonymousClass00D.A00();
                    C017109d A0022 = C017109d.A00();
                    AnonymousClass01Q A0023 = AnonymousClass01Q.A00();
                    AnonymousClass0I8 A013 = AnonymousClass0I8.A01();
                    C02040Ak A0024 = C02040Ak.A00();
                    AnonymousClass0I9 A0025 = AnonymousClass0I9.A00();
                    C017009c A0026 = C017009c.A00();
                    AnonymousClass0IC A0027 = AnonymousClass0IC.A00();
                    C014708f A0028 = C014708f.A00();
                    AnonymousClass022 A0029 = AnonymousClass022.A00();
                    AnonymousClass0IB A0030 = AnonymousClass0IB.A00();
                    A0U = new AnonymousClass0I7(r4, A003, A004, A005, A006, A009, A0010, A0011, A0013, r13, r14, A0015, A0016, A0017, A0018, A0020, A0022, A0023, A0024, A0026, A0028, A0030, AnonymousClass0EU.A03, new AnonymousClass0IL(r4, A002, A004, A008, A012, new AnonymousClass0IK(r4), A0011, A0012, A0014, A0016, A0019, A0020, A0021, A0023, A013, A0024, A0025, A0027, A0030), new AnonymousClass0IQ(A007), new AnonymousClass0IR(), new AnonymousClass0IS(A005, A006, A0012, A0020, A0021, A0029));
                }
            }
        }
        return A0U;
    }

    public static Collection A01(AnonymousClass0I7 r4, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C007003k A092 = r4.A08.A09((AnonymousClass02N) it.next());
            if (A092 != null) {
                arrayList.add(A092);
            }
        }
        return arrayList;
    }

    public final synchronized Handler A02() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("sync", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        if (r2.A01 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r2.A07 == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bc, code lost:
        if (r2.A08 == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        if (r2.A06 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ec, code lost:
        if (r2.A0A != false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r2.A0D != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0100, code lost:
        if (r2.A0E != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010a, code lost:
        if (r2.A09 != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0114, code lost:
        if (r2.A0B != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x011f, code lost:
        if (r2.A0C != false) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass0I0 r19) {
        /*
        // Method dump skipped, instructions count: 645
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0I7.A03(X.0I0):void");
    }

    @Override // X.AnonymousClass0DJ
    public void ADz(boolean z) {
        if (z) {
            this.A0Q.execute(new RunnableEBaseShape2S0100000_I0_2(this, 31));
        }
    }
}
