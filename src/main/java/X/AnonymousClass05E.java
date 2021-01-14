package X;

import java.security.PrivilegedAction;

/* renamed from: X.05E  reason: invalid class name */
public class AnonymousClass05E implements PrivilegedAction {
    public final /* synthetic */ AnonymousClass014 A00;

    public AnonymousClass05E(AnonymousClass014 r1) {
        this.A00 = r1;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        AnonymousClass014 r2 = this.A00;
        r2.A01("org.spongycastle.jcajce.provider.digest.", AnonymousClass014.A00);
        r2.A01("org.spongycastle.jcajce.provider.symmetric.", AnonymousClass014.A02);
        r2.A01("org.spongycastle.jcajce.provider.keystore.", AnonymousClass014.A01);
        return null;
    }
}
