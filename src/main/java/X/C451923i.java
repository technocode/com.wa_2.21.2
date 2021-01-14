package X;

/* renamed from: X.23i  reason: invalid class name and case insensitive filesystem */
public class C451923i extends AbstractC29841aH {
    public static int[] A00 = new int[2];

    public C451923i(AnonymousClass0WC r3) {
        super(r3);
        this.A05.A04 = EnumC14070lT.LEFT;
        this.A04.A04 = EnumC14070lT.RIGHT;
        this.A01 = 0;
    }

    public static final void A03(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    public void A0B() {
        this.A09 = false;
        this.A05.A00();
        this.A05.A0B = false;
        this.A04.A00();
        this.A04.A0B = false;
        this.A06.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0286, code lost:
        if (r15 != 1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01de, code lost:
        if (r10 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025a, code lost:
        if (r11 != false) goto L_0x025c;
     */
    @Override // X.AbstractC14050lR, X.AbstractC29841aH
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AQn(X.AbstractC14050lR r24) {
        /*
        // Method dump skipped, instructions count: 992
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451923i.AQn(X.0lR):void");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("HorizontalRun ");
        A0S.append(this.A03.A0f);
        return A0S.toString();
    }
}
