package com.facebook.soloader;

import X.AnonymousClass008;
import android.os.Trace;

public class Api18TraceUtils {
    public static void A00(String str, String str2) {
        String A0L = AnonymousClass008.A0L(str, str2, "]");
        if (A0L.length() > 127 && str2 != null) {
            StringBuilder A0S = AnonymousClass008.A0S(str);
            A0S.append(str2.substring(0, (127 - str.length()) - "]".length()));
            A0S.append("]");
            A0L = A0S.toString();
        }
        Trace.beginSection(A0L);
    }
}
