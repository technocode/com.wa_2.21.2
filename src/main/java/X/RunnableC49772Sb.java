package X;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2Sb  reason: invalid class name and case insensitive filesystem */
public class RunnableC49772Sb extends RunnableEmptyBase implements Runnable {
    public double A00;
    public double A01;
    public final /* synthetic */ AbstractC49792Sd A02;

    public RunnableC49772Sb(AbstractC49792Sd r1, double d, double d2) {
        this.A02 = r1;
        this.A00 = d;
        this.A01 = d2;
    }

    public void run() {
        String str;
        AbstractC49792Sd r5 = this.A02;
        Context applicationContext = r5.A0X.getApplicationContext();
        AnonymousClass01X r2 = r5.A1A;
        Address address = null;
        try {
            List<Address> fromLocation = new Geocoder(applicationContext, r2.A0I()).getFromLocation(this.A00, this.A01, 1);
            if (fromLocation != null && !fromLocation.isEmpty()) {
                address = fromLocation.get(0);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(address.getAddressLine(i));
                }
                str = sb.toString();
                AnonymousClass02M r22 = r5.A0y;
                r22.A02.post(new RunnableEBaseShape1S1200000_I1(this, address, str, 22));
            }
        } catch (Exception unused) {
        }
        str = r2.A06(R.string.location_no_address);
        AnonymousClass02M r222 = r5.A0y;
        r222.A02.post(new RunnableEBaseShape1S1200000_I1(this, address, str, 22));
    }
}
