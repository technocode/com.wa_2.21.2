package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* renamed from: X.1en  reason: invalid class name and case insensitive filesystem */
public class C32341en extends AbstractC05990Rh {
    public final long A00;
    public final NetworkStats.Bucket A01 = new NetworkStats.Bucket();
    public final NetworkStatsManager A02;

    @Override // X.AbstractC05990Rh
    public boolean A00() {
        return true;
    }

    public C32341en(Context context) {
        this.A02 = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
        this.A00 = Long.MIN_VALUE;
    }

    @Override // X.AbstractC05990Rh
    public boolean A01(long[] jArr) {
        try {
            Arrays.fill(jArr, 0L);
            A02(jArr, 0, 2);
            A02(jArr, 1, 0);
            return true;
        } catch (RemoteException | IllegalArgumentException | NullPointerException e) {
            Log.e("NetworkStatsManagerBytesCollector", "Unable to get bytes transferred", e);
            return false;
        }
    }

    public final void A02(long[] jArr, int i, int i2) {
        NetworkStats querySummary = this.A02.querySummary(i, null, Long.MIN_VALUE, Long.MAX_VALUE);
        while (querySummary.hasNextBucket()) {
            NetworkStats.Bucket bucket = this.A01;
            querySummary.getNextBucket(bucket);
            int i3 = 4;
            if (bucket.getState() == 2) {
                i3 = 0;
            }
            int i4 = i2 | 0 | i3;
            jArr[i4] = bucket.getRxBytes() + jArr[i4];
            int i5 = i3 | i2 | 1;
            jArr[i5] = bucket.getTxBytes() + jArr[i5];
        }
        querySummary.close();
    }
}
