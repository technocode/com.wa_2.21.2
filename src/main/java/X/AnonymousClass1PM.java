package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.1PM  reason: invalid class name */
public abstract class AnonymousClass1PM implements Transition.TransitionListener {
    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        if (this instanceof AnonymousClass3J8) {
            ((AnonymousClass3J8) this).A00.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
        } else if (this instanceof C54122eO) {
            MediaPreviewActivity mediaPreviewActivity = ((C54122eO) this).A00;
            ((LinearLayout) mediaPreviewActivity.A08).setGravity(80);
            if (mediaPreviewActivity.A05.getVisibility() != 8) {
                mediaPreviewActivity.A05.setVisibility(8);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(200);
                mediaPreviewActivity.A05.startAnimation(alphaAnimation);
            }
            MediaPreviewFragment A0V = mediaPreviewActivity.A0V();
            if (A0V != null) {
                A0V.A0n();
            }
        } else if (this instanceof AnonymousClass2X2) {
            ((AnonymousClass2X2) this).A00.A04 = false;
        }
    }

    public void onTransitionStart(Transition transition) {
        if (this instanceof AnonymousClass3JA) {
            ProfileInfoActivity profileInfoActivity = ((AnonymousClass3JA) this).A00;
            profileInfoActivity.A01.setScaleX(0.0f);
            profileInfoActivity.A01.setScaleY(0.0f);
            profileInfoActivity.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
        } else if (this instanceof AnonymousClass3J9) {
            ProfileInfoActivity profileInfoActivity2 = ((AnonymousClass3J9) this).A00;
            profileInfoActivity2.A01.setScaleX(1.0f);
            profileInfoActivity2.A01.setScaleY(1.0f);
            profileInfoActivity2.A01.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125);
        } else if (this instanceof C54122eO) {
            MediaPreviewFragment A0V = ((C54122eO) this).A00.A0V();
            if (A0V != null) {
                A0V.A0o();
            }
        } else if (this instanceof AnonymousClass2X2) {
            ((AnonymousClass2X2) this).A00.A04 = true;
        }
    }
}
