package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1IW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IW implements View.OnTouchListener {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass1IW(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (!messageReplyActivity.A0D.A01()) {
            messageReplyActivity.A09.A0E(messageReplyActivity.A06, motionEvent, false);
        }
        return false;
    }
}
