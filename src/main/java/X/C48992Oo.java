package X;

import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.2Oo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C48992Oo implements Comparator {
    public final /* synthetic */ Collator A00;

    public /* synthetic */ C48992Oo(Collator collator) {
        this.A00 = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        int compare = this.A00.compare((String) entry.getValue(), (String) entry2.getValue());
        if (compare == 0) {
            return compare;
        }
        String str = AnonymousClass089.A0B;
        if (str.equals(entry.getValue())) {
            return -1;
        }
        if (!str.equals(entry2.getValue())) {
            String str2 = AnonymousClass089.A0E;
            if (str2.equals(entry.getValue())) {
                return -1;
            }
            if (str2.equals(entry2.getValue())) {
                return 1;
            }
            return compare;
        }
        return 1;
    }
}
