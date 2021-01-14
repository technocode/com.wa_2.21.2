package X;

import java.util.Comparator;

/* renamed from: X.1He  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25491He implements Comparator {
    public static final /* synthetic */ C25491He A00 = new C25491He();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C28221Tj r4 = (C28221Tj) obj2;
        Integer num = ((C28221Tj) obj).A03;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = r4.A03;
            if (num2 != null) {
                return intValue - num2.intValue();
            }
            throw null;
        }
        throw null;
    }
}
