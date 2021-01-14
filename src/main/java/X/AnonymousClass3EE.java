package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.3EE  reason: invalid class name */
public class AnonymousClass3EE extends C61432tA {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final C68393Da A04;
    public final AnonymousClass0GP A05;
    public final C01970Ad A06;
    public final C68683Ed A07;
    public final C63842x6 A08;

    public AnonymousClass3EE(Context context, AnonymousClass02M r3, AnonymousClass01I r4, C63842x6 r5, C01970Ad r6, AnonymousClass04j r7, C60922sD r8, C03340Fu r9, C68683Ed r10, AnonymousClass0GP r11, C68393Da r12) {
        super(r9, r8.A04);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r5;
        this.A06 = r6;
        this.A03 = r7;
        this.A07 = r10;
        this.A05 = r11;
        this.A04 = r12;
    }

    public void A00(C74463ay r15, AbstractC61442tB r16) {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: IndiaUpiOtpAction requestOtp withCallback: ");
        boolean z = false;
        if (r16 != null) {
            z = true;
        }
        AnonymousClass008.A1a(A0S, z);
        C68683Ed r10 = this.A07;
        r10.AQ7();
        String str = r15.A0D;
        String str2 = r15.A0E;
        if (TextUtils.isEmpty(str)) {
            AnonymousClass3EB r3 = new AnonymousClass3EB(this.A00, this.A01, this.A02, this.A06, this.A03, super.A01, r10, this.A05, this.A04, null);
            AnonymousClass3ED r2 = new AnonymousClass3ED(this, r15, r16);
            AnonymousClass01I r0 = r3.A02;
            r0.A04();
            r3.A00(r0.A03, new AnonymousClass3EA(r3, r2));
            return;
        }
        A01(str, str2, r15, r16);
    }

    public final void A01(String str, String str2, C74463ay r22, AbstractC61442tB r23) {
        C61082sT r11 = super.A00;
        r11.A03("upi-generate-otp");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass0OS("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new AnonymousClass0OS("action", "upi-generate-otp", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass0OS("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new AnonymousClass0OS("device-id", this.A08.A02(), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("upi-bank-info", r22.A0A, null, (byte) 0));
        String A042 = this.A04.A04();
        if (!TextUtils.isEmpty(A042)) {
            arrayList.add(new AnonymousClass0OS("provider-type", A042, null, (byte) 0));
        }
        super.A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74623bE(this.A00, this.A01, this.A03, this.A05, r11, r23), 0);
    }
}
