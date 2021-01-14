package X;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.0cg  reason: invalid class name and case insensitive filesystem */
public class C09320cg implements AbstractC06100Rs {
    public final /* synthetic */ CallsFragment A00;

    public C09320cg(CallsFragment callsFragment) {
        this.A00 = callsFragment;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r7, MenuItem menuItem) {
        C11260fz r0;
        if (menuItem.getItemId() != R.id.menuitem_calls_delete) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        CallsFragment callsFragment = this.A00;
        Iterator it = callsFragment.A0c.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                LinkedHashMap linkedHashMap = callsFragment.A0B;
                if (!linkedHashMap.isEmpty() && linkedHashMap.containsKey(str) && (r0 = (C11260fz) callsFragment.A0B.get(str)) != null) {
                    arrayList.addAll(r0.A03);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            callsFragment.A0R.A0A(arrayList);
        }
        callsFragment.A0q();
        AbstractC06110Rt r02 = callsFragment.A01;
        if (r02 == null) {
            return true;
        }
        r02.A00();
        return true;
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r4, Menu menu) {
        menu.add(0, R.id.menuitem_calls_delete, 0, R.string.clear_single_log).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
        return true;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r3) {
        CallsFragment callsFragment = this.A00;
        callsFragment.A0q();
        callsFragment.A01 = null;
    }

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r8, Menu menu) {
        CallsFragment callsFragment = this.A00;
        if (!callsFragment.A0U()) {
            Log.i("calls/actionmode/fragment is not attached to activity.");
            return false;
        }
        HashSet hashSet = callsFragment.A0c;
        if (hashSet.isEmpty()) {
            r8.A00();
            return true;
        }
        r8.A04(String.format(callsFragment.A0Q.A0I(), "%d", Integer.valueOf(hashSet.size())));
        C02780Dk.A03(callsFragment.A0A().findViewById(R.id.action_mode_bar), callsFragment.A0A().getWindowManager());
        return true;
    }
}
