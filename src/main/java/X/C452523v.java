package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.23v  reason: invalid class name and case insensitive filesystem */
public final class C452523v extends AbstractC06820Uv {
    public static final Class[] A05 = {Application.class, C15610oN.class};
    public static final Class[] A06 = {C15610oN.class};
    public final Application A00;
    public final Bundle A01;
    public final AbstractC013907w A02;
    public final C452623x A03;
    public final AnonymousClass0SI A04;

    public C452523v(Application application, AbstractC005402n r3, Bundle bundle) {
        this.A04 = r3.A8t();
        this.A02 = r3.A75();
        this.A01 = bundle;
        this.A00 = application;
        C452623x r0 = C452623x.A01;
        if (r0 == null) {
            r0 = new C452623x(application);
            C452623x.A01 = r0;
        }
        this.A03 = r0;
    }
}
