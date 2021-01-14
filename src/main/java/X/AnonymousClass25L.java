package X;

import android.os.SystemClock;
import android.util.Log;
import java.util.AbstractCollection;

/* renamed from: X.25L  reason: invalid class name */
public abstract class AnonymousClass25L implements AbstractC33821hR {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass12M A03;
    public AnonymousClass143 A04;
    public boolean A05 = true;
    public boolean A06;
    public AnonymousClass126[] A07;
    public final int A08;

    public abstract void A04();

    public abstract void A05(long j, boolean z);

    @Override // X.AbstractC33821hR
    public final AnonymousClass25L A5C() {
        return this;
    }

    public AnonymousClass25L(int i) {
        this.A08 = i;
    }

    public static boolean A00(AnonymousClass138 r3, AnonymousClass135 r4) {
        if (r4 == null) {
            return true;
        }
        if (r3 == null) {
            return false;
        }
        if (((AbstractCollection) C33991hj.A00(r4)).isEmpty()) {
            if (r4.A01 != 1 || !r4.A03[0].A00(AnonymousClass11u.A01)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append((Object) null);
            Log.w("DefaultDrmSessionMgr", sb.toString());
        }
        String str = r4.A02;
        if (str == null || "cenc".equals(str) || ((!"cbc1".equals(str) && !"cbcs".equals(str) && !"cens".equals(str)) || AnonymousClass0W2.A00 >= 25)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (((X.C33891hY) r6.A0G).A07(r15.A05, r15.A0A) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass126 r15) {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25L.A01(X.126):int");
    }

    public final int A02(AnonymousClass127 r47, C33961hf r48, boolean z) {
        int AMM = this.A04.AMM(r47, r48, z);
        if (AMM == -4) {
            if (r48.A01()) {
                this.A05 = true;
                if (!this.A06) {
                    return -3;
                }
                return -4;
            }
            r48.A00 += this.A02;
        } else if (AMM == -5) {
            AnonymousClass126 r3 = r47.A00;
            long j = r3.A0G;
            if (j != Long.MAX_VALUE) {
                r47.A00 = new AnonymousClass126(r3.A0M, r3.A0N, r3.A0L, r3.A0P, r3.A0K, r3.A04, r3.A09, r3.A0F, r3.A08, r3.A01, r3.A0B, r3.A02, r3.A0R, r3.A0E, r3.A0J, r3.A05, r3.A0C, r3.A0A, r3.A06, r3.A07, r3.A0D, r3.A0O, r3.A03, j + this.A02, r3.A0Q, r3.A0H, r3.A0I);
                return AMM;
            }
        }
        return AMM;
    }

    public void A03(AnonymousClass126[] r8, long j) {
        if (this instanceof C461828l) {
            C461828l r2 = (C461828l) this;
            AnonymousClass126 r1 = r8[0];
            r2.A02 = r1;
            if (r2.A03 != null) {
                r2.A00 = 1;
            } else {
                r2.A03 = C34261iA.A00(r1);
            }
        } else if (!(this instanceof AnonymousClass2AM)) {
            AnonymousClass2AL r4 = (AnonymousClass2AL) this;
            if (r4.A07 != -9223372036854775807L) {
                int i = r4.A05;
                long[] jArr = r4.A0H;
                if (i == jArr.length) {
                    StringBuilder A0S = AnonymousClass008.A0S("Too many stream changes, so dropping change at ");
                    A0S.append(jArr[i - 1]);
                    Log.w("MediaCodecAudioRenderer", A0S.toString());
                } else {
                    r4.A05 = i + 1;
                }
                jArr[r4.A05 - 1] = r4.A07;
            }
        } else {
            AnonymousClass2AM r42 = (AnonymousClass2AM) this;
            if (r42.A0L == -9223372036854775807L) {
                r42.A0L = j;
                return;
            }
            int i2 = r42.A09;
            long[] jArr2 = r42.A0Z;
            if (i2 == jArr2.length) {
                StringBuilder A0S2 = AnonymousClass008.A0S("Too many stream changes, so dropping offset: ");
                A0S2.append(jArr2[i2 - 1]);
                Log.w("MediaCodecVideoRenderer", A0S2.toString());
            } else {
                r42.A09 = i2 + 1;
            }
            int i3 = r42.A09 - 1;
            jArr2[i3] = j;
            r42.A0a[i3] = r42.A0J;
        }
    }

    @Override // X.AbstractC33821hR
    public final void A3g() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        C002001d.A3A(z);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A04();
    }

    @Override // X.AbstractC33821hR
    public final void A40(AnonymousClass12M r11, AnonymousClass126[] r12, AnonymousClass143 r13, long j, boolean z, long j2) {
        boolean z2 = false;
        if (this.A01 == 0) {
            z2 = true;
        }
        C002001d.A3A(z2);
        this.A03 = r11;
        this.A01 = 1;
        if (this instanceof AnonymousClass2AM) {
            AnonymousClass2AM r9 = (AnonymousClass2AM) this;
            C227412z r8 = new C227412z();
            ((AbstractC461628i) r9).A0C = r8;
            int i = ((AnonymousClass25L) r9).A03.A00;
            r9.A0F = i;
            boolean z3 = false;
            if (i != 0) {
                z3 = true;
            }
            r9.A0S = z3;
            AnonymousClass169 r3 = r9.A0X;
            if (r3.A01 != null) {
                r3.A00.post(new RunnableEBaseShape5S0200000_I1_0(r3, r8, 33));
            }
            AnonymousClass167 r32 = r9.A0W;
            r32.A08 = false;
            if (r32.A09 != null) {
                r32.A0B.A02.sendEmptyMessage(1);
                AnonymousClass165 r2 = r32.A0A;
                if (r2 != null) {
                    r2.A00.registerDisplayListener(r2, null);
                }
                r32.A00();
            }
        } else if (this instanceof AnonymousClass2AL) {
            AnonymousClass2AL r92 = (AnonymousClass2AL) this;
            C227412z r6 = new C227412z();
            ((AbstractC461628i) r92).A0C = r6;
            C225512f r33 = r92.A0F;
            if (r33.A01 != null) {
                r33.A00.post(new RunnableEBaseShape5S0200000_I1_0(r33, r6, 28));
            }
            int i2 = ((AnonymousClass25L) r92).A03.A00;
            boolean z4 = false;
            if (i2 != 0) {
                C33891hY r34 = (C33891hY) r92.A0G;
                if (r34 != null) {
                    if (AnonymousClass0W2.A00 >= 21) {
                        z4 = true;
                    }
                    C002001d.A3A(z4);
                    if (!r34.A0a || r34.A01 != i2) {
                        r34.A0a = true;
                        r34.A01 = i2;
                        r34.A01();
                    }
                } else {
                    throw null;
                }
            } else {
                C33891hY r1 = (C33891hY) r92.A0G;
                if (r1.A0a) {
                    r1.A0a = false;
                    r1.A01 = 0;
                    r1.A01();
                }
            }
        }
        C002001d.A3A(!this.A06);
        this.A04 = r13;
        this.A05 = false;
        this.A07 = r12;
        this.A02 = j2;
        A03(r12, j2);
        A05(j, z);
    }

    @Override // X.AbstractC33821hR
    public AbstractC233315i A7J() {
        if (!(this instanceof AnonymousClass2AL)) {
            return null;
        }
        return (AnonymousClass2AL) this;
    }

    @Override // X.AbstractC33821hR
    public final int A9B() {
        return this.A01;
    }

    @Override // X.AbstractC33821hR
    public final AnonymousClass143 A9E() {
        return this.A04;
    }

    @Override // X.AbstractC33821hR
    public final int A9S() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        if (r9 != null) goto L_0x0086;
     */
    @Override // X.AnonymousClass12J
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AA7(int r8, java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25L.AA7(int, java.lang.Object):void");
    }

    @Override // X.AbstractC33821hR
    public final boolean AAM() {
        return this.A05;
    }

    @Override // X.AbstractC33821hR
    public final boolean AAz() {
        return this.A06;
    }

    @Override // X.AbstractC33821hR
    public final void AC7() {
        this.A04.AC4();
    }

    @Override // X.AbstractC33821hR
    public final void AMn(AnonymousClass126[] r2, AnonymousClass143 r3, long j) {
        C002001d.A3A(!this.A06);
        this.A04 = r3;
        this.A05 = false;
        this.A07 = r2;
        this.A02 = j;
        A03(r2, j);
    }

    @Override // X.AbstractC33821hR
    public final void AN2(long j) {
        this.A06 = false;
        this.A05 = false;
        A05(j, false);
    }

    @Override // X.AbstractC33821hR
    public final void AO9() {
        this.A06 = true;
    }

    @Override // X.AbstractC33821hR
    public final void AOM(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC33821hR
    public /* synthetic */ void AOk(float f) {
        if (this instanceof AbstractC461628i) {
            AbstractC461628i r0 = (AbstractC461628i) this;
            r0.A01 = f;
            r0.A0D();
        }
    }

    @Override // X.AbstractC33821hR
    public final void start() {
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        C002001d.A3A(z);
        this.A01 = 2;
        if (this instanceof AnonymousClass2AM) {
            AnonymousClass2AM r4 = (AnonymousClass2AM) this;
            r4.A08 = 0;
            r4.A0G = SystemClock.elapsedRealtime();
            r4.A0K = SystemClock.elapsedRealtime() * 1000;
        } else if (this instanceof AnonymousClass2AL) {
            C33891hY r2 = (C33891hY) ((AnonymousClass2AL) this).A0G;
            r2.A0Y = true;
            boolean z2 = false;
            if (r2.A0M != null) {
                z2 = true;
            }
            if (z2) {
                C226212n r0 = r2.A0g.A0I;
                if (r0 != null) {
                    r0.A00();
                    r2.A0M.play();
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.AbstractC33821hR
    public final void stop() {
        boolean z = false;
        if (this.A01 == 2) {
            z = true;
        }
        C002001d.A3A(z);
        this.A01 = 1;
        if (this instanceof AnonymousClass2AM) {
            AnonymousClass2AM r2 = (AnonymousClass2AM) this;
            r2.A0I = -9223372036854775807L;
            r2.A0J();
        } else if (this instanceof AnonymousClass2AL) {
            AnonymousClass2AL r22 = (AnonymousClass2AL) this;
            r22.A0I();
            C33891hY r6 = (C33891hY) r22.A0G;
            r6.A0Y = false;
            boolean z2 = false;
            if (r6.A0M != null) {
                z2 = true;
            }
            if (z2) {
                C226412p r5 = r6.A0g;
                r5.A0E = 0;
                r5.A04 = 0;
                r5.A01 = 0;
                r5.A09 = 0;
                if (r5.A0G == -9223372036854775807L) {
                    C226212n r0 = r5.A0I;
                    if (r0 != null) {
                        r0.A00();
                        r6.A0M.pause();
                        return;
                    }
                    throw null;
                }
            }
        }
    }
}
