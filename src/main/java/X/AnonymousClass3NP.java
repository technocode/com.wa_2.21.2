package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3NP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NP implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ AnonymousClass3NP(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A00;
        UserJid userJid = (UserJid) obj;
        if (!C006803i.A0q(userJid, searchViewModel.A0I)) {
            searchViewModel.A0I = userJid;
            searchViewModel.A0B();
        }
    }
}
