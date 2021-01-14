package X;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1LL  reason: invalid class name */
public class AnonymousClass1LL implements Comparator {
    public final Collator A00;
    public final List A01;

    public AnonymousClass1LL(Locale locale) {
        this.A00 = Collator.getInstance(locale);
        List list = (List) C03190Fd.A06.getOrDefault(AbstractC002201f.A04(locale), null);
        this.A01 = list == null ? Collections.emptyList() : list;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AnonymousClass1LK r6 = (AnonymousClass1LK) obj;
        AnonymousClass1LK r7 = (AnonymousClass1LK) obj2;
        List list = this.A01;
        int indexOf = list.indexOf(r6.A03);
        int indexOf2 = list.indexOf(r7.A03);
        if (indexOf == -1) {
            if (indexOf2 != -1) {
                return 1;
            }
            Collator collator = this.A00;
            String str = r6.A01;
            if (str.startsWith("ال")) {
                str = str.substring(2);
            }
            String str2 = r7.A01;
            if (str2.startsWith("ال")) {
                str2 = str2.substring(2);
            }
            return collator.compare(str, str2);
        } else if (indexOf2 != -1) {
            return indexOf - indexOf2;
        } else {
            return -1;
        }
    }
}
