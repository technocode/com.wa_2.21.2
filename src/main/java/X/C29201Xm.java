package X;

/* renamed from: X.1Xm  reason: invalid class name and case insensitive filesystem */
public class C29201Xm {
    public final AnonymousClass02N A00;
    public final Long A01;

    public C29201Xm(AnonymousClass02N r1, Long l) {
        this.A00 = r1;
        this.A01 = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C29201Xm.class != obj.getClass()) {
            return false;
        }
        C29201Xm r4 = (C29201Xm) obj;
        if (!this.A00.equals(r4.A00)) {
            return false;
        }
        return this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("MutedChat{chatJid=");
        A0S.append(this.A00);
        A0S.append(", muteEndTimestampMs=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
