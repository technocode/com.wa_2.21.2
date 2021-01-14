package X;

/* renamed from: X.3ar  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC74423ar implements AbstractC05800Qh, AbstractC05810Qi {
    public static final long[] A0E = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public byte[] A0C;
    public long[] A0D;

    public static final long A00(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public static final long A01(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    @Override // X.AbstractC05810Qi
    public int A53() {
        return 128;
    }

    public AbstractC74423ar() {
        this.A0C = new byte[8];
        this.A0D = new long[80];
        this.A01 = 0;
        reset();
    }

    public AbstractC74423ar(AbstractC74423ar r2) {
        this.A0C = new byte[8];
        this.A0D = new long[80];
        A03(r2);
    }

    public void A02() {
        long[] jArr;
        long j = this.A0A;
        if (j > 2305843009213693951L) {
            this.A0B += j >>> 61;
            this.A0A = j & 2305843009213693951L;
        }
        int i = 16;
        do {
            jArr = this.A0D;
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((j4 >>> 7) ^ (((j4 << 63) | (j4 >>> 1)) ^ ((j4 << 56) | (j4 >>> 8)))) + jArr[i - 16];
            i++;
        } while (i <= 79);
        long j5 = this.A02;
        long j6 = this.A03;
        long j7 = this.A04;
        long j8 = this.A05;
        long j9 = this.A06;
        long j10 = this.A07;
        long j11 = j8;
        long j12 = this.A08;
        long j13 = this.A09;
        long j14 = j10;
        int i2 = 0;
        long j15 = j6;
        long j16 = j7;
        long j17 = j9;
        int i3 = 0;
        long j18 = j13;
        long j19 = j5;
        long j20 = j12;
        do {
            long[] jArr2 = A0E;
            int i4 = i2 + 1;
            long A012 = A01(j17) + (((j17 ^ -1) & j20) ^ (j14 & j17)) + jArr2[i2] + jArr[i2] + j18;
            long j21 = j11 + A012;
            long j22 = j19 & j15;
            long A002 = A00(j19) + (((j19 & j16) ^ j22) ^ (j15 & j16)) + A012;
            int i5 = i4 + 1;
            long A013 = A01(j21) + (((j21 ^ -1) & j14) ^ (j17 & j21)) + jArr2[i4] + jArr[i4] + j20;
            long j23 = j16 + A013;
            long j24 = A002 & j19;
            long A003 = A00(A002) + (((A002 & j15) ^ j24) ^ j22) + A013;
            int i6 = i5 + 1;
            long A014 = A01(j23) + (((j23 ^ -1) & j17) ^ (j21 & j23)) + jArr2[i5] + jArr[i5] + j14;
            long j25 = j15 + A014;
            long j26 = A003 & A002;
            long A004 = A00(A003) + (((A003 & j19) ^ j26) ^ j24) + A014;
            int i7 = i6 + 1;
            long A015 = A01(j25) + (((j25 ^ -1) & j21) ^ (j23 & j25)) + jArr2[i6] + jArr[i6] + j17;
            long j27 = j19 + A015;
            long j28 = A004 & A003;
            long A005 = A00(A004) + (((A004 & A002) ^ j28) ^ j26) + A015;
            int i8 = i7 + 1;
            long A016 = A01(j27) + (((j27 ^ -1) & j23) ^ (j25 & j27)) + jArr2[i7] + jArr[i7] + j21;
            long j29 = A002 + A016;
            long j30 = A005 & A004;
            j11 = A00(A005) + (((A005 & A003) ^ j30) ^ j28) + A016;
            int i9 = i8 + 1;
            long A017 = A01(j29) + (((j29 ^ -1) & j25) ^ (j27 & j29)) + jArr2[i8] + jArr[i8] + j23;
            long j31 = A003 + A017;
            long j32 = j11 & A005;
            j16 = A00(j11) + (((j11 & A004) ^ j32) ^ j30) + A017;
            j18 = j29;
            long j33 = (j31 ^ -1) & j27;
            int i10 = i9 + 1;
            long A018 = A01(j31) + (j33 ^ (j29 & j31)) + jArr2[i9] + jArr[i9] + j25;
            j14 = A004 + A018;
            long j34 = j16 & j11;
            j15 = A00(j16) + (((j16 & A005) ^ j34) ^ j32) + A018;
            j20 = j31;
            i2 = i10 + 1;
            long A019 = A01(j14) + (((j14 ^ -1) & j18) ^ (j31 & j14)) + jArr2[i10] + jArr[i10] + j27;
            j17 = A005 + A019;
            j19 = A00(j15) + (((j15 & j11) ^ (j15 & j16)) ^ j34) + A019;
            i3++;
        } while (i3 < 10);
        this.A02 = j5 + j19;
        this.A03 = j6 + j15;
        this.A04 = j7 + j16;
        this.A05 = j8 + j11;
        this.A06 = j9 + j17;
        this.A07 = j10 + j14;
        this.A08 = j12 + j20;
        this.A09 = j13 + j18;
        this.A00 = 0;
        int i11 = 0;
        do {
            jArr[i11] = 0;
            i11++;
        } while (i11 < 16);
    }

    public void A03(AbstractC74423ar r5) {
        byte[] bArr = r5.A0C;
        System.arraycopy(bArr, 0, this.A0C, 0, bArr.length);
        this.A01 = r5.A01;
        this.A0A = r5.A0A;
        this.A0B = r5.A0B;
        this.A02 = r5.A02;
        this.A03 = r5.A03;
        this.A04 = r5.A04;
        this.A05 = r5.A05;
        this.A06 = r5.A06;
        this.A07 = r5.A07;
        this.A08 = r5.A08;
        this.A09 = r5.A09;
        long[] jArr = r5.A0D;
        System.arraycopy(jArr, 0, this.A0D, 0, jArr.length);
        this.A00 = r5.A00;
    }

    public void A04(byte[] bArr, int i) {
        long[] jArr = this.A0D;
        int i2 = this.A00;
        int A012 = AnonymousClass1YV.A01(bArr, i);
        jArr[i2] = (((long) AnonymousClass1YV.A01(bArr, i + 4)) & 4294967295L) | ((((long) A012) & 4294967295L) << 32);
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 16) {
            A02();
        }
    }

    @Override // X.AbstractC05820Qj
    public void AQm(byte b) {
        byte[] bArr = this.A0C;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            A04(bArr, 0);
            this.A01 = 0;
        }
        this.A0A++;
    }

    @Override // X.AbstractC05820Qj
    public void reset() {
        this.A0A = 0;
        this.A0B = 0;
        int i = 0;
        this.A01 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.A0C;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.A00 = 0;
        while (true) {
            long[] jArr = this.A0D;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC05820Qj
    public void update(byte[] bArr, int i, int i2) {
        while (this.A01 != 0 && i2 > 0) {
            AQm(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            int length = this.A0C.length;
            if (i2 <= length) {
                break;
            }
            A04(bArr, i);
            i += length;
            i2 -= length;
            this.A0A += (long) length;
        }
        while (i2 > 0) {
            AQm(bArr[i]);
            i++;
            i2--;
        }
    }
}
