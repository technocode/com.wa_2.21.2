package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.34z  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC665934z implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A01;

    public ViewTreeObserver$OnGlobalLayoutListenerC665934z(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment, View view) {
        this.A01 = userNoticeBottomSheetDialogFragment;
        this.A00 = view;
    }

    public void onGlobalLayout() {
        this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A01;
        userNoticeBottomSheetDialogFragment.A07.setVisibility(4);
        userNoticeBottomSheetDialogFragment.A06.setVisibility(8);
        userNoticeBottomSheetDialogFragment.A0z();
    }
}
