package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0eN  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC10280eN extends AnonymousClass0JW {
    public int A00;
    public AnonymousClass0PU A01;
    public C05350Oe A02;
    public AnonymousClass02U A03;
    public UserJid A04;
    public final AnonymousClass0AR A05 = AnonymousClass0AR.A00();

    public AbstractC10280eN(AnonymousClass02U r2, UserJid userJid) {
        this.A03 = r2;
        this.A04 = userJid;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        if (this.A02 == null || this.A01 == null) {
            if (!(this instanceof C60062oj)) {
                C59992oc r1 = (C59992oc) this;
                ActivityC004702f r0 = (ActivityC004702f) r1.A01.get();
                if (r0 != null) {
                    r0.A0K.A00();
                    r1.A00.A06(R.string.revoking_invite_failure, 0);
                    return;
                }
                return;
            }
            ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) ((C60062oj) this).A00.get();
            if (viewGroupInviteActivity != null) {
                viewGroupInviteActivity.A0T(R.string.revoking_invite_failure);
            }
        } else if (!(this instanceof C60062oj)) {
            C59992oc r12 = (C59992oc) this;
            ActivityC004702f r02 = (ActivityC004702f) r12.A01.get();
            if (r02 != null) {
                r02.A0K.A00();
                r12.A00.A06(R.string.revoking_invite_success, 0);
            }
        } else {
            C60062oj r13 = (C60062oj) this;
            Activity activity = (Activity) r13.A00.get();
            if (activity != null) {
                r13.A01.A06(R.string.revoking_invite_success, 0);
                activity.finish();
            }
        }
    }
}
