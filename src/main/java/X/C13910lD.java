package X;

/* renamed from: X.0lD  reason: invalid class name and case insensitive filesystem */
public final class C13910lD {
    public C29781aB A00;
    public AnonymousClass23Z A01 = new AnonymousClass23Z();
    public Object A02;
    public boolean A03;

    public void A00(Object obj) {
        this.A03 = true;
        C29781aB r0 = this.A00;
        if (r0 != null && r0.A00.A06(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public void finalize() {
        AnonymousClass23Z r1;
        C29781aB r2 = this.A00;
        if (r2 != null && !r2.isDone()) {
            StringBuilder A0S = AnonymousClass008.A0S("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            A0S.append(this.A02);
            r2.A00.A05(new C13920lE(A0S.toString()));
        }
        if (!this.A03 && (r1 = this.A01) != null) {
            r1.A06(null);
        }
    }
}
