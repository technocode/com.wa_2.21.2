package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3EJ  reason: invalid class name */
public class AnonymousClass3EJ implements AbstractC61382t5 {
    public final /* synthetic */ AnonymousClass3EL A00;
    public final /* synthetic */ AbstractC62022u7 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ HashMap A08;

    public AnonymousClass3EJ(AnonymousClass3EL r1, String str, String str2, HashMap hashMap, String str3, String str4, String str5, String str6, AbstractC62022u7 r9) {
        this.A00 = r1;
        this.A07 = str;
        this.A02 = str2;
        this.A08 = hashMap;
        this.A05 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A06 = str6;
        this.A01 = r9;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r12) {
        this.A00.A03(r12.A01, r12.A02, this.A07, this.A02, this.A08, this.A05, this.A03, this.A04, this.A06, this.A01);
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to set pin");
        AbstractC61462tD r0 = this.A00.A00;
        if (r0 != null) {
            r0.AK1(r2);
        }
    }
}
