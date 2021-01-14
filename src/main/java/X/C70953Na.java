package X;

import com.whatsapp.search.SearchFragment;

/* renamed from: X.3Na  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70953Na implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C70953Na(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchFragment searchFragment = this.A00;
        AnonymousClass02N r4 = (AnonymousClass02N) obj;
        searchFragment.A11.A01 = 4;
        AbstractC11910hD A0C = searchFragment.A03.A0C(searchFragment.A0B.A04(r4));
        if (A0C != null) {
            searchFragment.A08 = r4;
            searchFragment.A03.showContextMenuForChild(A0C.A0H);
        }
    }
}
