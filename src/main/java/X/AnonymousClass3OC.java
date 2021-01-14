package X;

import java.util.List;

/* renamed from: X.3OC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3OC implements AbstractC47662Jb {
    public final /* synthetic */ AbstractC007503q A00;
    public final /* synthetic */ AnonymousClass3OP A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ AnonymousClass3OC(AnonymousClass3OP r1, AbstractC007503q r2, List list) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = list;
    }

    @Override // X.AbstractC47662Jb
    public final void AER(Object obj) {
        AnonymousClass3OP r2 = this.A01;
        AbstractC007503q r1 = this.A00;
        List list = this.A02;
        r2.A05 = (CharSequence) obj;
        r2.A05(r1, list);
    }
}
