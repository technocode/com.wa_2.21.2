package X;

import android.provider.Settings;
import com.whatsapp.util.Log;

/* renamed from: X.3YA  reason: invalid class name */
public class AnonymousClass3YA extends C68743Ej {
    public AnonymousClass3YA(AnonymousClass00G r1, C02010Ah r2) {
        super(r1, r2);
    }

    @Override // X.C68743Ej
    public String A01() {
        if (this.A01.A01().getInt("payments_device_id_algorithm", 0) >= 2) {
            return super.A01();
        }
        Log.d("PAY: PaymentDeviceId: getid_v1()");
        return Settings.Secure.getString(this.A00.A00.getContentResolver(), "android_id");
    }
}
