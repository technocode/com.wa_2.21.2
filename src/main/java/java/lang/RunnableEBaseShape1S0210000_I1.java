package java.lang;

import X.AbstractC49792Sd;
import X.AbstractC59392na;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass082;
import X.AnonymousClass0M3;
import X.AnonymousClass1DF;
import X.AnonymousClass1S2;
import X.AnonymousClass1S3;
import X.AnonymousClass1n0;
import X.AnonymousClass2KA;
import X.AnonymousClass2PS;
import X.C013807v;
import X.C15260nl;
import X.C48082Kv;
import X.C52282as;
import android.location.Location;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

public class RunnableEBaseShape1S0210000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableEBaseShape1S0210000_I1(C013807v r2, AnonymousClass082 r3) {
        this.A03 = 0;
        this.A02 = false;
        this.A01 = r2;
        this.A00 = r3;
    }

    public RunnableEBaseShape1S0210000_I1(Object obj, Object obj2, boolean z, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    public void run() {
        AnonymousClass1DF r2;
        ActivityC004902h A0A;
        switch (this.A03) {
            case 0:
                if (!this.A02) {
                    ((C013807v) this.A01).A04((AnonymousClass082) this.A00);
                    this.A02 = true;
                    return;
                }
                return;
            case 1:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A00;
                C15260nl r0 = swipeDismissBehavior.A04;
                if (r0 != null && r0.A0B()) {
                    ((View) this.A01).postOnAnimation(this);
                    return;
                } else if (this.A02 && (r2 = swipeDismissBehavior.A05) != null) {
                    ((View) this.A01).setVisibility(8);
                    ((AnonymousClass1n0) r2).A00.A02(0);
                    return;
                } else {
                    return;
                }
            case 2:
                C48082Kv r3 = (C48082Kv) this.A01;
                boolean z = this.A02;
                for (AnonymousClass1S2 r02 : ((AnonymousClass1S3) this.A00).A09) {
                    r02.AIq(r3, z);
                }
                return;
            case 3:
                AnonymousClass02N r4 = (AnonymousClass02N) this.A01;
                boolean z2 = this.A02;
                AnonymousClass008.A12("conversations/group/toggleGroupProgressbar/:", r4);
                ConversationsFragment conversationsFragment = ((C52282as) this.A00).A00;
                View A0q = conversationsFragment.A0q(r4);
                if (A0q != null) {
                    View findViewById = A0q.findViewById(R.id.progressbar_small);
                    if (z2) {
                        findViewById.setVisibility(0);
                        return;
                    } else {
                        findViewById.setVisibility(8);
                        return;
                    }
                } else {
                    StringBuilder A0W = AnonymousClass008.A0W("conversations/refresh: no view for ", r4, " ");
                    A0W.append(conversationsFragment.A06.getFirstVisiblePosition());
                    A0W.append("-");
                    A0W.append(conversationsFragment.A06.getLastVisiblePosition());
                    A0W.append(" (");
                    A0W.append(conversationsFragment.A06.getCount());
                    A0W.append(")");
                    Log.w(A0W.toString());
                    return;
                }
            case 4:
                ((AbstractC59392na) this.A00).A04((AnonymousClass2KA) this.A01, this.A02);
                return;
            case 5:
                VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = (VerticalSwipeDismissBehavior) this.A00;
                C15260nl r03 = verticalSwipeDismissBehavior.A05;
                if (r03 == null || !r03.A0B()) {
                    AnonymousClass2PS r1 = verticalSwipeDismissBehavior.A06;
                    if (r1 == null) {
                        return;
                    }
                    if (this.A02) {
                        r1.AF9((View) this.A01);
                        return;
                    } else {
                        r1.AK2((View) this.A01);
                        return;
                    }
                } else {
                    ((View) this.A01).postOnAnimation(this);
                    return;
                }
            case 6:
                AbstractC49792Sd r42 = (AbstractC49792Sd) this.A00;
                boolean z3 = this.A02;
                Location location = (Location) this.A01;
                if (r42.A0a == null || z3) {
                    r42.A0J(location, Math.max((int) location.getAccuracy(), 100), null, true);
                    return;
                }
                return;
            case 7:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                boolean z4 = this.A02;
                AnonymousClass0M3 r22 = (AnonymousClass0M3) this.A01;
                if (!(!z4 || (A0A = mediaViewFragment.A0A()) == null || A0A.isFinishing())) {
                    mediaViewFragment.A1A(r22, 0, true);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
