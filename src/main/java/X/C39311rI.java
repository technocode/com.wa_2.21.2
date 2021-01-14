package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1rI  reason: invalid class name and case insensitive filesystem */
public class C39311rI extends AnonymousClass0JW {
    public int A00;
    public AnonymousClass02U A01;
    public final AnonymousClass0AR A02 = AnonymousClass0AR.A00();
    public final String A03;
    public final WeakReference A04;

    public C39311rI(AcceptInviteLinkActivity acceptInviteLinkActivity, String str) {
        this.A04 = new WeakReference(acceptInviteLinkActivity);
        this.A03 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A04.get();
        if (acceptInviteLinkActivity != null) {
            AnonymousClass02U r4 = this.A01;
            int i = this.A00;
            if (r4 != null) {
                if (acceptInviteLinkActivity.A09.A0C(r4)) {
                    AnonymousClass01T r0 = acceptInviteLinkActivity.A0C;
                    if (r0.A01(r4).A0A(r0.A01)) {
                        StringBuilder sb = new StringBuilder("acceptlink/processcode/exists/");
                        sb.append(r4);
                        Log.i(sb.toString());
                        acceptInviteLinkActivity.A0I(Conversation.A05(acceptInviteLinkActivity, r4), true);
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder("acceptlink/sendjoin/willwait/");
                sb2.append(r4);
                Log.i(sb2.toString());
                StringBuilder sb3 = new StringBuilder("acceptlink/wait/");
                sb3.append(acceptInviteLinkActivity.A02);
                Log.i(sb3.toString());
                Runnable runnable = acceptInviteLinkActivity.A03;
                if (runnable == null) {
                    runnable = new RunnableEBaseShape0S0100000_I0_0(acceptInviteLinkActivity, 33);
                    acceptInviteLinkActivity.A03 = runnable;
                }
                ((ActivityC004702f) acceptInviteLinkActivity).A0F.A02.postDelayed(runnable, 32000);
                return;
            }
            AnonymousClass008.A0u("acceptlink/sendjoin/failed/", i);
            if (i == 401) {
                acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_banned);
            } else if (i == 404) {
                acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_no_group);
            } else if (i == 419) {
                acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_group_full);
            } else if (i == 409) {
                acceptInviteLinkActivity.A0I(Conversation.A05(acceptInviteLinkActivity, acceptInviteLinkActivity.A02), true);
                acceptInviteLinkActivity.A0D.A0F(acceptInviteLinkActivity.A02, null);
            } else if (i != 410) {
                acceptInviteLinkActivity.A0T(R.string.register_try_again_later);
            } else {
                acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_reset);
            }
        }
    }
}
