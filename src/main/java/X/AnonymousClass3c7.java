package X;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.usernotice.UserNoticeModalIconView;

/* renamed from: X.3c7  reason: invalid class name */
public abstract class AnonymousClass3c7 extends WaImageView {
    public AnonymousClass3S3 A00;
    public final AnonymousClass00T A01 = C002101e.A00();

    public abstract int getTargetIconSize();

    public AnonymousClass3c7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A02() {
        if (!(this instanceof UserNoticeModalIconView)) {
            setColorFilter(getResources().getColor(R.color.user_notice_icon_tint));
            setImageResource(R.drawable.user_notice_banner_icon);
            return;
        }
        UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) this;
        userNoticeModalIconView.setBackground(C004302a.A03(userNoticeModalIconView.getContext(), R.drawable.user_notice_modal_default_icon_background));
        userNoticeModalIconView.A00.setImageResource(R.drawable.user_notice_banner_icon);
        userNoticeModalIconView.A00.setColorFilter(userNoticeModalIconView.getResources().getColor(R.color.user_notice_icon_tint));
        userNoticeModalIconView.A00.setVisibility(0);
    }

    public void A03(AnonymousClass356 r6) {
        setContentDescription(r6.A02);
        AnonymousClass3S3 r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        if (r6.A00(getContext()) == null) {
            A02();
            return;
        }
        AnonymousClass3S3 r4 = new AnonymousClass3S3(this);
        this.A00 = r4;
        this.A01.ANC(r4, r6.A00(getContext()));
    }
}
