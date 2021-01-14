package X;

/* renamed from: X.14j  reason: invalid class name and case insensitive filesystem */
public final class C230914j implements Comparable {
    public final int A00;
    public final C230514f A01;

    public C230914j(int i, C230514f r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.A00 - ((C230914j) obj).A00;
    }
}
