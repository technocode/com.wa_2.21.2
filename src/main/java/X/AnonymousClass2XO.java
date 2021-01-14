package X;

import java.util.Arrays;

/* renamed from: X.2XO  reason: invalid class name */
public class AnonymousClass2XO extends AnonymousClass1VI {
    public boolean A00;

    public AnonymousClass2XO(AnonymousClass1VI r14) {
        super(r14.A05, r14.A06, r14.A07, r14.A00, r14.A04, r14.A01, r14.A03, r14.A08, r14.A02);
    }

    @Override // X.AnonymousClass1VI
    public boolean equals(Object obj) {
        if (obj == null || AnonymousClass2XO.class != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass2XO r2 = (AnonymousClass2XO) obj;
        if (!super.equals(obj) || this.A00 != r2.A00) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass1VI
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Boolean.valueOf(this.A00)});
    }

    @Override // X.AnonymousClass1VI
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", isSyncing: ");
        sb.append(this.A00);
        return sb.toString();
    }
}
