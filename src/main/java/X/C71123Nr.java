package X;

import android.text.TextUtils;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.3Nr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71123Nr implements AnonymousClass0SG {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ C71123Nr(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        String str = (String) obj;
        if (!C006803i.A0q(tokenizedSearchInput.A0H, str)) {
            if (tokenizedSearchInput.A00 != 0 && !TextUtils.isEmpty(str)) {
                TokenizedSearchInput.setFocus(tokenizedSearchInput, 0);
            }
            tokenizedSearchInput.A0H = str;
        }
    }
}
