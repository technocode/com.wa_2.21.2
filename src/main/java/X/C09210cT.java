package X;

import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.0cT  reason: invalid class name and case insensitive filesystem */
public class C09210cT {
    public static volatile C09210cT A01;
    public C72713Ty A00;

    public C09210cT(AnonymousClass03P r3, AnonymousClass01X r4, C09270cb r5) {
        this.A00 = Build.VERSION.SDK_INT >= 28 ? new C72713Ty(r3, r4, r5) : null;
    }

    public static C09210cT A00() {
        if (A01 == null) {
            synchronized (C09210cT.class) {
                if (A01 == null) {
                    A01 = new C09210cT(AnonymousClass03P.A00(), AnonymousClass01X.A00(), C09270cb.A00());
                }
            }
        }
        return A01;
    }

    public AnonymousClass39G A01(String str) {
        return (AnonymousClass39G) A02().A05.get(str);
    }

    public final C72713Ty A02() {
        if (Build.VERSION.SDK_INT >= 28) {
            C72713Ty r0 = this.A00;
            if (r0 != null) {
                return r0;
            }
            throw null;
        }
        throw new RuntimeException("Requires API level 28");
    }

    public void A03(C09230cV r2) {
        A02().A01(r2);
    }

    public void A04(String str, String str2) {
        C72713Ty A02 = A02();
        AnonymousClass39G r2 = (AnonymousClass39G) A02.A05.get(str);
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/onCallAutoConnected changing CallId from: ");
            sb.append(str);
            sb.append(" -> ");
            sb.append(str2);
            Log.i(sb.toString());
            A02.A05(r2);
            r2.A01 = str2;
            A02.A04(r2);
        }
    }
}
