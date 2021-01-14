package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;

/* renamed from: X.32G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass32G implements View.OnTouchListener {
    public final /* synthetic */ StatusPlaybackActivity A00;

    public /* synthetic */ AnonymousClass32G(StatusPlaybackActivity statusPlaybackActivity) {
        this.A00 = statusPlaybackActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        StatusPlaybackFragment A0T;
        StatusPlaybackActivity statusPlaybackActivity = this.A00;
        int action = motionEvent.getAction() & 255;
        if ((action != 1 && action != 3) || motionEvent.getPointerCount() != 1 || (A0T = statusPlaybackActivity.A0T(statusPlaybackActivity.A07.getCurrentItem())) == null) {
            return false;
        }
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) A0T;
        if (((StatusPlaybackBaseFragment) statusPlaybackContactFragment).A03 || statusPlaybackContactFragment.A07) {
            return false;
        }
        A0T.A0o();
        return false;
    }
}
