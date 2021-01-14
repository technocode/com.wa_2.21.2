package X;

/* renamed from: X.0Qf  reason: invalid class name */
public class AnonymousClass0Qf extends AnonymousClass0Qg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int[] A06;

    @Override // X.AbstractC05820Qj
    public String A4i() {
        return "SHA-1";
    }

    @Override // X.AbstractC05820Qj
    public int A64() {
        return 20;
    }

    public AnonymousClass0Qf() {
        this.A06 = new int[80];
        reset();
    }

    public AnonymousClass0Qf(AnonymousClass0Qf r2) {
        super(r2);
        this.A06 = new int[80];
        A04(r2);
    }

    public final void A04(AnonymousClass0Qf r5) {
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        int[] iArr = r5.A06;
        System.arraycopy(iArr, 0, this.A06, 0, iArr.length);
        this.A05 = r5.A05;
    }

    @Override // X.AbstractC05800Qh
    public AbstractC05800Qh A37() {
        return new AnonymousClass0Qf(this);
    }

    @Override // X.AbstractC05820Qj
    public int A3r(byte[] bArr, int i) {
        A00();
        AnonymousClass1YV.A0C(this.A00, bArr, i);
        AnonymousClass1YV.A0C(this.A01, bArr, i + 4);
        AnonymousClass1YV.A0C(this.A02, bArr, i + 8);
        AnonymousClass1YV.A0C(this.A03, bArr, i + 12);
        AnonymousClass1YV.A0C(this.A04, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // X.AbstractC05800Qh
    public void AMy(AbstractC05800Qh r1) {
        AnonymousClass0Qf r12 = (AnonymousClass0Qf) r1;
        super.A01(r12);
        A04(r12);
    }

    @Override // X.AnonymousClass0Qg, X.AbstractC05820Qj
    public void reset() {
        super.reset();
        this.A00 = 1732584193;
        this.A01 = -271733879;
        this.A02 = -1732584194;
        this.A03 = 271733878;
        this.A04 = -1009589776;
        this.A05 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A06;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }
}
