package com.whatsapp.usernotice;

import X.AnonymousClass3c7;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

public class UserNoticeModalIconView extends AnonymousClass3c7 {
    public ImageView A00;

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AnonymousClass3c7
    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.user_notice_modal_server_icon_size);
    }

    public void setDefaultIconView(ImageView imageView) {
        this.A00 = imageView;
    }
}
