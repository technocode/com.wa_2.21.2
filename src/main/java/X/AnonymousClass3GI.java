package X;

import java.util.List;

/* renamed from: X.3GI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GI implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass3HD A00;

    public /* synthetic */ AnonymousClass3GI(AnonymousClass3HD r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass3HC r0 = this.A00.A00.A01;
        ((AbstractC63112vs) r0).A00 = (List) obj;
        r0.notifyDataSetChanged();
    }
}
