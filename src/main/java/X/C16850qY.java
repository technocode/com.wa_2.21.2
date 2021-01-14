package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0qY  reason: invalid class name and case insensitive filesystem */
public class C16850qY {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public C16850qY(String str, String str2, String str3, List list, List list2) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16850qY.class != obj.getClass()) {
            return false;
        }
        C16850qY r4 = (C16850qY) obj;
        if (this.A02.equals(r4.A02) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A03.equals(r4.A03)) {
            return this.A04.equals(r4.A04);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int hashCode2 = this.A01.hashCode();
        return this.A04.hashCode() + ((this.A03.hashCode() + ((hashCode2 + ((this.A00.hashCode() + hashCode) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ForeignKey{referenceTable='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", onDelete='");
        AnonymousClass008.A1W(A0S, this.A00, '\'', ", onUpdate='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", columnNames=");
        A0S.append(this.A03);
        A0S.append(", referenceColumnNames=");
        A0S.append(this.A04);
        A0S.append('}');
        return A0S.toString();
    }
}
