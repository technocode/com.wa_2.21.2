package X;

/* renamed from: X.1RH  reason: invalid class name */
public final class AnonymousClass1RH {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass1RH(String str, String str2, String str3, String str4, long j, long j2) {
        if (str != null) {
            this.A05 = str;
            if (str2 != null) {
                this.A04 = str2;
                if (str3 != null) {
                    this.A03 = str3;
                    if (str4 != null) {
                        this.A02 = str4;
                        this.A00 = j;
                        this.A01 = j2;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1RH.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1RH r7 = (AnonymousClass1RH) obj;
        if (this.A00 == r7.A00 && this.A01 == r7.A01 && this.A04.equals(r7.A04) && this.A03.equals(r7.A03)) {
            return this.A02.equals(r7.A02);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A04.hashCode() * 31;
        int hashCode2 = this.A02.hashCode();
        long j = this.A00;
        long j2 = this.A01;
        return ((((hashCode2 + ((this.A03.hashCode() + hashCode) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("RemoteFile{name='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", mimeType='");
        AnonymousClass008.A1W(A0S, this.A03, '\'', ", md5Hash='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", sizeBytes=");
        A0S.append(this.A00);
        A0S.append(", updateTime=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
