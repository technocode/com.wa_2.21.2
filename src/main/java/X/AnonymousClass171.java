package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.171  reason: invalid class name */
public class AnonymousClass171 extends Exception {
    public final AnonymousClass05V zaay;

    public AnonymousClass171(AnonymousClass05V r1) {
        this.zaay = r1;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C06050Rn) this.zaay.keySet()).iterator();
        boolean z = true;
        while (true) {
            C06070Rp r1 = (C06070Rp) it;
            if (!r1.hasNext()) {
                break;
            }
            C237017e r2 = (C237017e) r1.next();
            C34661ix r12 = (C34661ix) this.zaay.get(r2);
            if (r12.A02()) {
                z = false;
            }
            String str = r2.A01.A02;
            String valueOf = String.valueOf(r12);
            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 2);
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
