package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.27l  reason: invalid class name and case insensitive filesystem */
public class C460227l extends C30231ay {
    public final C02270Bi A00;
    public final AnonymousClass1S9 A01;

    public C460227l(Application application, AnonymousClass1S9 r3) {
        super(application);
        C02270Bi r0 = new C02270Bi();
        this.A00 = r0;
        this.A01 = r3;
        r3.A00 = r0;
    }

    public String A02(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + ((C27711Rc) it.next()).A00);
        }
        if (i == 0) {
            return "";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        return ((C30231ay) this).A00.getString(R.string.cart_max_total_quantity);
    }

    public void A03() {
        AnonymousClass1S9 r3 = this.A01;
        if (!r3.A01.A0D(AbstractC000400g.A0c)) {
            r3.A00.A08(Boolean.FALSE);
        } else {
            r3.A04.ANF(new RunnableEBaseShape7S0100000_I1_2(r3, 40));
        }
    }
}
