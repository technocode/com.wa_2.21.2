package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.2UC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UC implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ ExoPlaybackControlView A01;
    public final /* synthetic */ C72403Ss A02;

    public /* synthetic */ AnonymousClass2UC(MediaViewFragment mediaViewFragment, C72403Ss r2, ExoPlaybackControlView exoPlaybackControlView) {
        this.A00 = mediaViewFragment;
        this.A02 = r2;
        this.A01 = exoPlaybackControlView;
    }

    public final void onSystemUiVisibilityChange(int i) {
        this.A00.A1B(this.A02, this.A01, i);
    }
}
