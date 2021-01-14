package X;

import android.app.IntentService;
import android.content.Context;

/* renamed from: X.1Xk  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractIntentServiceC29181Xk extends IntentService {
    public final AnonymousClass0LB A00 = AnonymousClass0LB.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public AbstractIntentServiceC29181Xk(String str) {
        super(str);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(new AnonymousClass0S7(context, this.A01, this.A00));
    }
}
