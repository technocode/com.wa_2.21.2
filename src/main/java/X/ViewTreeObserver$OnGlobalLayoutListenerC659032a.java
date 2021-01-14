package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.32a  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC659032a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewOnClickEBaseShape0S0700000_I1 A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC659032a(ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1) {
        this.A00 = viewOnClickEBaseShape0S0700000_I1;
    }

    public void onGlobalLayout() {
        ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1 = this.A00;
        View view = (View) viewOnClickEBaseShape0S0700000_I1.A04;
        int[] iArr = (int[]) viewOnClickEBaseShape0S0700000_I1.A00;
        view.getLocationOnScreen(iArr);
        int[] iArr2 = (int[]) viewOnClickEBaseShape0S0700000_I1.A01;
        int i = iArr2[0];
        int i2 = iArr[0];
        if (i != i2 || iArr2[1] != iArr[1]) {
            iArr2[0] = i2;
            iArr2[1] = iArr[1];
            C13380k9 r1 = (C13380k9) viewOnClickEBaseShape0S0700000_I1.A05;
            r1.A03.A01();
            r1.A00();
            if (viewOnClickEBaseShape0S0700000_I1.A06 == null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewOnClickEBaseShape0S0700000_I1.A06 = viewTreeObserver;
                    viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) viewOnClickEBaseShape0S0700000_I1.A02);
                } else {
                    throw null;
                }
            }
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) viewOnClickEBaseShape0S0700000_I1.A03;
            if (1 != 0) {
                statusPlaybackBaseFragment.A03 = true;
                statusPlaybackBaseFragment.A0o();
                return;
            }
            statusPlaybackBaseFragment.A03 = false;
            AnonymousClass02M r4 = statusPlaybackBaseFragment.A04;
            r4.A02.postDelayed(new RunnableEBaseShape12S0100000_I1_7(statusPlaybackBaseFragment, 41), 200);
        }
    }
}
