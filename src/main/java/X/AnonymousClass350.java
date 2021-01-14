package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.350  reason: invalid class name */
public class AnonymousClass350 extends AnimatorListenerAdapter {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass350(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment, boolean z) {
        this.A00 = userNoticeBottomSheetDialogFragment;
        this.A01 = z;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A00.A03;
        int i = 8;
        if (this.A01) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public void onAnimationStart(Animator animator) {
        this.A00.A03.setVisibility(0);
    }
}
