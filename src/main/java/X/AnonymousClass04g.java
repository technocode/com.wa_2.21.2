package X;

import android.util.Pair;

/* renamed from: X.04g  reason: invalid class name */
public class AnonymousClass04g {
    public final AnonymousClass04h A00 = new AnonymousClass04h(20);

    public Pair A00(String str) {
        AnonymousClass04h r2 = this.A00;
        synchronized (r2) {
            if (!r2.containsKey(str)) {
                return null;
            }
            C29131Xe r1 = (C29131Xe) r2.get(str);
            boolean z = false;
            if (r1 == null) {
                z = true;
            }
            return Pair.create(Boolean.valueOf(z), r1);
        }
    }

    public void A01(String str) {
        AnonymousClass04h r1 = this.A00;
        synchronized (r1) {
            r1.put(str, null);
        }
    }
}
