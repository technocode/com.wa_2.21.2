package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cm  reason: invalid class name and case insensitive filesystem */
public class C31231cm implements AnonymousClass0s4, AbstractC17710s5, AbstractC17820sK {
    public static final String A07 = AbstractC17610rq.A01("GreedyScheduler");
    public Boolean A00;
    public List A01 = new ArrayList();
    public boolean A02;
    public final Context A03;
    public final C31221cl A04;
    public final C31291cx A05;
    public final Object A06;

    public C31231cm(Context context, AnonymousClass0t5 r3, C31221cl r4) {
        this.A03 = context;
        this.A04 = r4;
        this.A05 = new C31291cx(context, r3, this);
        this.A06 = new Object();
    }

    public final String A00() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) this.A03.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    @Override // X.AbstractC17710s5
    public void A2X(String str) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(TextUtils.equals(this.A03.getPackageName(), A00()));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            AbstractC17610rq.A00().A04(A07, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.A02) {
            this.A04.A03.A01(this);
            this.A02 = true;
        }
        AbstractC17610rq.A00().A02(A07, String.format("Cancelling work ID %s", str), new Throwable[0]);
        this.A04.A05(str);
    }

    @Override // X.AbstractC17820sK
    public void ACg(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC17610rq.A00().A02(A07, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.A04.A06(str, null);
        }
    }

    @Override // X.AbstractC17820sK
    public void ACh(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC17610rq.A00().A02(A07, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.A04.A05(str);
        }
    }

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        synchronized (this.A06) {
            int size = this.A01.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C18030sf) this.A01.get(i)).A0D.equals(str)) {
                    AbstractC17610rq.A00().A02(A07, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.A01.remove(i);
                    this.A05.A01(this.A01);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    @Override // X.AbstractC17710s5
    public void ANQ(C18030sf... r14) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(TextUtils.equals(this.A03.getPackageName(), A00()));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            AbstractC17610rq.A00().A04(A07, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.A02) {
            this.A04.A03.A01(this);
            this.A02 = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C18030sf r5 : r14) {
            AnonymousClass0VU r0 = r5.A0C;
            AnonymousClass0VU r10 = AnonymousClass0VU.ENQUEUED;
            if (r0 == r10) {
                boolean z = false;
                if (r5.A04 != 0) {
                    z = true;
                }
                if (!z && r5.A03 == 0 && (r5.A0C != r10 || r5.A00 <= 0)) {
                    if (!C17530rh.A08.equals(r5.A09)) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23 && r5.A09.A02()) {
                            AbstractC17610rq.A00().A02(A07, String.format("Ignoring WorkSpec %s, Requires device idle.", r5), new Throwable[0]);
                        } else if (i < 24 || !r5.A09.A01()) {
                            arrayList.add(r5);
                            arrayList2.add(r5.A0D);
                        } else {
                            AbstractC17610rq.A00().A02(A07, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", r5), new Throwable[0]);
                        }
                    } else {
                        AbstractC17610rq.A00().A02(A07, String.format("Starting work for %s", r5.A0D), new Throwable[0]);
                        this.A04.A06(r5.A0D, null);
                    }
                }
            }
        }
        synchronized (this.A06) {
            if (!arrayList.isEmpty()) {
                AbstractC17610rq.A00().A02(A07, String.format("Starting tracking for [%s]", TextUtils.join(",", arrayList2)), new Throwable[0]);
                this.A01.addAll(arrayList);
                this.A05.A01(this.A01);
            }
        }
    }
}
