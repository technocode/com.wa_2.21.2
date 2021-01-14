package X;

import androidx.lifecycle.SavedStateHandleController;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1b2  reason: invalid class name and case insensitive filesystem */
public final class C30261b2 implements AbstractC16890qc {
    @Override // X.AbstractC16890qc
    public void AJC(AbstractC005402n r6) {
        if (r6 instanceof AbstractC005302m) {
            AnonymousClass0O5 A9n = ((AbstractC005302m) r6).A9n();
            AnonymousClass0SI A8t = r6.A8t();
            if (A9n != null) {
                HashMap hashMap = A9n.A00;
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.A00((AnonymousClass0SD) hashMap.get(it.next()), A8t, r6.A75());
                }
                if (!new HashSet(hashMap.keySet()).isEmpty()) {
                    A8t.A01();
                    return;
                }
                return;
            }
            throw null;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
    }
}
