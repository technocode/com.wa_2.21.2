package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.28U  reason: invalid class name */
public abstract class AnonymousClass28U extends AbstractC454024p implements AbstractC18840u0, AbstractC18830tz {
    public String A00 = null;
    public List A01 = new ArrayList();
    public Set A02 = null;
    public Set A03 = null;
    public Set A04 = null;

    @Override // X.AbstractC18830tz
    public Set A9I() {
        return null;
    }

    @Override // X.AbstractC18830tz
    public void AP9(Set set) {
    }

    @Override // X.AbstractC18840u0
    public void A1i(C18850u1 r3) {
        if (!(this instanceof AnonymousClass2AH)) {
            this.A01.add(r3);
        } else if (r3 instanceof AbstractC18870u3) {
            this.A01.add(r3);
        } else {
            StringBuilder sb = new StringBuilder("Text content elements cannot contain ");
            sb.append(r3);
            sb.append(" elements.");
            throw new C18940uA(sb.toString());
        }
    }

    @Override // X.AbstractC18840u0
    public List A5H() {
        return this.A01;
    }

    @Override // X.AbstractC18830tz
    public String A8j() {
        return this.A00;
    }

    @Override // X.AbstractC18830tz
    public Set A8k() {
        return this.A02;
    }

    @Override // X.AbstractC18830tz
    public Set A8l() {
        return this.A03;
    }

    @Override // X.AbstractC18830tz
    public Set A8m() {
        return this.A04;
    }

    @Override // X.AbstractC18830tz
    public void AOx(String str) {
        this.A00 = str;
    }

    @Override // X.AbstractC18830tz
    public void AOy(Set set) {
        this.A02 = set;
    }

    @Override // X.AbstractC18830tz
    public void AOz(Set set) {
        this.A03 = set;
    }

    @Override // X.AbstractC18830tz
    public void AP0(Set set) {
        this.A04 = set;
    }
}
