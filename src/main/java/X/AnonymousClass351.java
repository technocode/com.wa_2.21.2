package X;

import android.view.ViewTreeObserver;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.351  reason: invalid class name */
public class AnonymousClass351 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public AnonymousClass351(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    public void onGlobalLayout() {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        userNoticeBottomSheetDialogFragment.A08.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        if ((userNoticeBottomSheetDialogFragment.A02.getY() - ((float) userNoticeBottomSheetDialogFragment.A08.getHeight())) - ((float) userNoticeBottomSheetDialogFragment.A08.getScrollY()) < 0.0f) {
            z = true;
        }
        userNoticeBottomSheetDialogFragment.A11(!z, false);
    }
}
