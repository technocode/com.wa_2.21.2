package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.01t  reason: invalid class name and case insensitive filesystem */
public class C003601t extends AtomicReference implements AbstractC000900m {
    public C003601t(C003301q r2) {
        super("D");
        r2.A01(this);
    }

    @Override // X.AbstractC000900m
    public void AEa(AnonymousClass0JF r4) {
        int i;
        String str = "D";
        if (r4.A02 && (i = r4.A00) != -1) {
            str = i != 0 ? i != 1 ? Integer.toString(i) : "W" : "M";
        }
        set(str);
    }
}
