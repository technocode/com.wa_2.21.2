package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.07C  reason: invalid class name */
public abstract class AnonymousClass07C extends AbstractC008905s implements AnonymousClass07B {
    public List A00 = new ArrayList();

    /* renamed from: A06 */
    public AnonymousClass07C A02() {
        AnonymousClass07C r2 = (AnonymousClass07C) super.A02();
        r2.A00 = new ArrayList(this.A00);
        return r2;
    }

    @Override // X.AbstractC009005t, X.AbstractC008905s
    public List A4u() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.A4u());
        arrayList.add(this.A00);
        return arrayList;
    }

    @Override // X.AnonymousClass07B
    public List A5H() {
        return this.A00;
    }
}
