package X;

/* renamed from: X.1Bl  reason: invalid class name and case insensitive filesystem */
public final class C24561Bl {
    public static final AbstractC34691j1 A00 = new C458226m();
    public static final AbstractC34691j1 A01 = new C458326n();
    public static final C34711j3 A02 = new C34711j3();
    public static final C34711j3 A03 = new C34711j3();
    public static final AnonymousClass16z A04 = new AnonymousClass16z("SignIn.API", A00, A02);

    static {
        C001801b.A1V("profile", "scopeUri must not be null or empty");
        C001801b.A1V("email", "scopeUri must not be null or empty");
        AbstractC34691j1 r2 = A01;
        C34711j3 r1 = A03;
        C001801b.A1R(r2, "Cannot construct an Api with a null ClientBuilder");
        C001801b.A1R(r1, "Cannot construct an Api with a null ClientKey");
    }
}
