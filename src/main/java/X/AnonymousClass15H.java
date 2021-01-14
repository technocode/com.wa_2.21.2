package X;

import java.util.Arrays;

/* renamed from: X.15H  reason: invalid class name */
public final class AnonymousClass15H {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass158[] A03;
    public final int A04;
    public final boolean A05;
    public final AnonymousClass158[] A06;

    public AnonymousClass15H() {
        if (1 != 0) {
            this.A05 = true;
            this.A04 = 32768;
            this.A01 = 0;
            this.A03 = new AnonymousClass158[100];
            this.A06 = new AnonymousClass158[1];
            return;
        }
        throw new IllegalArgumentException();
    }

    public synchronized void A00() {
        int i = this.A02;
        int i2 = this.A04;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.A00);
        int i3 = this.A01;
        if (max < i3) {
            Arrays.fill(this.A03, max, i3, (Object) null);
            this.A01 = max;
        }
    }

    public synchronized void A01(int i) {
        boolean z = false;
        if (i < this.A02) {
            z = true;
        }
        this.A02 = i;
        if (z) {
            A00();
        }
    }

    public synchronized void A02(AnonymousClass158[] r7) {
        int i = this.A01;
        int length = r7.length;
        int i2 = i + length;
        AnonymousClass158[] r1 = this.A03;
        AnonymousClass158[] r4 = r1;
        int length2 = r1.length;
        if (i2 >= length2) {
            r4 = (AnonymousClass158[]) Arrays.copyOf(r1, Math.max(length2 << 1, i2));
            this.A03 = r4;
        }
        for (AnonymousClass158 r2 : r7) {
            int i3 = this.A01;
            this.A01 = i3 + 1;
            r4[i3] = r2;
        }
        this.A00 -= length;
        notifyAll();
    }
}
