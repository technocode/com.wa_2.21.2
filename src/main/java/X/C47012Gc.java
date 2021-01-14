package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2Gc  reason: invalid class name and case insensitive filesystem */
public class C47012Gc implements Comparator {
    public final Collator A00;

    public C47012Gc(AnonymousClass01X r3) {
        Collator instance = Collator.getInstance(r3.A0I());
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C12310ht r5 = (C12310ht) obj2;
        String str = ((C12310ht) obj).A06;
        if (str == null && r5.A06 == null) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        String str2 = r5.A06;
        if (str2 == null) {
            return -1;
        }
        return this.A00.compare(str, str2);
    }
}
