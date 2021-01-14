package X;

import java.util.AbstractCollection;

/* renamed from: X.24K  reason: invalid class name */
public class AnonymousClass24K extends C30861c4 {
    public final /* synthetic */ AnonymousClass05V A00;
    public final /* synthetic */ View$OnAttachStateChangeListenerC17260rF A01;

    public AnonymousClass24K(View$OnAttachStateChangeListenerC17260rF r1, AnonymousClass05V r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC09420cr
    public void ALG(AbstractC09350ck r3) {
        ((AbstractCollection) this.A00.get(this.A01.A00)).remove(r3);
    }
}
