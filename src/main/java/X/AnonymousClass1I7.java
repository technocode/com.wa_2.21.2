package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.1I7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I7 implements Comparator {
    public final /* synthetic */ Collator A00;

    public /* synthetic */ AnonymousClass1I7(Collator collator) {
        this.A00 = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.A00.compare(((AnonymousClass1LY) obj).A03, ((AnonymousClass1LY) obj2).A03);
    }
}
