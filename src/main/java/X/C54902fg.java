package X;

import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;

/* renamed from: X.2fg  reason: invalid class name and case insensitive filesystem */
public class C54902fg extends C49352Qd {
    public final /* synthetic */ GroupChatInfo A00;
    public final /* synthetic */ HashSet A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54902fg(GroupChatInfo groupChatInfo, AnonymousClass01I r2, C014308b r3, HashSet hashSet) {
        super(r2, r3);
        this.A00 = groupChatInfo;
        this.A01 = hashSet;
    }

    @Override // X.C49352Qd
    public int A00(C007003k r5, C007003k r6) {
        AnonymousClass01I r1 = this.A00.A0a;
        if (!r1.A09(r5.A09) && !r1.A09(r6.A09)) {
            HashSet hashSet = this.A01;
            boolean contains = hashSet.contains(r5.A02(UserJid.class));
            boolean contains2 = hashSet.contains(r6.A02(UserJid.class));
            if (contains) {
                if (!contains2) {
                    return -1;
                }
            } else if (contains2) {
                return 1;
            }
        }
        return super.compare(r5, r6);
    }
}
