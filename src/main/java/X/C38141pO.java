package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.1pO  reason: invalid class name and case insensitive filesystem */
public final class C38141pO implements AnonymousClass06K {
    public AnonymousClass06M A00;
    public AbstractC011306t A01;
    public String A02;
    public final C38131pN A03 = new C38131pN();
    public final Stack A04 = new Stack();
    public final Stack A05 = new Stack();

    public C38141pO(Iterator it) {
        this.A05.add(it);
        this.A04.add(AnonymousClass1H2.ReadObject);
    }

    public final void A00() {
        AbstractC011306t r3 = this.A01;
        if (r3 == AnonymousClass1H5.A00) {
            this.A00 = AnonymousClass06M.NULL;
        } else if (r3 instanceof Number) {
            this.A00 = AnonymousClass06M.NUMBER;
        } else if (r3 instanceof AnonymousClass27G) {
            Object A0a = C008805h.A0a(r3);
            if (A0a instanceof String) {
                this.A00 = AnonymousClass06M.STRING;
            } else if (A0a instanceof List) {
                this.A05.push(((List) A0a).iterator());
                this.A04.push(AnonymousClass1H2.ArrayReadValue);
                this.A00 = AnonymousClass06M.START_ARRAY;
            } else if (A0a instanceof Map) {
                this.A05.push(((Map) A0a).entrySet().iterator());
                this.A04.push(AnonymousClass1H2.ObjectReadName);
                this.A00 = AnonymousClass06M.START_OBJECT;
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("unknown value type");
                A0S.append(r3);
                throw new IllegalStateException(A0S.toString());
            }
        } else if (r3 instanceof AnonymousClass27C) {
            this.A00 = AnonymousClass06M.EXPRESSION;
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S("unknown value type");
            A0S2.append(r3);
            throw new IllegalStateException(A0S2.toString());
        }
    }

    @Override // X.AnonymousClass06K
    public AnonymousClass06M ACQ() {
        AnonymousClass1H2 r6 = AnonymousClass1H2.ObjectReadName;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A04;
        Stack stack2 = this.A05;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((AnonymousClass1H2) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = AnonymousClass06M.START_OBJECT;
            stack.pop();
            stack.push(r6);
        } else if (ordinal == 1) {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.A02 = (String) C008805h.A0b((AbstractC011306t) entry.getKey());
                this.A01 = (AbstractC011306t) entry.getValue();
                this.A00 = AnonymousClass06M.NAME;
                stack.pop();
                stack.push(AnonymousClass1H2.ObjectReadValue);
            } else {
                this.A00 = AnonymousClass06M.END_OBJECT;
                stack.pop();
                stack2.pop();
            }
        } else if (ordinal == 2) {
            stack.pop();
            stack.push(r6);
            A00();
        } else if (ordinal == 3) {
            this.A00 = AnonymousClass06M.START_ARRAY;
            stack.pop();
            stack.push(AnonymousClass1H2.ArrayReadValue);
        } else if (ordinal == 4) {
            this.A01 = null;
            if (it.hasNext()) {
                this.A01 = (AbstractC011306t) it.next();
                A00();
            } else {
                this.A00 = AnonymousClass06M.END_ARRAY;
                stack2.pop();
                stack.pop();
            }
        }
        return this.A00;
    }

    @Override // X.AnonymousClass06K
    public String ALx() {
        return this.A02;
    }

    @Override // X.AnonymousClass06K
    public AnonymousClass06M ALy() {
        return this.A00;
    }

    @Override // X.AnonymousClass06K
    public AnonymousClass06N ALz() {
        C38131pN r1 = this.A03;
        r1.A00 = this.A01;
        return r1;
    }

    @Override // X.AnonymousClass06K
    public void APz() {
        AnonymousClass06M r4 = AnonymousClass06M.START_OBJECT;
        AnonymousClass06M r3 = AnonymousClass06M.START_ARRAY;
        AnonymousClass06M r0 = this.A00;
        if (r0 == r3 || r0 == r4) {
            int i = 1;
            while (true) {
                AnonymousClass06M ACQ = ACQ();
                if (ACQ == r3 || ACQ == r4) {
                    i++;
                } else if (ACQ == AnonymousClass06M.END_ARRAY || ACQ == AnonymousClass06M.END_OBJECT) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
