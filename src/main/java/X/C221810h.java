package X;

import android.os.Build;
import android.os.Debug;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;

/* renamed from: X.10h  reason: invalid class name and case insensitive filesystem */
public class C221810h {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;

    public static void A00(int i, long j, long j2) {
        if (j > j2) {
            Logger.writeStandardEntry(SystemCounterThread.PROVIDER_SYSTEM_COUNTERS, 6, 44, 0, 0, i, 0, j);
        }
    }

    public static void A01(int i, long j, long j2) {
        if (j != j2) {
            Logger.writeStandardEntry(SystemCounterThread.PROVIDER_SYSTEM_COUNTERS, 6, 44, 0, 0, i, 0, j);
        }
    }

    public void A02() {
        long globalAllocCount = (long) Debug.getGlobalAllocCount();
        A00(9240593, globalAllocCount, this.A00);
        this.A00 = globalAllocCount;
        long globalAllocSize = (long) Debug.getGlobalAllocSize();
        A00(9240594, globalAllocSize, this.A01);
        this.A01 = globalAllocSize;
        if (Build.VERSION.SDK_INT >= 23) {
            String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat != null) {
                long parseLong = Long.parseLong(runtimeStat);
                A00(9240595, parseLong, this.A04);
                this.A04 = parseLong;
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat2 != null) {
                long parseLong2 = Long.parseLong(runtimeStat2);
                A00(9240665, parseLong2, this.A05);
                this.A05 = parseLong2;
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat3 != null) {
                long parseLong3 = Long.parseLong(runtimeStat3);
                A00(9240664, parseLong3, this.A02);
                this.A02 = parseLong3;
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat4 != null) {
                long parseLong4 = Long.parseLong(runtimeStat4);
                A00(9240666, parseLong4, this.A03);
                this.A03 = parseLong4;
            }
        }
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long j = runtime.totalMemory();
        long freeMemory = j - runtime.freeMemory();
        long j2 = maxMemory - freeMemory;
        A01(9240636, freeMemory, this.A09);
        A01(9240634, j2, this.A06);
        A01(9240635, maxMemory, this.A07);
        A01(9240637, j, this.A08);
        this.A07 = maxMemory;
        this.A08 = j;
        this.A09 = freeMemory;
        this.A06 = j2;
    }
}
