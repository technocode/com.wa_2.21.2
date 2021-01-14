package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1bq  reason: invalid class name and case insensitive filesystem */
public final class C30731bq implements AbstractC16900qd {
    public final Set A00 = new HashSet();

    public C30731bq(AnonymousClass0SI r3) {
        if (r3.A01.A02("androidx.savedstate.Restarter", this) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @Override // X.AbstractC16900qd
    public Bundle ANN() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.A00));
        return bundle;
    }
}
