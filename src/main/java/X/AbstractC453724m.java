package X;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.24m  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC453724m extends AbstractC31941e3 implements AbstractC18840u0 {
    public Matrix A00;
    public EnumC18680tk A01;
    public Boolean A02;
    public String A03;
    public List A04 = new ArrayList();

    @Override // X.AbstractC18840u0
    public void A1i(C18850u1 r3) {
        if (r3 instanceof C453924o) {
            this.A04.add(r3);
            return;
        }
        StringBuilder sb = new StringBuilder("Gradient elements cannot contain ");
        sb.append(r3);
        sb.append(" elements.");
        throw new C18940uA(sb.toString());
    }

    @Override // X.AbstractC18840u0
    public List A5H() {
        return this.A04;
    }
}
