package X;

import com.whatsapp.util.Log;

/* renamed from: X.01r  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC003401r {
    public final C003501s A00 = new C003501s();

    public void A00(Object obj) {
        if (obj != null) {
            AnonymousClass00E.A01();
            if (!this.A00.A01(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(":Observer ");
                sb.append(obj);
                sb.append(" was not registered.");
                Log.e(sb.toString());
                return;
            }
            return;
        }
        throw null;
    }

    public void A01(Object obj) {
        if (obj != null) {
            AnonymousClass00E.A01();
            C003501s r1 = this.A00;
            if (!r1.A01.contains(obj)) {
                r1.A00(obj);
                return;
            }
            StringBuilder sb = new StringBuilder("Observer ");
            sb.append(obj);
            sb.append(" is already registered.");
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }
}
