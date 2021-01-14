package X;

import com.google.android.search.verification.client.R;
import java.util.HashMap;

/* renamed from: X.3AU  reason: invalid class name */
public abstract class AnonymousClass3AU {
    public final AbstractC02170Ax A00 = AnonymousClass3V2.A00;
    public final AbstractC02170Ax A01 = C72923Uu.A00;
    public final AbstractC02170Ax A02 = C72953Ux.A00;
    public final AbstractC02170Ax A03 = C72973Uz.A00;

    public static ActivityC004702f A00(C011106q r2) {
        return ((C010706m) r2.A00.get(R.id.bloks_global_bloks_host)).A02;
    }

    public void A01(C011106q r5, String str, HashMap hashMap) {
        String str2;
        if (hashMap.containsKey("params")) {
            str2 = (String) hashMap.get("params");
        } else {
            str2 = "{}";
        }
        ActivityC004702f A002 = A00(r5);
        A002.startActivity(new AnonymousClass3AR(A002, str, str2, false));
    }
}
