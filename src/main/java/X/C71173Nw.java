package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.3Nw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71173Nw implements AnonymousClass0SG {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ C71173Nw(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        UserJid userJid = (UserJid) obj;
        if (tokenizedSearchInput.A0C != null && tokenizedSearchInput.A0B != userJid) {
            tokenizedSearchInput.A0B = userJid;
            if (userJid != null) {
                tokenizedSearchInput.A0M.setText(tokenizedSearchInput.A08.A08(tokenizedSearchInput.A07.A0A(userJid), false));
            }
            tokenizedSearchInput.A04();
            tokenizedSearchInput.A03();
        }
    }
}
