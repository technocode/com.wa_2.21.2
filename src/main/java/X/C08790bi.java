package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.0bi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08790bi implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ C08790bi(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0J = ((C08590bO) obj).A01();
        Runnable runnable = searchViewModel.A0W;
        if (runnable != null) {
            runnable.run();
        }
        searchViewModel.A01.removeMessages(0);
        searchViewModel.A0C();
    }
}
