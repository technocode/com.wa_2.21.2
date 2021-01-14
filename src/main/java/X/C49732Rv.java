package X;

import android.text.TextUtils;
import com.whatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.2Rv  reason: invalid class name and case insensitive filesystem */
public class C49732Rv {
    public static Pattern A00;

    public static C04110Jc A00(AnonymousClass0Ja r0, Locale[] localeArr, String str, String str2) {
        C04110Jc A03 = r0.A03(localeArr, str);
        if (A03 == null) {
            StringBuilder sb = new StringBuilder("HSMRehydrationUtil/requestLanguagePack/error missing hsm pack after requirements satisfied, loggableString=");
            sb.append(str2);
            Log.e(sb.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(1002);
        } else if (A03.A02.size() != 0) {
            return A03;
        } else {
            StringBuilder sb2 = new StringBuilder("HSMRehydrationUtil/requestLanguagePack/error server had no hsm pack for namespace, loggableString=");
            sb2.append(str2);
            Log.e(sb2.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(1002);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: boolean[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x065c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r23, X.C04110Jc r24, X.C76103e0 r25, X.C04130Je r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 1740
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49732Rv.A01(android.content.Context, X.0Jc, X.3e0, X.0Je, java.lang.String, boolean, boolean):java.lang.String");
    }

    public static void A02(C76103e0 r3, String str) {
        if ((r3.A00 & 2) != 2 || TextUtils.isEmpty(r3.A06) || (r3.A00 & 1) != 1 || TextUtils.isEmpty(r3.A09)) {
            StringBuilder sb = new StringBuilder("HSMRehydrationUtil/validateHsmMessage/error hsm missing element, loggableString=");
            sb.append(str);
            Log.e(sb.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(null);
        }
    }
}
