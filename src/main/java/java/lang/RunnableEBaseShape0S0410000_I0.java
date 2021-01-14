package java.lang;

import X.AbstractC007503q;
import X.AnonymousClass0CH;
import X.AnonymousClass0EO;
import X.AnonymousClass0K0;
import X.AnonymousClass0M3;
import X.AnonymousClass0OE;
import X.AnonymousClass1WA;
import X.AnonymousClass1XX;
import X.C001801b;
import X.C49982Sy;
import android.os.ConditionVariable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;

public class RunnableEBaseShape0S0410000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public RunnableEBaseShape0S0410000_I0(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = z;
        this.A03 = obj4;
    }

    public final void run() {
        switch (this.A05) {
            case 0:
                AnonymousClass0EO r6 = (AnonymousClass0EO) this.A00;
                boolean z = this.A04;
                AnonymousClass1XX r4 = (AnonymousClass1XX) this.A03;
                r6.A0I.A0S(new AnonymousClass0OE(((Jid) this.A01).getRawString(), C001801b.A0A((DeviceJid) this.A02)));
                if (z) {
                    r6.A0d.A0M(r4);
                    return;
                }
                return;
            case 1:
                AnonymousClass0CH r7 = (AnonymousClass0CH) this.A00;
                C49982Sy r62 = (C49982Sy) this.A01;
                AnonymousClass0M3 r5 = (AnonymousClass0M3) this.A02;
                AnonymousClass1WA r42 = (AnonymousClass1WA) this.A03;
                boolean z2 = this.A04;
                AnonymousClass0CH.A01(false, r62, r5, r42);
                r7.A0Q.A01(r5.A02, r42.A0C);
                if (r62.A01() != null) {
                    r7.A0A(z2, r5, r62.A01().A01);
                    return;
                }
                throw null;
            case 2:
                AnonymousClass0K0 r3 = (AnonymousClass0K0) this.A00;
                AbstractMap abstractMap = (AbstractMap) this.A01;
                boolean z3 = this.A04;
                ConditionVariable conditionVariable = (ConditionVariable) this.A02;
                ConditionVariable conditionVariable2 = (ConditionVariable) this.A03;
                ArrayList arrayList = new ArrayList();
                try {
                    for (AbstractC007503q r0 : abstractMap.values()) {
                        if (r0 != null) {
                            arrayList.add(r0);
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("app/xmpp/send/qr_send_conv preempt:");
                    sb.append(z3);
                    sb.append(" recents error ");
                    sb.append(e.toString());
                    Log.e(sb.toString());
                }
                r3.A01(0, arrayList, true, z3, conditionVariable, conditionVariable2, null);
                return;
            default:
                return;
        }
    }
}
