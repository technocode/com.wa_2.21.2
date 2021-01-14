package X;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: X.044  reason: invalid class name */
public class AnonymousClass044 extends AbstractC007903v {
    public int A00;
    public Context A01;
    public C008103x A02;

    public AnonymousClass044(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.A01 = context;
            applicationContext = context;
        }
        this.A00 = i;
        this.A02 = new C008103x(new File(applicationContext.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // X.AbstractC007903v
    public String toString() {
        return this.A02.toString();
    }
}
