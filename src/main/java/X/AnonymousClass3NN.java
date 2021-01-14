package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3NN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NN implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ AnonymousClass3NN(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A00;
        String str = (String) obj;
        if (!C006803i.A0q(str, searchViewModel.A0X)) {
            searchViewModel.A0X = str;
            searchViewModel.A0B();
        }
    }
}
