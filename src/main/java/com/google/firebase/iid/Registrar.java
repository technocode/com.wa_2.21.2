package com.google.firebase.iid;

import X.AbstractC008705g;
import X.AnonymousClass05T;
import X.AnonymousClass07I;
import X.AnonymousClass07M;
import X.AnonymousClass07P;
import X.AnonymousClass07Q;
import X.AnonymousClass07Z;
import X.C001801b;
import X.C008505d;
import X.C008605e;
import X.C36991nM;
import java.util.Arrays;
import java.util.List;

public final class Registrar {
    public final List getComponents() {
        C008605e r3 = new C008605e(FirebaseInstanceId.class, new Class[0]);
        r3.A01(new AnonymousClass07I(AnonymousClass05T.class, 1));
        r3.A01(new AnonymousClass07I(AnonymousClass07M.class, 1));
        r3.A01(new AnonymousClass07I(AnonymousClass07Z.class, 1));
        AbstractC008705g r0 = AnonymousClass07P.A00;
        C001801b.A1R(r0, "Null factory");
        r3.A01 = r0;
        boolean z = false;
        if (r3.A00 == 0) {
            z = true;
        }
        C001801b.A1b(z, "Instantiation type has already been set.");
        r3.A00 = 1;
        C008505d A00 = r3.A00();
        C008605e r1 = new C008605e(C36991nM.class, new Class[0]);
        r1.A01(new AnonymousClass07I(FirebaseInstanceId.class, 1));
        AbstractC008705g r02 = AnonymousClass07Q.A00;
        C001801b.A1R(r02, "Null factory");
        r1.A01 = r02;
        return Arrays.asList(A00, r1.A00());
    }
}
