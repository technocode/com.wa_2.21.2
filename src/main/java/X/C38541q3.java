package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;

/* renamed from: X.1q3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38541q3 implements AnonymousClass1MU {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ C38541q3(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass1MU
    public final void ADw(boolean z) {
        Conversation conversation = this.A00;
        int i = R.drawable.ib_new_expanded_bottom;
        if (!z) {
            i = conversation.A0b(2);
        }
        conversation.A0y(i);
    }
}
