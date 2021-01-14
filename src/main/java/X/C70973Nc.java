package X;

import android.os.SystemClock;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.search.SearchFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Nc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70973Nc implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C70973Nc(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        View view;
        AnonymousClass0QB r7;
        Object obj2;
        SearchFragment searchFragment = this.A00;
        AnonymousClass0M3 r72 = (AnonymousClass0M3) obj;
        AnonymousClass0LW A04 = searchFragment.A0B().A04();
        int A05 = searchFragment.A0B.A05(r72);
        if (A05 == -2) {
            searchFragment.A0N.A06(R.string.gallery_media_not_exist, 0);
            return;
        }
        AbstractC11910hD A0C = searchFragment.A03.A0C(A05);
        if (A0C != null) {
            view = A0C.A0H.findViewById(R.id.thumb_view);
        } else {
            view = null;
        }
        searchFragment.A0B.A0G(4);
        ActivityC004902h A0B = searchFragment.A0B();
        AnonymousClass1PN r8 = searchFragment.A0U;
        RunnableEBaseShape4S0100000_I0_4 runnableEBaseShape4S0100000_I0_4 = new RunnableEBaseShape4S0100000_I0_4(searchFragment, 13);
        MediaViewFragment A02 = MediaViewFragment.A02(r72.A0n, null, false, false, 5, SystemClock.uptimeMillis(), AnonymousClass2UT.A00(A0B, view), 1, false, 2);
        boolean z = AnonymousClass2UT.A00;
        if (z) {
            A02.A08().A0C = true;
        }
        ((MediaViewBaseFragment) A02).A0D = runnableEBaseShape4S0100000_I0_4;
        ActivityC004802g r4 = (ActivityC004802g) A0B;
        String A07 = AbstractC59162nB.A07(r72);
        if (z && view != null) {
            ArrayList A052 = C57652ke.A05(view, r4, r8, A07);
            if (A04 != null) {
                r7 = new AnonymousClass0QB(A04);
                Iterator it = A052.iterator();
                while (it.hasNext()) {
                    AnonymousClass02R r3 = (AnonymousClass02R) it.next();
                    Object obj3 = r3.A00;
                    if (!(obj3 == null || (obj2 = r3.A01) == null)) {
                        View view2 = (View) obj3;
                        String str = (String) obj2;
                        if (C09330ch.A00 != null || C09330ch.A01 != null) {
                            String A0G = AnonymousClass0Q7.A0G(view2);
                            if (A0G != null) {
                                if (r7.A0B == null) {
                                    r7.A0B = new ArrayList();
                                    r7.A0C = new ArrayList();
                                } else if (r7.A0C.contains(str)) {
                                    throw new IllegalArgumentException(AnonymousClass008.A0L("A shared element with the target name '", str, "' has already been added to the transaction."));
                                } else if (r7.A0B.contains(A0G)) {
                                    throw new IllegalArgumentException(AnonymousClass008.A0L("A shared element with the source name '", A0G, "' has already been added to the transaction."));
                                }
                                r7.A0B.add(A0G);
                                r7.A0C.add(str);
                            } else {
                                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                            }
                        }
                    }
                }
            } else {
                throw null;
            }
        } else if (A04 != null) {
            r7 = new AnonymousClass0QB(A04);
        } else {
            throw null;
        }
        r7.A0F = true;
        r7.A06(R.id.media_fragment_holder, A02, "media_view_fragment");
        r7.A08("media_view_fragment");
        r7.A00();
    }
}
