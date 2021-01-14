package X;

import com.whatsapp.MessageReplyActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1rB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39241rB implements AnonymousClass33U {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ C39241rB(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    @Override // X.AnonymousClass33U
    public final void AKY(C29241Xq r10, Integer num) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (messageReplyActivity.A0L.A0H(UserJid.of(messageReplyActivity.A0E))) {
            C002001d.A2O(messageReplyActivity, 106);
            return;
        }
        C04360Kb r3 = messageReplyActivity.A0T;
        AnonymousClass02N r5 = messageReplyActivity.A0E;
        if (r5 != null) {
            r3.A0O(r10, r5, messageReplyActivity.A0G, false, num);
            messageReplyActivity.A0U();
            return;
        }
        throw null;
    }
}
