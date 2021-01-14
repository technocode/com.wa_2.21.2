package X;

/* renamed from: X.23c  reason: invalid class name and case insensitive filesystem */
public class C451323c extends C29821aF {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = true;

    @Override // X.AnonymousClass0WC
    public String toString() {
        String A0O = AnonymousClass008.A0O(AnonymousClass008.A0S("[Barrier] "), this.A0f, " {");
        for (int i = 0; i < ((C29821aF) this).A00; i++) {
            AnonymousClass0WC r2 = ((C29821aF) this).A01[i];
            if (i > 0) {
                A0O = AnonymousClass008.A0K(A0O, ", ");
            }
            StringBuilder A0S = AnonymousClass008.A0S(A0O);
            A0S.append(r2.A0f);
            A0O = A0S.toString();
        }
        return AnonymousClass008.A0K(A0O, "}");
    }
}
