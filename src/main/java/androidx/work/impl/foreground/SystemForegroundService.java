package androidx.work.impl.foreground;

import X.AbstractC17610rq;
import X.AbstractC17900sS;
import X.AnonymousClass0t5;
import X.C31221cl;
import X.C31321d1;
import X.C31501dK;
import X.C31581dS;
import X.ServiceC30241b0;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

public class SystemForegroundService extends ServiceC30241b0 implements AbstractC17900sS {
    public static SystemForegroundService A04;
    public static final String A05 = AbstractC17610rq.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public C31321d1 A02;
    public boolean A03;

    public final void A00() {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C31321d1 r1 = new C31321d1(getApplicationContext());
        this.A02 = r1;
        if (r1.A03 != null) {
            AbstractC17610rq.A00().A03(C31321d1.A0B, "A callback already exists.", new Throwable[0]);
        } else {
            r1.A03 = this;
        }
    }

    @Override // X.ServiceC30241b0
    public void onCreate() {
        super.onCreate();
        A04 = this;
        A00();
    }

    @Override // X.ServiceC30241b0
    public void onDestroy() {
        super.onDestroy();
        C31321d1 r1 = this.A02;
        r1.A03 = null;
        r1.A05.A00();
        r1.A02.A03.A02(r1);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A03) {
            AbstractC17610rq.A00().A04(A05, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            C31321d1 r1 = this.A02;
            r1.A03 = null;
            r1.A05.A00();
            r1.A02.A03.A02(r1);
            A00();
            this.A03 = false;
        }
        if (intent == null) {
            return 3;
        }
        C31321d1 r5 = this.A02;
        if (r5 != null) {
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                AbstractC17610rq.A00().A04(C31321d1.A0B, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                WorkDatabase workDatabase = r5.A02.A04;
                AnonymousClass0t5 r2 = r5.A06;
                ((C31581dS) r2).A01.execute(new RunnableEBaseShape1S1200000_I1(r5, workDatabase, stringExtra, 4));
                r5.A00(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                r5.A00(intent);
                return 3;
            } else if (!"ACTION_CANCEL_WORK".equals(action)) {
                return 3;
            } else {
                AbstractC17610rq.A00().A04(C31321d1.A0B, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                C31221cl r22 = r5.A02;
                UUID fromString = UUID.fromString(stringExtra2);
                if (r22 != null) {
                    ((C31581dS) r22.A06).A01.execute(new C31501dK(r22, fromString));
                    return 3;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }
}
