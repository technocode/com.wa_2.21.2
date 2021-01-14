package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.1Ky  reason: invalid class name */
public class AnonymousClass1Ky implements TextView.OnEditorActionListener {
    public boolean A00;
    public final /* synthetic */ Conversation A01;

    public AnonymousClass1Ky(Conversation conversation) {
        this.A01 = conversation;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null) {
            StringBuilder A0S = AnonymousClass008.A0S("conversation/editor/enter :");
            A0S.append(keyEvent.getKeyCode());
            Log.d(A0S.toString());
        }
        if (i == 4) {
            this.A01.A1G(false);
            return true;
        } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        } else {
            if (this.A00) {
                this.A00 = false;
                return true;
            }
            Conversation conversation = this.A01;
            if (((AnonymousClass2DW) conversation).A0N.A00.getBoolean("input_enter_send", true)) {
                conversation.A1G(false);
            } else {
                int selectionStart = conversation.A0k.getSelectionStart();
                int selectionEnd = conversation.A0k.getSelectionEnd();
                if (selectionStart != conversation.A0k.length()) {
                    conversation.A0k.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), "\n", 0, 1);
                } else {
                    conversation.A0k.append("\n");
                }
            }
            this.A00 = true;
            return true;
        }
    }
}
