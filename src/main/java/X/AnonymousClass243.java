package X;

import android.content.Context;

/* renamed from: X.243  reason: invalid class name */
public class AnonymousClass243 extends C30521bU {
    public final /* synthetic */ AnonymousClass244 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass243(AnonymousClass244 r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    @Override // X.C30521bU
    public int A03(int i) {
        return Math.min(100, super.A03(i));
    }
}
