package X;

/* renamed from: X.1bJ  reason: invalid class name and case insensitive filesystem */
public class C30411bJ implements AbstractC16260pW {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Object A03 = null;
    public final AbstractC16260pW A04;

    public C30411bJ(AbstractC16260pW r2) {
        this.A04 = r2;
    }

    public void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                this.A04.AGm(this.A01, this.A00);
            } else if (i == 2) {
                this.A04.AJG(this.A01, this.A00);
            } else if (i == 3) {
                this.A04.ADx(this.A01, this.A00, this.A03);
            }
            this.A03 = null;
            this.A02 = 0;
        }
    }

    @Override // X.AbstractC16260pW
    public void ADx(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.A02 != 3 || i > (i4 = (i3 = this.A01) + this.A00) || (i5 = i + i2) < i3 || this.A03 != obj) {
            A00();
            this.A01 = i;
            this.A00 = i2;
            this.A03 = obj;
            this.A02 = 3;
            return;
        }
        int min = Math.min(i, i3);
        this.A01 = min;
        this.A00 = Math.max(i4, i5) - min;
    }

    @Override // X.AbstractC16260pW
    public void AGm(int i, int i2) {
        int i3;
        if (this.A02 == 1 && i >= (i3 = this.A01)) {
            int i4 = this.A00;
            if (i <= i3 + i4) {
                this.A00 = i4 + i2;
                this.A01 = Math.min(i, i3);
                return;
            }
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 1;
    }

    @Override // X.AbstractC16260pW
    public void AHp(int i, int i2) {
        A00();
        this.A04.AHp(i, i2);
    }

    @Override // X.AbstractC16260pW
    public void AJG(int i, int i2) {
        int i3;
        if (this.A02 != 2 || (i3 = this.A01) < i || i3 > i + i2) {
            A00();
            this.A01 = i;
            this.A00 = i2;
            this.A02 = 2;
            return;
        }
        this.A00 += i2;
        this.A01 = i;
    }
}
