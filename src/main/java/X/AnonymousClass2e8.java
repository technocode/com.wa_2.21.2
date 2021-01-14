package X;

import android.view.animation.AlphaAnimation;
import com.whatsapp.gallerypicker.VideoPreviewFragment;

/* renamed from: X.2e8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2e8 implements AnonymousClass37I {
    public final /* synthetic */ VideoPreviewFragment A00;

    public /* synthetic */ AnonymousClass2e8(VideoPreviewFragment videoPreviewFragment) {
        this.A00 = videoPreviewFragment;
    }

    @Override // X.AnonymousClass37I
    public final void AEU(AnonymousClass37M r5) {
        VideoPreviewFragment videoPreviewFragment = this.A00;
        videoPreviewFragment.A02 = videoPreviewFragment.A0I.A04;
        videoPreviewFragment.A0G.invalidate();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        videoPreviewFragment.A08.startAnimation(alphaAnimation);
        videoPreviewFragment.A08.setVisibility(0);
        if (videoPreviewFragment.A0N) {
            videoPreviewFragment.A0x();
        }
    }
}
