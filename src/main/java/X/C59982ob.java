package X;

import com.whatsapp.group.GroupChatInfo;
import java.lang.ref.WeakReference;

/* renamed from: X.2ob  reason: invalid class name and case insensitive filesystem */
public class C59982ob extends AbstractC55082fy {
    public final WeakReference A00;

    public C59982ob(GroupChatInfo groupChatInfo, C007003k r3, String str) {
        super(r3, str);
        this.A00 = new WeakReference(groupChatInfo);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00.get();
        if (groupChatInfo != null) {
            groupChatInfo.A00.setVisibility(0);
            groupChatInfo.A0T.setVisibility(8);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00.get();
        if (groupChatInfo != null) {
            groupChatInfo.A00.setVisibility(8);
            groupChatInfo.A0T.setVisibility(0);
        }
    }
}
