package X;

import android.text.Editable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import java.util.List;

/* renamed from: X.3Rk  reason: invalid class name and case insensitive filesystem */
public class C72073Rk extends C07860Zy {
    public final /* synthetic */ FinalBackspaceAwareEntry A00;

    public C72073Rk(FinalBackspaceAwareEntry finalBackspaceAwareEntry) {
        this.A00 = finalBackspaceAwareEntry;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        if (editable != null) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = this.A00;
            if (!FinalBackspaceAwareEntry.A00(editable.toString()) && !finalBackspaceAwareEntry.A02) {
                List<C71193Ny> list = finalBackspaceAwareEntry.A01;
                if (list != null) {
                    for (C71193Ny r0 : list) {
                        TokenizedSearchInput tokenizedSearchInput = r0.A00;
                        SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
                        if (searchViewModel != null) {
                            UserJid A06 = searchViewModel.A06();
                            int A03 = tokenizedSearchInput.A0C.A03();
                            int i = tokenizedSearchInput.A00;
                            if (i == 1) {
                                TokenizedSearchInput.A00(tokenizedSearchInput, tokenizedSearchInput.A0N);
                            } else if (i == 2) {
                                TokenizedSearchInput.A00(tokenizedSearchInput, tokenizedSearchInput.A0M);
                            } else if (i == 0) {
                                if (A06 != null) {
                                    TokenizedSearchInput.setFocus(tokenizedSearchInput, 2);
                                } else if (A03 != 0) {
                                    TokenizedSearchInput.setFocus(tokenizedSearchInput, 1);
                                }
                            }
                        }
                    }
                }
                finalBackspaceAwareEntry.A06(editable);
            }
            List<C71193Ny> list2 = finalBackspaceAwareEntry.A01;
            if (list2 != null) {
                for (C71193Ny r2 : list2) {
                    String obj = finalBackspaceAwareEntry.A05(editable).toString();
                    SearchViewModel searchViewModel2 = r2.A00.A0C;
                    if (!(searchViewModel2 == null || obj == null)) {
                        searchViewModel2.A0J(obj);
                    }
                }
            }
        }
    }
}
