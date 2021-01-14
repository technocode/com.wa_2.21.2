package X;

import com.whatsapp.search.SearchFragment;

/* renamed from: X.3Nf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71003Nf implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C71003Nf(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ActivityC004902h A0A;
        SearchFragment searchFragment = this.A00;
        Number number = (Number) obj;
        if (number != null && (A0A = searchFragment.A0A()) != null && !A0A.isFinishing()) {
            int intValue = number.intValue();
            if (intValue != 0) {
                if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
                    searchFragment.A02.setVisibility(0);
                    return;
                } else if (intValue != 5) {
                    return;
                }
            }
            searchFragment.A02.setVisibility(4);
        }
    }
}
