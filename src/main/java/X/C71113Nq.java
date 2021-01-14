package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3Nq  reason: invalid class name and case insensitive filesystem */
public class C71113Nq implements AnonymousClass2UI {
    public final /* synthetic */ SearchViewModel A00;

    @Override // X.AnonymousClass2UI
    public void AQ4() {
    }

    @Override // X.AnonymousClass2UI
    public void AQE() {
    }

    @Override // X.AnonymousClass2UI
    public void close() {
    }

    public C71113Nq(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass2UI
    public AnonymousClass0M3 A7O(int i) {
        if (i == -2) {
            return null;
        }
        SearchViewModel searchViewModel = this.A00;
        if (i < searchViewModel.A0J.A00.size()) {
            return (AnonymousClass0M3) searchViewModel.A0J.A00.get(i);
        }
        return null;
    }

    @Override // X.AnonymousClass2UI
    public int A8U(C007303n r4) {
        int i = 0;
        while (true) {
            SearchViewModel searchViewModel = this.A00;
            if (i >= searchViewModel.A0J.A00.size()) {
                return -2;
            }
            if (C006803i.A0q(r4, ((AbstractC007503q) searchViewModel.A0J.A00.get(i)).A0n)) {
                return i;
            }
            i++;
        }
    }

    @Override // X.AnonymousClass2UI
    public void AHr() {
        this.A00.A0F(2);
    }

    @Override // X.AnonymousClass2UI
    public void AOB(Runnable runnable) {
        this.A00.A0W = runnable;
    }

    @Override // X.AnonymousClass2UI
    public void AQq(int i) {
        SearchViewModel searchViewModel = this.A00;
        int A05 = searchViewModel.A05((AnonymousClass0M3) searchViewModel.A0J.A00.get(i));
        if (A05 >= 0 && A05 <= searchViewModel.A08().size()) {
            searchViewModel.A0Q.A08(Integer.valueOf(A05));
        }
    }

    @Override // X.AnonymousClass2UI
    public int getCount() {
        return this.A00.A0J.A00.size();
    }
}
