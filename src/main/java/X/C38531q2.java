package X;

import android.view.View;
import com.whatsapp.Conversation;

/* renamed from: X.1q2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38531q2 implements AbstractC06800Ut {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ C38531q2(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AbstractC06800Ut
    public final boolean AM0(View view, AbstractC15070nL r6) {
        Conversation conversation = this.A00;
        conversation.A0h();
        C27131Oe r1 = conversation.A0l;
        if (r1 == null) {
            return false;
        }
        if (r1.A0P()) {
            return true;
        }
        r1.A0Q();
        conversation.A0l.A0J(conversation.A1X);
        conversation.A0W.post(new RunnableEBaseShape1S0100000_I0_1(conversation, 0));
        return true;
    }
}
