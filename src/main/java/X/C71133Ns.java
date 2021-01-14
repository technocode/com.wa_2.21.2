package X;

import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.3Ns  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71133Ns implements AnonymousClass0SG {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ C71133Ns(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        Integer num = (Integer) obj;
        if (tokenizedSearchInput.A0C != null && !C006803i.A0q(tokenizedSearchInput.A0E, num)) {
            tokenizedSearchInput.A0E = num;
            tokenizedSearchInput.A05();
            tokenizedSearchInput.A03();
        }
    }
}
