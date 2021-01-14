package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1ct  reason: invalid class name and case insensitive filesystem */
public class C31261ct implements AnonymousClass0s4 {
    public static final String A0A = AbstractC17610rq.A01("SystemAlarmDispatcher");
    public Intent A00;
    public AbstractC17780sG A01;
    public final Context A02;
    public final Handler A03;
    public final C31091cX A04;
    public final C31221cl A05;
    public final C31241cn A06;
    public final C18200sx A07 = new C18200sx();
    public final AnonymousClass0t5 A08;
    public final List A09;

    public C31261ct(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A06 = new C31241cn(applicationContext);
        C31221cl A002 = C31221cl.A00(context);
        this.A05 = A002;
        C31091cX r1 = A002.A03;
        this.A04 = r1;
        this.A08 = A002.A06;
        r1.A01(this);
        this.A09 = new ArrayList();
        this.A00 = null;
        this.A03 = new Handler(Looper.getMainLooper());
    }

    public void A00() {
        AbstractC17610rq.A00().A02(A0A, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.A04.A02(this);
        ScheduledExecutorService scheduledExecutorService = this.A07.A03;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.A01 = null;
    }

    public final void A01() {
        if (this.A03.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void A02() {
        A01();
        PowerManager.WakeLock A002 = C18160st.A00(this.A02, "ProcessCommand");
        try {
            A002.acquire();
            AnonymousClass0t5 r2 = this.A05.A06;
            ((C31581dS) r2).A01.execute(new RunnableEBaseShape5S0100000_I1_0(this, 20));
        } finally {
            A002.release();
        }
    }

    public void A03(Intent intent, int i) {
        AbstractC17610rq A002 = AbstractC17610rq.A00();
        String str = A0A;
        boolean z = false;
        A002.A02(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        A01();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC17610rq.A00().A05(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            A01();
            List<Intent> list = this.A09;
            synchronized (list) {
                for (Intent intent2 : list) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(intent2.getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.A09;
        synchronized (list2) {
            if (!list2.isEmpty()) {
                z = true;
            }
            list2.add(intent);
            if (!z) {
                A02();
            }
        }
    }

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        Intent intent = new Intent(this.A02, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.A03.post(new RunnableEBaseShape1S0201000_I1(intent, 0, this, 4));
    }
}
