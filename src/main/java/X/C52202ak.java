package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import java.util.List;

/* renamed from: X.2ak  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52202ak implements AbstractC09120cK {
    public final /* synthetic */ ConversationsFragment A00;

    public /* synthetic */ C52202ak(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    @Override // X.AbstractC09120cK
    public final void AII(List list, List list2, List list3) {
        Intent intent;
        ConversationsFragment conversationsFragment = this.A00;
        ActivityC004902h A0A = conversationsFragment.A0A();
        if (A0A != null && !A0A.isFinishing()) {
            C000300f r5 = conversationsFragment.A0g;
            C015808q r1 = conversationsFragment.A1a;
            boolean z = false;
            if (C28051Sr.A1r(r5, r1) || conversationsFragment.A12.A05()) {
                ActivityC004902h A0A2 = conversationsFragment.A0A();
                if (list.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
                    z = true;
                }
                if (C28051Sr.A1r(r5, r1)) {
                    intent = new Intent(A0A2, LinkedDevicesActivity.class);
                } else {
                    intent = z ? new Intent(A0A2, DevicePairQrScannerActivity.class) : new Intent(A0A2, PairedDevicesActivity.class);
                }
                conversationsFragment.A0h(intent);
                return;
            }
            boolean A02 = AnonymousClass04j.A02(conversationsFragment.A0A());
            int i = R.string.network_required;
            if (A02) {
                i = R.string.network_required_airplane_on;
            }
            conversationsFragment.A0d.A06(i, 0);
        }
    }
}
