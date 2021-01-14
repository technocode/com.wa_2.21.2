package X;

import java.util.Arrays;

/* renamed from: X.0WH  reason: invalid class name */
public class AnonymousClass0WH {
    public static int A0C = 1;
    public float A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public EnumC13980lK A06;
    public boolean A07;
    public boolean A08 = false;
    public float[] A09 = new float[9];
    public float[] A0A = new float[9];
    public AnonymousClass0WI[] A0B = new AnonymousClass0WI[16];

    public AnonymousClass0WH(EnumC13980lK r4) {
        this.A06 = r4;
    }

    public void A00() {
        this.A06 = EnumC13980lK.UNKNOWN;
        this.A04 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = 0.0f;
        this.A08 = false;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2] = null;
        }
        this.A03 = 0;
        this.A05 = 0;
        this.A07 = false;
        Arrays.fill(this.A09, 0.0f);
    }

    public final void A01(AnonymousClass0WI r4) {
        int i = 0;
        while (true) {
            int i2 = this.A03;
            if (i >= i2) {
                AnonymousClass0WI[] r1 = this.A0B;
                int length = r1.length;
                if (i2 >= length) {
                    r1 = (AnonymousClass0WI[]) Arrays.copyOf(r1, length << 1);
                    this.A0B = r1;
                }
                int i3 = this.A03;
                r1[i3] = r4;
                this.A03 = i3 + 1;
                return;
            } else if (this.A0B[i] != r4) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void A02(AnonymousClass0WI r6) {
        int i = this.A03;
        int i2 = 0;
        while (i2 < i) {
            AnonymousClass0WI[] r2 = this.A0B;
            if (r2[i2] != r6) {
                i2++;
            } else {
                while (true) {
                    int i3 = i - 1;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        r2[i2] = r2[i4];
                        i2 = i4;
                    } else {
                        this.A03 = i3;
                        return;
                    }
                }
            }
        }
    }

    public final void A03(AnonymousClass0WI r5) {
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2].A01(r5, false);
        }
        this.A03 = 0;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("");
        A0S.append(this.A02);
        return A0S.toString();
    }
}
