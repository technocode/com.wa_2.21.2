package X;

import java.util.Arrays;

/* renamed from: X.0WA  reason: invalid class name */
public class AnonymousClass0WA extends AnonymousClass0WB {
    public int A00 = 0;
    public int A01 = 263;
    public int A02;
    public int A03;
    public int A04 = 0;
    public AnonymousClass0WD A05 = new AnonymousClass0WD();
    public AbstractC14030lP A06 = null;
    public C14040lQ A07 = new C14040lQ(this);
    public C14060lS A08 = new C14060lS(this);
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public AnonymousClass0WF[] A0C = new AnonymousClass0WF[4];
    public AnonymousClass0WF[] A0D = new AnonymousClass0WF[4];

    @Override // X.AnonymousClass0WB, X.AnonymousClass0WC
    public void A07() {
        this.A05.A06();
        this.A02 = 0;
        this.A03 = 0;
        super.A07();
    }

    @Override // X.AnonymousClass0WC
    public void A0F(boolean z, boolean z2) {
        super.A0F(z, z2);
        int size = ((AnonymousClass0WB) this).A00.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0WC) ((AnonymousClass0WB) this).A00.get(i)).A0F(z, z2);
        }
    }

    public void A0J(AnonymousClass0WC r7, int i) {
        if (i == 0) {
            int i2 = this.A00 + 1;
            AnonymousClass0WF[] r4 = this.A0C;
            int length = r4.length;
            if (i2 >= length) {
                r4 = (AnonymousClass0WF[]) Arrays.copyOf(r4, length << 1);
                this.A0C = r4;
            }
            int i3 = this.A00;
            r4[i3] = new AnonymousClass0WF(r7, 0, this.A0A);
            this.A00 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.A04 + 1;
            AnonymousClass0WF[] r3 = this.A0D;
            int length2 = r3.length;
            if (i4 >= length2) {
                r3 = (AnonymousClass0WF[]) Arrays.copyOf(r3, length2 << 1);
                this.A0D = r3;
            }
            int i5 = this.A04;
            r3[i5] = new AnonymousClass0WF(r7, 1, this.A0A);
            this.A04 = i5 + 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r15 == 0) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013d A[EDGE_INSN: B:83:0x013d->B:68:0x013d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(boolean r14, int r15) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WA.A0K(boolean, int):boolean");
    }
}
