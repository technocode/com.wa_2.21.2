package X;

import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.1Vm  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28721Vm {
    public static AbstractC28721Vm A00;

    public void A00() {
        C446921c r2 = (C446921c) this;
        if (r2.A01.A01()) {
            Iterator it = ((AbstractCollection) r2.A03.A02()).iterator();
            while (it.hasNext()) {
                r2.A01((String) it.next());
            }
        }
    }

    public void A01(String str) {
        C446921c r2 = (C446921c) this;
        if (r2.A01.A01()) {
            AnonymousClass280 r1 = (AnonymousClass280) r2.A00;
            if (r1.A03.A01()) {
                Log.d("InstrumentationObserverImpl/onAuthorizationRevoked");
                C28661Vg r12 = r1.A04;
                try {
                    if (r12.A02.A02(str).A03) {
                        AbstractC02190Az r0 = (AbstractC02190Az) r12.A00.A00.A00.get(str);
                        if (r0 != null) {
                            ((AbstractC28671Vh) r0.get()).A00();
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                AnonymousClass008.A19("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", str);
            }
            r2.A03.A03(str);
        }
    }
}
