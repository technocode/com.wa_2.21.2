package X;

import android.media.AudioTrack;

/* renamed from: X.12n  reason: invalid class name and case insensitive filesystem */
public final class C226212n {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C226112m A05;

    public C226212n(AudioTrack audioTrack) {
        if (AnonymousClass0W2.A00 >= 19) {
            this.A05 = new C226112m(audioTrack);
            A00();
            return;
        }
        this.A05 = null;
        A01(3);
    }

    public void A00() {
        if (this.A05 != null) {
            A01(0);
        }
    }

    public final void A01(int i) {
        this.A00 = i;
        if (i == 0) {
            this.A03 = 0;
            this.A01 = -1;
            this.A02 = System.nanoTime() / 1000;
            this.A04 = 5000;
        } else if (i == 1) {
            this.A04 = 5000;
        } else if (i == 2 || i == 3) {
            this.A04 = 10000000;
        } else if (i == 4) {
            this.A04 = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
