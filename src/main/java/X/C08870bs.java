package X;

import java.util.ArrayDeque;

/* renamed from: X.0bs  reason: invalid class name and case insensitive filesystem */
public class C08870bs implements AnonymousClass0WS {
    public final AnonymousClass0SU A00;
    public final /* synthetic */ AnonymousClass0S8 A01;

    public C08870bs(AnonymousClass0S8 r1, AnonymousClass0SU r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0WS
    public void cancel() {
        ArrayDeque arrayDeque = this.A01.A01;
        AnonymousClass0SU r0 = this.A00;
        arrayDeque.remove(r0);
        r0.A00.remove(this);
    }
}
