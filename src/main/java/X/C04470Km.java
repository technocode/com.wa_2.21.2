package X;

import com.whatsapp.Conversation;
import java.util.Iterator;

/* renamed from: X.0Km  reason: invalid class name and case insensitive filesystem */
public class C04470Km extends AbstractC003401r {
    public static final C04470Km A00 = new C04470Km();

    public void A02(String str) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                Conversation conversation = ((C39771s5) r1.next()).A00;
                int i = 0;
                if (conversation.A12.A01()) {
                    conversation.A12.A00(false);
                }
                C59842oN r12 = conversation.A11;
                if (r12 != null) {
                    if (r12.A0M == null || !r12.isShowing()) {
                        r12.A07();
                    }
                    r12.A0C(2);
                    AnonymousClass3R6 r2 = r12.A0M;
                    r2.A0D = str;
                    while (true) {
                        AnonymousClass3RI[] r13 = r2.A0G;
                        if (i >= r13.length) {
                            break;
                        } else if (str.equals(r13[i].getId())) {
                            r2.A01(i, true);
                            r2.A0D = null;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
