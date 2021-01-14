package X;

import com.whatsapp.search.SearchFragment;
import java.util.ArrayList;

/* renamed from: X.3NL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NL implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ AnonymousClass3NL(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        AnonymousClass3ZP r3 = this.A00.A0A;
        if (r3 != null) {
            ArrayList arrayList = new ArrayList(r3.A0c);
            for (int i = 0; i < arrayList.size(); i++) {
                if (obj.equals(((AbstractC08640bT) arrayList.get(i)).A01)) {
                    r3.A02(i);
                    return;
                }
            }
            return;
        }
        throw null;
    }
}
