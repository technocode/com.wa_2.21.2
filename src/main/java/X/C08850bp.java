package X;

import android.os.Message;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0bp  reason: invalid class name and case insensitive filesystem */
public class C08850bp extends AnonymousClass0JW {
    public int A00;
    public AnonymousClass2RU A01;
    public final AnonymousClass01I A02 = AnonymousClass01I.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final C014308b A04 = C014308b.A00();
    public final AnonymousClass09H A05 = AnonymousClass09H.A01();
    public final AnonymousClass0AR A06 = AnonymousClass0AR.A00();
    public final String A07;
    public final WeakReference A08;

    public C08850bp(AcceptInviteLinkActivity acceptInviteLinkActivity, String str) {
        this.A08 = new WeakReference(acceptInviteLinkActivity);
        this.A07 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A08.get();
        if (acceptInviteLinkActivity != null) {
            String str = this.A07;
            AnonymousClass2RU r7 = this.A01;
            int i = this.A00;
            if (r7 != null) {
                C006903j r0 = acceptInviteLinkActivity.A09;
                AnonymousClass02U r9 = r7.A01;
                if (r0.A0C(r9) && acceptInviteLinkActivity.A0C.A04(r9)) {
                    StringBuilder A0S = AnonymousClass008.A0S("acceptlink/processcode/exists/");
                    A0S.append(r9);
                    Log.i(A0S.toString());
                    ((ActivityC004702f) acceptInviteLinkActivity).A0F.A0C(acceptInviteLinkActivity.A08.A06(R.string.accept_invite_link_already_in_group), 1);
                    acceptInviteLinkActivity.A0I(Conversation.A05(acceptInviteLinkActivity, r9), true);
                } else if (!C002001d.A3D(acceptInviteLinkActivity)) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("acceptlink/processcode/showconfirmation/");
                    A0S2.append(r9);
                    Log.i(A0S2.toString());
                    acceptInviteLinkActivity.A01.A01(r7, 0);
                    AnonymousClass0AR r3 = acceptInviteLinkActivity.A0D;
                    C39281rF r10 = new C39281rF(acceptInviteLinkActivity);
                    AnonymousClass09K r2 = r3.A04;
                    if (r2.A06 && r2.A02) {
                        AnonymousClass09H r6 = r3.A08;
                        String A022 = r6.A02();
                        try {
                            r6.A05(A022, Message.obtain(null, 0, 112, 0, new AnonymousClass1WX(A022, r9, str, r10)), false);
                        } catch (AnonymousClass1WI unused) {
                        }
                    }
                    acceptInviteLinkActivity.findViewById(R.id.invite_accept).setOnClickListener(new AnonymousClass1HO(acceptInviteLinkActivity, str, r7));
                    acceptInviteLinkActivity.findViewById(R.id.invite_ignore).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(acceptInviteLinkActivity, 5));
                    acceptInviteLinkActivity.findViewById(R.id.progress).setVisibility(8);
                    acceptInviteLinkActivity.findViewById(R.id.group_info).setVisibility(0);
                } else {
                    StringBuilder A0S3 = AnonymousClass008.A0S("acceptlink/processcode/activityended/");
                    A0S3.append(r9);
                    Log.i(A0S3.toString());
                }
            } else {
                AnonymousClass008.A0u("acceptlink/processcode/failed/", i);
                if (i == 0) {
                    acceptInviteLinkActivity.A0T(R.string.network_required);
                } else if (i == 401) {
                    acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_banned);
                } else if (i == 404) {
                    acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_no_group);
                } else if (i == 406) {
                    acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_invalid);
                } else if (i == 410) {
                    acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_link_reset);
                } else if (i != 419) {
                    acceptInviteLinkActivity.A0T(R.string.register_try_again_later);
                } else {
                    acceptInviteLinkActivity.A0T(R.string.failed_accept_invite_group_full);
                }
            }
        }
    }
}
