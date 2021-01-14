package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.140  reason: invalid class name */
public final class AnonymousClass140 {
    public int A00;
    public int A01 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public AnonymousClass126 A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public int[] A0B = new int[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public int[] A0C = new int[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public int[] A0D = new int[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public long[] A0E = new long[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public long[] A0F = new long[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public AnonymousClass126[] A0G = new AnonymousClass126[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];
    public AnonymousClass13J[] A0H = new AnonymousClass13J[SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS];

    public final long A00(int i) {
        long j = this.A05;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = this.A04 + (i - 1);
            int i3 = this.A01;
            if (i2 >= i3) {
                i2 -= i3;
            }
            for (int i4 = 0; i4 < i; i4++) {
                j2 = Math.max(j2, this.A0F[i2]);
                if ((this.A0B[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
            }
        }
        this.A05 = Math.max(j, j2);
        int i5 = this.A02 - i;
        this.A02 = i5;
        this.A00 += i;
        int i6 = this.A04 + i;
        this.A04 = i6;
        int i7 = this.A01;
        if (i6 >= i7) {
            i6 -= i7;
            this.A04 = i6;
        }
        int i8 = this.A03 - i;
        this.A03 = i8;
        if (i8 < 0) {
            this.A03 = 0;
        }
        if (i5 != 0) {
            return this.A0E[i6];
        }
        if (i6 == 0) {
            i6 = i7;
        }
        int i9 = i6 - 1;
        return this.A0E[i9] + ((long) this.A0C[i9]);
    }

    public synchronized boolean A01() {
        boolean z;
        z = false;
        if (this.A03 != this.A02) {
            z = true;
        }
        return z;
    }
}
