package X;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1sY  reason: invalid class name and case insensitive filesystem */
public class C40051sY implements AnonymousClass176, AnonymousClass177 {
    public final /* synthetic */ AnonymousClass0C1 A00;

    @Override // X.AnonymousClass177
    public void AEY(C34661ix r1) {
    }

    @Override // X.AnonymousClass176
    public void AEZ(int i) {
    }

    public C40051sY(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass176
    public void AEX(Bundle bundle) {
        AnonymousClass0C1 r6 = this.A00;
        if (r6.A07.A04()) {
            Map map = r6.A02;
            if (map != null) {
                for (C40061sZ r4 : map.values()) {
                    LocationRequest A002 = AnonymousClass0C1.A00(r4);
                    try {
                        AnonymousClass178 r2 = r6.A01;
                        C001801b.A1R(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                        r2.A01(new AnonymousClass2BT(r2, A002, r4));
                    } catch (SecurityException e) {
                        Log.w("FusedLocationManager/GmsConnectionCallbacks/onConnected/unable to request location updates", e);
                    }
                }
                if (r6.A02.isEmpty()) {
                    AnonymousClass178 r0 = r6.A01;
                    if (r0 != null) {
                        r0.A03();
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }
}
