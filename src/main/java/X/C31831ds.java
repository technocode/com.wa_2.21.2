package X;

/* renamed from: X.1ds  reason: invalid class name and case insensitive filesystem */
public class C31831ds implements AbstractC18510tT {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public C31831ds(int i, int i2, boolean z, boolean z2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
    }

    @Override // X.AbstractC18510tT
    public boolean ABy(C18540tW r8, AbstractC31941e3 r9) {
        String str;
        int i;
        int i2;
        int i3;
        if (!this.A04 || this.A02 != null) {
            str = this.A02;
        } else {
            str = r9.A00();
        }
        AbstractC18840u0 r0 = ((C18850u1) r9).A00;
        if (r0 != null) {
            i = 0;
            i2 = 0;
            for (C18850u1 r02 : r0.A5H()) {
                if (r02 == r9) {
                    i = i2;
                }
                if (str == null || r02.A00().equals(str)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        if (this.A03) {
            i3 = i + 1;
        } else {
            i3 = i2 - i;
        }
        int i4 = this.A00;
        if (i4 != 0) {
            int i5 = i3 - this.A01;
            if (i5 % i4 != 0) {
                return false;
            }
            int signum = Integer.signum(i5);
            if (signum == 0 || signum == Integer.signum(i4)) {
                return true;
            }
            return false;
        } else if (i3 == this.A01) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String str;
        if (this.A03) {
            str = "";
        } else {
            str = "last-";
        }
        if (this.A04) {
            return String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
        }
        return String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }
}
