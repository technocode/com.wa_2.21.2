package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.25N  reason: invalid class name */
public final class AnonymousClass25N implements AbstractC34191i3, AbstractC229213s, Handler.Callback, AnonymousClass11v, AnonymousClass12I {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public AnonymousClass123 A04;
    public AnonymousClass12E A05;
    public AnonymousClass12O A06;
    public AbstractC229313t A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = false;
    public AbstractC33821hR[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final C33801hP A0G;
    public final AnonymousClass122 A0H;
    public final AnonymousClass129 A0I;
    public final AnonymousClass12C A0J;
    public final AnonymousClass12P A0K;
    public final AnonymousClass12Q A0L;
    public final AbstractC232314x A0M;
    public final C232414y A0N;
    public final AnonymousClass15B A0O;
    public final AnonymousClass15Y A0P;
    public final C234315u A0Q;
    public final ArrayList A0R;
    public final AnonymousClass25L[] A0S;
    public final AbstractC33821hR[] A0T;

    public AnonymousClass25N(AbstractC33821hR[] r6, AbstractC232314x r7, C232414y r8, AnonymousClass129 r9, AnonymousClass15B r10, Handler handler, AnonymousClass15Y r12) {
        this.A0T = r6;
        this.A0M = r7;
        this.A0N = r8;
        this.A0I = r9;
        this.A0O = r10;
        this.A0E = handler;
        this.A0P = r12;
        this.A0J = new AnonymousClass12C();
        this.A0D = ((C33791hO) r9).A03;
        this.A06 = AnonymousClass12O.A02;
        this.A05 = AnonymousClass12E.A00(-9223372036854775807L, r8);
        this.A0H = new AnonymousClass122();
        int length = r6.length;
        AnonymousClass25L[] r3 = new AnonymousClass25L[length];
        this.A0S = r3;
        for (int i = 0; i < length; i++) {
            AbstractC33821hR r0 = r6[i];
            r0.AOM(i);
            r3[i] = r0.A5C();
        }
        this.A0G = new C33801hP(this, r12);
        this.A0R = new ArrayList();
        this.A0C = new AbstractC33821hR[0];
        this.A0L = new AnonymousClass12Q();
        this.A0K = new AnonymousClass12P();
        r7.A00 = r10;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = r12.A3K(this.A0F.getLooper(), this);
    }

    public static final void A00(AnonymousClass12K r4) {
        synchronized (r4) {
        }
        try {
            r4.A0A.AA7(r4.A00, r4.A04);
        } finally {
            r4.A01(true);
        }
    }

    public final long A01() {
        long j = this.A05.A0A;
        AnonymousClass12A r0 = this.A0J.A04;
        if (r0 == null) {
            return 0;
        }
        return j - (this.A03 - r0.A00);
    }

    public final long A02(C229113r r9, long j, boolean z) {
        A0A();
        this.A09 = false;
        A0C(2);
        AnonymousClass12C r7 = this.A0J;
        AnonymousClass12A r1 = r7.A05;
        AnonymousClass12A r5 = r1;
        while (true) {
            if (r5 == null) {
                break;
            }
            if (r9.equals(r5.A02.A03) && r5.A07) {
                r7.A08(r5);
                break;
            }
            r5 = r7.A00();
        }
        if (r1 != r5 || z) {
            for (AbstractC33821hR r0 : this.A0C) {
                A0G(r0);
            }
            this.A0C = new AbstractC33821hR[0];
            r1 = null;
        }
        if (r5 != null) {
            A0E(r1);
            if (r5.A06) {
                AbstractC34201i4 r2 = r5.A08;
                j = r2.ANY(j);
                r2.A3j(j - this.A0D, false);
            }
            A0D(j);
            A06();
        } else {
            r7.A06(true);
            this.A05 = this.A05.A03(AnonymousClass14A.A03, this.A0N);
            A0D(j);
        }
        A0I(false);
        this.A0Q.A00.sendEmptyMessage(2);
        return j;
    }

    public final Pair A03(AnonymousClass123 r14) {
        AnonymousClass12R r4 = this.A05.A03;
        AnonymousClass12R r5 = r14.A02;
        if (r4.A0D()) {
            return null;
        }
        if (r5.A0D()) {
            r5 = r4;
        }
        try {
            AnonymousClass12Q r6 = this.A0L;
            AnonymousClass12P r7 = this.A0K;
            Pair A072 = r5.A07(r6, r7, r14.A00, r14.A01, 0);
            if (r4 == r5 || r4.A04(A072.first) != -1) {
                return A072;
            }
            if (A05(A072.first, r5, r4) != null) {
                return A04(r4, r4.A08(-1, r7, false).A00);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new AnonymousClass128(r4, r14.A00, r14.A01);
        }
    }

    public final Pair A04(AnonymousClass12R r9, int i) {
        return r9.A07(this.A0L, this.A0K, i, -9223372036854775807L, 0);
    }

    public final Object A05(Object obj, AnonymousClass12R r12, AnonymousClass12R r13) {
        int A042 = r12.A04(obj);
        int A002 = r12.A00();
        int i = -1;
        for (int i2 = 0; i2 < A002 && i == -1; i2++) {
            A042 = r12.A03(A042, this.A0K, this.A0L, this.A02, this.A0B);
            if (A042 == -1) {
                return null;
            }
            i = r13.A04(r12.A0C(A042));
        }
        if (i != -1) {
            return r13.A0C(i);
        }
        return null;
    }

    public final void A06() {
        long A7f;
        int i;
        AnonymousClass12C r3 = this.A0J;
        AnonymousClass12A r4 = r3.A04;
        long j = 0;
        if (!r4.A07) {
            A7f = 0;
        } else {
            A7f = r4.A08.A7f();
        }
        boolean z = false;
        if (A7f == Long.MIN_VALUE) {
            A0K(false);
            return;
        }
        AnonymousClass12A r0 = r3.A04;
        if (r0 != null) {
            j = A7f - (this.A03 - r0.A00);
        }
        AnonymousClass129 r5 = this.A0I;
        float f = this.A0G.A8Q().A01;
        C33791hO r52 = (C33791hO) r5;
        AnonymousClass15H r2 = r52.A08;
        synchronized (r2) {
            i = r2.A00 * r2.A04;
        }
        boolean z2 = false;
        if (i >= r52.A00) {
            z2 = true;
        }
        long j2 = r52.A07;
        if (f > 1.0f) {
            if (f != 1.0f) {
                j2 = Math.round(((double) j2) * ((double) f));
            }
            j2 = Math.min(j2, r52.A06);
        }
        if (j < j2) {
            if (r52.A09 || !z2) {
                z = true;
            }
            r52.A01 = z;
        } else if (j >= r52.A06 || z2) {
            r52.A01 = false;
        }
        boolean z3 = r52.A01;
        A0K(z3);
        if (z3) {
            r4.A08.A32(this.A03 - r4.A00);
        }
    }

    public final void A07() {
        int i;
        AnonymousClass122 r5 = this.A0H;
        AnonymousClass12E r4 = this.A05;
        if (r4 != r5.A02 || r5.A01 > 0 || r5.A03) {
            Handler handler = this.A0E;
            int i2 = r5.A01;
            if (r5.A03) {
                i = r5.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, r4).sendToTarget();
            r5.A02 = this.A05;
            r5.A01 = 0;
            r5.A03 = false;
        }
    }

    public final void A08() {
        AnonymousClass12C r0 = this.A0J;
        AnonymousClass12A r4 = r0.A04;
        AnonymousClass12A r1 = r0.A06;
        if (!(r4 == null || r4.A07)) {
            if (r1 == null || r1.A01 == r4) {
                for (AbstractC33821hR r02 : this.A0C) {
                    if (!r02.AAM()) {
                        return;
                    }
                }
                r4.A08.AC5();
            }
        }
    }

    public final void A09() {
        this.A09 = false;
        C34501ia r2 = this.A0G.A03;
        if (!r2.A03) {
            r2.A00 = r2.A04.A3z();
            r2.A03 = true;
        }
        for (AbstractC33821hR r0 : this.A0C) {
            r0.start();
        }
    }

    public final void A0A() {
        C34501ia r2 = this.A0G.A03;
        if (r2.A03) {
            r2.A00(r2.A8V());
            r2.A03 = false;
        }
        AbstractC33821hR[] r4 = this.A0C;
        for (AbstractC33821hR r22 : r4) {
            if (r22.A9B() == 2) {
                r22.stop();
            }
        }
    }

    public final void A0B() {
        boolean z;
        long A8V;
        int i;
        AnonymousClass12C r4 = this.A0J;
        AnonymousClass12A r1 = r4.A05;
        if (r1 != null) {
            long AMN = r1.A08.AMN();
            if (AMN != -9223372036854775807L) {
                A0D(AMN);
                if (AMN != this.A05.A0B) {
                    AnonymousClass12E r5 = this.A05;
                    this.A05 = r5.A02(r5.A05, AMN, r5.A01, A01());
                    this.A0H.A00(4);
                }
            } else {
                C33801hP r2 = this.A0G;
                AbstractC33821hR r0 = r2.A00;
                if (r0 == null || r0.AB1() || (!r2.A00.ABS() && r2.A00.AAM())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    r2.A00();
                    A8V = r2.A01.A8V();
                } else {
                    A8V = r2.A03.A8V();
                }
                this.A03 = A8V;
                long j = A8V - r1.A00;
                long j2 = this.A05.A0B;
                ArrayList arrayList = this.A0R;
                if (!arrayList.isEmpty()) {
                    AnonymousClass12E r10 = this.A05;
                    C229113r r9 = r10.A05;
                    if (!r9.A00()) {
                        if (r10.A02 == j2) {
                            j2--;
                        }
                        int A042 = r10.A03.A04(r9.A04);
                        int i2 = this.A00;
                        if (i2 > 0) {
                            AnonymousClass121 r12 = (AnonymousClass121) arrayList.get(i2 - 1);
                            while (r12 != null) {
                                int i3 = r12.A00;
                                if (i3 <= A042 && (i3 != A042 || r12.A01 <= j2)) {
                                    break;
                                }
                                i2--;
                                this.A00 = i2;
                                if (i2 <= 0) {
                                    break;
                                }
                                r12 = (AnonymousClass121) arrayList.get(i2 - 1);
                            }
                        }
                        if (i2 < arrayList.size()) {
                            AnonymousClass121 r102 = (AnonymousClass121) arrayList.get(i2);
                            while (true) {
                                if (r102 != null) {
                                    if (r102.A02 != null && ((i = r102.A00) < A042 || (i == A042 && r102.A01 <= j2))) {
                                        i2++;
                                        this.A00 = i2;
                                        if (i2 >= arrayList.size()) {
                                            break;
                                        }
                                        r102 = (AnonymousClass121) arrayList.get(i2);
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (r102.A02 != null && r102.A00 == A042) {
                                long j3 = r102.A01;
                                if (j3 <= j2 || j3 > j) {
                                    break;
                                }
                                A0F(r102.A03);
                                int i4 = this.A00;
                                arrayList.remove(i4);
                                if (i4 < arrayList.size()) {
                                    r102 = (AnonymousClass121) arrayList.get(i4);
                                    if (r102 == null) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                this.A05.A0B = j;
            }
            this.A05.A0A = r4.A04.A00();
            this.A05.A0C = A01();
        }
    }

    public final void A0C(int i) {
        AnonymousClass12E r1 = this.A05;
        if (r1.A00 != i) {
            this.A05 = new AnonymousClass12E(r1.A03, r1.A08, r1.A05, r1.A02, r1.A01, i, r1.A09, r1.A06, r1.A07, r1.A04, r1.A0A, r1.A0C, r1.A0B);
        }
    }

    public final void A0D(long j) {
        AnonymousClass12A r0 = this.A0J.A05;
        if (r0 != null) {
            j += r0.A00;
        }
        this.A03 = j;
        this.A0G.A03.A00(j);
        for (AbstractC33821hR r2 : this.A0C) {
            r2.AN2(this.A03);
        }
    }

    public final void A0E(AnonymousClass12A r10) {
        AnonymousClass12A r6 = this.A0J.A05;
        if (!(r6 == null || r10 == r6)) {
            AbstractC33821hR[] r8 = this.A0T;
            int length = r8.length;
            boolean[] zArr = new boolean[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                AbstractC33821hR r2 = r8[i2];
                boolean z = false;
                if (r2.A9B() != 0) {
                    z = true;
                }
                zArr[i2] = z;
                boolean z2 = false;
                if (r6.A05.A03[i2] != null) {
                    z2 = true;
                }
                if (z2) {
                    i++;
                }
                if (zArr[i2]) {
                    boolean z3 = false;
                    if (r6.A05.A03[i2] != null) {
                        z3 = true;
                    }
                    if (!z3 || (r2.AAz() && r2.A9E() == r10.A0D[i2])) {
                        A0G(r2);
                    }
                }
            }
            this.A05 = this.A05.A03(r6.A03, r6.A05);
            A0N(zArr, i);
        }
    }

    public final void A0F(AnonymousClass12K r5) {
        Looper looper = r5.A03.getLooper();
        Handler handler = this.A0Q.A00;
        if (looper == handler.getLooper()) {
            A00(r5);
            int i = this.A05.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        handler.obtainMessage(15, r5).sendToTarget();
    }

    public final void A0G(AbstractC33821hR r3) {
        C33801hP r1 = this.A0G;
        if (r3 == r1.A00) {
            r1.A01 = null;
            r1.A00 = null;
        }
        if (r3.A9B() == 2) {
            r3.stop();
        }
        r3.A3g();
    }

    public final void A0H(C232414y r7) {
        int i;
        AnonymousClass129 r5 = this.A0I;
        AbstractC33821hR[] r4 = this.A0T;
        C232214w r3 = r7.A01;
        C33791hO r52 = (C33791hO) r5;
        int i2 = r52.A02;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < r4.length; i3++) {
                if (r3.A02[i3] != null) {
                    switch (r4[i3].A9S()) {
                        case 0:
                            i = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            break;
                        case 1:
                            i = 3538944;
                            break;
                        case 2:
                            i = 13107200;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i = 131072;
                            break;
                        case 6:
                            i = 0;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i2 += i;
                }
            }
        }
        r52.A00 = i2;
        r52.A08.A01(i2);
    }

    public final void A0I(boolean z) {
        C229113r r12;
        long A002;
        AnonymousClass12A r13 = this.A0J.A04;
        if (r13 == null) {
            r12 = this.A05.A05;
        } else {
            r12 = r13.A02.A03;
        }
        boolean z2 = !this.A05.A04.equals(r12);
        if (z2) {
            AnonymousClass12E r1 = this.A05;
            this.A05 = new AnonymousClass12E(r1.A03, r1.A08, r1.A05, r1.A02, r1.A01, r1.A00, r1.A09, r1.A06, r1.A07, r12, r1.A0A, r1.A0C, r1.A0B);
        } else {
            z2 = false;
        }
        AnonymousClass12E r2 = this.A05;
        if (r13 == null) {
            A002 = r2.A0B;
        } else {
            A002 = r13.A00();
        }
        r2.A0A = A002;
        this.A05.A0C = A01();
        if ((z2 || z) && r13 != null && r13.A07) {
            A0H(r13.A05);
        }
    }

    public final void A0J(boolean z) {
        C229113r r3 = this.A0J.A05.A02.A03;
        long A022 = A02(r3, this.A05.A0B, true);
        if (A022 != this.A05.A0B) {
            AnonymousClass12E r2 = this.A05;
            this.A05 = r2.A02(r3, A022, r2.A01, A01());
            if (z) {
                this.A0H.A00(4);
            }
        }
    }

    public final void A0K(boolean z) {
        AnonymousClass12E r1 = this.A05;
        if (r1.A09 != z) {
            this.A05 = new AnonymousClass12E(r1.A03, r1.A08, r1.A05, r1.A02, r1.A01, r1.A00, z, r1.A06, r1.A07, r1.A04, r1.A0A, r1.A0C, r1.A0B);
        }
    }

    public final void A0L(boolean z, boolean z2) {
        A0M(true, z, z);
        this.A0H.A01 += this.A01 + (z2 ? 1 : 0);
        this.A01 = 0;
        ((C33791hO) this.A0I).A01(true);
        A0C(1);
    }

    public final void A0M(boolean z, boolean z2, boolean z3) {
        C229113r r5;
        long j;
        AnonymousClass12R r3;
        AnonymousClass14A r12;
        C232414y r13;
        AbstractC229313t r2;
        this.A0Q.A00.removeMessages(2);
        this.A09 = false;
        C34501ia r32 = this.A0G.A03;
        if (r32.A03) {
            r32.A00(r32.A8V());
            r32.A03 = false;
        }
        this.A03 = 0;
        for (AbstractC33821hR r1 : this.A0C) {
            try {
                A0G(r1);
            } catch (AnonymousClass11w | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0C = new AbstractC33821hR[0];
        AnonymousClass12C r33 = this.A0J;
        r33.A06(!z2);
        A0K(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            r33.A07 = AnonymousClass12R.A00;
            ArrayList arrayList = this.A0R;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass121) it.next()).A03.A01(false);
            }
            arrayList.clear();
            this.A00 = 0;
        }
        AnonymousClass12E r4 = this.A05;
        if (z2) {
            r5 = r4.A04(this.A0B, this.A0L);
        } else {
            r5 = r4.A05;
        }
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0B;
            j2 = this.A05.A01;
        }
        if (z3) {
            r3 = AnonymousClass12R.A00;
        } else {
            r3 = this.A05.A03;
        }
        Object obj = z3 ? null : this.A05.A08;
        AnonymousClass12E r22 = this.A05;
        int i = r22.A00;
        if (z3) {
            r12 = AnonymousClass14A.A03;
        } else {
            r12 = r22.A06;
        }
        if (z3) {
            r13 = this.A0N;
        } else {
            r13 = r22.A07;
        }
        this.A05 = new AnonymousClass12E(r3, obj, r5, j, j2, i, false, r12, r13, r5, j, 0, j);
        if (z && (r2 = this.A07) != null) {
            r2.AMV(this);
            this.A07 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r20.A05.A00 != 3) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r7 == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(boolean[] r21, int r22) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25N.A0N(boolean[], int):void");
    }

    public final boolean A0O() {
        AnonymousClass12A r5 = this.A0J.A05;
        long j = r5.A02.A01;
        if (j == -9223372036854775807L || this.A05.A0B < j) {
            return true;
        }
        AnonymousClass12A r1 = r5.A01;
        if (r1 != null) {
            return r1.A07 || r1.A02.A03.A00();
        }
        return false;
    }

    @Override // X.AnonymousClass144
    public void AEd(AnonymousClass145 r3) {
        this.A0Q.A00.obtainMessage(10, r3).sendToTarget();
    }

    @Override // X.AbstractC34191i3
    public void AIj(AbstractC34201i4 r3) {
        this.A0Q.A00.obtainMessage(9, r3).sendToTarget();
    }

    @Override // X.AbstractC229213s
    public void AKG(AbstractC229313t r4, AnonymousClass12R r5, Object obj) {
        C234315u r0 = this.A0Q;
        r0.A00.obtainMessage(8, new AnonymousClass120(r4, r5, obj)).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06d1, code lost:
        if (r10.A00 < 100) goto L_0x06d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x083f, code lost:
        if (r6.A01 == null) goto L_0x0841;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08ec, code lost:
        if (r8.AB1() == false) goto L_0x08ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0957, code lost:
        if (A0O() != false) goto L_0x0959;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x09c5, code lost:
        if (r3 >= r9.A00) goto L_0x0959;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x064e A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x02d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r39) {
        /*
        // Method dump skipped, instructions count: 2850
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25N.handleMessage(android.os.Message):boolean");
    }
}
