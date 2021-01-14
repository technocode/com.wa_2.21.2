package X;

import com.whatsapp.util.Log;
import java.util.TimerTask;

/* renamed from: X.1QZ  reason: invalid class name */
public class AnonymousClass1QZ extends TimerTask {
    public final /* synthetic */ C11040fc A00;

    public AnonymousClass1QZ(C11040fc r1) {
        this.A00 = r1;
    }

    public void run() {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-activity/one-time-setup/not-finished-in-");
        C11040fc r4 = this.A00;
        A0S.append(r4.A08.A00() / 1000);
        A0S.append("-seconds");
        Log.i(A0S.toString());
        AnonymousClass02M r2 = r4.A00;
        r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(this, 6));
    }
}
