package X;

import android.os.CountDownTimer;
import android.text.TextUtils;

/* renamed from: X.1y4  reason: invalid class name and case insensitive filesystem */
public class C43271y4 implements AnonymousClass1Gq {
    public static final C43271y4 A00 = new C43271y4();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        C46502As r4 = (C46502As) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -919344854) {
            if (hashCode != 1237602148 || !str.equals("millis_in_future")) {
                return false;
            }
            r4.A00 = C006803i.A04((String) C008805h.A0a(r6), 0);
            CountDownTimer countDownTimer = r4.A01;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                r4.A01 = null;
            }
        } else if (!str.equals("start_message")) {
            return false;
        } else {
            r4.A03 = (String) C008805h.A0a(r6);
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        C46502As r7 = (C46502As) obj;
        String str = (String) obj2;
        AbstractC011306t r9 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -919344854) {
            if (hashCode != 1237602148 || !str.equals("millis_in_future") || r7.A00 == C006803i.A04((String) C008805h.A0a(r9), 0)) {
                return false;
            }
            return true;
        } else if (str.equals("start_message")) {
            return !TextUtils.equals(r7.A03, (CharSequence) C008805h.A0a(r9));
        } else {
            return false;
        }
    }
}
