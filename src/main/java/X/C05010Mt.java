package X;

/* renamed from: X.0Mt  reason: invalid class name and case insensitive filesystem */
public final class C05010Mt {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = Integer.MAX_VALUE;
    public int A04;
    public int A05;
    public int A06 = 100;
    public int A07 = 67108864;
    public int A08;
    public final boolean A09;
    public final byte[] A0A;

    public C05010Mt(byte[] bArr, int i, int i2, boolean z) {
        this.A0A = bArr;
        this.A01 = i2 + i;
        this.A00 = i;
        this.A08 = -i;
        this.A09 = z;
    }

    public int A00() {
        int i = this.A03;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.A08 + this.A00);
    }

    public int A01() {
        int i = this.A00;
        if (this.A01 - i < 4) {
            A0F(4);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        byte[] bArr = this.A0A;
        this.A00 = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02() {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05010Mt.A02():int");
    }

    public int A03() {
        if (this.A00 == this.A01) {
            A0G(1);
            this.A04 = 0;
            return 0;
        }
        int A022 = A02();
        this.A04 = A022;
        if ((A022 >>> 3) != 0) {
            return A022;
        }
        throw new C04190Jk("Protocol message contained an invalid tag (zero).");
    }

    public int A04(int i) {
        if (i >= 0) {
            int i2 = this.A08 + this.A00 + i;
            int i3 = this.A03;
            if (i2 <= i3) {
                this.A03 = i2;
                A0B();
                return i3;
            }
            throw new C04190Jk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C04190Jk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public long A05() {
        int i = this.A00;
        if (this.A01 - i < 8) {
            A0F(8);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        byte[] bArr = this.A0A;
        this.A00 = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (((long) r6[r5]) < 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06() {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05010Mt.A06():long");
    }

    public long A07() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A00;
            if (i2 == this.A01) {
                A0F(1);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            byte[] bArr = this.A0A;
            this.A00 = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw new C04190Jk("CodedInputStream encountered a malformed varint.");
    }

    public AnonymousClass071 A08() {
        int A022 = A02();
        int i = this.A01;
        int i2 = this.A00;
        if (A022 <= i - i2 && A022 > 0) {
            AnonymousClass071 A002 = AnonymousClass071.A00(this.A0A, i2, A022);
            this.A00 += A022;
            return A002;
        } else if (A022 == 0) {
            return AnonymousClass071.A01;
        } else {
            A0E(A022);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public AnonymousClass076 A09(AbstractC37151nd r4, AnonymousClass1FL r5) {
        int A022 = A02();
        int i = this.A05;
        if (i < 100) {
            int A042 = A04(A022);
            this.A05 = i + 1;
            AnonymousClass078 A012 = AnonymousClass078.A01(((AnonymousClass275) r4).A00, this, r5);
            A0C(0);
            this.A05--;
            this.A03 = A042;
            A0B();
            return A012;
        }
        throw new C04190Jk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public String A0A() {
        int A022 = A02();
        int i = this.A01;
        int i2 = this.A00;
        if (A022 <= i - i2 && A022 > 0) {
            String str = new String(this.A0A, i2, A022, AnonymousClass07G.A00);
            this.A00 += A022;
            return str;
        } else if (A022 == 0) {
            return "";
        } else {
            if (A022 <= i) {
                A0F(A022);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            A0E(A022);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final void A0B() {
        int i = this.A01 + this.A02;
        this.A01 = i;
        int i2 = this.A08 + i;
        int i3 = this.A03;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.A02 = i4;
            this.A01 = i - i4;
            return;
        }
        this.A02 = 0;
    }

    public void A0C(int i) {
        if (this.A04 != i) {
            throw new C04190Jk("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0D(int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        if (i <= i2 - i3) {
            if (i >= 0) {
                this.A00 = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i4 = this.A08;
            int i5 = i4 + i3 + i;
            int i6 = this.A03;
            if (i5 <= i6) {
                this.A00 = i2;
                A0F(1);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            A0D((i6 - i4) - i3);
            throw new C04190Jk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C04190Jk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void A0E(int i) {
        if (i <= 0) {
            throw new C04190Jk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.A08;
        int i3 = this.A00;
        int i4 = i2 + i3 + i;
        if (i4 <= 67108864) {
            int i5 = this.A03;
            if (i4 <= i5) {
                throw new C04190Jk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            A0D((i5 - i2) - i3);
            throw new C04190Jk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C04190Jk("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void A0F(int i) {
        A0G(i);
        throw new C04190Jk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void A0G(int i) {
        int i2 = this.A00;
        if (i2 + i <= this.A01) {
            throw new IllegalStateException(AnonymousClass008.A0G("refillBuffer() called when ", i, " bytes were already available in buffer"));
        } else if (this.A08 + i2 + i <= this.A03) {
        }
    }

    public boolean A0H() {
        return A06() != 0;
    }
}
