package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.185  reason: invalid class name */
public final class AnonymousClass185 {
    public final Object A00;
    public final List A01 = new ArrayList();

    public AnonymousClass185(Object obj) {
        C001801b.A1Q(obj);
        this.A00 = obj;
    }

    public final void A00(String str, Object obj) {
        List list = this.A01;
        C001801b.A1Q(str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.A00.getClass().getSimpleName());
        sb.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
