package X;

import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
public final class C07410Xn implements AnonymousClass0C0 {
    public static volatile C07410Xn A01;
    public final AnonymousClass0HM A00;

    public C07410Xn(AnonymousClass0HM r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{198, 199, 200, 201};
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        switch (i) {
            case 198:
                AnonymousClass0HM r0 = this.A00;
                String str = (String) message.obj;
                for (AnonymousClass30O r02 : r0.A0n) {
                    r02.AI4(str);
                }
                return true;
            case 199:
                AnonymousClass0HM r03 = this.A00;
                int i2 = message.arg2;
                for (AnonymousClass30O r04 : r03.A0n) {
                    r04.AI3(i2);
                }
                return true;
            case 200:
                this.A00.A07();
                return true;
            case 201:
                AnonymousClass0HM r4 = this.A00;
                int i3 = message.arg2;
                AnonymousClass01I r5 = r4.A08;
                if (r5.A01() == null) {
                    Log.w("registrationmanager/response/error but already changed");
                    return true;
                } else if (i3 == 400) {
                    Log.w("registrationmanager/check-number/match");
                    r4.A02.post(new RunnableEBaseShape4S0100000_I0_4(r4, 5));
                    r5.A03();
                    r4.A05.A01();
                    return true;
                } else if (i3 == 401) {
                    r4.A02.post(new RunnableEBaseShape4S0100000_I0_4(r4, 4));
                    r4.A0N.A0d(true);
                    r4.A09.A03();
                    r5.A03();
                    r4.A05.A01();
                    return true;
                } else if (i3 != 405) {
                    if (i3 != 409 && i3 < 500) {
                        r4.A0N.A0d(true);
                        r4.A09.A03();
                        r5.A03();
                        r4.A05.A01();
                    }
                    return true;
                } else {
                    r4.A07();
                    return true;
                }
            default:
                return false;
        }
    }
}
