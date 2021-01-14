package X;

/* renamed from: X.2ia  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56412ia implements AbstractC49902Sq {
    public final /* synthetic */ C04430Ki A00;

    public /* synthetic */ C56412ia(C04430Ki r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC49902Sq
    public final boolean A21(Object obj, AnonymousClass0M3 r8, AnonymousClass0M4 r9) {
        Number number = (Number) obj;
        boolean z = false;
        if (r8.A0m != 1) {
            long j = r9.A0C;
            long intValue = (long) number.intValue();
            if (j != intValue) {
                z = true;
            }
            r9.A0C = intValue;
        }
        return z;
    }
}
