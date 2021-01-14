package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0EN  reason: invalid class name */
public class AnonymousClass0EN {
    public static volatile AnonymousClass0EN A0D;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00D A05;
    public final C006903j A06;
    public final AnonymousClass0AQ A07;
    public final AnonymousClass098 A08;
    public final AnonymousClass09E A09;
    public final C002701k A0A;
    public final AnonymousClass0EO A0B;
    public final AnonymousClass0CP A0C;

    public AnonymousClass0EN(AnonymousClass00S r1, C002701k r2, AnonymousClass01I r3, C006903j r4, C000300f r5, AnonymousClass098 r6, AnonymousClass09E r7, AnonymousClass0CP r8, AnonymousClass01A r9, AnonymousClass0EO r10, AnonymousClass04j r11, AnonymousClass00D r12, AnonymousClass0AQ r13) {
        this.A04 = r1;
        this.A0A = r2;
        this.A00 = r3;
        this.A06 = r4;
        this.A01 = r5;
        this.A08 = r6;
        this.A09 = r7;
        this.A0C = r8;
        this.A02 = r9;
        this.A0B = r10;
        this.A03 = r11;
        this.A05 = r12;
        this.A07 = r13;
    }

    public static AnonymousClass0EN A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0EN.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0EN(AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass01I.A00(), C006903j.A00(), C000300f.A00(), AnonymousClass098.A00(), AnonymousClass09E.A00(), AnonymousClass0CP.A00(), AnonymousClass01A.A00(), AnonymousClass0EO.A00(), AnonymousClass04j.A00(), AnonymousClass00D.A00(), AnonymousClass0AQ.A00());
                }
            }
        }
        return A0D;
    }

    public boolean A01(int i, AnonymousClass1XO r8, boolean z, long j, int i2, AnonymousClass02N r13) {
        if (r8 == AnonymousClass1XO.A0I) {
            if (i2 >= 0) {
                long j2 = (long) i2;
                if (j < j2 && !A03(r13)) {
                    if (i == 3) {
                        if ((C002001d.A09(this.A05, 3) & 1) == 0) {
                            return false;
                        }
                        return true;
                    } else if (j2 >= 102400) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            return false;
        } else if (r8 == AnonymousClass1XO.A0A || r8 == AnonymousClass1XO.A0C || r8 == AnonymousClass1XO.A0P) {
            if (i2 <= 0 || j >= ((long) i2) || i2 > 35000 || i == 3 || A03(r13)) {
                return false;
            }
            return true;
        } else if (r8 != AnonymousClass1XO.A0N || !z || j >= 262144 || (C002001d.A09(this.A05, i) & 1) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (X.AnonymousClass0FI.A0e(r14) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r13, X.AnonymousClass0M3 r14) {
        /*
            r12 = this;
            X.0M4 r3 = r14.A02
            if (r3 == 0) goto L_0x0032
            r8 = 0
            r4 = r12
            X.0CP r2 = r12.A0C
            java.lang.String r1 = r3.A0I
            r0 = 0
            X.1W6 r0 = r2.A03(r1, r0, r0)
            if (r0 == 0) goto L_0x0014
            long r8 = r0.A06
        L_0x0014:
            X.1XO r6 = X.AnonymousClass1XO.A02(r14)
            boolean r0 = X.AnonymousClass0FI.A0d(r14)
            if (r0 != 0) goto L_0x0025
            boolean r0 = X.AnonymousClass0FI.A0e(r14)
            r7 = 0
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r7 = 1
        L_0x0026:
            int r10 = r3.A04
            X.03n r0 = r14.A0n
            X.02N r11 = r0.A00
            r5 = r13
            boolean r0 = r4.A01(r5, r6, r7, r8, r10, r11)
            return r0
        L_0x0032:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EN.A02(int, X.0M3):boolean");
    }

    public final boolean A03(AnonymousClass02N r10) {
        long j;
        if (r10 == null) {
            return false;
        }
        C006903j r2 = this.A06;
        if (r2.A01(r10) < 5) {
            return false;
        }
        long j2 = this.A05.A00.getLong("last_read_conversation_time", 0);
        C08560bL r0 = (C08560bL) r2.A0A().get(r10);
        if (r0 == null) {
            j = 0;
        } else {
            j = r0.A0L;
        }
        if (j == 0 || j + 86400000 >= j2) {
            return false;
        }
        return true;
    }

    public boolean A04(AnonymousClass1XO r14, long j, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        int A032 = this.A03.A03(z);
        if (r14 == AnonymousClass1XO.A0I && j > ((long) this.A01.A06(AbstractC000400g.A3z)) * 1024) {
            return false;
        }
        C000300f r4 = this.A01;
        if (A032 == 1) {
            if (j > ((long) r4.A06(AbstractC000400g.A3Z)) * SearchActionVerificationClientService.MS_TO_NS) {
                return false;
            }
        } else if (j > ((long) r4.A06(AbstractC000400g.A3Y)) * SearchActionVerificationClientService.MS_TO_NS) {
            return false;
        }
        if (z3 && z4 && (A032 == 1 || A032 == 2)) {
            return true;
        }
        int A092 = C002001d.A09(this.A05, A032);
        byte b = r14.A00;
        if (!(b == 0 || b == 1)) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 9) {
                        if (b != 13) {
                            if (b != 20) {
                                if (!(b == 23 || b == 37 || b == 25)) {
                                    if (b != 26) {
                                        if (b != 28) {
                                            if (b != 29) {
                                                if (b != 42) {
                                                    if (b != 43) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    } else if ((A092 & 8) != 0) {
                                        return true;
                                    } else {
                                        return false;
                                    }
                                }
                            } else if ((z2 || A032 == 3) && (A092 & 1) == 0) {
                                return false;
                            } else {
                                return true;
                            }
                        }
                        if (j <= 524288) {
                            if ((A092 & 1) != 0) {
                                return true;
                            }
                            return false;
                        } else if ((A092 & 4) != 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if ((i != 7 || j > ((long) r4.A06(AbstractC000400g.A3c)) * 1024 || A032 == 3) && (A092 & 8) == 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
                if ((A092 & 4) != 0) {
                    return true;
                }
                return false;
            } else if ((A092 & 2) != 0) {
                return true;
            } else {
                if (i != 1) {
                    return false;
                }
                if (j <= 524288 || A032 == 1) {
                    return true;
                }
                return false;
            }
        }
        if ((A092 & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean A05(AnonymousClass0M3 r10) {
        boolean z;
        AnonymousClass0M4 r0;
        if ((!(r10 instanceof AnonymousClass0ZE) || !((AnonymousClass0ZE) r10).A00) && ((r0 = r10.A02) == null || r0.A04 <= 0)) {
            z = false;
        } else {
            z = true;
        }
        return A04(AnonymousClass1XO.A02(r10), r10.A01, false, z, ((AbstractC007503q) r10).A04, AnonymousClass1VY.A0b(r10.A0n.A00), AnonymousClass1VY.A0a(r10.A0G));
    }
}
