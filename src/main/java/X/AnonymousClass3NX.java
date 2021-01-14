package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.search.SearchViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3NX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NX implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ AnonymousClass3NX(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A00;
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList((Collection) obj).iterator();
        while (it.hasNext()) {
            C007003k r1 = (C007003k) it.next();
            if (r1 != null) {
                Jid A02 = r1.A02(AnonymousClass02N.class);
                if (A02 != null) {
                    arrayList.add(new C10760f9((AnonymousClass02N) A02));
                } else {
                    throw null;
                }
            }
        }
        searchViewModel.A0Y = arrayList;
        searchViewModel.A0C();
    }
}
