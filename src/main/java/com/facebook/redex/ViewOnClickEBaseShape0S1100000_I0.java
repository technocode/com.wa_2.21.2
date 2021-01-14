package com.facebook.redex;

import X.ActivityC004602e;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.storage.StorageUsageActivity;

public class ViewOnClickEBaseShape0S1100000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickEBaseShape0S1100000_I0(Object obj, String str, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                ActivityC004602e r3 = (ActivityC004602e) this.A00;
                r3.A04.A05(r3, StorageUsageActivity.A04(r3, this.A01, 6));
                return;
            case 1:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                String str = this.A01;
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    StringBuilder sb = new StringBuilder("http://");
                    sb.append(str);
                    parse = Uri.parse(sb.toString());
                }
                try {
                    popupNotification.startActivity(new Intent("android.intent.action.VIEW", parse));
                    return;
                } catch (ActivityNotFoundException unused) {
                    popupNotification.A0g.A0C(popupNotification.A1B.A06(R.string.activity_not_found), 0);
                    return;
                }
            default:
                return;
        }
    }
}
