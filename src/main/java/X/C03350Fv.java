package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.0Fv  reason: invalid class name and case insensitive filesystem */
public class C03350Fv {
    public static volatile C03350Fv A02;
    public final AnonymousClass00G A00;
    public final AnonymousClass0GU A01;

    public C03350Fv(AnonymousClass00G r1, AnonymousClass0GU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C03350Fv A00() {
        if (A02 == null) {
            synchronized (C03350Fv.class) {
                if (A02 == null) {
                    A02 = new C03350Fv(AnonymousClass00G.A01, AnonymousClass0GU.A00());
                }
            }
        }
        return A02;
    }

    public void A01() {
        Log.i("Scheduling job to restore chat connection");
        EnumC17570rl r4 = EnumC17570rl.KEEP;
        C31001cM r3 = new C31001cM(RestoreChatConnectionWorker.class);
        C17520rg r2 = new C17520rg();
        r2.A03 = EnumC07010Vo.CONNECTED;
        r3.A00.A09 = new C17530rh(r2);
        ((AbstractC17680ry) this.A01.get()).A02("com.whatsapp.service.restoreChatConnection", r4, Collections.singletonList(r3.A00()));
    }
}
