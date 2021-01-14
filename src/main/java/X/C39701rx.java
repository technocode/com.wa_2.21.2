package X;

import android.text.Editable;
import com.whatsapp.Conversation;

/* renamed from: X.1rx  reason: invalid class name and case insensitive filesystem */
public class C39701rx extends C07860Zy {
    public final /* synthetic */ Conversation A00;

    public C39701rx(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        Conversation conversation = this.A00;
        String obj = editable.toString();
        conversation.A1J = obj;
        conversation.A1N = AnonymousClass1YB.A03(obj, ((AnonymousClass2C0) conversation).A01);
        conversation.A1K = conversation.A1J;
        conversation.A0q.A01++;
        conversation.A0m();
    }
}
