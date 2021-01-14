package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: X.2RH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2RH implements Callable {
    public final /* synthetic */ C55332gN A00;
    public final /* synthetic */ HashSet A01;

    public /* synthetic */ AnonymousClass2RH(C55332gN r1, HashSet hashSet) {
        this.A00 = r1;
        this.A01 = hashSet;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C55332gN r1 = this.A00;
        return Integer.valueOf(C09200cS.A00().A02(new ArrayList(this.A01), r1.A02.A00, 26, false, false, null));
    }
}
