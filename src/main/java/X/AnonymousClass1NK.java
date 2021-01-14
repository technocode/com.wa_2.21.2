package X;

import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.1NK  reason: invalid class name */
public class AnonymousClass1NK implements Comparator {
    public final C014308b A00;
    public final C006903j A01;
    public final Collator A02;

    public AnonymousClass1NK(C006903j r3, C014308b r4, AnonymousClass01X r5) {
        this.A01 = r3;
        this.A00 = r4;
        Collator instance = Collator.getInstance(r5.A0I());
        this.A02 = instance;
        instance.setDecomposition(1);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        long j;
        long j2;
        C007003k r9 = (C007003k) obj;
        C007003k r10 = (C007003k) obj2;
        Jid A022 = r9.A02(AnonymousClass02N.class);
        if (A022 != null) {
            AnonymousClass02N r3 = (AnonymousClass02N) A022;
            Jid A023 = r10.A02(AnonymousClass02N.class);
            if (A023 != null) {
                AnonymousClass02N r2 = (AnonymousClass02N) A023;
                C006903j r1 = this.A01;
                if (r1.A0C(r3)) {
                    j = r1.A04(r3);
                } else {
                    j = 0;
                }
                if (r1.A0C(r2)) {
                    j2 = r1.A04(r2);
                } else {
                    j2 = 0;
                }
                if (j == 0 && j2 == 0) {
                    Collator collator = this.A02;
                    C014308b r0 = this.A00;
                    return collator.compare(r0.A08(r9, false), r0.A08(r10, false));
                } else if (j == 0) {
                    return 1;
                } else {
                    if (j2 == 0) {
                        return -1;
                    }
                    if (j != j2) {
                        return j < j2 ? 1 : -1;
                    }
                    C014308b r02 = this.A00;
                    return r02.A08(r9, false).compareTo(r02.A08(r10, false));
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
