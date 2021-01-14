package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public class C008605e {
    public int A00;
    public AbstractC008705g A01;
    public Set A02;
    public final Set A03 = new HashSet();
    public final Set A04 = new HashSet();

    public C008605e(Class cls, Class[] clsArr) {
        this.A00 = 0;
        this.A02 = new HashSet();
        C001801b.A1R(cls, "Null interface");
        this.A04.add(cls);
        for (Class cls2 : clsArr) {
            C001801b.A1R(cls2, "Null interface");
        }
        Collections.addAll(this.A04, clsArr);
    }

    public C008505d A00() {
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        C001801b.A1b(z, "Missing required property: factory.");
        return new C008505d(new HashSet(this.A04), new HashSet(this.A03), this.A00, 0, this.A01, this.A02);
    }

    public void A01(AnonymousClass07I r3) {
        C001801b.A1R(r3, "Null dependency");
        C001801b.A1a(!this.A04.contains(r3.A01), "Components are not allowed to depend on interfaces they themselves provide.");
        this.A03.add(r3);
    }
}
