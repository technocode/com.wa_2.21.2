package X;

/* renamed from: X.16z  reason: invalid class name */
public final class AnonymousClass16z {
    public final AbstractC34691j1 A00;
    public final C34711j3 A01;
    public final String A02;

    public AnonymousClass16z(String str, AbstractC34691j1 r3, C34711j3 r4) {
        C001801b.A1R(r3, "Cannot construct an Api with a null ClientBuilder");
        C001801b.A1R(r4, "Cannot construct an Api with a null ClientKey");
        this.A02 = str;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final C236316w A00() {
        C34711j3 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
