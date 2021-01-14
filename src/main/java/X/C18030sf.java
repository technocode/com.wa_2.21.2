package X;

/* renamed from: X.0sf  reason: invalid class name and case insensitive filesystem */
public final class C18030sf {
    public static final AnonymousClass0RN A0H = new C31401dA();
    public static final String A0I = AbstractC17610rq.A01("WorkSpec");
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public EnumC06980Vl A08;
    public C17530rh A09;
    public C17550rj A0A;
    public C17550rj A0B;
    public AnonymousClass0VU A0C = AnonymousClass0VU.ENQUEUED;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;

    public C18030sf(C18030sf r3) {
        C17550rj r0 = C17550rj.A01;
        this.A0A = r0;
        this.A0B = r0;
        this.A09 = C17530rh.A08;
        this.A08 = EnumC06980Vl.EXPONENTIAL;
        this.A01 = 30000;
        this.A07 = -1;
        this.A0D = r3.A0D;
        this.A0F = r3.A0F;
        this.A0C = r3.A0C;
        this.A0E = r3.A0E;
        this.A0A = new C17550rj(r3.A0A);
        this.A0B = new C17550rj(r3.A0B);
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
        this.A09 = new C17530rh(r3.A09);
        this.A00 = r3.A00;
        this.A08 = r3.A08;
        this.A01 = r3.A01;
        this.A06 = r3.A06;
        this.A05 = r3.A05;
        this.A07 = r3.A07;
        this.A0G = r3.A0G;
    }

    public C18030sf(String str, String str2) {
        C17550rj r0 = C17550rj.A01;
        this.A0A = r0;
        this.A0B = r0;
        this.A09 = C17530rh.A08;
        this.A08 = EnumC06980Vl.EXPONENTIAL;
        this.A01 = 30000;
        this.A07 = -1;
        this.A0D = str;
        this.A0F = str2;
    }

    public long A00() {
        long j;
        long j2;
        int i;
        long scalb;
        if (this.A0C != AnonymousClass0VU.ENQUEUED || (i = this.A00) <= 0) {
            boolean z = false;
            if (this.A04 != 0) {
                z = true;
            }
            long j3 = 0;
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.A06;
                if (j4 == 0) {
                    j4 = this.A03 + currentTimeMillis;
                }
                long j5 = this.A02;
                long j6 = this.A04;
                int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                if (j5 != j6) {
                    if (i2 == 0) {
                        j3 = j5 * -1;
                    }
                    return j4 + j6 + j3;
                }
                if (i2 != 0) {
                    j3 = j6;
                }
                return j4 + j3;
            }
            j = this.A06;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.A03;
        } else {
            if (this.A08 == EnumC06980Vl.LINEAR) {
                scalb = this.A01 * ((long) i);
            } else {
                scalb = (long) Math.scalb((float) this.A01, i - 1);
            }
            j2 = this.A06;
            j = Math.min(18000000L, scalb);
        }
        return j + j2;
    }

    public void A01(long j, long j2) {
        if (j < 900000) {
            AbstractC17610rq.A00().A05(A0I, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            AbstractC17610rq.A00().A05(A0I, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            AbstractC17610rq.A00().A05(A0I, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j)), new Throwable[0]);
            j2 = j;
        }
        this.A04 = j;
        this.A02 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18030sf)) {
            return false;
        }
        C18030sf r8 = (C18030sf) obj;
        if (this.A03 != r8.A03 || this.A04 != r8.A04 || this.A02 != r8.A02 || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A06 != r8.A06 || this.A05 != r8.A05 || this.A07 != r8.A07 || this.A0G != r8.A0G || !this.A0D.equals(r8.A0D) || this.A0C != r8.A0C || !this.A0F.equals(r8.A0F)) {
            return false;
        }
        String str = this.A0E;
        if (str != null) {
            if (!str.equals(r8.A0E)) {
                return false;
            }
        } else if (r8.A0E != null) {
            return false;
        }
        if (this.A0A.equals(r8.A0A) && this.A0B.equals(r8.A0B) && this.A09.equals(r8.A09) && this.A08 == r8.A08) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.A0D.hashCode() * 31;
        int hashCode2 = (this.A0F.hashCode() + ((this.A0C.hashCode() + hashCode) * 31)) * 31;
        String str = this.A0E;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode3 = (this.A0A.hashCode() + ((hashCode2 + i) * 31)) * 31;
        long j = this.A03;
        long j2 = this.A04;
        long j3 = this.A02;
        int hashCode4 = this.A09.hashCode();
        int hashCode5 = this.A08.hashCode();
        long j4 = this.A01;
        long j5 = this.A06;
        long j6 = this.A05;
        long j7 = this.A07;
        return ((((((((((hashCode5 + ((((hashCode4 + ((((((((this.A0B.hashCode() + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.A00) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
    }

    public String toString() {
        return AnonymousClass008.A0O(AnonymousClass008.A0S("{WorkSpec: "), this.A0D, "}");
    }
}
