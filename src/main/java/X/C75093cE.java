package X;

/* renamed from: X.3cE  reason: invalid class name and case insensitive filesystem */
public class C75093cE extends AbstractC74423ar {
    @Override // X.AbstractC05820Qj
    public String A4i() {
        return "SHA-384";
    }

    @Override // X.AbstractC05820Qj
    public int A64() {
        return 48;
    }

    public C75093cE() {
    }

    public C75093cE(C75093cE r1) {
        super(r1);
    }

    @Override // X.AbstractC05800Qh
    public AbstractC05800Qh A37() {
        return new C75093cE(this);
    }

    @Override // X.AbstractC05820Qj
    public int A3r(byte[] bArr, int i) {
        long j = this.A0A;
        if (j > 2305843009213693951L) {
            this.A0B += j >>> 61;
            j &= 2305843009213693951L;
            this.A0A = j;
        }
        long j2 = j << 3;
        long j3 = this.A0B;
        AQm(Byte.MIN_VALUE);
        while (this.A01 != 0) {
            AQm((byte) 0);
        }
        if (this.A00 > 14) {
            A02();
        }
        long[] jArr = this.A0D;
        jArr[14] = j3;
        jArr[15] = j2;
        A02();
        AnonymousClass1YV.A0E(this.A02, bArr, i);
        AnonymousClass1YV.A0E(this.A03, bArr, i + 8);
        AnonymousClass1YV.A0E(this.A04, bArr, i + 16);
        AnonymousClass1YV.A0E(this.A05, bArr, i + 24);
        AnonymousClass1YV.A0E(this.A06, bArr, i + 32);
        AnonymousClass1YV.A0E(this.A07, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // X.AbstractC05800Qh
    public void AMy(AbstractC05800Qh r1) {
        super.A03((AbstractC74423ar) r1);
    }

    @Override // X.AbstractC74423ar, X.AbstractC05820Qj
    public void reset() {
        super.reset();
        this.A02 = -3766243637369397544L;
        this.A03 = 7105036623409894663L;
        this.A04 = -7973340178411365097L;
        this.A05 = 1526699215303891257L;
        this.A06 = 7436329637833083697L;
        this.A07 = -8163818279084223215L;
        this.A08 = -2662702644619276377L;
        this.A09 = 5167115440072839076L;
    }
}
