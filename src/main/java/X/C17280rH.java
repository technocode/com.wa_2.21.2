package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0rH  reason: invalid class name and case insensitive filesystem */
public class C17280rH {
    public View A00;
    public final ArrayList A01 = new ArrayList();
    public final Map A02 = new HashMap();

    public boolean equals(Object obj) {
        if (!(obj instanceof C17280rH)) {
            return false;
        }
        C17280rH r3 = (C17280rH) obj;
        return this.A00 == r3.A00 && this.A02.equals(r3.A02);
    }

    public int hashCode() {
        return this.A02.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("TransitionValues@");
        A0S.append(Integer.toHexString(hashCode()));
        A0S.append(":\n");
        StringBuilder A0Y = AnonymousClass008.A0Y(A0S.toString(), "    view = ");
        A0Y.append(this.A00);
        A0Y.append("\n");
        String A0K = AnonymousClass008.A0K(A0Y.toString(), "    values:");
        Map map = this.A02;
        for (String str : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0K);
            sb.append("    ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            sb.append("\n");
            A0K = sb.toString();
        }
        return A0K;
    }
}
