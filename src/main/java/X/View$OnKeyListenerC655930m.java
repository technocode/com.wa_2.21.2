package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.30m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnKeyListenerC655930m implements View.OnKeyListener {
    public final /* synthetic */ TokenizedSearchInput A00;

    public /* synthetic */ View$OnKeyListenerC655930m(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        if (tokenizedSearchInput.A0C == null || keyEvent == null) {
            return false;
        }
        if ((keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160) || keyEvent.getAction() != 1) {
            return false;
        }
        tokenizedSearchInput.A0C.A0L(false);
        return true;
    }
}
