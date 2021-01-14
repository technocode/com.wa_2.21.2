package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.30d  reason: invalid class name */
public class AnonymousClass30d {
    public static final Set A00 = new HashSet(Arrays.asList("audio", "image", "video", "kyc-id", "sticker", "document", "ptt", "gif", "md-app-state", "md-msg-hist", "ppic"));

    public static Pair A00(AnonymousClass0M5 r4) {
        for (AnonymousClass0M5 r3 : r4.A0H("error")) {
            if (r3 != null) {
                try {
                    int A05 = r3.A05("code", 0);
                    if (A05 != 0) {
                        return new Pair(Integer.valueOf(A05), Integer.valueOf(r3.A05("backoff", 0)));
                    }
                } catch (AnonymousClass1XC e) {
                    Log.e("MediaConnFactory/getErrorCodeAndBackoffFromIqResponse CorruptStreamException ", e);
                }
            }
        }
        return null;
    }

    public static Set A01(AnonymousClass0M5 r6, Set set) {
        if (r6 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        AnonymousClass0M5[] r4 = r6.A03;
        if (r4 != null) {
            for (AnonymousClass0M5 r1 : r4) {
                if (set == null || set.contains(r1.A00)) {
                    hashSet.add(r1.A00);
                }
            }
        }
        return hashSet;
    }
}
