package X;

import com.whatsapp.group.GroupChatInfo;
import java.util.List;

/* renamed from: X.27z  reason: invalid class name */
public class AnonymousClass27z extends AnonymousClass21U implements AbstractC29101Xb {
    public AnonymousClass27z(AnonymousClass0C4 r10, AnonymousClass0EO r11, AnonymousClass0A8 r12, AnonymousClass02U r13, List list) {
        super(r10, r11, r12, r13, null, list, 15, null);
    }

    public AnonymousClass27z(AnonymousClass0C4 r10, AnonymousClass0EO r11, AnonymousClass0A8 r12, AnonymousClass02U r13, List list, AnonymousClass1Xa r15) {
        super(r10, r11, r12, r13, null, list, 15, r15);
    }

    @Override // X.AbstractC29101Xb
    public void ANB(C64502yI r5) {
        if (this instanceof C60552pg) {
            C60552pg r3 = (C60552pg) this;
            GroupChatInfo groupChatInfo = r3.A00;
            if (groupChatInfo.A0e.A0D(AbstractC000400g.A18) && r5.A02.size() > 0) {
                AnonymousClass02M r2 = groupChatInfo.A0Z;
                r2.A02.post(new RunnableEBaseShape8S0200000_I1_3(r3, r5, 10));
            }
        }
    }
}
