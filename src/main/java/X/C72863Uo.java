package X;

import com.whatsapp.wabloks.debug.WaBloksDebugActivity;

/* renamed from: X.3Uo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72863Uo implements AbstractC28141Tb {
    public final /* synthetic */ WaBloksDebugActivity A00;

    public /* synthetic */ C72863Uo(WaBloksDebugActivity waBloksDebugActivity) {
        this.A00 = waBloksDebugActivity;
    }

    @Override // X.AbstractC28141Tb
    public final void A3s(C28131Ta r3) {
        Exception exc = r3.A00;
        if (exc == null) {
            Integer valueOf = Integer.valueOf(((Number) r3.A01).intValue() + 10);
            r3.A01 = valueOf;
            StringBuilder A0S = AnonymousClass008.A0S("doInBackground: output=");
            A0S.append(valueOf);
            WaBloksDebugActivity.A04("testHttpsRetry", A0S.toString());
            throw new Exception("Fail");
        }
        throw exc;
    }
}
