package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.0SI  reason: invalid class name */
public final class AnonymousClass0SI {
    public Bundle A00;
    public C014107y A01 = new C014107y();
    public C30731bq A02;
    public boolean A03 = true;
    public boolean A04;

    public Bundle A00(String str) {
        if (this.A04) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.A00.remove(str);
            if (this.A00.isEmpty()) {
                this.A00 = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void A01() {
        if (this.A03) {
            if (this.A02 == null) {
                this.A02 = new C30731bq(this);
            }
            try {
                C30261b2.class.getDeclaredConstructor(new Class[0]);
                C30731bq r0 = this.A02;
                r0.A00.add(C30261b2.class.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder A0S = AnonymousClass008.A0S("Class");
                A0S.append(C30261b2.class.getSimpleName());
                A0S.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(A0S.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public void A02(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C014107y r0 = this.A01;
        C07130Wa r2 = new C07130Wa(r0);
        r0.A03.put(r2, Boolean.FALSE);
        while (r2.hasNext()) {
            Map.Entry entry = (Map.Entry) r2.next();
            bundle2.putBundle((String) entry.getKey(), ((AbstractC16900qd) entry.getValue()).ANN());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
