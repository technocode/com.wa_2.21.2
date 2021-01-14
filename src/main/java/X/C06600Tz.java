package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Tz  reason: invalid class name and case insensitive filesystem */
public class C06600Tz {
    public static final AnonymousClass03V A00;
    public static final Charset A01 = Charset.forName("US-ASCII");
    public static final Charset[] A02 = {Charset.forName("UTF-8"), Charset.forName("UTF-16BE")};

    static {
        List asList = Arrays.asList("AO", "CV", "GQ", "FR", "GW", "LU", "MO", "MZ", "PT", "ST", "CH", "TL");
        AnonymousClass03V r0 = new AnonymousClass03V(0);
        if (asList != null) {
            r0.addAll(asList);
        }
        A00 = r0;
    }
}
