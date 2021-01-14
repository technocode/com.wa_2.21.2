package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2t0  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC61332t0 {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final C018709t A03;
    public final AnonymousClass0GP A04;
    public final C03340Fu A05;
    public final C01970Ad A06;
    public final C61762th A07;

    public AbstractC61332t0(Context context, AnonymousClass02M r2, C018709t r3, C01970Ad r4, AnonymousClass04j r5, C03340Fu r6, AnonymousClass0GP r7, C61762th r8) {
        this.A00 = context;
        this.A01 = r2;
        this.A03 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A07 = r8;
    }

    public void A00() {
        Log.i("PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync");
        C61762th r9 = this.A07;
        C68653Ea A022 = r9.A02("VISA", "STEP-UP", true);
        if (A022 == null) {
            new C61572tO(this.A00, this.A01, this.A02, this.A05, this.A04, r9, "STEP-UP").A00("VISA", new AnonymousClass3E4(this));
        } else {
            A01(A022, null);
        }
    }

    public void A01(C68653Ea r5, C61072sS r6) {
        if (!(this instanceof AnonymousClass3E6)) {
            AnonymousClass3E5 r3 = (AnonymousClass3E5) this;
            if (r6 != null) {
                r3.A03.A00(null, r6);
                return;
            }
            String A042 = r3.A02.A04(r3.A06, r5);
            if (TextUtils.isEmpty(A042)) {
                Log.e("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp/enc otp failure");
                r3.A03.A00(null, new C61072sS());
                return;
            }
            Log.i("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp");
            r3.A02(A042);
            return;
        }
        AnonymousClass3E6 r2 = (AnonymousClass3E6) this;
        if (r6 != null) {
            AnonymousClass008.A1T(AnonymousClass008.A0S("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure "), r6.text);
            r2.A03.A00(r6);
            return;
        }
        String A043 = r2.A02.A04(r2.A04, r5);
        if (TextUtils.isEmpty(A043)) {
            Log.e("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure");
            r2.A03.A00(new C61072sS());
            return;
        }
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction onProviderKeyFetched success");
        r2.A02(A043);
    }
}
