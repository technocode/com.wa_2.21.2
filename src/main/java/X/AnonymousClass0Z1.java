package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.0Z1  reason: invalid class name */
public class AnonymousClass0Z1 extends BroadcastReceiver {
    public final /* synthetic */ HomeActivity A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass0Z1(HomeActivity homeActivity, Runnable runnable) {
        this.A00 = homeActivity;
        this.A01 = runnable;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("home/resume/unlocked received ACTION_USER_PRESENT");
        try {
            HomeActivity homeActivity = this.A00;
            homeActivity.unregisterReceiver(this);
            AnonymousClass02M r0 = ((ActivityC004702f) homeActivity).A0F;
            Runnable runnable = this.A01;
            Handler handler = r0.A02;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 500);
            homeActivity.A06 = null;
        } catch (Exception e) {
            Log.e("home/resume/unlocked received ACTION_USER_PRESENT ", e);
        }
    }
}
