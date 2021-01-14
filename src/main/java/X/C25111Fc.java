package X;

/* renamed from: X.1Fc  reason: invalid class name and case insensitive filesystem */
public final class C25111Fc {
    public C25201Fn A00;
    public final AbstractC25101Fb A01;

    public C25111Fc(AbstractC25101Fb r1) {
        this.A01 = r1;
    }

    public String toString() {
        try {
            C25201Fn r0 = this.A00;
            if (r0 == null) {
                r0 = this.A01.A00();
                this.A00 = r0;
            }
            return r0.toString();
        } catch (C37211np unused) {
            return "";
        }
    }
}
