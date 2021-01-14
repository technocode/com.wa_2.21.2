package X;

import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2od  reason: invalid class name and case insensitive filesystem */
public class C60002od extends AnonymousClass2X5 {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final AnonymousClass00S A02 = AnonymousClass00S.A00();
    public final C02930Ea A03 = C02930Ea.A00();
    public final AnonymousClass02U A04;
    public final WeakReference A05;

    public C60002od(GroupChatInfo groupChatInfo, C007003k r3) {
        super(groupChatInfo, r3);
        this.A05 = new WeakReference(groupChatInfo);
        Jid A022 = r3.A02(AnonymousClass02U.class);
        if (A022 != null) {
            this.A04 = (AnonymousClass02U) A022;
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A05.get();
        if (groupChatInfo != null) {
            groupChatInfo.A0I.A04(groupChatInfo.A05, groupChatInfo.A02, groupChatInfo.A0C, groupChatInfo.A0M);
            groupChatInfo.A0O(false);
            MediaCard mediaCard = groupChatInfo.A0U;
            if (mediaCard != null) {
                if (mediaCard.getVisibility() == 0) {
                    groupChatInfo.A0X();
                }
                Log.i("group_info/updated");
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass2X5
    public Void A04(Void... voidArr) {
        super.A04(voidArr);
        if (((AnonymousClass0JW) this).A00.isCancelled()) {
            return null;
        }
        List A012 = this.A03.A01(this.A04, this.A02.A05() / 1000);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A012).iterator();
        while (it.hasNext()) {
            AnonymousClass0ZF r2 = (AnonymousClass0ZF) it.next();
            AnonymousClass02N r1 = r2.A0n.A00;
            if (r1 != null && !hashSet.contains(r1)) {
                hashSet.add(r1);
                C007003k A09 = this.A01.A09(r1);
                if (A09 != null) {
                    arrayList.add(new AnonymousClass2RW(A09, r2));
                }
            }
        }
        AnonymousClass02M r22 = this.A00;
        r22.A02.post(new RunnableEBaseShape8S0200000_I1_3(this, arrayList, 11));
        return null;
    }
}
