package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.SearchFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Nh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71023Nh implements AbstractC47722Jh {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C71023Nh(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AbstractC47722Jh
    public final void A1d(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        SearchFragment searchFragment = this.A00;
        View view = ((AnonymousClass037) searchFragment).A0A;
        if (searchFragment.A00() != null && view != null) {
            C36901n6 A002 = C36901n6.A00(view.findViewById(R.id.search_fragment), charSequence, 0);
            A002.A06(charSequence2, onClickListener);
            A002.A05(C004302a.A00(searchFragment.A00(), R.color.bulkArchiveSnackbarButton));
            AnonymousClass3ZQ r1 = new AnonymousClass3ZQ(searchFragment);
            List list = ((AbstractC24951Dr) A002).A01;
            if (list == null) {
                list = new ArrayList();
                ((AbstractC24951Dr) A002).A01 = list;
            }
            list.add(r1);
            searchFragment.A04 = A002;
            A002.A04();
        }
    }
}
