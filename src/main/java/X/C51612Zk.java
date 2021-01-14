package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Zk  reason: invalid class name and case insensitive filesystem */
public class C51612Zk extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ C59052my A00;

    public C51612Zk(C59052my r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        C59052my r2 = this.A00;
        String str = null;
        if (r2.A00 == 1) {
            Iterator it = r2.A0P.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                if (userJid != null) {
                    AnonymousClass36B r3 = r2.A0M;
                    Context context = r2.getContext();
                    AnonymousClass1Z4 r0 = r2.A04;
                    if (r0 != null) {
                        str = r0.A08.A08;
                    }
                    r3.A02(context, userJid, str);
                    return;
                }
            }
            return;
        }
        AnonymousClass0FI.A0B(r2.getFMessage());
        Context A0O = C002001d.A0O(r2.getContext());
        if (r2.A04 != null && (A0O instanceof ActivityC004802g)) {
            ActivityC004902h r6 = (ActivityC004902h) A0O;
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (int i = 0; i < r2.A04.A05.size(); i++) {
                if (r2.A0P.get(i) != null) {
                    arrayList.add(((AnonymousClass1Z3) r2.A04.A05.get(i)).A02);
                    arrayList2.add(((AnonymousClass1Z3) r2.A04.A05.get(i)).A03);
                } else {
                    arrayList.add(null);
                    arrayList2.add(null);
                }
            }
            ArrayList arrayList3 = r2.A0P;
            String str2 = r2.A04.A08.A08;
            ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = new ConversationRowContact$MessageSharedContactDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("jids", AnonymousClass1VY.A0F(arrayList3));
            bundle.putStringArrayList("phones", arrayList);
            bundle.putStringArrayList("labels", arrayList2);
            bundle.putString("business_name", str2);
            conversationRowContact$MessageSharedContactDialogFragment.A0N(bundle);
            conversationRowContact$MessageSharedContactDialogFragment.A0u(r6.A04(), null);
        }
    }
}
