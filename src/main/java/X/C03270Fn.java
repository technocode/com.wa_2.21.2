package X;

import android.app.ActivityManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.DeadObjectException;
import android.os.Debug;
import com.whatsapp.util.Log;

/* renamed from: X.0Fn  reason: invalid class name and case insensitive filesystem */
public class C03270Fn {
    public static volatile C03270Fn A01;
    public final AnonymousClass03P A00;

    public C03270Fn(AnonymousClass03P r1) {
        this.A00 = r1;
    }

    public static C03270Fn A00() {
        if (A01 == null) {
            synchronized (C03270Fn.class) {
                if (A01 == null) {
                    A01 = new C03270Fn(AnonymousClass03P.A00());
                }
            }
        }
        return A01;
    }

    public void A01() {
        NetworkInfo[] networkInfoArr;
        ConnectivityManager A0A = this.A00.A0A();
        if (A0A == null) {
            Log.w("app/log-network-info cm=null");
            return;
        }
        try {
            networkInfoArr = A0A.getAllNetworkInfo();
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                networkInfoArr = null;
            } else {
                throw e;
            }
        }
        StringBuilder sb = new StringBuilder("network/info");
        if (networkInfoArr != null) {
            boolean z = false;
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.getState() != NetworkInfo.State.UNKNOWN) {
                    sb.append("\n");
                    sb.append(networkInfo.toString());
                    sb.append(", type: ");
                    sb.append(networkInfo.getType());
                    sb.append(", subtype: ");
                    sb.append(networkInfo.getSubtype());
                    z = true;
                }
            }
            if (z) {
                Log.i(sb.toString());
            } else {
                Log.i("app/log-network-info/all_network_states_unknown");
            }
        } else {
            Log.e("app/log-network-info/unavailable");
        }
    }

    public void A02() {
        AnonymousClass00E.A00();
        ActivityManager A012 = this.A00.A01();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (A012 == null) {
            Log.w("device/memory am=null");
        } else {
            A012.getMemoryInfo(memoryInfo);
            StringBuilder sb = new StringBuilder("device/memory/system/available ");
            sb.append(memoryInfo.availMem / 1024);
            sb.append(" kiB (");
            sb.append(memoryInfo.threshold / 1024);
            sb.append(" kiB) lowMemory=");
            AnonymousClass008.A1a(sb, memoryInfo.lowMemory);
        }
        long freeMemory = Runtime.getRuntime().freeMemory();
        long j = Runtime.getRuntime().totalMemory();
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long maxMemory = Runtime.getRuntime().maxMemory();
        StringBuilder A0S = AnonymousClass008.A0S("device/memory/max ");
        A0S.append(maxMemory / 1024);
        A0S.append(" kiB (~");
        A0S.append(AnonymousClass0QO.A00);
        A0S.append(" memory class)");
        Log.i(A0S.toString());
        StringBuilder sb2 = new StringBuilder("device/memory/native/size ");
        sb2.append((nativeHeapFreeSize + nativeHeapAllocatedSize) / 1024);
        sb2.append(" kiB/allocated ");
        sb2.append(nativeHeapAllocatedSize / 1024);
        sb2.append(" kiB/free ");
        sb2.append(nativeHeapFreeSize / 1024);
        sb2.append(" kiB");
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder("device/memory/dalvik/size ");
        sb3.append(j / 1024);
        sb3.append(" kiB/allocated ");
        sb3.append((j - freeMemory) / 1024);
        sb3.append(" kiB/free ");
        sb3.append(freeMemory / 1024);
        sb3.append(" kiB");
        Log.i(sb3.toString());
    }
}
