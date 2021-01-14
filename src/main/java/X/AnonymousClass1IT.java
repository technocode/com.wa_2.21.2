package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1IT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IT implements TextView.OnEditorActionListener {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass1IT(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (i != 4) {
            return false;
        }
        messageReplyActivity.A0X(false);
        return true;
    }
}
