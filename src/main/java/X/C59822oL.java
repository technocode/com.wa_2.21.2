package X;

import android.view.animation.AlphaAnimation;
import com.whatsapp.gallerypicker.VideoPreviewFragment;

/* renamed from: X.2oL  reason: invalid class name and case insensitive filesystem */
public class C59822oL extends C54212eX {
    public final /* synthetic */ VideoPreviewFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59822oL(VideoPreviewFragment videoPreviewFragment) {
        super(videoPreviewFragment);
        this.A00 = videoPreviewFragment;
    }

    @Override // X.C54212eX
    public void A01() {
        super.A01();
        AlphaAnimation A02 = AnonymousClass008.A02(1.0f, 0.0f, 300);
        VideoPreviewFragment videoPreviewFragment = this.A00;
        videoPreviewFragment.A0A.setVisibility(4);
        videoPreviewFragment.A0A.startAnimation(A02);
    }

    @Override // X.C54212eX
    public void A02() {
        super.A02();
        VideoPreviewFragment videoPreviewFragment = this.A00;
        if (videoPreviewFragment.A0A.getVisibility() != 0) {
            AlphaAnimation A02 = AnonymousClass008.A02(0.0f, 1.0f, 300);
            videoPreviewFragment.A0A.setVisibility(0);
            videoPreviewFragment.A0A.startAnimation(A02);
        }
    }
}
