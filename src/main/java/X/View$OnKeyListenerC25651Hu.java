package X;

import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.Conversation;

/* renamed from: X.1Hu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnKeyListenerC25651Hu implements View.OnKeyListener {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ View$OnKeyListenerC25651Hu(Conversation conversation) {
        this.A00 = conversation;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Conversation conversation = this.A00;
        if (!((AnonymousClass2DW) conversation).A0N.A00.getBoolean("input_enter_send", true) || keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        conversation.A1G(false);
        return true;
    }
}
