package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.invites.ViewGroupInviteActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.0eL  reason: invalid class name and case insensitive filesystem */
public class C10260eL extends AnonymousClass0JW {
    public int A00;
    public AnonymousClass02U A01;
    public final AnonymousClass0AR A02 = AnonymousClass0AR.A00();
    public final C29111Xc A03;
    public final WeakReference A04;

    public C10260eL(ViewGroupInviteActivity viewGroupInviteActivity, C29111Xc r3) {
        this.A04 = new WeakReference(viewGroupInviteActivity);
        this.A03 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A04.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass02U r3 = this.A01;
            int i = this.A00;
            if (r3 != null) {
                if (viewGroupInviteActivity.A0K.A0C(r3)) {
                    AnonymousClass01T r0 = viewGroupInviteActivity.A0O;
                    if (r0.A01(r3).A0A(r0.A01)) {
                        viewGroupInviteActivity.A0I(Conversation.A05(viewGroupInviteActivity, r3), true);
                        return;
                    }
                }
                Runnable runnable = viewGroupInviteActivity.A0D;
                if (runnable == null) {
                    runnable = new RunnableEBaseShape3S0100000_I0_3(viewGroupInviteActivity, 9);
                    viewGroupInviteActivity.A0D = runnable;
                }
                ((ActivityC004702f) viewGroupInviteActivity).A0F.A02.postDelayed(runnable, 32000);
                return;
            }
            if (i != 400) {
                if (i == 404) {
                    viewGroupInviteActivity.A0T(R.string.group_error_accept_invite_group_does_not_exist);
                    return;
                } else if (i == 419) {
                    viewGroupInviteActivity.A0T(R.string.group_error_accept_invite_group_full);
                    return;
                } else if (i != 500) {
                    if (i == 409) {
                        viewGroupInviteActivity.A0T(R.string.group_error_accept_invite_already_in_group);
                        return;
                    } else if (i != 410) {
                        viewGroupInviteActivity.A0T(R.string.register_try_again_later);
                        return;
                    } else {
                        viewGroupInviteActivity.A0T(R.string.group_error_accept_invite_invalid);
                        return;
                    }
                }
            }
            viewGroupInviteActivity.A0T(R.string.group_error_accept_invite_failure);
        }
    }
}
