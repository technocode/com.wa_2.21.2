package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3NT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NT implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ AnonymousClass3NT(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A00;
        Integer num = (Integer) obj;
        if (!C006803i.A0q(num, searchViewModel.A0U)) {
            searchViewModel.A0U = num;
            searchViewModel.A0B();
        }
    }
}
