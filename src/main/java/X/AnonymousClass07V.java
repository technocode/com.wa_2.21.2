package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.07V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass07V implements AnonymousClass07L {
    public final Set A00;

    public AnonymousClass07V(Set set) {
        this.A00 = set;
    }

    @Override // X.AnonymousClass07L
    public Object get() {
        Set<AnonymousClass07U> set = this.A00;
        HashSet hashSet = new HashSet();
        for (AnonymousClass07U r0 : set) {
            hashSet.add(r0.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
