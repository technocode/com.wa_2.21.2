package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* renamed from: X.1Ve  reason: invalid class name and case insensitive filesystem */
public class ServiceConnectionC28641Ve implements ServiceConnection {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final /* synthetic */ C28651Vf A03;

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public ServiceConnectionC28641Ve(C28651Vf r1, String str, String str2, boolean z) {
        this.A03 = r1;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C28651Vf r2 = this.A03;
        try {
            if (r2.A03.A02(componentName.getPackageName()).A03 && this.A01.equals(componentName.getPackageName())) {
                r2.A05.execute(new RunnableEBaseShape8S0200000_I1_3(this, iBinder, 17));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("CallbackServiceProxy/service component mismatch.");
        r2.A00.A00.unbindService(this);
    }
}
