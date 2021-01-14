package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;

/* renamed from: X.3Ph  reason: invalid class name and case insensitive filesystem */
public class C71523Ph implements AbstractC660032k {
    public final /* synthetic */ StatusPlaybackBaseFragment A00;

    @Override // X.AbstractC660032k
    public void AD5(boolean z) {
    }

    public C71523Ph(StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A00 = statusPlaybackBaseFragment;
    }

    @Override // X.AbstractC660032k
    public void AD8(int i, int i2, int i3) {
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A00;
        if (((StatusPlaybackFragment) statusPlaybackBaseFragment).A00 && i3 != 0) {
            int i4 = i2 + 1;
            if (i2 == 0) {
                i4 = 0;
            }
            AnonymousClass32Y A0t = statusPlaybackBaseFragment.A0t();
            A0t.A0B.setVolume((((float) i4) * 1.0f) / ((float) (i3 + 1)));
            A0t.A0B.setVisibility(0);
            A0t.A0B.removeCallbacks(statusPlaybackBaseFragment.A02);
            A0t.A0B.postDelayed(statusPlaybackBaseFragment.A02, 1500);
        }
    }
}
