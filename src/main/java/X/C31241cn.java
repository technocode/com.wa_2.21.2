package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1cn  reason: invalid class name and case insensitive filesystem */
public class C31241cn implements AnonymousClass0s4 {
    public static final String A03 = AbstractC17610rq.A01("CommandHandler");
    public final Context A00;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();

    public C31241cn(Context context) {
        this.A00 = context;
    }

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        synchronized (this.A01) {
            AnonymousClass0s4 r0 = (AnonymousClass0s4) this.A02.remove(str);
            if (r0 != null) {
                r0.AFn(str, z);
            }
        }
    }
}
