package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.0cd  reason: invalid class name and case insensitive filesystem */
public class C09290cd implements AbstractC09300ce {
    public final /* synthetic */ CallsFragment A00;

    public C09290cd(CallsFragment callsFragment) {
        this.A00 = callsFragment;
    }

    @Override // X.AbstractC09300ce
    public void ADe() {
        Log.i("voip/CallsFragment/onCallLogDeleted");
        this.A00.A0r();
    }

    @Override // X.AbstractC09300ce
    public void ADf(AnonymousClass0QM r2) {
        Log.i("CallsFragment/onCallLogUpdated");
        this.A00.A0r();
    }
}
