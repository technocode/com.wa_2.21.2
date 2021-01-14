package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1sX  reason: invalid class name and case insensitive filesystem */
public class C40041sX implements AnonymousClass0It {
    public final C04050Iv A00;

    public C40041sX(Context context) {
        this.A00 = new C04050Iv(context);
    }

    @Override // X.AnonymousClass0It
    public void A29(C04080Iy r5, AbstractC27431Py r6) {
        WeakReference weakReference = new WeakReference(r6);
        try {
            this.A00.A03(null, r5, new C40031sW(weakReference));
        } catch (NullPointerException e) {
            StringBuilder A0S = AnonymousClass008.A0S("AppAuthManager/authenticate: authentication exception=");
            A0S.append(e.getMessage());
            Log.d(A0S.toString());
            AbstractC27431Py r0 = (AbstractC27431Py) weakReference.get();
            if (r0 != null) {
                r0.ADB();
            }
        }
    }

    @Override // X.AnonymousClass0It
    public boolean A2R() {
        C04050Iv r1 = this.A00;
        return r1.A05() && r1.A04();
    }

    @Override // X.AnonymousClass0It
    public boolean AAH() {
        return this.A00.A04();
    }

    @Override // X.AnonymousClass0It
    public boolean AB6() {
        return this.A00.A05();
    }
}
