package X;

import android.text.Editable;
import com.whatsapp.Conversation;

/* renamed from: X.1rl  reason: invalid class name and case insensitive filesystem */
public class C39581rl extends C07860Zy {
    public final /* synthetic */ Conversation A00;

    public C39581rl(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        Conversation conversation = this.A00;
        if (conversation.A1b) {
            return;
        }
        if (editable.toString().length() != 0) {
            conversation.A2K.A0D((AnonymousClass02N) conversation.A0z.A02(AnonymousClass02N.class), 0);
            return;
        }
        conversation.A1Y = false;
        conversation.A2K.A0B((AnonymousClass02N) conversation.A0z.A02(AnonymousClass02N.class));
    }
}
