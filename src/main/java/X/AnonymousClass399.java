package X;

import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VideoCallParticipantView;

/* renamed from: X.399  reason: invalid class name */
public class AnonymousClass399 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MaximizedParticipantVideoDialogFragment A00;

    public AnonymousClass399(MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment) {
        this.A00 = maximizedParticipantVideoDialogFragment;
    }

    public boolean onPreDraw() {
        float f;
        float f2;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A00;
        maximizedParticipantVideoDialogFragment.A08.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        maximizedParticipantVideoDialogFragment.A08.getLocationOnScreen(iArr);
        maximizedParticipantVideoDialogFragment.A02 = maximizedParticipantVideoDialogFragment.A0D - iArr[0];
        maximizedParticipantVideoDialogFragment.A03 = maximizedParticipantVideoDialogFragment.A0E - iArr[1];
        if (maximizedParticipantVideoDialogFragment.A08.getWidth() != 0) {
            f = ((float) maximizedParticipantVideoDialogFragment.A0C) / ((float) maximizedParticipantVideoDialogFragment.A08.getWidth());
        } else {
            f = 1.0f;
        }
        maximizedParticipantVideoDialogFragment.A01 = f;
        if (maximizedParticipantVideoDialogFragment.A08.getHeight() != 0) {
            f2 = ((float) maximizedParticipantVideoDialogFragment.A0B) / ((float) maximizedParticipantVideoDialogFragment.A08.getHeight());
        } else {
            f2 = 1.0f;
        }
        maximizedParticipantVideoDialogFragment.A00 = f2;
        VideoCallParticipantView videoCallParticipantView = maximizedParticipantVideoDialogFragment.A08;
        if (videoCallParticipantView == null) {
            throw null;
        } else if (maximizedParticipantVideoDialogFragment.A06 == null) {
            throw null;
        } else if (maximizedParticipantVideoDialogFragment.A05 != null) {
            videoCallParticipantView.setPivotX(0.0f);
            maximizedParticipantVideoDialogFragment.A08.setPivotY(0.0f);
            maximizedParticipantVideoDialogFragment.A08.setScaleX(maximizedParticipantVideoDialogFragment.A01);
            maximizedParticipantVideoDialogFragment.A08.setScaleY(maximizedParticipantVideoDialogFragment.A00);
            maximizedParticipantVideoDialogFragment.A08.setTranslationX((float) maximizedParticipantVideoDialogFragment.A02);
            maximizedParticipantVideoDialogFragment.A08.setTranslationY((float) maximizedParticipantVideoDialogFragment.A03);
            maximizedParticipantVideoDialogFragment.A08.animate().setDuration(250).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(new DecelerateInterpolator(1.5f));
            AlphaAnimation A02 = AnonymousClass008.A02(0.0f, 1.0f, 250);
            maximizedParticipantVideoDialogFragment.A06.startAnimation(A02);
            if (maximizedParticipantVideoDialogFragment.A05.getVisibility() == 0) {
                maximizedParticipantVideoDialogFragment.A05.startAnimation(A02);
            }
            maximizedParticipantVideoDialogFragment.A0z(true);
            return true;
        } else {
            throw null;
        }
    }
}
