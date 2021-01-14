package X;

import android.os.RemoteException;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2he  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55842he implements AnonymousClass1B2 {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C55842he(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    @Override // X.AnonymousClass1B2
    public final void AGl(AnonymousClass1BR r3) {
        AbstractC49792Sd r1 = this.A00.A08;
        if (r3 != null) {
            try {
                r1.A0P(r3.A00.getId(), r3);
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            throw null;
        }
    }
}
