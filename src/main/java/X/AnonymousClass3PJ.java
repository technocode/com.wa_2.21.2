package X;

import android.content.Intent;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.3PJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3PJ implements AbstractC13370k8 {
    public final /* synthetic */ AbstractC007503q A00;
    public final /* synthetic */ ViewOnClickCListenerShape14S0100000_I1_3 A01;

    public /* synthetic */ AnonymousClass3PJ(ViewOnClickCListenerShape14S0100000_I1_3 viewOnClickCListenerShape14S0100000_I1_3, AbstractC007503q r2) {
        this.A01 = viewOnClickCListenerShape14S0100000_I1_3;
        this.A00 = r2;
    }

    @Override // X.AbstractC13370k8
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean z;
        long j;
        int i;
        ViewOnClickCListenerShape14S0100000_I1_3 viewOnClickCListenerShape14S0100000_I1_3 = this.A01;
        AbstractC007503q r4 = this.A00;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_forward) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) viewOnClickCListenerShape14S0100000_I1_3.A00;
            AbstractC06110Rt r0 = myStatusesActivity.A01;
            if (r0 != null) {
                r0.A00();
            }
            myStatusesActivity.A03 = r4;
            Intent intent = new Intent(myStatusesActivity, ContactPicker.class);
            intent.putExtra("forward", true);
            intent.putExtra("forward_jid", AnonymousClass1VY.A0D(r4.A0n.A00));
            byte b = r4.A0m;
            intent.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
            if (b == 3) {
                j = ((long) ((AnonymousClass0M3) r4).A00) * 1000;
            } else {
                j = 0;
            }
            intent.putExtra("forward_video_duration", j);
            if (b == 0) {
                String A0D = r4.A0D();
                if (A0D != null) {
                    i = A0D.length();
                } else {
                    throw null;
                }
            } else {
                i = 0;
            }
            intent.putExtra("forward_text_length", i);
            myStatusesActivity.startActivityForResult(intent, 2);
            return true;
        } else if (itemId == R.id.menuitem_delete) {
            MyStatusesActivity myStatusesActivity2 = (MyStatusesActivity) viewOnClickCListenerShape14S0100000_I1_3.A00;
            Map map = myStatusesActivity2.A0s;
            map.clear();
            map.put(r4.A0n, r4);
            C002001d.A2O(myStatusesActivity2, 13);
            map.clear();
            return true;
        } else {
            if (itemId == R.id.menuitem_share_status_facebook) {
                z = true;
            } else if (itemId != R.id.menuitem_share_status_third_party) {
                return true;
            } else {
                z = false;
            }
            MyStatusesActivity myStatusesActivity3 = (MyStatusesActivity) viewOnClickCListenerShape14S0100000_I1_3.A00;
            Map map2 = myStatusesActivity3.A0s;
            map2.clear();
            map2.put(r4.A0n, r4);
            myStatusesActivity3.A0Z(Collections.singletonList(r4), z);
            return true;
        }
    }
}
