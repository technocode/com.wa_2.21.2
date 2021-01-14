package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0LL  reason: invalid class name */
public final class AnonymousClass0LL extends BroadcastReceiver {
    public final AnonymousClass0AV A00;
    public final AnonymousClass0AX A01;

    public AnonymousClass0LL(AnonymousClass0AV r1, AnonymousClass0AX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(AnonymousClass03P r3) {
        boolean isPowerSaveMode;
        PowerManager A0C = r3.A0C();
        if (A0C == null) {
            Log.w("battery-receiver/on-action-power-save-mode-changed pm=null");
            isPowerSaveMode = true;
        } else {
            isPowerSaveMode = A0C.isPowerSaveMode();
        }
        this.A01.A02(isPowerSaveMode);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1538406691) {
            if (hashCode == 1779291251 && action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                A00(AnonymousClass03P.A00());
                return;
            }
        } else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
            AnonymousClass0AW r3 = new AnonymousClass0AW(intent);
            AnonymousClass0AV r1 = this.A00;
            if (!r1.A00.equals(r3)) {
                AnonymousClass00E.A01();
                r1.A00 = r3;
                Iterator it = ((AbstractC003401r) r1).A00.iterator();
                while (true) {
                    AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                    if (r12.hasNext()) {
                        ((AbstractC02370Bs) r12.next()).ADV(r3);
                    } else {
                        StringBuilder sb = new StringBuilder("battery changed; newEvent=");
                        sb.append(r3);
                        Log.i(sb.toString());
                        return;
                    }
                }
            } else {
                return;
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("Unexpected action: ");
        A0S.append(intent.getAction());
        throw new IllegalArgumentException(A0S.toString());
    }
}
