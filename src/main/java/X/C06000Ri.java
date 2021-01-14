package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;

/* renamed from: X.0Ri  reason: invalid class name and case insensitive filesystem */
public class C06000Ri extends AbstractC05990Rh {
    public static final int A05 = Process.myUid();
    public int A00;
    public BroadcastReceiver A01 = new C06060Ro(this);
    public boolean A02 = true;
    public final ConnectivityManager A03;
    public final long[] A04 = new long[8];

    public C06000Ri(Context context) {
        int type;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A03 = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        this.A00 = type;
        context.registerReceiver(this.A01, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        A02();
    }

    public synchronized void A02() {
        int i = A05;
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        if (uidRxBytes == -1 || uidTxBytes == -1) {
            this.A02 = false;
            return;
        }
        char c = 2;
        if (this.A00 == 1) {
            c = 0;
        }
        long[] jArr = this.A04;
        long j = jArr[3] + jArr[1];
        long j2 = jArr[2] + jArr[0];
        int i2 = c | 1;
        jArr[i2] = (uidTxBytes - j) + jArr[i2];
        int i3 = c | 0;
        jArr[i3] = (uidRxBytes - j2) + jArr[i3];
    }
}
