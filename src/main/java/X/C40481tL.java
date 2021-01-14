package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1tL  reason: invalid class name and case insensitive filesystem */
public class C40481tL extends AnonymousClass1W2 {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40481tL(AnonymousClass0XK r1, AnonymousClass02N r2, boolean z, String str) {
        super(r2, z);
        this.A00 = r1;
        this.A01 = str;
    }

    @Override // X.AnonymousClass1W2
    public void A02(int i) {
        super.A02(i);
        if (!super.A01) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.toString((long) (i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
            this.A00.A12.A04(this.A01, Collections.emptyList(), 29, false, Collections.emptyMap(), hashMap);
        }
    }
}
