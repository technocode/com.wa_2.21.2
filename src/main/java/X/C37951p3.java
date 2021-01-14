package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1p3  reason: invalid class name and case insensitive filesystem */
public class C37951p3 implements AnonymousClass11B {
    public final AnonymousClass05q A00;
    public final AbstractC008905s A01;
    public final List A02;

    public C37951p3(AnonymousClass05q r1, List list, AbstractC008905s r3) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC009906e r3 = (AbstractC009906e) list.get(i);
            r3.A4v().A2E(obj, this.A00, r3, this.A01);
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC009906e r3 = (AbstractC009906e) list.get(i);
            r3.A4v().AQk(obj, this.A00, r3, this.A01);
        }
    }
}
