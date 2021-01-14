package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0OF  reason: invalid class name */
public class AnonymousClass0OF {
    public final String A00;
    public final String A01;
    public final List A02;

    public AnonymousClass0OF(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }

    public AnonymousClass0OF A00() {
        String str = this.A00;
        String str2 = this.A01;
        List list = this.A02;
        return new AnonymousClass0OF(str, str2, list != null ? new ArrayList(list) : null);
    }
}
