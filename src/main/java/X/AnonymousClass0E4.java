package X;

import android.app.Service;
import android.content.Context;

/* renamed from: X.0E4  reason: invalid class name */
public abstract class AnonymousClass0E4 extends Service {
    public final AnonymousClass0LB A00 = AnonymousClass0LB.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public void attachBaseContext(Context context) {
        super.attachBaseContext(new AnonymousClass0S7(context, this.A01, this.A00));
    }
}
