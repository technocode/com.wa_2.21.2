package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.16r  reason: invalid class name */
public class AnonymousClass16r implements ServiceConnection {
    public boolean A00 = false;
    public final BlockingQueue A01 = new LinkedBlockingQueue();

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A01.add(iBinder);
    }
}
