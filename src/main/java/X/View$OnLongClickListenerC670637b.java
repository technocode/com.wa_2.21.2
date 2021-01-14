package X;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.37b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC670637b implements View.OnLongClickListener {
    public final /* synthetic */ C11260fz A00;
    public final /* synthetic */ AnonymousClass3TO A01;

    public /* synthetic */ View$OnLongClickListenerC670637b(AnonymousClass3TO r1, C11260fz r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass3TO r3 = this.A01;
        C11260fz r2 = this.A00;
        CallsFragment callsFragment = r3.A0M;
        if (!callsFragment.A0C) {
            Log.i("callsfragment/fillcallgroupview/longclicklistener Ignoring long click");
            return true;
        }
        callsFragment.A0v(r2, r3);
        return true;
    }
}
