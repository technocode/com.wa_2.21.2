package com.whatsapp.usernotice;

import X.AnonymousClass3c7;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

public class UserNoticeBannerIconView extends AnonymousClass3c7 {
    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AnonymousClass3c7
    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.user_notice_banner_icon_size);
    }
}
