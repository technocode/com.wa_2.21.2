package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0sM  reason: invalid class name and case insensitive filesystem */
public class C17840sM extends BroadcastReceiver {
    public final /* synthetic */ AbstractC31311cz A00;

    public C17840sM(AbstractC31311cz r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            AbstractC31311cz r3 = this.A00;
            if (!(r3 instanceof C452924c)) {
                if (!(r3 instanceof C452824b)) {
                    String action = intent.getAction();
                    if (action != null) {
                        AbstractC17610rq.A00().A02(C452724a.A00, String.format("Received %s", action), new Throwable[0]);
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    r3.A04(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    r3.A04(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    r3.A04(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    r3.A04(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                } else if (intent.getAction() != null) {
                    AbstractC17610rq.A00().A02(C452824b.A00, String.format("Received %s", intent.getAction()), new Throwable[0]);
                    String action2 = intent.getAction();
                    int hashCode = action2.hashCode();
                    if (hashCode != -1980154005) {
                        if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                            r3.A04(Boolean.FALSE);
                        }
                    } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                        r3.A04(Boolean.TRUE);
                    }
                }
            } else if (intent.getAction() != null) {
                AbstractC17610rq.A00().A02(C452924c.A00, String.format("Received %s", intent.getAction()), new Throwable[0]);
                String action3 = intent.getAction();
                int hashCode2 = action3.hashCode();
                if (hashCode2 != -1181163412) {
                    if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        r3.A04(Boolean.TRUE);
                    }
                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    r3.A04(Boolean.FALSE);
                }
            }
        }
    }
}
