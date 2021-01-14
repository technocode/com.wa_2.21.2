package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3NO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NO implements AnonymousClass0SG {
    public final /* synthetic */ C15610oN A00;
    public final /* synthetic */ SearchViewModel A01;

    public /* synthetic */ AnonymousClass3NO(SearchViewModel searchViewModel, C15610oN r2) {
        this.A01 = searchViewModel;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A01;
        C15610oN r5 = this.A00;
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        if (!C006803i.A0q(str, searchViewModel.A09())) {
            searchViewModel.A0L.A00(new AnonymousClass0Yi(3, Integer.valueOf(searchViewModel.A03()), searchViewModel.A06(), str));
            r5.A02("query_text", str);
        }
    }
}
