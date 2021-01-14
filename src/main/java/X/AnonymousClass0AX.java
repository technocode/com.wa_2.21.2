package X;

import android.os.Build;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0AX  reason: invalid class name */
public class AnonymousClass0AX extends AbstractC003401r {
    public static volatile AnonymousClass0AX A01;
    public volatile boolean A00;

    public AnonymousClass0AX(AnonymousClass03P r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            PowerManager A0C = r3.A0C();
            if (A0C == null) {
                this.A00 = true;
            } else {
                this.A00 = A0C.isPowerSaveMode();
            }
        } else {
            this.A00 = false;
        }
    }

    public static AnonymousClass0AX A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0AX.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0AX(AnonymousClass03P.A00());
                }
            }
        }
        return A01;
    }

    public void A02(boolean z) {
        StringBuilder sb = new StringBuilder("PowerSaveModeStateProvider/notifyPowerSaveModeChanged: ");
        sb.append(z);
        Log.d(sb.toString());
        AnonymousClass00E.A01();
        this.A00 = z;
        Iterator it = super.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AnonymousClass0AZ) r1.next()).AId(z);
            } else {
                return;
            }
        }
    }
}
