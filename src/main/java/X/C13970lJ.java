package X;

/* renamed from: X.0lJ  reason: invalid class name and case insensitive filesystem */
public class C13970lJ implements Comparable {
    public AnonymousClass0WH A00;
    public final /* synthetic */ C451223b A01;

    public C13970lJ(C451223b r1) {
        this.A01 = r1;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.A00.A02 - ((AnonymousClass0WH) obj).A02;
    }

    public String toString() {
        String str = "[ ";
        if (this.A00 != null) {
            int i = 0;
            do {
                StringBuilder A0S = AnonymousClass008.A0S(str);
                A0S.append(this.A00.A09[i]);
                A0S.append(" ");
                str = A0S.toString();
                i++;
            } while (i < 9);
        }
        StringBuilder A0Y = AnonymousClass008.A0Y(str, "] ");
        A0Y.append(this.A00);
        return A0Y.toString();
    }
}
