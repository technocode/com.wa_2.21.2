package X;

import com.whatsapp.search.SearchFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3NK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NK implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ AnonymousClass3NK(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass3ZP r5 = this.A00.A0A;
        if (r5 != null) {
            ArrayList arrayList = new ArrayList(r5.A0c);
            for (Object obj2 : collection) {
                if (obj2 != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (obj2.equals(((AbstractC08640bT) arrayList.get(i)).A01)) {
                            r5.A02(i);
                            return;
                        }
                    }
                    continue;
                }
            }
            return;
        }
        throw null;
    }
}
