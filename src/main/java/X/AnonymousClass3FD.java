package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.3FD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FD implements AbstractC48012Ko {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ AnonymousClass3GW A01;

    public /* synthetic */ AnonymousClass3FD(AnonymousClass3GW r1, C28021Sn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        AnonymousClass3GW r1 = this.A01;
        C28021Sn r3 = this.A00;
        if (list.size() > 0) {
            HashMap A03 = r1.A01.A03.A03((C43761yu) list.get(0), null);
            if (r3.A00) {
                AnonymousClass008.A0f(r3, "on_success", A03, r3.A03);
            }
        }
    }
}
