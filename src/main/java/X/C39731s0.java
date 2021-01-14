package X;

import android.view.KeyEvent;
import com.whatsapp.Conversation;

/* renamed from: X.1s0  reason: invalid class name and case insensitive filesystem */
public class C39731s0 implements AbstractC26561Lk {
    public final /* synthetic */ Conversation A00;

    public C39731s0(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A0k.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        Conversation conversation = this.A00;
        C002001d.A2l(conversation.A0k, iArr, 0);
        conversation.A0k.callOnClick();
    }
}
