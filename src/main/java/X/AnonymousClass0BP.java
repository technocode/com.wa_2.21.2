package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.0BP  reason: invalid class name */
public class AnonymousClass0BP {
    public void A00(UserJid userJid) {
        if (this instanceof C71063Nl) {
            SearchFragment.A00(((C71063Nl) this).A00, userJid);
        } else if (this instanceof C52262aq) {
            ConversationsFragment.A02(((C52262aq) this).A00, userJid);
        } else if (this instanceof AnonymousClass2ZB) {
            AnonymousClass2ZB r1 = (AnonymousClass2ZB) this;
            if (r1.A01(userJid)) {
                r1.A00.A00();
            }
        } else if (this instanceof AnonymousClass2XA) {
            ContactInfoActivity contactInfoActivity = ((AnonymousClass2XA) this).A00;
            if (userJid.equals(UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"))) && contactInfoActivity.A00 != null) {
                contactInfoActivity.A0q(false, false);
            }
        } else if (this instanceof C42481wm) {
            AnonymousClass2DB r2 = ((C42481wm) this).A00;
            if (r2.A03.equals(userJid) && !r2.A06.A09(r2.A03)) {
                AbstractC42511wp r22 = r2.A01;
                if (r22.A08() == 1) {
                    r22.A02(0);
                }
            }
        } else if (this instanceof C41751va) {
            C41751va r0 = (C41751va) this;
            if (userJid != null) {
                BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = r0.A00;
                if (userJid.equals(businessProfileExtraFieldsActivity.A02)) {
                    businessProfileExtraFieldsActivity.A03.A03(businessProfileExtraFieldsActivity.A02, new C41731vY(businessProfileExtraFieldsActivity));
                }
            }
        } else if (this instanceof C39661rt) {
            C39661rt r12 = (C39661rt) this;
            if (r12.A01(userJid)) {
                r12.A00.A0n();
            }
        }
    }
}
