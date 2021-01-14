package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.05Y  reason: invalid class name */
public class AnonymousClass05Y implements AnonymousClass05Z {
    public static AtomicReference A00 = new AtomicReference();

    @Override // X.AnonymousClass05Z
    public void ADH(boolean z) {
        synchronized (AnonymousClass05T.A09) {
            Iterator it = new ArrayList(AnonymousClass05T.A0E.values()).iterator();
            while (it.hasNext()) {
                AnonymousClass05T r2 = (AnonymousClass05T) it.next();
                if (r2.A06.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = r2.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw null;
                    }
                }
            }
        }
    }
}
