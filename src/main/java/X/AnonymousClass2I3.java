package X;

import android.text.TextUtils;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.2I3  reason: invalid class name */
public class AnonymousClass2I3 {
    public C11920hE A00;
    public ConversationListRowHeaderView A01;
    public final C014308b A02;

    public AnonymousClass2I3(ConversationListRowHeaderView conversationListRowHeaderView, C014308b r4, AnonymousClass01X r5, AnonymousClass31y r6) {
        this.A01 = conversationListRowHeaderView;
        this.A02 = r4;
        this.A00 = new C11920hE(conversationListRowHeaderView.A00, r4, r5, r6);
    }

    public void A00() {
        this.A01.A01.setVisibility(8);
        this.A00.A00.setText("");
        this.A00.A00.setPlaceholder(50);
    }

    public void A01(C007003k r3, List list, AbstractC11890hA r5) {
        String A08;
        this.A00.A00.setPlaceholder(0);
        if (!AnonymousClass1VY.A0T(r3.A09) || !TextUtils.isEmpty(r3.A0F)) {
            A08 = this.A02.A08(r3, false);
        } else {
            C014308b r1 = this.A02;
            Jid A022 = r3.A02(AnonymousClass0OP.class);
            if (A022 != null) {
                A08 = r1.A0A((AnonymousClass02X) A022);
            } else {
                throw null;
            }
        }
        this.A00.A05(A08, list, r5);
    }
}
