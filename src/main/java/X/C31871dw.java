package X;

/* renamed from: X.1dw  reason: invalid class name and case insensitive filesystem */
public class C31871dw implements AbstractC18510tT {
    public String A00;
    public boolean A01;

    public C31871dw(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    @Override // X.AbstractC18510tT
    public boolean ABy(C18540tW r7, AbstractC31941e3 r8) {
        String str;
        if (!this.A01 || this.A00 != null) {
            str = this.A00;
        } else {
            str = r8.A00();
        }
        AbstractC18840u0 r0 = ((C18850u1) r8).A00;
        if (r0 != null) {
            int i = 0;
            for (C18850u1 r02 : r0.A5H()) {
                if (str == null || r02.A00().equals(str)) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        if (!this.A01) {
            return String.format("only-child", new Object[0]);
        }
        return String.format("only-of-type <%s>", this.A00);
    }
}
