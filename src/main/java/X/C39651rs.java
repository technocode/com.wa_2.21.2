package X;

import android.os.Build;
import com.whatsapp.Conversation;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1rs  reason: invalid class name and case insensitive filesystem */
public class C39651rs extends AnonymousClass019 {
    public final /* synthetic */ Conversation A00;

    public C39651rs(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass019
    public void A02(Collection collection, Map map, Map map2) {
        int A002;
        int i;
        int i2;
        AnonymousClass377 r1;
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC007503q r3 = (AbstractC007503q) it.next();
            C007303n r4 = r3.A0n;
            AnonymousClass02N r12 = r4.A00;
            Conversation conversation = this.A00;
            if (r12.equals(conversation.A14)) {
                if (Build.VERSION.SDK_INT >= 19 && (r1 = conversation.A1D) != null && r1.A0E && r4.equals(r1.A09)) {
                    z2 = true;
                }
                if (!conversation.A2z.A02(r3) && (i = conversation.A07) > 0) {
                    conversation.A07 = i - 1;
                    if (r3.A0m != 10 && (i2 = conversation.A05) > 0) {
                        conversation.A05 = i2 - 1;
                    }
                    conversation.A0o();
                }
                z = true;
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("conversation/observer/delete/unseen/");
        Conversation conversation2 = this.A00;
        A0S.append(conversation2.A07);
        A0S.append("/");
        A0S.append(conversation2.A05);
        A0S.append("/");
        AnonymousClass008.A1L(A0S, conversation2.A06);
        if (z) {
            if (conversation2.A07 > 0 && conversation2.A0q.getCount() > (A002 = conversation2.A0q.A00() + 1)) {
                AbstractC007503q A04 = conversation2.A0q.getItem(A002);
                if (A04 != null) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AbstractC007503q r2 = (AbstractC007503q) it2.next();
                        if (r2.A0n.A00.equals(conversation2.A14) && r2.A0p >= A04.A0p) {
                            conversation2.A0q();
                            break;
                        }
                    }
                } else {
                    throw null;
                }
            }
            conversation2.A0l();
            if (Build.VERSION.SDK_INT >= 19 && z2) {
                conversation2.A1D.A00();
            }
        }
    }
}
