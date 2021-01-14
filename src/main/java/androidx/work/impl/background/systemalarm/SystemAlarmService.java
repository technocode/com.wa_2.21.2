package androidx.work.impl.background.systemalarm;

import X.AbstractC17610rq;
import X.AbstractC17780sG;
import X.C31261ct;
import X.ServiceC30241b0;
import android.content.Intent;

public class SystemAlarmService extends ServiceC30241b0 implements AbstractC17780sG {
    public static final String A02 = AbstractC17610rq.A01("SystemAlarmService");
    public C31261ct A00;
    public boolean A01;

    public final void A00() {
        C31261ct r1 = new C31261ct(this);
        this.A00 = r1;
        if (r1.A01 != null) {
            AbstractC17610rq.A00().A03(C31261ct.A0A, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            r1.A01 = this;
        }
    }

    @Override // X.ServiceC30241b0
    public void onCreate() {
        super.onCreate();
        A00();
        this.A01 = false;
    }

    @Override // X.ServiceC30241b0
    public void onDestroy() {
        super.onDestroy();
        this.A01 = true;
        this.A00.A00();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.A01) {
            AbstractC17610rq.A00().A04(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.A00.A00();
            A00();
            this.A01 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.A00.A03(intent, i2);
        return 3;
    }
}
