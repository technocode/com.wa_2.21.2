package X;

import com.whatsapp.companiondevice.LinkedDevicesActivity;
import java.util.Map;

/* renamed from: X.2XX  reason: invalid class name */
public class AnonymousClass2XX implements AbstractC03150Ez {
    public final /* synthetic */ LinkedDevicesActivity A00;

    public AnonymousClass2XX(LinkedDevicesActivity linkedDevicesActivity) {
        this.A00 = linkedDevicesActivity;
    }

    @Override // X.AbstractC03150Ez
    public void A1e(Object obj) {
        boolean booleanValue;
        Map map = (Map) obj;
        C51022Xa r8 = this.A00.A02;
        for (AnonymousClass2XO r6 : r8.A00) {
            boolean z = false;
            if (r6.A01 > 0) {
                z = true;
            }
            if (!z) {
                Boolean bool = (Boolean) map.get(r6.A05);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                r6.A00 = booleanValue;
            }
        }
        ((AbstractC16300pa) r8).A01.A00();
    }
}
