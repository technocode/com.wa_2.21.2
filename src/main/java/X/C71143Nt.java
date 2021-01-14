package X;

import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.3Nt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71143Nt implements AnonymousClass0SG {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ C71143Nt(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        Boolean bool = (Boolean) obj;
        int i = 0;
        if (bool != null && bool.booleanValue()) {
            i = 1;
        }
        tokenizedSearchInput.A01 = i;
        tokenizedSearchInput.A01();
    }
}
