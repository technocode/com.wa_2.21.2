package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.1OO  reason: invalid class name */
public class AnonymousClass1OO implements Comparator {
    public final Collator A00;

    public AnonymousClass1OO(AnonymousClass01X r3) {
        Collator instance = Collator.getInstance(r3.A0I());
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.A00.compare(((AnonymousClass1Z4) obj).A07(), ((AnonymousClass1Z4) obj2).A07());
    }
}
