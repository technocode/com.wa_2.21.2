package X;

/* renamed from: X.3Bd  reason: invalid class name and case insensitive filesystem */
public class C67953Bd {
    public int A00;
    public AbstractC11690gn A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public byte[] A05;

    public C67953Bd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r4.startsWith("PGP", r3) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67953Bd(X.AbstractC11690gn r7) {
        /*
            r6 = this;
            r6.<init>()
            r6.A01 = r7
            int r0 = r7.A4x()
            byte[] r0 = new byte[r0]
            r6.A05 = r0
            r5 = 0
            r6.A00 = r5
            java.lang.String r4 = r7.A4i()
            r0 = 47
            int r3 = r4.indexOf(r0)
            r2 = 1
            int r3 = r3 + r2
            if (r3 <= 0) goto L_0x0027
            java.lang.String r0 = "PGP"
            boolean r1 = r4.startsWith(r0, r3)
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r6.A04 = r0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r7 instanceof X.AbstractC67993Bh
            if (r0 != 0) goto L_0x003e
            if (r3 <= 0) goto L_0x003b
            java.lang.String r0 = "OpenPGP"
            boolean r0 = r4.startsWith(r0, r3)
            if (r0 == 0) goto L_0x003b
            r5 = 1
        L_0x003b:
            r6.A03 = r5
            return
        L_0x003e:
            r6.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67953Bd.<init>(X.0gn):void");
    }

    public int A00(int i) {
        int length;
        if (!(this instanceof C73313Wi)) {
            int i2 = i + this.A00;
            if (!this.A04) {
                length = i2 % this.A05.length;
            } else if (this.A02) {
                length = (i2 % this.A05.length) - (this.A01.A4x() + 2);
            } else {
                length = i2 % this.A05.length;
            }
            return i2 - length;
        }
        int i3 = i + this.A00;
        int length2 = this.A05.length;
        int i4 = i3 % length2;
        return i4 == 0 ? Math.max(0, i3 - length2) : i3 - i4;
    }

    public void A01() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A05;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.A00 = 0;
                this.A01.reset();
                return;
            }
        }
    }
}
