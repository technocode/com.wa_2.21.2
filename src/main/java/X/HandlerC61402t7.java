package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2t7  reason: invalid class name and case insensitive filesystem */
public class HandlerC61402t7 extends Handler {
    public final C74463ay A00;
    public final C60922sD A01;
    public final C68393Da A02;
    public final C63842x6 A03;
    public final String A04;
    public final /* synthetic */ C61412t8 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC61402t7(C61412t8 r1, C63842x6 r2, C60922sD r3, C68393Da r4, String str, C74463ay r6, Looper looper) {
        super(looper);
        this.A05 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = str;
        this.A00 = r6;
    }

    public void handleMessage(Message message) {
        int i;
        int i2;
        C68393Da r0 = this.A02;
        String str = this.A04;
        String A09 = r0.A09(str);
        if (!TextUtils.isEmpty(A09)) {
            C63842x6 r02 = this.A03;
            C68743Ej r6 = r02.A00;
            if (r6 == null) {
                r6 = r02.A01();
                r02.A00 = r6;
            }
            if (r6 != null) {
                r6.A02.A03("PaymentDeviceId: try to upgrade algorithm ...");
                int i3 = r6.A01.A01().getInt("payments_device_id_algorithm", 0);
                if (r6 instanceof AnonymousClass3YA) {
                    i = 2;
                } else if (!(r6 instanceof AnonymousClass3Y8)) {
                    throw null;
                } else {
                    i = 2;
                }
                if (i3 < i) {
                    r6.A02.A03("PaymentDeviceId: algorithm upgraded!");
                    C02010Ah r2 = r6.A01;
                    if (r6 instanceof AnonymousClass3YA) {
                        i2 = 2;
                    } else if (!(r6 instanceof AnonymousClass3Y8)) {
                        throw null;
                    } else {
                        i2 = 2;
                    }
                    r2.A01().edit().putInt("payments_device_id_algorithm", i2).apply();
                    AnonymousClass008.A0q(r6.A01, "payments_device_id", null);
                }
            }
            String A032 = this.A01.A03(this.A00);
            C61412t8 r12 = this.A05;
            if (r12 != null) {
                StringBuilder A0Z = AnonymousClass008.A0Z("PAY: sendDeviceBindingIq called with psp: ", str, " verificationData: ");
                A0Z.append(C28051Sr.A16(A09));
                Log.i(A0Z.toString());
                C61082sT r22 = r12.A0C;
                r22.A03("upi-bind-device");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AnonymousClass0OS("action", "upi-bind-device", null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("version", "2", null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("device-id", r12.A0F.A02(), null, (byte) 0));
                AnonymousClass008.A1F("verification-data", A09, arrayList);
                if (!TextUtils.isEmpty(str)) {
                    AnonymousClass008.A1F("provider-type", str, arrayList);
                }
                arrayList.add(new AnonymousClass0OS("sms-phone-number", A032, null, (byte) 0));
                int i4 = r12.A00;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    i5 = 0;
                }
                long j = 0;
                int i6 = 0;
                while (i6 <= i5) {
                    long[] jArr = C61412t8.A0G;
                    j += i6 < jArr.length ? jArr[i6] : ((long) i6) * 5;
                    i6++;
                }
                arrayList.add(new AnonymousClass0OS("delay", String.valueOf(j), null, (byte) 0));
                int i7 = r12.A00;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    i8 = 0;
                }
                arrayList.add(new AnonymousClass0OS("counter", String.valueOf(i8), null, (byte) 0));
                r12.A0D.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74573b9(r12, r12.A08.A00, r12.A06, r12.A07, r12.A0B, r22), 0);
                return;
            }
            throw null;
        }
    }
}
