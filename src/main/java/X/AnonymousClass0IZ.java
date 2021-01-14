package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.0IZ  reason: invalid class name */
public class AnonymousClass0IZ {
    public static volatile AnonymousClass0IZ A00;

    public static int A00(Context context) {
        try {
            return AnonymousClass0LP.A00.A00(context, 12451000);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("google-utils/checkGooglePlayServicesStatus/unexpected exception/");
            sb.append(e);
            Log.e(sb.toString());
            return 8;
        }
    }

    public static AnonymousClass0IZ A01() {
        if (A00 == null) {
            synchronized (AnonymousClass0IZ.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass0IZ();
                }
            }
        }
        return A00;
    }
}
