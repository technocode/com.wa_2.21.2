package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.3EK  reason: invalid class name */
public class AnonymousClass3EK implements AbstractC61382t5 {
    public final /* synthetic */ AnonymousClass3EL A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public AnonymousClass3EK(AnonymousClass3EL r1, String str, String str2, HashMap hashMap, String str3) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A04 = hashMap;
        this.A02 = str3;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r8) {
        this.A00.A02(r8.A01, r8.A02, this.A03, this.A01, this.A04, this.A02);
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r2) {
        Log.w("PAY: IndiaUpiPinActions: could not fetch VPA information to change pin");
        AbstractC61462tD r0 = this.A00.A00;
        if (r0 != null) {
            r0.AK1(r2);
        }
    }
}
