package X;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.0S8  reason: invalid class name */
public final class AnonymousClass0S8 {
    public final Runnable A00;
    public final ArrayDeque A01 = new ArrayDeque();

    public AnonymousClass0S8(Runnable runnable) {
        this.A00 = runnable;
    }

    public void A00() {
        Iterator descendingIterator = this.A01.descendingIterator();
        while (descendingIterator.hasNext()) {
            AnonymousClass0SU r1 = (AnonymousClass0SU) descendingIterator.next();
            if (r1.A01) {
                AnonymousClass0LW r12 = ((AnonymousClass0ST) r1).A00;
                r12.A0q(true);
                if (r12.A0N.A01) {
                    r12.A0t();
                    return;
                } else {
                    r12.A01.A00();
                    return;
                }
            }
        }
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }
}
