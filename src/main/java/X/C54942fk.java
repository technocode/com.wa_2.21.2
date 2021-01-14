package X;

import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2fk  reason: invalid class name and case insensitive filesystem */
public class C54942fk implements AnonymousClass0EF {
    public final /* synthetic */ GroupChatInfo A00;

    @Override // X.AnonymousClass0EF
    public void AJ5(C02900Dx r1) {
    }

    public C54942fk(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    @Override // X.AnonymousClass0EF
    public void AJ6(AnonymousClass02N r5, UserJid userJid) {
        GroupChatInfo groupChatInfo = this.A00;
        if (r5.equals(groupChatInfo.A0S)) {
            AnonymousClass02M r2 = groupChatInfo.A0Z;
            r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(groupChatInfo, 9));
        }
    }

    @Override // X.AnonymousClass0EF
    public void AJ7(AnonymousClass02N r5, UserJid userJid) {
        GroupChatInfo groupChatInfo = this.A00;
        if (r5.equals(groupChatInfo.A0S)) {
            AnonymousClass02M r2 = groupChatInfo.A0Z;
            r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(groupChatInfo, 8));
        }
    }
}
