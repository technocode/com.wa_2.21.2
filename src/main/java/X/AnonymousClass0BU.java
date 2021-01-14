package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.0BU  reason: invalid class name */
public final class AnonymousClass0BU implements AbstractC01950Ab {
    @Override // X.AbstractC01950Ab
    public String A7a() {
        return "m";
    }

    @Override // X.AbstractC01950Ab
    public Set A7P(AbstractC007503q r2) {
        if (r2.A0j) {
            return Collections.singleton("s");
        }
        return null;
    }

    @Override // X.AbstractC01950Ab
    public AnonymousClass1V2 A7b(C08680bX r3) {
        if (r3.A08 == null) {
            return null;
        }
        if (r3.A01().booleanValue()) {
            AnonymousClass1V2 r1 = new AnonymousClass1V2();
            r1.A00 = Collections.singleton("s");
            return r1;
        }
        AnonymousClass1V2 r12 = new AnonymousClass1V2();
        r12.A01 = Collections.singleton("s");
        return r12;
    }
}
