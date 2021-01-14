package X;

import android.util.Pair;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0bR  reason: invalid class name and case insensitive filesystem */
public final class C08620bR extends ArrayList<AbstractC08640bT> {
    public static final C08630bS A00 = new C08630bS(Integer.valueOf((int) R.string.search_section_messages), 1);
    public static final C08630bS A01 = new C08630bS(Boolean.FALSE, 13);
    public static final C08630bS A02 = new C08630bS(Boolean.TRUE, 13);
    public static final C08630bS A03 = new C08630bS(Integer.valueOf((int) R.string.search_section_starred_messages), 1);
    public C08660bV latestBucket = null;
    public C08650bU timeBucketsProvider = new C08650bU(AnonymousClass01X.A00());

    public int A00(int i) {
        if (i < 0 || i >= size()) {
            return -1;
        }
        return ((AbstractC08640bT) get(i)).A00;
    }

    public void A01(AbstractC007503q r5, boolean z) {
        C08660bV A002 = this.timeBucketsProvider.A00(r5.A0E);
        if (!C006803i.A0q(A002, this.latestBucket)) {
            add(new C08630bS(new Pair(A002.toString(), Boolean.valueOf(z)), 12));
            this.latestBucket = A002;
        }
    }

    public void A02(List list, boolean z) {
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC007503q r2 = (AbstractC007503q) it.next();
            if (r2 != null) {
                if (z) {
                    A01(r2, false);
                }
                if (r2 instanceof C05490Ot) {
                    if (AnonymousClass1Y8.A05(r2.A0D(), true) != null) {
                        add(new C08630bS(r2, 19));
                    } else {
                        add(new C08630bS(r2, 7));
                    }
                } else if (r2 instanceof AnonymousClass0M2) {
                    add(new C08630bS(r2, 11));
                } else if (r2 instanceof AbstractC02860Dt) {
                    add(new C08630bS(r2, 20));
                } else if (r2 instanceof AnonymousClass0MP) {
                    if (r2.A04 != 1) {
                        add(new C08630bS(r2, 14));
                    } else {
                        add(new C08630bS(r2, 15));
                    }
                } else if (r2 instanceof AnonymousClass0MI) {
                    add(new C08630bS(r2, 16));
                } else if (r2 instanceof AnonymousClass0ZC) {
                    add(new C08630bS(r2, 17));
                } else if (r2 instanceof AnonymousClass0ZB) {
                    add(new C08630bS(r2, 18));
                } else if (r2 instanceof C04830Lz) {
                    add(new C08630bS(r2, 21));
                } else if (r2 instanceof AnonymousClass0M1) {
                    add(new C08630bS(r2, 21));
                } else {
                    add(new C52392b3(r2));
                }
            }
        }
    }
}
