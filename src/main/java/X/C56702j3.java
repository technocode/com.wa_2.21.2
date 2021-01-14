package X;

/* renamed from: X.2j3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56702j3 implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0CH A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C56702j3(AnonymousClass0CH r1, AnonymousClass0M3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0M3 r4 = this.A01;
        C49992Sz r6 = (C49992Sz) obj;
        synchronized (r4) {
            AnonymousClass0M4 r3 = r4.A02;
            if (r3 != null) {
                r3.A0P = false;
                r3.A0a = true;
                r3.A0C = 0;
                r3.A0L = true;
                r3.A0Y = r6.A00;
                r3.A0Z = r6.A01;
            } else {
                throw null;
            }
        }
    }
}
