package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.25V  reason: invalid class name */
public final class AnonymousClass25V implements AbstractC34201i4, AnonymousClass13C, AnonymousClass142, AnonymousClass15M, AnonymousClass15Q {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass13H A07;
    public C229013p A08;
    public AbstractC34191i3 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int[] A0J;
    public C34211i5[] A0K;
    public final long A0L = ((long) 1048576);
    public final Uri A0M;
    public final Handler A0N;
    public final C228813n A0O;
    public final AbstractC228913o A0P;
    public final C229513v A0Q;
    public final AnonymousClass15E A0R;
    public final AnonymousClass15H A0S;
    public final AnonymousClass15L A0T;
    public final AnonymousClass15S A0U = new AnonymousClass15S();
    public final C232715b A0V;
    public final Runnable A0W;
    public final Runnable A0X;

    public AnonymousClass25V(Uri uri, AnonymousClass15E r6, AnonymousClass13B[] r7, AnonymousClass15L r8, C229513v r9, AbstractC228913o r10, AnonymousClass15H r11) {
        this.A0M = uri;
        this.A0R = r6;
        this.A0T = r8;
        this.A0Q = r9;
        this.A0P = r10;
        this.A0S = r11;
        this.A0O = new C228813n(r7);
        this.A0V = new C232715b();
        this.A0W = new RunnableEBaseShape5S0100000_I1_0(this, 38);
        this.A0X = new RunnableEBaseShape5S0100000_I1_0(this, 37);
        this.A0N = new Handler();
        this.A0J = new int[0];
        this.A0K = new C34211i5[0];
        this.A06 = -9223372036854775807L;
        this.A05 = -1;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        r9.A02();
    }

    public final int A00() {
        int i = 0;
        for (C34211i5 r0 : this.A0K) {
            AnonymousClass140 r02 = r0.A09;
            i += r02.A00 + r02.A02;
        }
        return i;
    }

    public void A01() {
        IOException iOException;
        AnonymousClass15S r3 = this.A0U;
        int i = 3;
        if (this.A00 == 7) {
            i = 6;
        }
        IOException iOException2 = r3.A01;
        if (iOException2 == null) {
            AnonymousClass15O r0 = r3.A00;
            if (r0 != null && (iOException = r0.A02) != null && r0.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void A02() {
        C34171i1 r11 = new C34171i1(this, this.A0M, this.A0R, this.A0O, this, this.A0V);
        boolean z = true;
        if (this.A0F) {
            C229013p r0 = this.A08;
            if (r0 != null) {
                AnonymousClass13H r9 = r0.A00;
                C002001d.A3A(A06());
                long j = this.A03;
                if (j == -9223372036854775807L || this.A06 < j) {
                    long j2 = r9.A8w(this.A06).A00.A00;
                    long j3 = this.A06;
                    r11.A06.A00 = j2;
                    r11.A01 = j3;
                    r11.A03 = true;
                    this.A06 = -9223372036854775807L;
                } else {
                    this.A0B = true;
                    this.A06 = -9223372036854775807L;
                    return;
                }
            } else {
                throw null;
            }
        }
        this.A02 = A00();
        AnonymousClass15S r92 = this.A0U;
        int i = 3;
        if (this.A00 == 7) {
            i = 6;
        }
        if (r92 != null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                z = false;
            }
            C002001d.A3A(z);
            r92.A01 = null;
            new AnonymousClass15O(r92, myLooper, r11, this, i, SystemClock.elapsedRealtime()).A00(0);
            C229513v r5 = this.A0Q;
            AnonymousClass15G r02 = r11.A02;
            long j4 = r11.A01;
            long j5 = this.A03;
            if (r5 != null) {
                Uri uri = r02.A05;
                Collections.emptyMap();
                r5.A07(new C229613w(uri), new C229713x(1, -1, null, 0, null, r5.A01(j4), r5.A01(j5)));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A03(int i) {
        int i2;
        C229013p r1 = this.A08;
        if (r1 != null) {
            boolean[] zArr = r1.A04;
            if (!zArr[i]) {
                AnonymousClass126 r7 = r1.A01.A02[i].A02[0];
                C229513v r2 = this.A0Q;
                String str = r7.A0P;
                if (TextUtils.isEmpty(str)) {
                    i2 = -1;
                } else if ("audio".equals(C233415j.A02(str))) {
                    i2 = 1;
                } else if ("video".equals(C233415j.A02(str))) {
                    i2 = 2;
                } else if ("text".equals(C233415j.A02(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
                    i2 = 3;
                } else if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
                    i2 = 4;
                } else if ("application/x-camera-motion".equals(str)) {
                    i2 = 5;
                } else {
                    ArrayList arrayList = C233415j.A00;
                    if (0 < arrayList.size()) {
                        arrayList.get(0);
                        throw null;
                    }
                    i2 = -1;
                }
                r2.A09(new C229713x(1, i2, r7, 0, null, r2.A01(this.A04), -9223372036854775807L));
                zArr[i] = true;
                return;
            }
            return;
        }
        throw null;
    }

    public final void A04(int i) {
        C229013p r0 = this.A08;
        if (r0 != null) {
            boolean[] zArr = r0.A03;
            if (this.A0E && zArr[i] && !this.A0K[i].A09.A01()) {
                this.A06 = 0;
                this.A0E = false;
                this.A0D = true;
                this.A04 = 0;
                this.A02 = 0;
                for (C34211i5 r02 : this.A0K) {
                    r02.A05();
                }
                AbstractC34191i3 r03 = this.A09;
                if (r03 != null) {
                    r03.AEd(this);
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    public void A05(AnonymousClass15P r19, long j, long j2, boolean z) {
        C34171i1 r4 = (C34171i1) r19;
        C229513v r6 = this.A0Q;
        r6.A05(new C229613w(r4.A08.A01), new C229713x(1, -1, null, 0, null, r6.A01(r4.A01), r6.A01(this.A03)));
        if (!z) {
            if (this.A05 == -1) {
                this.A05 = r4.A00;
            }
            for (C34211i5 r0 : this.A0K) {
                r0.A05();
            }
            if (this.A01 > 0) {
                AbstractC34191i3 r02 = this.A09;
                if (r02 != null) {
                    r02.AEd(this);
                    return;
                }
                throw null;
            }
        }
    }

    public final boolean A06() {
        return this.A06 != -9223372036854775807L;
    }

    @Override // X.AbstractC34201i4
    public boolean A32(long j) {
        boolean z;
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        C232715b r1 = this.A0V;
        synchronized (r1) {
            if (r1.A00) {
                z = false;
            } else {
                r1.A00 = true;
                r1.notifyAll();
                z = true;
            }
        }
        if (this.A0U.A00 != null) {
            return z;
        }
        A02();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 == r3) goto L_0x0034;
     */
    @Override // X.AbstractC34201i4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3j(long r16, boolean r18) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25V.A3j(long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r7 > r13) goto L_0x0058;
     */
    @Override // X.AbstractC34201i4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A4h(long r20, X.AnonymousClass12O r22) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25V.A4h(long, X.12O):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r2 == Long.MAX_VALUE) goto L_0x0050;
     */
    @Override // X.AbstractC34201i4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A51() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25V.A51():long");
    }

    @Override // X.AbstractC34201i4
    public long A7f() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A51();
    }

    @Override // X.AbstractC34201i4
    public AnonymousClass14A A9R() {
        C229013p r0 = this.A08;
        if (r0 != null) {
            return r0.A01;
        }
        throw null;
    }

    @Override // X.AbstractC34201i4
    public void AC5() {
        A01();
    }

    @Override // X.AbstractC34201i4
    public void AM6(AbstractC34191i3 r3, long j) {
        this.A09 = r3;
        C232715b r1 = this.A0V;
        synchronized (r1) {
            if (!r1.A00) {
                r1.A00 = true;
                r1.notifyAll();
            }
        }
        A02();
    }

    @Override // X.AbstractC34201i4
    public long AMN() {
        if (!this.A0C) {
            this.A0Q.A04();
            this.A0C = true;
        }
        if (!this.A0D) {
            return -9223372036854775807L;
        }
        if (!this.A0B && A00() <= this.A02) {
            return -9223372036854775807L;
        }
        this.A0D = false;
        return this.A04;
    }

    @Override // X.AbstractC34201i4
    public long ANY(long j) {
        C229013p r1 = this.A08;
        if (r1 != null) {
            AnonymousClass13H r0 = r1.A00;
            boolean[] zArr = r1.A03;
            if (!r0.ABX()) {
                j = 0;
            }
            this.A0D = false;
            this.A04 = j;
            if (A06()) {
                this.A06 = j;
                return j;
            }
            if (this.A00 != 7) {
                int length = this.A0K.length;
                for (int i = 0; i < length; i++) {
                    C34211i5 r2 = this.A0K[i];
                    AnonymousClass140 r12 = r2.A09;
                    synchronized (r12) {
                        r12.A03 = 0;
                    }
                    r2.A04 = r2.A03;
                    if (r2.A01(j, false) != -1 || (!zArr[i] && this.A0A)) {
                    }
                }
                return j;
            }
            this.A0E = false;
            this.A06 = j;
            this.A0B = false;
            AnonymousClass15O r02 = this.A0U.A00;
            if (r02 != null) {
                r02.A01(false);
            } else {
                for (C34211i5 r03 : this.A0K) {
                    r03.A05();
                }
            }
            return j;
        }
        throw null;
    }

    @Override // X.AbstractC34201i4
    public long ANZ(AbstractC232114v[] r13, boolean[] zArr, AnonymousClass143[] r15, boolean[] zArr2, long j) {
        int length;
        boolean z;
        long j2 = j;
        C229013p r2 = this.A08;
        if (r2 != null) {
            AnonymousClass14A r9 = r2.A01;
            boolean[] zArr3 = r2.A02;
            int i = this.A01;
            int i2 = i;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                length = r13.length;
                if (i4 >= length) {
                    break;
                }
                if (r15[i4] != null && (r13[i4] == null || !zArr[i4])) {
                    int i5 = ((C34181i2) r15[i4]).A00;
                    C002001d.A3A(zArr3[i5]);
                    i2--;
                    this.A01 = i2;
                    zArr3[i5] = false;
                    r15[i4] = null;
                }
                i4++;
            }
            if (!this.A0I ? j == 0 : i != 0) {
                z = false;
            } else {
                z = true;
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (r15[i6] == null && r13[i6] != null) {
                    AbstractC232114v r10 = r13[i6];
                    boolean z2 = false;
                    if (r10.length() == 1) {
                        z2 = true;
                    }
                    C002001d.A3A(z2);
                    boolean z3 = false;
                    if (r10.A6m(0) == 0) {
                        z3 = true;
                    }
                    C002001d.A3A(z3);
                    AnonymousClass148 A9Q = r10.A9Q();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= r9.A01) {
                            i7 = -1;
                            break;
                        }
                        if (r9.A02[i7] == A9Q) {
                            break;
                        }
                        i7++;
                    }
                    C002001d.A3A(!zArr3[i7]);
                    this.A01++;
                    zArr3[i7] = true;
                    r15[i6] = new C34181i2(this, i7);
                    zArr2[i6] = true;
                    if (!z) {
                        C34211i5 r102 = this.A0K[i7];
                        AnonymousClass140 r22 = r102.A09;
                        synchronized (r22) {
                            r22.A03 = 0;
                        }
                        r102.A04 = r102.A03;
                        if (r102.A01(j2, true) == -1) {
                            AnonymousClass140 r23 = r102.A09;
                            z = true;
                            if (r23.A00 + r23.A03 != 0) {
                            }
                        }
                        z = false;
                    } else {
                        continue;
                    }
                }
            }
            if (this.A01 == 0) {
                this.A0E = false;
                this.A0D = false;
                AnonymousClass15S r8 = this.A0U;
                AnonymousClass15O r24 = r8.A00;
                C34211i5[] r7 = this.A0K;
                int length2 = r7.length;
                if (r24 != null) {
                    for (C34211i5 r25 : r7) {
                        r25.A04();
                    }
                    r8.A00.A01(false);
                } else {
                    while (i3 < length2) {
                        r7[i3].A05();
                        i3++;
                    }
                }
            } else if (z) {
                j2 = ANY(j2);
                while (i3 < r15.length) {
                    if (r15[i3] != null) {
                        zArr2[i3] = true;
                    }
                    i3++;
                }
            }
            this.A0I = true;
            return j2;
        }
        throw null;
    }
}
