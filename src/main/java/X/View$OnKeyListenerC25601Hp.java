package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.Conversation;

/* renamed from: X.1Hp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnKeyListenerC25601Hp implements View.OnKeyListener {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ View$OnKeyListenerC25601Hp(Conversation conversation) {
        this.A00 = conversation;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Conversation conversation = this.A00;
        if (i != 23 || keyEvent.getAction() != 0 || conversation.A1J() || conversation.A12.A01()) {
            return false;
        }
        conversation.A0p();
        conversation.A0h();
        C27131Oe r1 = conversation.A0l;
        if (r1.A0P()) {
            return false;
        }
        r1.A04();
        return true;
    }
}
