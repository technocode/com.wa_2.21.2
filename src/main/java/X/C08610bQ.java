package X;

import android.view.View;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0bQ  reason: invalid class name and case insensitive filesystem */
public class C08610bQ implements AnonymousClass0Y5 {
    public final /* synthetic */ SearchViewModel A00;

    @Override // X.AnonymousClass0Y5
    public void A2h() {
    }

    @Override // X.AnonymousClass0Y5
    public AnonymousClass02N A6g() {
        return null;
    }

    @Override // X.AnonymousClass0Y5
    public boolean AMb(Jid jid) {
        return false;
    }

    public C08610bQ(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    @Override // X.AnonymousClass0Y5
    public List A8O() {
        return this.A00.A0m.A0G.A03();
    }

    @Override // X.AnonymousClass0Y5
    public Set A8x() {
        return new HashSet();
    }

    @Override // X.AnonymousClass0Y5
    public void AEA(AnonymousClass02N r4, ViewHolder viewHolder) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0G.A07(Boolean.FALSE);
        searchViewModel.A0F(1);
        if (r4 != null) {
            searchViewModel.A0M.A07(r4);
        }
    }

    @Override // X.AnonymousClass0Y5
    public void AEB(AnonymousClass02N r4, View view, SelectionCheckView selectionCheckView) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0G.A07(Boolean.FALSE);
        if (r4 != null) {
            searchViewModel.A0O.A07(r4);
        }
    }

    @Override // X.AnonymousClass0Y5
    public void AEC(AbstractC007503q r3, ViewHolder viewHolder) {
        SearchViewModel searchViewModel = this.A00;
        searchViewModel.A0L(false);
        searchViewModel.A0F(2);
        searchViewModel.A0T.A07(r3);
    }

    @Override // X.AnonymousClass0Y5
    public void AED(AnonymousClass2CD r2) {
        Log.e("SearchViewModel/pending group in search results");
    }

    @Override // X.AnonymousClass0Y5
    public void AHN(AnonymousClass02N r2, View view, SelectionCheckView selectionCheckView) {
        this.A00.A0N.A07(r2);
    }
}
