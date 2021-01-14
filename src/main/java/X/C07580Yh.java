package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.0Yh  reason: invalid class name and case insensitive filesystem */
public class C07580Yh extends Stack<AnonymousClass0Yi> {
    public C07580Yh() {
        push(new AnonymousClass0Yi(0, 0, null, ""));
    }

    public void A00(AnonymousClass0Yi r6) {
        Integer num;
        if (size() > 0) {
            AnonymousClass0Yi r1 = (AnonymousClass0Yi) peek();
            if (r1.A00 == 1 && r6.A00 == 1) {
                pop();
            }
            if (r1.A00 == 3 && r6.A00 == 3 && r1.A01 == r6.A01) {
                pop();
            }
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((AnonymousClass0Yi) it.next()).A00 == r6.A00) {
                it.remove();
            }
        }
        int i = r6.A00;
        if (i != 3 || r6.A01 != null) {
            if (i == 1 && TextUtils.isEmpty(r6.A03)) {
                return;
            }
            if (r6.A00 != 2 || ((num = r6.A02) != null && num.intValue() != 0)) {
                push(r6);
            }
        }
    }
}
