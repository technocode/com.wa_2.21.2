package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.25M  reason: invalid class name */
public final class AnonymousClass25M extends AbstractC33781hN implements AbstractC33811hQ {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AnonymousClass12E A04;
    public AnonymousClass12F A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final Handler A0B;
    public final AnonymousClass25N A0C;
    public final AnonymousClass12P A0D;
    public final AbstractC232314x A0E;
    public final C232414y A0F;
    public final ArrayDeque A0G;
    public final CopyOnWriteArraySet A0H;

    public AnonymousClass25M(AbstractC33821hR[] r13, AbstractC232314x r14, AnonymousClass129 r15, AnonymousClass15B r16, AnonymousClass15Y r17, Looper looper) {
        StringBuilder A0S = AnonymousClass008.A0S("Init ");
        A0S.append(Integer.toHexString(System.identityHashCode(this)));
        A0S.append(" [");
        A0S.append("ExoPlayerLib/2.9.6");
        A0S.append("] [");
        A0S.append(AnonymousClass0W2.A02);
        A0S.append("]");
        Log.i("ExoPlayerImpl", A0S.toString());
        int length = r13.length;
        C002001d.A3A(length > 0);
        if (r14 != null) {
            this.A0E = r14;
            this.A09 = false;
            this.A0H = new CopyOnWriteArraySet();
            this.A0F = new C232414y(new AnonymousClass12M[length], new AbstractC232114v[length], null);
            this.A0D = new AnonymousClass12P();
            this.A05 = AnonymousClass12F.A04;
            this.A0A = new HandlerC224811y(this, looper);
            this.A04 = AnonymousClass12E.A00(0, this.A0F);
            this.A0G = new ArrayDeque();
            AnonymousClass25N r4 = new AnonymousClass25N(r13, r14, this.A0F, r15, r16, this.A0A, r17);
            this.A0C = r4;
            this.A0B = new Handler(r4.A0F.getLooper());
            return;
        }
        throw null;
    }

    public final AnonymousClass12E A00(boolean z, boolean z2, int i) {
        int A042;
        C229113r r5;
        long j;
        long j2 = 0;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A03 = 0;
            r5 = this.A04.A04(false, super.A00);
        } else {
            this.A01 = A5r();
            if (A04()) {
                A042 = this.A00;
            } else {
                AnonymousClass12E r0 = this.A04;
                A042 = r0.A03.A04(r0.A05.A04);
            }
            this.A00 = A042;
            this.A03 = A5n();
            r5 = this.A04.A05;
        }
        if (!z) {
            j2 = this.A04.A0B;
        }
        if (z) {
            j = -9223372036854775807L;
        } else {
            j = this.A04.A01;
        }
        return new AnonymousClass12E(z2 ? AnonymousClass12R.A00 : this.A04.A03, z2 ? null : this.A04.A08, r5, j2, j, i, false, z2 ? AnonymousClass14A.A03 : this.A04.A06, z2 ? this.A0F : this.A04.A07, r5, j2, 0, j2);
    }

    public final void A01(AnonymousClass12E r15, boolean z, int i, int i2, boolean z2, boolean z3) {
        ArrayDeque arrayDeque = this.A0G;
        boolean z4 = !arrayDeque.isEmpty();
        arrayDeque.addLast(new C224911z(r15, this.A04, this.A0H, this.A0E, z, i, i2, z2, this.A09, z3));
        this.A04 = r15;
        if (!z4) {
            while (!arrayDeque.isEmpty()) {
                C224911z r5 = (C224911z) arrayDeque.peekFirst();
                if (r5.A0A || r5.A01 == 0) {
                    for (AnonymousClass12G r4 : r5.A04) {
                        AnonymousClass12E r0 = r5.A02;
                        r4.AKz(r0.A03, r0.A08, r5.A01);
                    }
                }
                if (r5.A08) {
                    for (AnonymousClass12G r1 : r5.A04) {
                        r1.AIZ(r5.A00);
                    }
                }
                if (r5.A0B) {
                    AbstractC232314x r12 = r5.A03;
                    AnonymousClass12E r7 = r5.A02;
                    C232414y r6 = r7.A07;
                    Object obj = r6.A02;
                    AnonymousClass25d r13 = (AnonymousClass25d) r12;
                    if (r13 != null) {
                        r13.A00 = (C231914t) obj;
                        for (AnonymousClass12G r3 : r5.A04) {
                            r3.ALC(r7.A06, r6.A01);
                        }
                    } else {
                        throw null;
                    }
                }
                if (r5.A05) {
                    for (AnonymousClass12G r14 : r5.A04) {
                        r14.AHH(r5.A02.A09);
                    }
                }
                if (r5.A07) {
                    for (AnonymousClass12G r32 : r5.A04) {
                        r32.AIY(r5.A06, r5.A02.A00);
                    }
                }
                if (r5.A09) {
                    for (AnonymousClass12G r02 : r5.A04) {
                        r02.AJu();
                    }
                }
                arrayDeque.removeFirst();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r13 != false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r12, boolean r13) {
        /*
            r11 = this;
            r3 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0007
            r1 = 1
            if (r13 == 0) goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            r4 = r11
            boolean r0 = r11.A08
            if (r0 == r1) goto L_0x001c
            r11.A08 = r1
            X.25N r0 = r11.A0C
            X.15u r0 = r0.A0Q
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r3, r1, r2)
            r0.sendToTarget()
        L_0x001c:
            boolean r0 = r11.A09
            if (r0 == r12) goto L_0x002c
            r11.A09 = r12
            X.12E r5 = r11.A04
            r6 = 0
            r7 = 4
            r8 = 1
            r9 = r2
            r10 = r3
            r4.A01(r5, r6, r7, r8, r9, r10)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25M.A02(boolean, boolean):void");
    }

    public boolean A03() {
        return !A04() && this.A04.A05.A00();
    }

    public final boolean A04() {
        return this.A04.A03.A0D() || this.A02 > 0;
    }

    @Override // X.AnonymousClass12H
    public void A1n(AnonymousClass12G r2) {
        this.A0H.add(r2);
    }

    @Override // X.AnonymousClass12H
    public long A50() {
        if (A03()) {
            AnonymousClass12E r0 = this.A04;
            if (r0.A04.equals(r0.A05)) {
                return AnonymousClass11u.A01(this.A04.A0A);
            }
            return A67();
        } else if (A04()) {
            return this.A03;
        } else {
            AnonymousClass12E r5 = this.A04;
            if (r5.A04.A03 != r5.A05.A03) {
                return AnonymousClass11u.A01(r5.A03.A0A(A5r(), super.A00).A02);
            }
            long j = r5.A0A;
            AnonymousClass12E r7 = this.A04;
            C229113r r1 = r7.A04;
            C229113r r52 = r1;
            if (r1.A00()) {
                AnonymousClass12P A092 = r7.A03.A09(r1.A04, this.A0D);
                r7 = this.A04;
                r52 = r7.A04;
                j = A092.A03.A02[r52.A00];
                if (j == Long.MIN_VALUE) {
                    j = A092.A01;
                }
            }
            long A012 = AnonymousClass11u.A01(j);
            AnonymousClass12R r4 = r7.A03;
            Object obj = r52.A04;
            AnonymousClass12P r02 = this.A0D;
            r4.A09(obj, r02);
            return A012 + AnonymousClass11u.A01(r02.A02);
        }
    }

    @Override // X.AnonymousClass12H
    public long A5T() {
        if (!A03()) {
            return A5n();
        }
        AnonymousClass12E r0 = this.A04;
        AnonymousClass12R r2 = r0.A03;
        Object obj = r0.A05.A04;
        AnonymousClass12P r02 = this.A0D;
        r2.A09(obj, r02);
        return AnonymousClass11u.A01(this.A04.A01) + AnonymousClass11u.A01(r02.A02);
    }

    @Override // X.AnonymousClass12H
    public int A5j() {
        if (A03()) {
            return this.A04.A05.A00;
        }
        return -1;
    }

    @Override // X.AnonymousClass12H
    public int A5k() {
        if (A03()) {
            return this.A04.A05.A01;
        }
        return -1;
    }

    @Override // X.AnonymousClass12H
    public long A5n() {
        if (A04()) {
            return this.A03;
        }
        AnonymousClass12E r1 = this.A04;
        C229113r r5 = r1.A05;
        if (r5.A00()) {
            return AnonymousClass11u.A01(r1.A0B);
        }
        long A012 = AnonymousClass11u.A01(r1.A0B);
        AnonymousClass12R r2 = this.A04.A03;
        Object obj = r5.A04;
        AnonymousClass12P r0 = this.A0D;
        r2.A09(obj, r0);
        return A012 + AnonymousClass11u.A01(r0.A02);
    }

    @Override // X.AnonymousClass12H
    public AnonymousClass12R A5q() {
        return this.A04.A03;
    }

    @Override // X.AnonymousClass12H
    public int A5r() {
        if (A04()) {
            return this.A01;
        }
        AnonymousClass12E r0 = this.A04;
        return r0.A03.A09(r0.A05.A04, this.A0D).A00;
    }

    @Override // X.AnonymousClass12H
    public long A67() {
        if (A03()) {
            AnonymousClass12E r1 = this.A04;
            r1.A03.A09(r1.A05.A04, this.A0D);
            return AnonymousClass11u.A01(-9223372036854775807L);
        }
        AnonymousClass12R A5q = A5q();
        if (A5q.A0D()) {
            return -9223372036854775807L;
        }
        return AnonymousClass11u.A01(A5q.A0A(A5r(), super.A00).A02);
    }

    @Override // X.AnonymousClass12H
    public boolean A8P() {
        return this.A09;
    }

    @Override // X.AnonymousClass12H
    public int A8R() {
        return this.A04.A00;
    }

    @Override // X.AnonymousClass12H
    public long A9P() {
        return Math.max(0L, AnonymousClass11u.A01(this.A04.A0C));
    }

    @Override // X.AnonymousClass12H
    public void AMe(AnonymousClass12G r2) {
        this.A0H.remove(r2);
    }

    @Override // X.AnonymousClass12H
    public void ANV(int i, long j) {
        boolean A0D2;
        long A002;
        long j2;
        AnonymousClass12R r9 = this.A04.A03;
        if (i < 0 || (!(A0D2 = r9.A0D()) && i >= r9.A01())) {
            throw new AnonymousClass128(r9, i, j);
        }
        this.A07 = true;
        this.A02++;
        if (A03()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.A0A.obtainMessage(0, 1, -1, this.A04).sendToTarget();
            return;
        }
        this.A01 = i;
        int i2 = (j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1));
        if (A0D2) {
            if (i2 == 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            this.A03 = j2;
            this.A00 = 0;
        } else {
            if (i2 == 0) {
                r9.A0A(i, super.A00);
                A002 = 0;
            } else {
                A002 = AnonymousClass11u.A00(j);
            }
            Pair A072 = r9.A07(super.A00, this.A0D, i, A002, 0);
            this.A03 = AnonymousClass11u.A01(A002);
            this.A00 = r9.A04(A072.first);
        }
        this.A0C.A0Q.A00.obtainMessage(3, new AnonymousClass123(r9, i, AnonymousClass11u.A00(j))).sendToTarget();
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            ((AnonymousClass12G) it.next()).AIZ(1);
        }
    }

    @Override // X.AnonymousClass12H
    public void AOo(boolean z) {
        A02(z, false);
    }
}
