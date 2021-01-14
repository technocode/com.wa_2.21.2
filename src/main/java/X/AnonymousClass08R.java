package X;

import com.whatsapp.jid.Jid;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.08R  reason: invalid class name */
public class AnonymousClass08R {
    public final AnonymousClass08S A00;
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    public AnonymousClass08R(AnonymousClass01X r2) {
        this.A00 = new AnonymousClass08S(r2);
    }

    public void A00(C007003k r4) {
        Map map;
        Object obj;
        Jid A02 = r4.A02(AnonymousClass02N.class);
        if (A02 != null && (obj = (map = this.A01).get(A02)) != null && obj != r4) {
            map.remove(A02);
        }
    }
}
