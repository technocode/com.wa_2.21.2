package X;

import java.util.Arrays;

/* renamed from: X.2yO  reason: invalid class name and case insensitive filesystem */
public class C64562yO {
    public final long A00;
    public final AnonymousClass3JT A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;

    public C64562yO(C76183e8 r4) {
        AnonymousClass3JT r0;
        AnonymousClass3JT r2 = AnonymousClass3JT.IMAGE;
        int i = r4.A00;
        if (i != 0) {
            r0 = i == 1 ? AnonymousClass3JT.PDF : r0;
            this.A01 = r2;
            this.A03 = r4.A08;
            this.A07 = r4.A06.A01();
            this.A00 = r4.A02;
            this.A05 = r4.A04.A01();
            this.A04 = r4.A03.A01();
            this.A02 = r4.A07;
            this.A06 = r4.A05.A01();
        }
        r0 = r2;
        if (r0 != null) {
            r2 = r0;
        }
        this.A01 = r2;
        this.A03 = r4.A08;
        this.A07 = r4.A06.A01();
        this.A00 = r4.A02;
        this.A05 = r4.A04.A01();
        this.A04 = r4.A03.A01();
        this.A02 = r4.A07;
        this.A06 = r4.A05.A01();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C64562yO.class != obj.getClass()) {
            return false;
        }
        C64562yO r7 = (C64562yO) obj;
        if (this.A00 != r7.A00 || this.A01 != r7.A01 || !C006803i.A0q(this.A03, r7.A03) || !Arrays.equals(this.A07, r7.A07) || !Arrays.equals(this.A05, r7.A05) || !Arrays.equals(this.A04, r7.A04) || !C006803i.A0q(this.A02, r7.A02) || !Arrays.equals(this.A06, r7.A06)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(new Object[]{this.A01, this.A03, Long.valueOf(this.A00), this.A02}) * 31) + Arrays.hashCode(new Object[]{this.A07})) * 31) + Arrays.hashCode(new Object[]{this.A05})) * 31) + Arrays.hashCode(new Object[]{this.A04})) * 31) + Arrays.hashCode(new Object[]{this.A06});
    }
}
