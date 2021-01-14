package X;

/* renamed from: X.1aw  reason: invalid class name and case insensitive filesystem */
public class C30211aw implements AbstractC15390o0 {
    public int A00;
    public final AnonymousClass0QB A01;
    public final boolean A02;

    public C30211aw(AnonymousClass0QB r1, boolean z) {
        this.A02 = z;
        this.A01 = r1;
    }

    public void A00() {
        AnonymousClass0O2 r0;
        boolean z = false;
        if (this.A00 > 0) {
            z = true;
        }
        AnonymousClass0QB r4 = this.A01;
        AnonymousClass0LW r3 = r4.A02;
        for (AnonymousClass037 r1 : r3.A0Q.A04()) {
            r1.A0P(null);
            if (z && (r0 = r1.A0C) != null && r0.A0C) {
                r1.A0J();
            }
        }
        r3.A0O(r4, this.A02, !z, true);
    }
}
