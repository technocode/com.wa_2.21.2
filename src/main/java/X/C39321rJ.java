package X;

import android.app.ActivityManager;
import android.os.Debug;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1rJ  reason: invalid class name and case insensitive filesystem */
public class C39321rJ implements AbstractC02140Au {
    public final AnonymousClass0AV A00;
    public final AnonymousClass03P A01;
    public final C03270Fn A02;
    public final AnonymousClass00T A03;

    public C39321rJ(AnonymousClass00T r1, AnonymousClass03P r2, C03270Fn r3, AnonymousClass0AV r4) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    @Override // X.AbstractC02140Au
    public void AGf() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        StringBuilder A0S = AnonymousClass008.A0S("device/memory private_dirty=");
        A0S.append(memoryInfo.getTotalPrivateDirty());
        A0S.append("kB pss=");
        A0S.append(memoryInfo.getTotalPss());
        A0S.append("kB shared_dirty=");
        A0S.append(memoryInfo.getTotalSharedDirty());
        A0S.append("kB");
        Log.i(A0S.toString());
        ActivityManager A012 = this.A01.A01();
        if (A012 == null) {
            Log.w("device/info am=null");
        } else {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A012.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                try {
                    int[] iArr = new int[runningAppProcesses.size()];
                    for (int i = 0; i < runningAppProcesses.size(); i++) {
                        iArr[i] = runningAppProcesses.get(i).pid;
                    }
                    Debug.MemoryInfo[] processMemoryInfo = A012.getProcessMemoryInfo(iArr);
                    if (processMemoryInfo != null) {
                        int length = processMemoryInfo.length;
                        int i2 = 0;
                        for (Debug.MemoryInfo memoryInfo2 : processMemoryInfo) {
                            i2 += memoryInfo2.getTotalPss();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("device/memory processes=");
                        sb.append(length);
                        sb.append(" total=");
                        sb.append(i2);
                        Log.i(sb.toString());
                    }
                } catch (Exception e) {
                    Log.i("device/processes/error ", e);
                }
                AnonymousClass0AW r2 = this.A00.A00;
                StringBuilder sb2 = new StringBuilder("device/battery ");
                sb2.append(r2);
                Log.i(sb2.toString());
                this.A03.ANF(new RunnableEBaseShape0S0100000_I0_0(this.A02, 28));
            }
        }
        Log.w("device/processes/none");
        AnonymousClass0AW r22 = this.A00.A00;
        StringBuilder sb22 = new StringBuilder("device/battery ");
        sb22.append(r22);
        Log.i(sb22.toString());
        this.A03.ANF(new RunnableEBaseShape0S0100000_I0_0(this.A02, 28));
    }
}
