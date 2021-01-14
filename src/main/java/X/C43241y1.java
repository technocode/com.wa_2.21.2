package X;

/* renamed from: X.1y1  reason: invalid class name and case insensitive filesystem */
public final class C43241y1 extends AnonymousClass00X {
    public final String A00;
    public final AnonymousClass1TK[] A01;

    public C43241y1(String str, int i, int i2, AnonymousClass00Z r4, AnonymousClass1TK[] r5) {
        super(i, r4, i2);
        this.A00 = str;
        this.A01 = r5;
    }

    @Override // X.AnonymousClass00X
    public void serialize(AnonymousClass0Qt r6) {
        AnonymousClass1TK[] r4 = this.A01;
        for (AnonymousClass1TK r0 : r4) {
            r6.ANq(r0.A00, r0.A02);
        }
    }

    @Override // X.AnonymousClass00X
    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.A00);
        sb.append(" {");
        AnonymousClass1TK[] r4 = this.A01;
        for (AnonymousClass1TK r1 : r4) {
            Object obj = r1.A01;
            if (obj != null) {
                AnonymousClass00X.appendFieldToStringBuilder(sb, r1.A03, String.valueOf(obj));
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
