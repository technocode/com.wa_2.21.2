package X;

import android.view.inputmethod.InputMethodManager;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;

/* renamed from: X.3Nv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71163Nv implements AnonymousClass0SG {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ C71163Nv(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            TokenizedSearchInput.setFocus(tokenizedSearchInput, 0);
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0Q;
            finalBackspaceAwareEntry.requestFocus();
            finalBackspaceAwareEntry.A01(false);
            return;
        }
        TokenizedSearchInput.setFocus(tokenizedSearchInput, 3);
        tokenizedSearchInput.A0Q.clearFocus();
        tokenizedSearchInput.A0L.requestFocus();
        InputMethodManager A0H = tokenizedSearchInput.A09.A0H();
        if (A0H != null) {
            A0H.hideSoftInputFromWindow(tokenizedSearchInput.getWindowToken(), 2);
        }
    }
}
