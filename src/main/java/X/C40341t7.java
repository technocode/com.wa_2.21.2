package X;

import android.view.KeyEvent;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1t7  reason: invalid class name and case insensitive filesystem */
public class C40341t7 implements AbstractC26561Lk {
    public final /* synthetic */ MessageReplyActivity A00;

    public C40341t7(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A08.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (!messageReplyActivity.A09.A0P()) {
            C002001d.A2l(messageReplyActivity.A08, iArr, 0);
        }
    }
}
