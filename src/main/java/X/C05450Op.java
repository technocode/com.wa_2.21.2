package X;

/* renamed from: X.0Op  reason: invalid class name and case insensitive filesystem */
public class C05450Op {
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public final AnonymousClass0M3 A04;

    public C05450Op(AnonymousClass0M3 r1) {
        this.A04 = r1;
    }

    public static boolean A00(AnonymousClass1XO r2) {
        return r2 == AnonymousClass1XO.A0N || r2 == AnonymousClass1XO.A0M || r2 == AnonymousClass1XO.A0A || r2 == AnonymousClass1XO.A0P || r2 == AnonymousClass1XO.A0Q || r2 == AnonymousClass1XO.A0C || r2 == AnonymousClass1XO.A0L || r2 == AnonymousClass1XO.A0H || r2 == AnonymousClass1XO.A06;
    }

    public synchronized void A01() {
        this.A03 = null;
        this.A02 = null;
        AnonymousClass0M4 r1 = this.A04.A02;
        if (r1 != null) {
            r1.A0M = false;
            this.A01 = true;
            this.A00 = true;
        } else {
            throw null;
        }
    }

    public synchronized void A02(byte[] bArr, int[] iArr) {
        if (iArr != null) {
            this.A03 = iArr;
        }
        if (bArr != null && bArr.length > 0) {
            AnonymousClass0M3 r1 = this.A04;
            if ((r1 instanceof AnonymousClass0ZC) || this.A03 != null) {
                AnonymousClass0M4 r0 = r1.A02;
                if (r0 != null) {
                    r0.A0M = true;
                    this.A02 = bArr;
                    this.A00 = true;
                } else {
                    throw null;
                }
            }
        }
        AnonymousClass0M4 r12 = this.A04.A02;
        if (r12 != null) {
            r12.A0M = false;
            this.A02 = null;
            this.A00 = true;
        } else {
            throw null;
        }
    }

    public synchronized void A03(byte[] bArr, int[] iArr) {
        A02(bArr, iArr);
        this.A01 = true;
    }

    public synchronized boolean A04() {
        return this.A00;
    }

    public synchronized byte[] A05() {
        return this.A02;
    }

    public synchronized int[] A06() {
        return this.A03;
    }
}
