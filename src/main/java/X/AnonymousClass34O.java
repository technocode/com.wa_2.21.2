package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.34O  reason: invalid class name */
public abstract class AnonymousClass34O {
    public final int A00;
    public final long A01;
    public final int[] A02;

    public AnonymousClass34O(long j, int i, int[] iArr) {
        this.A01 = j;
        this.A00 = i;
        if (iArr == null) {
            this.A02 = new int[i];
        } else {
            this.A02 = iArr;
        }
    }

    public int A00(int i) {
        long j;
        if (this instanceof C72053Ri) {
            return ((Number) ((C72053Ri) this).A00.get(i)).intValue();
        }
        C72043Rh r1 = (C72043Rh) this;
        if (i == r1.A00 - 1) {
            long j2 = r1.A01;
            j = Math.min(j2, ((AnonymousClass34O) r1).A01 % j2);
        } else {
            j = r1.A01;
        }
        return (int) j;
    }

    public int A01(long j) {
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        if (j >= 0) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        if (j >= this.A01) {
            z = false;
        }
        AnonymousClass00E.A07(z);
        int i2 = 0;
        while (i < this.A00) {
            i2 += A00(i);
            if (j < ((long) i2)) {
                return i;
            }
            i++;
        }
        return i;
    }

    public long A02() {
        long j = 0;
        for (int i = 0; i < this.A00; i++) {
            j += A04(i);
        }
        return j;
    }

    public long A03(int i) {
        long j = 0;
        int i2 = 0;
        while (i2 < i && i2 < this.A00) {
            j += (long) A00(i2);
            i2++;
        }
        return j;
    }

    public final synchronized long A04(int i) {
        return (long) this.A02[i];
    }

    public long A05(long j) {
        int i;
        if (j >= this.A01) {
            return -1;
        }
        int A012 = A01(j);
        do {
            A012++;
            i = this.A00;
            if (A012 >= i) {
                break;
            }
        } while (A04(A012) == 0);
        if (A012 == i) {
            return -1;
        }
        return A03(A012);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(long r7) {
        /*
            r6 = this;
            long r4 = r6.A01
            r2 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0009
            return r2
        L_0x0009:
            int r4 = r6.A01(r7)
        L_0x000d:
            int r1 = r6.A00
            if (r4 >= r1) goto L_0x001a
            boolean r0 = r6.A0A(r4)
            if (r0 == 0) goto L_0x001a
            int r4 = r4 + 1
            goto L_0x000d
        L_0x001a:
            if (r4 != r1) goto L_0x001d
            return r2
        L_0x001d:
            long r2 = r6.A03(r4)
            long r0 = r6.A04(r4)
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34O.A06(long):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A07(long r6) {
        /*
            r5 = this;
            long r1 = r5.A01
            r3 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0009
            return r3
        L_0x0009:
            int r2 = r5.A01(r6)
        L_0x000d:
            int r1 = r5.A00
            if (r2 >= r1) goto L_0x001a
            boolean r0 = r5.A0A(r2)
            if (r0 == 0) goto L_0x001a
            int r2 = r2 + 1
            goto L_0x000d
        L_0x001a:
            if (r2 != r1) goto L_0x001d
            return r3
        L_0x001d:
            long r0 = r5.A03(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34O.A07(long):long");
    }

    public List A08(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (j2 > 0) {
            int A012 = A01(j);
            long A03 = j - A03(A012);
            boolean z2 = false;
            boolean z3 = false;
            if (A03 >= 0) {
                z3 = true;
            }
            AnonymousClass00E.A07(z3);
            if (A03 < ((long) A00(A012))) {
                z2 = true;
            }
            AnonymousClass00E.A07(z2);
            int A013 = A01(j);
            long A04 = A04(A013);
            if (A03 <= A04) {
                long j3 = A03 + j2;
                if (j3 < A04) {
                    return arrayList;
                }
                int A002 = A00(A013);
                long j4 = (long) A002;
                if (j3 > j4) {
                    if (z) {
                        synchronized (this) {
                            this.A02[A013] = A002;
                        }
                    }
                    j2 = j3 - j4;
                    int i = A013 + 1;
                    if (i < this.A00) {
                        arrayList.add(Integer.valueOf(A013));
                        j = A03(i);
                    } else {
                        throw new IllegalStateException("downloaded more bytes than chunks");
                    }
                } else {
                    if (z) {
                        int i2 = (int) j3;
                        synchronized (this) {
                            this.A02[A013] = i2;
                        }
                    }
                    if (j3 == ((long) A00(A013))) {
                        arrayList.add(Integer.valueOf(A013));
                    }
                    j2 = 0;
                }
            } else {
                throw new IllegalStateException("gap in downloaded chunk");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(java.io.File r5) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34O.A09(java.io.File):void");
    }

    public synchronized boolean A0A(int i) {
        boolean z;
        z = false;
        if (this.A02[i] == A00(i)) {
            z = true;
        }
        return z;
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("totalBytes: ");
        sb2.append(this.A01);
        sb2.append(", ");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("chunkCount: ");
        int i = this.A00;
        sb3.append(i);
        sb3.append(", ");
        sb.append(sb3.toString());
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            if (!A0A(i3)) {
                if (i2 >= 0) {
                    int i4 = i3 - 1;
                    if (i4 != i2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("-");
                        sb4.append(i4);
                        sb4.append("]");
                        sb.append(sb4.toString());
                    } else {
                        sb.append("]");
                    }
                    i2 = -1;
                }
                int[] iArr = this.A02;
                if (iArr[i3] > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("[");
                    sb5.append(i3);
                    sb5.append("] ");
                    sb5.append(iArr[i3]);
                    sb5.append(", ");
                    sb.append(sb5.toString());
                }
            } else if (i2 < 0) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("[");
                sb6.append(i3);
                sb.append(sb6.toString());
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("[");
            sb7.append(i2);
            sb7.append("-");
            sb7.append(i - 1);
            sb7.append("]");
            sb.append(sb7.toString());
        }
        return sb.toString();
    }
}
