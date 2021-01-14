package X;

import java.util.ArrayDeque;

/* renamed from: X.1hq  reason: invalid class name and case insensitive filesystem */
public final class C34061hq implements AnonymousClass13H, AnonymousClass13B {
    public static final int A0I = AnonymousClass0W2.A01("qt  ");
    public static final AnonymousClass13D A0J = C34001hk.A00;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = -1;
    public long A07;
    public long A08;
    public AnonymousClass13C A09;
    public C233815n A0A;
    public boolean A0B;
    public AnonymousClass13Q[] A0C;
    public long[][] A0D;
    public final C233815n A0E = new C233815n(16);
    public final C233815n A0F = new C233815n(4);
    public final C233815n A0G = new C233815n(C233615l.A00);
    public final ArrayDeque A0H = new ArrayDeque();

    @Override // X.AnonymousClass13H
    public boolean ABX() {
        return true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1170:0x0e5a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v95, types: [X.13T[]] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0544, code lost:
        if (r3 != 0) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b23, code lost:
        if (r15 <= 0) goto L_0x0b25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x0edc, code lost:
        if (r3 != 0) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x0ee8, code lost:
        if (r3 != -65536) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0ef4, code lost:
        if (r13 == 0) goto L_0x051d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1106:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0a63  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r105) {
        /*
        // Method dump skipped, instructions count: 6008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34061hq.A00(long):void");
    }

    @Override // X.AnonymousClass13H
    public long A68() {
        return this.A08;
    }

    @Override // X.AnonymousClass13H
    public AnonymousClass13G A8w(long j) {
        long j2;
        long j3;
        int A012;
        long j4 = j;
        AnonymousClass13Q[] r1 = this.A0C;
        if (r1.length == 0) {
            return new AnonymousClass13G(AnonymousClass13I.A02);
        }
        long j5 = -1;
        int i = this.A02;
        if (i != -1) {
            AnonymousClass13U r14 = r1[i].A03;
            int A002 = r14.A00(j4);
            if (A002 == -1) {
                A002 = r14.A01(j4);
            }
            if (A002 == -1) {
                return new AnonymousClass13G(AnonymousClass13I.A02);
            }
            long[] jArr = r14.A07;
            long j6 = jArr[A002];
            long[] jArr2 = r14.A06;
            j3 = jArr2[A002];
            if (j6 >= j || A002 >= r14.A01 - 1 || (A012 = r14.A01(j4)) == -1 || A012 == A002) {
                j2 = -9223372036854775807L;
            } else {
                j2 = jArr[A012];
                j5 = jArr2[A012];
            }
            j4 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            j2 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            AnonymousClass13Q[] r9 = this.A0C;
            if (i2 >= r9.length) {
                break;
            }
            if (i2 != this.A02) {
                AnonymousClass13U r142 = r9[i2].A03;
                int A003 = r142.A00(j4);
                if (A003 == -1) {
                    A003 = r142.A01(j4);
                }
                if (A003 != -1) {
                    j3 = Math.min(r142.A06[A003], j3);
                }
                if (j2 != -9223372036854775807L) {
                    int A004 = r142.A00(j2);
                    if (A004 == -1) {
                        A004 = r142.A01(j2);
                    }
                    if (A004 != -1) {
                        j5 = Math.min(r142.A06[A004], j5);
                    }
                }
            }
            i2++;
        }
        AnonymousClass13I r2 = new AnonymousClass13I(j4, j3);
        if (j2 == -9223372036854775807L) {
            return new AnonymousClass13G(r2);
        }
        return new AnonymousClass13G(r2, new AnonymousClass13I(j2, j5));
    }
}
