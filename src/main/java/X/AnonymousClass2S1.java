package X;

import java.util.Comparator;

/* renamed from: X.2S1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S1 implements Comparator {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;

    public /* synthetic */ AnonymousClass2S1(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        double d = this.A00;
        double d2 = this.A01;
        AnonymousClass1BR r11 = (AnonymousClass1BR) obj;
        AnonymousClass1BR r12 = (AnonymousClass1BR) obj2;
        return Double.compare(((r11.A00().A01 - d2) * (r11.A00().A01 - d2)) + ((r11.A00().A00 - d) * (r11.A00().A00 - d)), ((r12.A00().A01 - d2) * (r12.A00().A01 - d2)) + ((r12.A00().A00 - d) * (r12.A00().A00 - d)));
    }
}
