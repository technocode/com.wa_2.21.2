package X;

import android.animation.ValueAnimator;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.34x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C665734x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public /* synthetic */ C665734x(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A03.setAlpha(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
