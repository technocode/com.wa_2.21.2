package X;

import com.whatsapp.wabloks.debug.WaBloksDebugActivity;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3Uq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72883Uq implements AbstractC28161Td {
    public final /* synthetic */ WaBloksDebugActivity A00;
    public final /* synthetic */ CountDownLatch A01;

    public /* synthetic */ C72883Uq(WaBloksDebugActivity waBloksDebugActivity, CountDownLatch countDownLatch) {
        this.A00 = waBloksDebugActivity;
        this.A01 = countDownLatch;
    }

    @Override // X.AbstractC28161Td
    public final void AGB(C28131Ta r4) {
        CountDownLatch countDownLatch = this.A01;
        Integer valueOf = Integer.valueOf(((Number) r4.A01).intValue() + 100);
        r4.A01 = valueOf;
        StringBuilder A0S = AnonymousClass008.A0S("onFinish: output=");
        A0S.append(valueOf);
        WaBloksDebugActivity.A04("testHttps", A0S.toString());
        countDownLatch.countDown();
    }
}
