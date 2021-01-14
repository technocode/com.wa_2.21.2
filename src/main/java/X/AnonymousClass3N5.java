package X;

import com.whatsapp.search.SearchFragment;

/* renamed from: X.3N5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3N5 implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ AnonymousClass3N5(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchFragment searchFragment = this.A00;
        if (obj != null) {
            AnonymousClass02M r2 = searchFragment.A0N;
            r2.A02.post(new RunnableEBaseShape4S0200000_I0_3(searchFragment, obj, 1));
        }
    }
}
