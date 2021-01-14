package X;

import android.util.SparseIntArray;
import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3NW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NW implements AnonymousClass0SG {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ AnonymousClass3NW(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchViewModel searchViewModel = this.A00;
        SparseIntArray sparseIntArray = (SparseIntArray) obj;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray();
            sparseIntArray.put(105, 1);
        }
        synchronized (searchViewModel) {
            searchViewModel.A02 = sparseIntArray;
        }
        searchViewModel.A0C();
    }
}
