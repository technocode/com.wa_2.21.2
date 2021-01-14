package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1d1  reason: invalid class name and case insensitive filesystem */
public class C31321d1 implements AnonymousClass0s4, AbstractC17820sK {
    public static final String A0B = AbstractC17610rq.A01("SystemFgDispatcher");
    public Context A00;
    public C17580rm A01;
    public C31221cl A02;
    public AbstractC17900sS A03;
    public String A04;
    public final C31291cx A05;
    public final AnonymousClass0t5 A06;
    public final Object A07 = new Object();
    public final Map A08;
    public final Map A09;
    public final Set A0A;

    @Override // X.AbstractC17820sK
    public void ACg(List list) {
    }

    public C31321d1(Context context) {
        this.A00 = context;
        C31221cl A002 = C31221cl.A00(context);
        this.A02 = A002;
        AnonymousClass0t5 r2 = A002.A06;
        this.A06 = r2;
        this.A04 = null;
        this.A01 = null;
        this.A08 = new LinkedHashMap();
        this.A0A = new HashSet();
        this.A09 = new HashMap();
        this.A05 = new C31291cx(this.A00, r2, this);
        this.A02.A03.A01(this);
    }

    public final void A00(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC17610rq.A00().A02(A0B, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (!(notification == null || this.A03 == null)) {
            C17580rm r0 = new C17580rm(intExtra, notification, intExtra2);
            Map map = this.A08;
            map.put(stringExtra, r0);
            if (TextUtils.isEmpty(this.A04)) {
                this.A04 = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A03;
                systemForegroundService.A01.post(new RunnableC17910sT(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A03;
            systemForegroundService2.A01.post(new RunnableEBaseShape1S0201000_I1(notification, intExtra, systemForegroundService2, 5));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry entry : map.entrySet()) {
                    i |= ((C17580rm) entry.getValue()).A00;
                }
                C17580rm r02 = (C17580rm) map.get(this.A04);
                if (r02 != null) {
                    AbstractC17900sS r4 = this.A03;
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) r4;
                    systemForegroundService3.A01.post(new RunnableC17910sT(systemForegroundService3, r02.A01, r02.A02, i));
                }
            }
        }
    }

    @Override // X.AbstractC17820sK
    public void ACh(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC17610rq.A00().A02(A0B, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                C31221cl r3 = this.A02;
                AnonymousClass0t5 r2 = r3.A06;
                ((C31581dS) r2).A01.execute(new RunnableEBaseShape0S1110000_I1(r3, str, true, 0));
            }
        }
    }

    @Override // X.AnonymousClass0s4
    public void AFn(String str, boolean z) {
        boolean z2;
        AbstractC17900sS r4;
        Map.Entry entry;
        synchronized (this.A07) {
            C18030sf r1 = (C18030sf) this.A09.remove(str);
            if (r1 != null) {
                z2 = this.A0A.remove(r1);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            this.A05.A01(this.A0A);
        }
        Map map = this.A08;
        C17580rm r12 = (C17580rm) map.remove(str);
        this.A01 = r12;
        if (str.equals(this.A04)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.A04 = (String) entry.getKey();
                if (this.A03 != null) {
                    C17580rm r0 = (C17580rm) entry.getValue();
                    AbstractC17900sS r5 = this.A03;
                    int i = r0.A01;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) r5;
                    systemForegroundService.A01.post(new RunnableC17910sT(systemForegroundService, i, r0.A02, r0.A00));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A03;
                    systemForegroundService2.A01.post(new RunnableEBaseShape1S0101000_I1(systemForegroundService2, i, 0));
                }
            }
        } else if (r12 != null && (r4 = this.A03) != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) r4;
            systemForegroundService3.A01.post(new RunnableEBaseShape1S0101000_I1(systemForegroundService3, r12.A01, 0));
        }
    }
}
