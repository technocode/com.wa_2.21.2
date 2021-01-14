package X;

import com.whatsapp.search.SearchViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3NR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NR implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ AnonymousClass3NR(SearchViewModel searchViewModel) {
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
                arrayList.add(new C52242ao(r1));
            }
        }
        searchViewModel.A0a = arrayList;
        searchViewModel.A0C();
    }
}
