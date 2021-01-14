package X;

import android.view.KeyEvent;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1qU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38811qU implements AnonymousClass2HT {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ C38811qU(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    @Override // X.AnonymousClass2HT
    public final boolean AGv(int i, KeyEvent keyEvent) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        messageReplyActivity.A0T();
        messageReplyActivity.A0V();
        messageReplyActivity.finish();
        return false;
    }
}
