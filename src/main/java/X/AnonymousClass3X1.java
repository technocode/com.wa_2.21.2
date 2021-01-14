package X;

import java.security.Provider;
import java.security.Security;

/* renamed from: X.3X1  reason: invalid class name */
public class AnonymousClass3X1 {
    public final Provider A00;

    public AnonymousClass3X1() {
        Provider r0;
        if (Security.getProvider("SC") != null) {
            r0 = Security.getProvider("SC");
        } else {
            r0 = new AnonymousClass014();
        }
        this.A00 = r0;
    }
}
