package X;

import com.whatsapp.util.Log;

/* renamed from: X.01G  reason: invalid class name */
public abstract class AnonymousClass01G {
    public final C003501s A00 = new C003501s();

    public void A00(Object obj) {
        if (obj != null) {
            C003501s r2 = this.A00;
            synchronized (r2) {
                if (!r2.A01.contains(obj)) {
                    r2.A00(obj);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Observer ");
                    sb.append(obj);
                    sb.append(" is already registered.");
                    throw new IllegalStateException(sb.toString());
                }
            }
            return;
        }
        throw null;
    }

    public void A01(Object obj) {
        if (obj != null) {
            C003501s r2 = this.A00;
            synchronized (r2) {
                if (!r2.A01(obj)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getSimpleName());
                    sb.append(":Observer ");
                    sb.append(obj);
                    sb.append(" was not registered.");
                    Log.e(sb.toString());
                }
            }
            return;
        }
        throw null;
    }
}
