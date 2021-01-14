package X;

import com.whatsapp.wabloks.debug.WaBloksDebugActivity;

/* renamed from: X.3Un  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72853Un implements AbstractC28161Td {
    public final /* synthetic */ WaBloksDebugActivity A00;

    public /* synthetic */ C72853Un(WaBloksDebugActivity waBloksDebugActivity) {
        this.A00 = waBloksDebugActivity;
    }

    @Override // X.AbstractC28161Td
    public final void AGB(C28131Ta r4) {
        String message;
        Integer valueOf = Integer.valueOf(((Number) r4.A01).intValue() + 100);
        r4.A01 = valueOf;
        StringBuilder A0S = AnonymousClass008.A0S("onFinish: output=");
        A0S.append(valueOf);
        A0S.append(" error=");
        Exception exc = r4.A00;
        if (exc == null) {
            message = "None";
        } else {
            message = exc.getMessage();
        }
        A0S.append(message);
        WaBloksDebugActivity.A04("testHttpsRetry", A0S.toString());
    }
}
