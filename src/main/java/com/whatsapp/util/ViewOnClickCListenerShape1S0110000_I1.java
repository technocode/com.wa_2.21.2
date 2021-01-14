package com.whatsapp.util;

import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass00D;
import X.AnonymousClass0SQ;
import X.AnonymousClass0TX;
import X.C006803i;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.voipcalling.PermissionDialogFragment;

public class ViewOnClickCListenerShape1S0110000_I1 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickCListenerShape1S0110000_I1(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        switch (this.A02) {
            case 0:
                if (this.A01) {
                    ((ActivityC004702f) this.A00).A0F.A06(R.string.chats_in_read_later_stay_muted, 0);
                    return;
                }
                ChatInfoActivity chatInfoActivity = (ChatInfoActivity) this.A00;
                chatInfoActivity.APl(MuteDialogFragment.A00(chatInfoActivity.A0V()), null);
                return;
            case 1:
                if (this.A01) {
                    PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A00;
                    permissionDialogFragment.A05 = true;
                    C006803i.A0R(permissionDialogFragment.A0B(), "com.whatsapp");
                    return;
                }
                PermissionDialogFragment permissionDialogFragment2 = (PermissionDialogFragment) this.A00;
                permissionDialogFragment2.A01.dismiss();
                AnonymousClass00D r0 = permissionDialogFragment2.A0D;
                String[] strArr = permissionDialogFragment2.A08;
                RequestPermissionActivity.A0G(r0, strArr);
                AnonymousClass0SQ r02 = permissionDialogFragment2.A0F;
                if (r02 != null) {
                    ActivityC004902h r4 = r02.A04;
                    ActivityC004902h.A01(100);
                    try {
                        r4.A03 = true;
                        AnonymousClass0TX.A0H(r4, strArr, ((r4.A03(permissionDialogFragment2) + 1) << 16) + 100);
                        r4.A03 = false;
                        return;
                    } catch (Throwable th) {
                        r4.A03 = false;
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(permissionDialogFragment2);
                    sb.append(" not attached to Activity");
                    throw new IllegalStateException(sb.toString());
                }
            default:
                super.A00(view);
                return;
        }
    }
}
