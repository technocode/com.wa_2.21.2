package X;

import java.util.List;

/* renamed from: X.1Yg  reason: invalid class name and case insensitive filesystem */
public class C29381Yg extends Exception {
    public C29381Yg(String str) {
        super(str);
    }

    public C29381Yg(Throwable th) {
        super(th);
    }

    public C29381Yg(List list) {
        super("No valid sessions.", (Throwable) list.get(0));
    }
}
