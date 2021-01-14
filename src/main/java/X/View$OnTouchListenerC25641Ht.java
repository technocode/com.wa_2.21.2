package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.Conversation;

/* renamed from: X.1Ht  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnTouchListenerC25641Ht implements View.OnTouchListener {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ View$OnTouchListenerC25641Ht(Conversation conversation) {
        this.A00 = conversation;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Conversation conversation = this.A00;
        if (!conversation.A12.A01()) {
            conversation.A0p();
            conversation.A0h();
            conversation.A0l.A0E(conversation.A0X, motionEvent, conversation.A1X);
        }
        return false;
    }
}
