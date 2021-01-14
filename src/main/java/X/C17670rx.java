package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0rx  reason: invalid class name and case insensitive filesystem */
public final class C17670rx {
    public int A00;
    public C17550rj A01;
    public C17550rj A02;
    public AnonymousClass0VU A03;
    public Set A04;
    public UUID A05;

    public C17670rx(UUID uuid, AnonymousClass0VU r3, C17550rj r4, List list, C17550rj r6, int i) {
        this.A05 = uuid;
        this.A03 = r3;
        this.A01 = r4;
        this.A04 = new HashSet(list);
        this.A02 = r6;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17670rx.class != obj.getClass()) {
            return false;
        }
        C17670rx r4 = (C17670rx) obj;
        if (this.A00 == r4.A00 && this.A05.equals(r4.A05) && this.A03 == r4.A03 && this.A01.equals(r4.A01) && this.A04.equals(r4.A04)) {
            return this.A02.equals(r4.A02);
        }
        return false;
    }

    public int hashCode() {
        return ((this.A02.hashCode() + ((this.A04.hashCode() + ((this.A01.hashCode() + ((this.A03.hashCode() + (this.A05.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WorkInfo{mId='");
        A0S.append(this.A05);
        A0S.append('\'');
        A0S.append(", mState=");
        A0S.append(this.A03);
        A0S.append(", mOutputData=");
        A0S.append(this.A01);
        A0S.append(", mTags=");
        A0S.append(this.A04);
        A0S.append(", mProgress=");
        A0S.append(this.A02);
        A0S.append('}');
        return A0S.toString();
    }
}
