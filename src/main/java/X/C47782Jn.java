package X;

import java.util.regex.Matcher;

/* renamed from: X.2Jn  reason: invalid class name and case insensitive filesystem */
public class C47782Jn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C47782Jn(String str, boolean z) {
        Matcher matcher = AnonymousClass0R0.A0B.matcher(str);
        matcher.find();
        this.A00 = matcher.group();
        boolean z2 = false;
        if (z) {
            int indexOf = str.indexOf(164);
            this.A01 = str.substring(0, indexOf);
            this.A02 = str.substring(indexOf + 1);
            this.A03 = matcher.start() > indexOf ? true : z2;
            return;
        }
        this.A02 = "";
        this.A01 = "";
    }
}
