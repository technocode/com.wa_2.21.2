package X;

import android.text.TextUtils;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import java.util.Map;

/* renamed from: X.3S0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3S0 {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public /* synthetic */ AnonymousClass3S0(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    public final void A00(String str, Map map) {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        userNoticeBottomSheetDialogFragment.A0G.A02(str, map, userNoticeBottomSheetDialogFragment.A01());
        AnonymousClass0HG r1 = userNoticeBottomSheetDialogFragment.A0H;
        if (!TextUtils.isEmpty(userNoticeBottomSheetDialogFragment.A09.A03)) {
            r1.A01(5);
        } else {
            r1.A01(8);
        }
    }
}
