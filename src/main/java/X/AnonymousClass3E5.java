package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3E5  reason: invalid class name */
public class AnonymousClass3E5 extends AbstractC61332t0 {
    public final Context A00;
    public final AnonymousClass04j A01;
    public final C60862s7 A02;
    public final AnonymousClass3FL A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass3E5(Context context, AnonymousClass02M r12, C018709t r13, C01970Ad r14, AnonymousClass04j r15, C03340Fu r16, C60862s7 r17, AnonymousClass0GP r18, C61762th r19, String str, String str2, String str3, AnonymousClass3FL r23) {
        super(context, r12, r13, r14, r15, r16, r18, r19);
        this.A00 = context;
        this.A01 = r15;
        this.A02 = r17;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = r23;
    }

    public final void A02(String str) {
        Log.i("PAY: BrazilVerifyCardOTPSendAction sendOtp");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "br-verify-send-otp", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", this.A04, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("nonce", this.A05, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("otp", str, null, (byte) 0));
        super.A05.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C73463Xk(this, this.A00, super.A01, this.A01, super.A04), 0);
    }
}
