package X;

import android.app.ActivityManager;
import android.os.DeadObjectException;
import android.os.Process;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.36T  reason: invalid class name */
public class AnonymousClass36T extends Thread {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final ActivityManager A03;
    public final Object A04 = new Object();
    public volatile AnonymousClass3SK A05;
    public final /* synthetic */ AnonymousClass04n A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass36T(AnonymousClass04n r2, ActivityManager activityManager, AnonymousClass3SK r4, long j) {
        super("ProcessAnrErrorMonitorThread");
        this.A06 = r2;
        this.A03 = activityManager;
        this.A05 = r4;
        this.A02 = j;
        this.A00 = true;
    }

    public void run() {
        AnonymousClass04n r4;
        boolean z;
        int i = 0;
        do {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = this.A03.getProcessesInErrorState();
                LinkedList linkedList = new LinkedList();
                int myUid = Process.myUid();
                int myPid = Process.myPid();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                            AnonymousClass36S r1 = new AnonymousClass36S();
                            r1.A01 = processErrorStateInfo.shortMsg;
                            r1.A02 = processErrorStateInfo.tag;
                            int i2 = processErrorStateInfo.pid;
                            r1.A00 = i2;
                            if (i2 == myPid) {
                                linkedList.addFirst(r1);
                            } else {
                                linkedList.addLast(r1);
                            }
                        }
                    }
                }
                if (this.A00) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ProcessANRErrorMonitor/Starting process monitor checks for process ");
                    sb.append(Process.myPid());
                    Log.w(sb.toString());
                    this.A00 = false;
                    this.A06.A00(0, this.A05, null, null);
                }
                if (!linkedList.isEmpty()) {
                    AnonymousClass36S r42 = (AnonymousClass36S) linkedList.getFirst();
                    if (r42.A00 == Process.myPid()) {
                        StringBuilder A0S = AnonymousClass008.A0S("ProcessANRErrorMonitor/ANR detected Short msg: ");
                        A0S.append(r42.A01);
                        A0S.append(" Tag: ");
                        AnonymousClass008.A1V(A0S, r42.A02);
                        this.A06.A00(1, this.A05, r42.A01, r42.A02);
                        return;
                    }
                }
                i++;
                r4 = this.A06;
                if (i >= 120) {
                    r4.A00(2, this.A05, null, null);
                    Log.w("ProcessANRErrorMonitor/Stopping checks because of MAX_NUMBER_BEFORE_ERROR");
                    return;
                }
                Object obj = this.A04;
                synchronized (obj) {
                    z = this.A01;
                    if (!z) {
                        try {
                            obj.wait((long) 500);
                        } catch (InterruptedException unused) {
                        }
                        z = this.A01;
                    }
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
                if (e.getCause() instanceof DeadObjectException) {
                    this.A06.A00(4, this.A05, null, null);
                    return;
                }
                throw e;
            }
        } while (!z);
        r4.A00(3, this.A05, null, null);
    }
}
