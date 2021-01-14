package X;

import android.view.ViewTreeObserver;
import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.3Pg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71513Pg implements AbstractC13360k7 {
    public final /* synthetic */ ViewOnClickEBaseShape0S0700000_I1 A00;

    public /* synthetic */ C71513Pg(ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1) {
        this.A00 = viewOnClickEBaseShape0S0700000_I1;
    }

    @Override // X.AbstractC13360k7
    public final void AFA(C13380k9 r6) {
        ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1 = this.A00;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) viewOnClickEBaseShape0S0700000_I1.A06;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                ((ViewTreeObserver) viewOnClickEBaseShape0S0700000_I1.A06).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) viewOnClickEBaseShape0S0700000_I1.A02);
            }
            viewOnClickEBaseShape0S0700000_I1.A06 = null;
        }
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) viewOnClickEBaseShape0S0700000_I1.A03;
        if (0 != 0) {
            statusPlaybackBaseFragment.A03 = true;
            statusPlaybackBaseFragment.A0o();
            return;
        }
        statusPlaybackBaseFragment.A03 = false;
        AnonymousClass02M r4 = statusPlaybackBaseFragment.A04;
        r4.A02.postDelayed(new RunnableEBaseShape12S0100000_I1_7(statusPlaybackBaseFragment, 41), 200);
    }
}
