package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2Gm  reason: invalid class name and case insensitive filesystem */
public class C47102Gm implements Comparator {
    public final Collator A00;

    public C47102Gm(AnonymousClass01X r3) {
        Collator instance = Collator.getInstance(r3.A0I());
        this.A00 = instance;
        instance.setDecomposition(1);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C007003k r5 = (C007003k) obj2;
        String str = ((C007003k) obj).A0F;
        if (str == null && r5.A0F == null) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        String str2 = r5.A0F;
        if (str2 == null) {
            return -1;
        }
        return this.A00.compare(str, str2);
    }
}
