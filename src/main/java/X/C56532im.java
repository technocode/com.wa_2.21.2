package X;

/* renamed from: X.2im  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56532im implements AbstractC49902Sq {
    public final /* synthetic */ C04430Ki A00;

    public /* synthetic */ C56532im(C04430Ki r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC49902Sq
    public final boolean A21(Object obj, AnonymousClass0M3 r4, AnonymousClass0M4 r5) {
        Number number = (Number) obj;
        if (this.A00 != null) {
            r5.A0C = (long) number.intValue();
            return true;
        }
        throw null;
    }
}
