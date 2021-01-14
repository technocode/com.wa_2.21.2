package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.27p  reason: invalid class name and case insensitive filesystem */
public class C460327p extends C30231ay {
    public final AnonymousClass01X A00;

    public C460327p(Application application, AnonymousClass01X r2) {
        super(application);
        this.A00 = r2;
    }

    public String A02(List list) {
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator it = list.iterator();
        C05910Qz r5 = null;
        while (it.hasNext()) {
            AnonymousClass1SJ r0 = (AnonymousClass1SJ) it.next();
            BigDecimal bigDecimal2 = r0.A05;
            if (bigDecimal2 == null || (r5 = r0.A02) == null) {
                return ((C30231ay) this).A00.getString(R.string.ask_for_total);
            }
            bigDecimal = bigDecimal.add(bigDecimal2.multiply(new BigDecimal(r0.A00)));
        }
        if (r5 == null) {
            return "";
        }
        return ((C30231ay) this).A00.getString(R.string.estimated, r5.A03(this.A00, bigDecimal, true));
    }
}
