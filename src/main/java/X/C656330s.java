package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.30s  reason: invalid class name and case insensitive filesystem */
public class C656330s implements TextView.OnEditorActionListener {
    public final /* synthetic */ TokenizedSearchInput A00;

    public C656330s(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        SearchViewModel searchViewModel = this.A00.A0C;
        if (searchViewModel == null || i != 3) {
            return false;
        }
        searchViewModel.A0L(false);
        return true;
    }
}
