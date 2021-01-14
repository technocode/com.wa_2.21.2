package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0tX  reason: invalid class name and case insensitive filesystem */
public class C18550tX {
    public List A00 = null;

    public void A00(C18530tV r4) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        for (int i = 0; i < this.A00.size(); i++) {
            if (((C18530tV) this.A00.get(i)).A00.A00 > r4.A00.A00) {
                this.A00.add(i, r4);
                return;
            }
        }
        this.A00.add(r4);
    }

    public void A01(C18550tX r3) {
        List list = r3.A00;
        if (list != null) {
            if (this.A00 == null) {
                this.A00 = new ArrayList(list.size());
            }
            for (C18530tV r0 : r3.A00) {
                A00(r0);
            }
        }
    }

    public String toString() {
        List<Object> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            sb.append(obj.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
