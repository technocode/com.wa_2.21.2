package X;

import android.os.Handler;
import android.widget.FrameLayout;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

/* renamed from: X.36s  reason: invalid class name and case insensitive filesystem */
public class C669836s {
    public RunnableEBaseShape1S1100000_I1 A00;
    public final Handler A01 = new Handler();
    public final ExoPlaybackControlView A02;
    public final ExoPlayerErrorFrame A03;
    public final boolean A04;

    public C669836s(ExoPlayerErrorFrame exoPlayerErrorFrame, ExoPlaybackControlView exoPlaybackControlView, boolean z) {
        this.A03 = exoPlayerErrorFrame;
        this.A02 = exoPlaybackControlView;
        this.A04 = z;
    }

    public void A00() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A03;
        exoPlayerErrorFrame.setLoadingViewVisibility(8);
        RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = this.A00;
        if (runnableEBaseShape1S1100000_I1 != null) {
            this.A01.removeCallbacks(runnableEBaseShape1S1100000_I1);
        }
        if (exoPlayerErrorFrame.getErrorScreenVisibility() == 0) {
            ExoPlaybackControlView exoPlaybackControlView = this.A02;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayControlVisibility(0);
            }
            FrameLayout frameLayout = exoPlayerErrorFrame.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    public void A01() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A03;
        exoPlayerErrorFrame.setLoadingViewVisibility(0);
        FrameLayout frameLayout = exoPlayerErrorFrame.A02;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void A02(String str) {
        this.A03.setLoadingViewVisibility(0);
        if (this.A04) {
            RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = this.A00;
            if (runnableEBaseShape1S1100000_I1 != null) {
                this.A01.removeCallbacks(runnableEBaseShape1S1100000_I1);
            } else {
                this.A00 = new RunnableEBaseShape1S1100000_I1(this, str, 25);
            }
            this.A01.postDelayed(this.A00, 5000);
        }
    }
}
