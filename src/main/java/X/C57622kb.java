package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2kb  reason: invalid class name and case insensitive filesystem */
public final class C57622kb extends AnonymousClass1PM {
    public final /* synthetic */ MediaViewBaseFragment A00;
    public final /* synthetic */ AnonymousClass2US A01;

    public C57622kb(MediaViewBaseFragment mediaViewBaseFragment, AnonymousClass2US r2) {
        this.A00 = mediaViewBaseFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass1PM
    public void onTransitionEnd(Transition transition) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        ActivityC004902h A0A = mediaViewBaseFragment.A0A();
        if (A0A != null && !mediaViewBaseFragment.A0g && !A0A.isFinishing()) {
            mediaViewBaseFragment.A03.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(600);
            mediaViewBaseFragment.A03.startAnimation(alphaAnimation);
            mediaViewBaseFragment.A10(true, true);
            PhotoView A0o = mediaViewBaseFragment.A0o(mediaViewBaseFragment.A0r(mediaViewBaseFragment.A09.getCurrentItem()));
            if (A0o != null) {
                A0o.A08(true);
            }
            this.A01.ALF(true);
        }
    }
}
