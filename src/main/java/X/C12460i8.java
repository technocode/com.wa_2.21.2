package X;

import java.util.regex.Pattern;

/* renamed from: X.0i8  reason: invalid class name and case insensitive filesystem */
public class C12460i8 {
    public C12470i9 A00;

    public C12460i8(int i) {
        this.A00 = new C12470i9(i);
    }

    public Pattern A00(String str) {
        Object obj;
        C12470i9 r1 = this.A00;
        synchronized (r1) {
            obj = r1.A01.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            C12470i9 r12 = this.A00;
            synchronized (r12) {
                r12.A01.put(str, pattern);
            }
        }
        return pattern;
    }
}
