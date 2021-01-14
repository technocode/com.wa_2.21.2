package X;

/* renamed from: X.1GJ  reason: invalid class name */
public final class AnonymousClass1GJ {
    public int A00 = -1;
    public AnonymousClass1G3 A01;
    public AnonymousClass1G5 A02;
    public AnonymousClass1G9 A03;
    public AnonymousClass05j A04;

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.A02);
        sb.append("\n ecLevel: ");
        sb.append(this.A01);
        sb.append("\n version: ");
        sb.append(this.A03);
        sb.append("\n maskPattern: ");
        sb.append(this.A00);
        AnonymousClass05j r1 = this.A04;
        if (r1 == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(r1);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
