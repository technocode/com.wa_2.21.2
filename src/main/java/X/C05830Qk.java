package X;

/* renamed from: X.0Qk  reason: invalid class name and case insensitive filesystem */
public class C05830Qk extends AnonymousClass0Qg {
    public static final int[] A0A = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int[] A09;

    public static final int A00(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static final int A01(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    @Override // X.AbstractC05820Qj
    public String A4i() {
        return "SHA-256";
    }

    @Override // X.AbstractC05820Qj
    public int A64() {
        return 32;
    }

    public C05830Qk() {
        this.A09 = new int[64];
        reset();
    }

    public C05830Qk(C05830Qk r2) {
        super(r2);
        this.A09 = new int[64];
        A04(r2);
    }

    public final void A04(C05830Qk r5) {
        super.A01(r5);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        this.A05 = r5.A05;
        this.A06 = r5.A06;
        this.A07 = r5.A07;
        int[] iArr = r5.A09;
        System.arraycopy(iArr, 0, this.A09, 0, iArr.length);
        this.A08 = r5.A08;
    }

    @Override // X.AbstractC05800Qh
    public AbstractC05800Qh A37() {
        return new C05830Qk(this);
    }

    @Override // X.AbstractC05820Qj
    public int A3r(byte[] bArr, int i) {
        A00();
        AnonymousClass1YV.A0C(this.A00, bArr, i);
        AnonymousClass1YV.A0C(this.A01, bArr, i + 4);
        AnonymousClass1YV.A0C(this.A02, bArr, i + 8);
        AnonymousClass1YV.A0C(this.A03, bArr, i + 12);
        AnonymousClass1YV.A0C(this.A04, bArr, i + 16);
        AnonymousClass1YV.A0C(this.A05, bArr, i + 20);
        AnonymousClass1YV.A0C(this.A06, bArr, i + 24);
        AnonymousClass1YV.A0C(this.A07, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // X.AbstractC05800Qh
    public void AMy(AbstractC05800Qh r1) {
        A04((C05830Qk) r1);
    }

    @Override // X.AnonymousClass0Qg, X.AbstractC05820Qj
    public void reset() {
        super.reset();
        this.A00 = 1779033703;
        this.A01 = -1150833019;
        this.A02 = 1013904242;
        this.A03 = -1521486534;
        this.A04 = 1359893119;
        this.A05 = -1694144372;
        this.A06 = 528734635;
        this.A07 = 1541459225;
        this.A08 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A09;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }
}
