package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.StatusesFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.0fH  reason: invalid class name and case insensitive filesystem */
public class C10830fH extends AnonymousClass0JW {
    public final AnonymousClass09E A00 = AnonymousClass09E.A00();
    public final AnonymousClass0BB A01 = AnonymousClass0BB.A00();
    public final WeakReference A02;

    public C10830fH(StatusesFragment statusesFragment) {
        this.A02 = new WeakReference(statusesFragment);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C09150cN r12 = (C09150cN) obj;
        StatusesFragment statusesFragment = (StatusesFragment) this.A02.get();
        if (statusesFragment != null) {
            statusesFragment.A04 = null;
            statusesFragment.A05 = r12;
            if (r12.A01.size() == 0) {
                statusesFragment.A0H = true;
            }
            statusesFragment.A06.getFilter().filter(statusesFragment.A0A);
            long j = 0;
            int i = 0;
            for (AnonymousClass1VC r0 : statusesFragment.A05.A02) {
                i++;
                long j2 = r0.A06;
                if (j2 > j) {
                    j = j2;
                }
            }
            ActivityC004902h A0A = statusesFragment.A0A();
            if (A0A instanceof HomeActivity) {
                HomeActivity homeActivity = (HomeActivity) A0A;
                if (j != 0) {
                    homeActivity.A04 = j;
                }
                AnonymousClass02M r02 = ((ActivityC004702f) homeActivity).A0F;
                r02.A02.removeCallbacks(homeActivity.A1s);
                if (homeActivity.A03 == 300) {
                    homeActivity.A0c();
                } else {
                    long j3 = ((ActivityC004702f) homeActivity).A0J.A00.getLong("last_notified_status_row_id", 0);
                    AnonymousClass0YG A0G = homeActivity.A0M.A0G(HomeActivity.A04(((AnonymousClass2C0) homeActivity).A01, 300));
                    if (j3 < j) {
                        A0G.A00 = i;
                        homeActivity.A0f();
                    } else if (A0G.A00 != 0) {
                        A0G.A00 = 0;
                        homeActivity.A0f();
                    }
                }
            }
            C04380Kd r1 = statusesFragment.A0P;
            AnonymousClass1Ny r03 = r1.A00;
            if (r03 != null && !r03.A04) {
                r1.A02(statusesFragment.A05.A02.size());
            }
            statusesFragment.A0r();
            statusesFragment.A0v();
            AnonymousClass02M r04 = statusesFragment.A0M;
            r04.A02.removeCallbacks(statusesFragment.A0u);
            statusesFragment.A0s.ANF(new RunnableEBaseShape1S0100000_I0_1(statusesFragment, 36));
            C40791tq r05 = statusesFragment.A03;
            if (r05 != null) {
                ((AnonymousClass0JW) r05).A00.cancel(true);
            }
            C40791tq r2 = new C40791tq(statusesFragment);
            statusesFragment.A03 = r2;
            statusesFragment.A0s.ANC(r2, new Void[0]);
        }
    }
}
