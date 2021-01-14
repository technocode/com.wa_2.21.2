package androidx.lifecycle;

import X.AbstractC005102k;
import X.AnonymousClass082;
import X.AnonymousClass0SK;
import X.C11950hH;
import X.C11960hJ;
import java.util.List;
import java.util.Map;

public class ReflectiveGenericLifecycleObserver implements AnonymousClass0SK {
    public final C11960hJ A00;
    public final Object A01;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.A01 = obj;
        C11950hH r2 = C11950hH.A02;
        Class<?> cls = obj.getClass();
        C11960hJ r0 = (C11960hJ) r2.A00.get(cls);
        this.A00 = r0 == null ? r2.A01(cls, null) : r0;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r4, AnonymousClass082 r5) {
        C11960hJ r0 = this.A00;
        Object obj = this.A01;
        Map map = r0.A00;
        C11960hJ.A00((List) map.get(r5), r4, r5, obj);
        C11960hJ.A00((List) map.get(AnonymousClass082.ON_ANY), r4, r5, obj);
    }
}
