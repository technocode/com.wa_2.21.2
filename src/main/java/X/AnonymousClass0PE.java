package X;

import com.whatsapp.util.Log;

/* renamed from: X.0PE  reason: invalid class name */
public abstract class AnonymousClass0PE extends AnonymousClass0PF {
    @Override // X.AnonymousClass0PF
    public AbstractC14510mP A02() {
        try {
            return super.A02();
        } catch (SecurityException e) {
            if (e.getMessage().contains("Caller no longer running")) {
                StringBuilder A0S = AnonymousClass008.A0S("WaJobIntentService/'Caller no longer running' failure for ");
                A0S.append(getClass().getSimpleName());
                Log.e(A0S.toString(), e);
                return null;
            }
            throw e;
        }
    }
}
