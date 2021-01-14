package X;

import androidx.core.widget.NestedScrollView;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.3Rz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72213Rz implements AbstractC15110nW {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public /* synthetic */ C72213Rz(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    @Override // X.AbstractC15110nW
    public final void AJn(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        userNoticeBottomSheetDialogFragment.A11(false, false);
        userNoticeBottomSheetDialogFragment.A0z();
        Runnable runnable = userNoticeBottomSheetDialogFragment.A0B;
        if (runnable != null) {
            userNoticeBottomSheetDialogFragment.A0E.A02.removeCallbacks(runnable);
        }
        boolean z = false;
        if ((userNoticeBottomSheetDialogFragment.A02.getY() - ((float) userNoticeBottomSheetDialogFragment.A08.getHeight())) - ((float) userNoticeBottomSheetDialogFragment.A08.getScrollY()) < 0.0f) {
            z = true;
        }
        if (!z) {
            RunnableEBaseShape13S0100000_I1_8 runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(userNoticeBottomSheetDialogFragment, 20);
            userNoticeBottomSheetDialogFragment.A0B = runnableEBaseShape13S0100000_I1_8;
            userNoticeBottomSheetDialogFragment.A0E.A02.postDelayed(runnableEBaseShape13S0100000_I1_8, 600);
        }
    }
}
