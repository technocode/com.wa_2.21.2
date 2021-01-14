package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0sN  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17850sN {
    public static final String A05 = AbstractC17610rq.A01("ConstraintTracker");
    public Object A00;
    public final Context A01;
    public final AnonymousClass0t5 A02;
    public final Object A03 = new Object();
    public final Set A04 = new LinkedHashSet();

    public AbstractC17850sN(Context context, AnonymousClass0t5 r3) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
    }

    public Object A00() {
        if (this instanceof AnonymousClass1d0) {
            return ((AnonymousClass1d0) this).A05();
        }
        if (!(this instanceof C452924c)) {
            Intent registerReceiver = this.A01.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (registerReceiver == null) {
                AbstractC17610rq.A00().A03(C452824b.A00, "getInitialState - null intent received", new Throwable[0]);
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("plugged", 0);
            int intExtra2 = registerReceiver.getIntExtra("status", -1);
            float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
            if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        Context context = this.A01;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent registerReceiver2 = context.registerReceiver(null, intentFilter);
        if (registerReceiver2 == null || registerReceiver2.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver2.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
            return Boolean.TRUE;
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        } else {
            return null;
        }
    }

    public void A01() {
        AbstractC31311cz r5 = (AbstractC31311cz) this;
        AbstractC17610rq.A00().A02(AbstractC31311cz.A01, String.format("%s: registering receiver", r5.getClass().getSimpleName()), new Throwable[0]);
        r5.A01.registerReceiver(r5.A00, r5.A05());
    }

    public void A02() {
        AbstractC31311cz r5 = (AbstractC31311cz) this;
        AbstractC17610rq.A00().A02(AbstractC31311cz.A01, String.format("%s: unregistering receiver", r5.getClass().getSimpleName()), new Throwable[0]);
        r5.A01.unregisterReceiver(r5.A00);
    }

    public void A03(AbstractC17800sI r4) {
        synchronized (this.A03) {
            Set set = this.A04;
            if (set.remove(r4) && set.isEmpty()) {
                A02();
            }
        }
    }

    public void A04(Object obj) {
        synchronized (this.A03) {
            Object obj2 = this.A00;
            if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                this.A00 = obj;
                ((C31581dS) this.A02).A02.execute(new RunnableEBaseShape5S0200000_I1_0(this, new ArrayList(this.A04), 17));
            }
        }
    }
}
