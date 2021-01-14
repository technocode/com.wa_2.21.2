package X;

import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0eM  reason: invalid class name and case insensitive filesystem */
public class C10270eM extends AnonymousClass0JW {
    public int A00;
    public AnonymousClass2RU A01;
    public final AnonymousClass01I A02 = AnonymousClass01I.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final C014308b A04 = C014308b.A00();
    public final AnonymousClass01T A05 = AnonymousClass01T.A00();
    public final AnonymousClass09H A06 = AnonymousClass09H.A01();
    public final AnonymousClass0AR A07 = AnonymousClass0AR.A00();
    public final C29111Xc A08;
    public final AnonymousClass0ZF A09;
    public final WeakReference A0A;

    public C10270eM(ViewGroupInviteActivity viewGroupInviteActivity, AnonymousClass0ZF r3, C29111Xc r4) {
        this.A0A = new WeakReference(viewGroupInviteActivity);
        this.A09 = r3;
        this.A08 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C007003k A092;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A0A.get();
        if (viewGroupInviteActivity != null) {
            AnonymousClass2RU r6 = this.A01;
            int i = this.A00;
            if (r6 != null) {
                viewGroupInviteActivity.A02.setVisibility(0);
                C08840bo r2 = viewGroupInviteActivity.A08;
                C29111Xc r0 = viewGroupInviteActivity.A0B;
                if (r0 != null) {
                    r2.A01(r6, r0.A00 * 1000);
                    viewGroupInviteActivity.A03.setVisibility(8);
                    C29111Xc r22 = viewGroupInviteActivity.A0B;
                    if (r22 == null) {
                        return;
                    }
                    if (!viewGroupInviteActivity.A0E || (A092 = viewGroupInviteActivity.A0F.A09(r22.A01)) == null) {
                        AnonymousClass0AR r23 = viewGroupInviteActivity.A0P;
                        C29111Xc r62 = viewGroupInviteActivity.A0B;
                        C55512gf r5 = new C55512gf(viewGroupInviteActivity);
                        AnonymousClass09K r1 = r23.A04;
                        if (r1.A06 && r1.A02) {
                            AnonymousClass09H r4 = r23.A08;
                            String A022 = r4.A02();
                            try {
                                r4.A05(A022, Message.obtain(null, 0, 212, 0, new AnonymousClass1WY(A022, r62, r5)), false);
                            } catch (AnonymousClass1WI unused) {
                            }
                        }
                    } else {
                        viewGroupInviteActivity.A07.A02(A092, viewGroupInviteActivity.A04);
                    }
                } else {
                    throw null;
                }
            } else {
                viewGroupInviteActivity.A02.setVisibility(4);
                viewGroupInviteActivity.A03.setVisibility(4);
                if (i == 403) {
                    viewGroupInviteActivity.A0T(R.string.group_info_fetch_invalid_invite);
                } else if (i == 404 || i == 406) {
                    viewGroupInviteActivity.A0T(R.string.group_info_fetch_invalid_group);
                } else {
                    viewGroupInviteActivity.A0T(R.string.group_info_fetch_failure);
                }
            }
        }
    }

    public final void A04(AnonymousClass02U r8, UserJid userJid, String str, Collection collection, int i, C11220fu r13) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C007003k A092 = this.A03.A09((AnonymousClass02N) it.next());
            if (!(A092 == null || A092.A08 == null)) {
                arrayList.add(A092);
            }
        }
        Collections.sort(arrayList, new C55522gg(this.A02, this.A04));
        this.A01 = new AnonymousClass2RU(r8, userJid, str, arrayList, i, r13);
    }
}
