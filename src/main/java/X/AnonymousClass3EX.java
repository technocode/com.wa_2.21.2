package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.3EX  reason: invalid class name */
public class AnonymousClass3EX {
    public final /* synthetic */ ActivityC004702f A00;
    public final /* synthetic */ C61622tT A01;
    public final /* synthetic */ AnonymousClass3H0 A02;

    public AnonymousClass3EX(C61622tT r1, AnonymousClass3H0 r2, ActivityC004702f r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public void A00(C61072sS r7) {
        C61622tT r3 = this.A01;
        C018809u r2 = r3.A07;
        StringBuilder sb = new StringBuilder("performDobComplianceCheck onError: ");
        sb.append(r7);
        r2.A07(null, sb.toString(), null);
        C61632tU r0 = r3.A06;
        ActivityC004702f r4 = this.A00;
        if (r0.A02(r4, r7)) {
            this.A02.A00.A00("on_failure");
            return;
        }
        if (r7.code == 10755) {
            this.A02.A00.A00("on_failure");
            PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_is_underage_unavailability", false);
            paymentsUnavailableDialogFragment.A0N(bundle);
            r4.APm(paymentsUnavailableDialogFragment);
        }
        AnonymousClass3H0 r22 = this.A02;
        if (r22 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(r7.code));
            C28021Sn r23 = r22.A00;
            if (r23.A00) {
                AnonymousClass008.A0f(r23, "on_exception", hashMap, r23.A03);
                return;
            }
            return;
        }
        throw null;
    }
}
