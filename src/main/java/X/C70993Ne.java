package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.3Ne  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70993Ne implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C70993Ne(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        View findViewById;
        SearchFragment searchFragment = this.A00;
        AnonymousClass02N r5 = (AnonymousClass02N) obj;
        C28301Tu.A05();
        AbstractC11910hD A0C = searchFragment.A03.A0C(searchFragment.A0B.A04(r5));
        if (A0C != null && (findViewById = A0C.A0H.findViewById(R.id.contact_photo)) != null) {
            QuickContactActivity.A04(searchFragment.A0A(), findViewById, r5, AnonymousClass0Q7.A0G(findViewById));
        }
    }
}
