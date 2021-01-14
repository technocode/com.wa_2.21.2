package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.2Uk  reason: invalid class name and case insensitive filesystem */
public class C50362Uk {
    public int A00;
    public C50382Um A01;
    public final AbstractC50392Un A02;

    public C50362Uk(AbstractC50392Un r1) {
        this.A02 = r1;
    }

    public int A00() {
        if (!(this instanceof C57682kh)) {
            A02();
            AbstractC50392Un r0 = this.A02;
            r0.readInt();
            int readInt = this.A01.A00[EnumC50372Ul.A00(r0.readByte() & 255).typeId] * r0.readInt();
            A04((long) readInt);
            return this.A00 + 4 + 4 + 1 + readInt;
        }
        A02();
        AbstractC50392Un r4 = this.A02;
        r4.readInt();
        int readInt2 = this.A01.A00[EnumC50372Ul.A00(r4.readByte() & 255).typeId] * r4.readInt();
        C57692ki r42 = (C57692ki) r4;
        r42.A00.AML(new byte[readInt2]);
        r42.A01.write(new byte[readInt2]);
        return this.A00 + 4 + 4 + 1 + readInt2;
    }

    public int A01() {
        return this.A02.readShort() & 65535;
    }

    public long A02() {
        int i = this.A00;
        if (i == 1) {
            return (long) this.A02.readByte();
        }
        if (i == 2) {
            return (long) this.A02.readShort();
        }
        if (i == 4) {
            return (long) this.A02.readInt();
        }
        if (i == 8) {
            return this.A02.readLong();
        }
        throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A03() {
        AbstractC50392Un r4;
        long j;
        int i;
        int i2;
        int i3;
        this.A01 = new C50382Um();
        do {
            try {
                r4 = this.A02;
            } catch (EOFException unused) {
                return;
            }
        } while (r4.readByte() != 0);
        int readInt = r4.readInt();
        this.A00 = readInt;
        C50382Um r7 = this.A01;
        int i4 = -1;
        for (int i5 = 0; i5 < EnumC50372Ul.values().length; i5++) {
            i4 = Math.max(EnumC50372Ul.values()[i5].typeId, i4);
        }
        int[] iArr = new int[(i4 + 1)];
        r7.A00 = iArr;
        Arrays.fill(iArr, -1);
        for (int i6 = 0; i6 < EnumC50372Ul.values().length; i6++) {
            r7.A00[EnumC50372Ul.values()[i6].typeId] = EnumC50372Ul.values()[i6].size;
        }
        r7.A00[EnumC50372Ul.OBJECT.typeId] = readInt;
        r4.readLong();
        while (r4.AAN()) {
            int readByte = r4.readByte() & 255;
            r4.readInt();
            long readInt2 = ((long) r4.readInt()) & 4294967295L;
            if (readByte == 12 || readByte == 28) {
                while (readInt2 > 0) {
                    int readByte2 = r4.readByte() & 255;
                    long j2 = readInt2 - 1;
                    if (readByte2 != 144) {
                        if (readByte2 != 195) {
                            if (readByte2 == 254) {
                                r4.readInt();
                                A02();
                                i2 = this.A00;
                            } else if (readByte2 != 255) {
                                switch (readByte2) {
                                    case 1:
                                        A04((long) this.A00);
                                        j2 -= (long) this.A00;
                                        A02();
                                        i = this.A00;
                                        j = (long) i;
                                        break;
                                    case 2:
                                    case 3:
                                        A04((long) (this.A00 + 4 + 4));
                                        i3 = this.A00;
                                        i2 = i3 + 4;
                                        break;
                                    case 4:
                                        A02();
                                        r4.readInt();
                                        i2 = this.A00;
                                        break;
                                    case 5:
                                    case 7:
                                        break;
                                    case 6:
                                        A02();
                                        r4.readInt();
                                        i2 = this.A00;
                                        break;
                                    case 8:
                                        A02();
                                        r4.readInt();
                                        r4.readInt();
                                        i3 = this.A00;
                                        i2 = i3 + 4;
                                        break;
                                    default:
                                        switch (readByte2) {
                                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                                if (this instanceof C57682kh) {
                                                    A02();
                                                    AbstractC50392Un r8 = this.A02;
                                                    r8.readInt();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    A02();
                                                    r8.readInt();
                                                    int A012 = A01();
                                                    int i7 = (this.A00 * 7) + 4 + 4 + 2;
                                                    for (int i8 = 0; i8 < A012; i8++) {
                                                        A01();
                                                        int i9 = this.A01.A00[EnumC50372Ul.A00(r8.readByte() & 255).typeId];
                                                        A04((long) i9);
                                                        i7 += i9 + 1 + 2;
                                                    }
                                                    int A013 = A01();
                                                    int i10 = i7 + 2;
                                                    for (int i11 = 0; i11 < A013; i11++) {
                                                        A02();
                                                        EnumC50372Ul A002 = EnumC50372Ul.A00(r8.readByte());
                                                        if (A002 == EnumC50372Ul.OBJECT) {
                                                            A02();
                                                        } else {
                                                            C57692ki r10 = (C57692ki) r8;
                                                            int i12 = A002.size;
                                                            if (r10 != null) {
                                                                r10.A00.AML(new byte[i12]);
                                                                r10.A01.write(new byte[i12]);
                                                            } else {
                                                                throw null;
                                                            }
                                                        }
                                                        i10 += this.A01.A00[A002.typeId] + this.A00 + 1;
                                                    }
                                                    int A014 = A01();
                                                    i = i10 + 2;
                                                    for (int i13 = 0; i13 < A014; i13++) {
                                                        A02();
                                                        r8.readByte();
                                                        i += this.A00 + 1;
                                                    }
                                                } else if (!(this instanceof C57672kg)) {
                                                    throw null;
                                                } else {
                                                    C57672kg r6 = (C57672kg) this;
                                                    long A022 = r6.A02();
                                                    AbstractC50392Un r72 = r6.A02;
                                                    r72.readInt();
                                                    long A023 = r6.A02();
                                                    r6.A02();
                                                    r6.A02();
                                                    r6.A02();
                                                    r6.A02();
                                                    r6.A02();
                                                    r72.readInt();
                                                    int A015 = r6.A01();
                                                    int i14 = (((C50362Uk) r6).A00 * 7) + 4 + 4 + 2;
                                                    for (int i15 = 0; i15 < A015; i15++) {
                                                        r6.A01();
                                                        int i16 = r6.A01.A00[EnumC50372Ul.A00(r72.readByte() & 255).typeId];
                                                        r6.A04((long) i16);
                                                        i14 += i16 + 1 + 2;
                                                    }
                                                    int A016 = r6.A01();
                                                    int i17 = i14 + 2;
                                                    for (int i18 = 0; i18 < A016; i18++) {
                                                        r6.A02();
                                                        EnumC50372Ul A003 = EnumC50372Ul.A00(r72.readByte());
                                                        r6.A04((long) r6.A01.A00[A003.typeId]);
                                                        i17 += r6.A01.A00[A003.typeId] + ((C50362Uk) r6).A00 + 1;
                                                    }
                                                    int A017 = r6.A01();
                                                    EnumC50372Ul[] r82 = new EnumC50372Ul[A017];
                                                    i = i17 + 2;
                                                    for (int i19 = 0; i19 < A017; i19++) {
                                                        r6.A02();
                                                        r82[i19] = EnumC50372Ul.A00(r72.readByte() & 255);
                                                        i += ((C50362Uk) r6).A00 + 1;
                                                    }
                                                    C50342Ui r12 = new C50342Ui(A022, A023, r82);
                                                    r6.A00.A00.put(Long.valueOf(r12.A00), r12);
                                                }
                                                j = (long) i;
                                                break;
                                            case 33:
                                                if (!(this instanceof C57682kh)) {
                                                    A02();
                                                    AbstractC50392Un r0 = this.A02;
                                                    r0.readInt();
                                                    A02();
                                                    int readInt3 = r0.readInt();
                                                    A04((long) readInt3);
                                                    int i20 = this.A00;
                                                    i = i20 + 4 + i20 + 4 + readInt3;
                                                } else {
                                                    C57682kh r102 = (C57682kh) this;
                                                    r102.A02();
                                                    AbstractC50392Un r9 = r102.A02;
                                                    r9.readInt();
                                                    long A024 = r102.A02();
                                                    int readInt4 = r9.readInt();
                                                    C50352Uj r83 = r102.A00;
                                                    if (r83 != null) {
                                                        ArrayList arrayList = new ArrayList();
                                                        C50342Ui r13 = (C50342Ui) r83.A00.get(Long.valueOf(A024));
                                                        arrayList.add(r13);
                                                        while (r13.A01 != 0) {
                                                            r13 = (C50342Ui) r83.A00.get(Long.valueOf(r13.A01));
                                                            arrayList.add(r13);
                                                        }
                                                        Iterator it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            Iterator it2 = ((C50342Ui) it.next()).A02.iterator();
                                                            while (true) {
                                                                if (it2.hasNext()) {
                                                                    EnumC50372Ul r1 = (EnumC50372Ul) it2.next();
                                                                    if (r1 == EnumC50372Ul.OBJECT) {
                                                                        r102.A02();
                                                                    } else {
                                                                        C57692ki r73 = (C57692ki) r9;
                                                                        int i21 = r1.size;
                                                                        if (r73 != null) {
                                                                            r73.A00.AML(new byte[i21]);
                                                                            r73.A01.write(new byte[i21]);
                                                                        } else {
                                                                            throw null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int i22 = ((C50362Uk) r102).A00;
                                                        i = i22 + 4 + i22 + 4 + readInt4;
                                                    } else {
                                                        throw null;
                                                    }
                                                }
                                                j = (long) i;
                                                break;
                                            case 34:
                                                A02();
                                                r4.readInt();
                                                int readInt5 = r4.readInt();
                                                A02();
                                                int i23 = readInt5 * this.A00;
                                                A04((long) i23);
                                                int i24 = this.A00;
                                                j = (long) (i24 + 4 + 4 + i24 + i23);
                                                break;
                                            case 35:
                                                i = A00();
                                                j = (long) i;
                                                break;
                                            default:
                                                switch (readByte2) {
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                    case 140:
                                                    case 141:
                                                        break;
                                                    case 142:
                                                        A02();
                                                        r4.readInt();
                                                        r4.readInt();
                                                        i3 = this.A00;
                                                        i2 = i3 + 4;
                                                        break;
                                                    default:
                                                        StringBuilder A0T = AnonymousClass008.A0T("loadHeapDump loop with unknown tag ", readByte2, " with ");
                                                        A0T.append(r4.AMX());
                                                        A0T.append(" bytes possibly remaining");
                                                        throw new IllegalArgumentException(A0T.toString());
                                                }
                                                j = (long) i;
                                                break;
                                        }
                                }
                                readInt2 = j2 - j;
                            }
                            i = i2 + 4;
                            j = (long) i;
                            readInt2 = j2 - j;
                        } else {
                            System.err.println("+--- PRIMITIVE ARRAY NODATA DUMP");
                            A00();
                            throw new IllegalArgumentException("Don't know how to load a nodata array");
                        }
                    }
                    A04((long) this.A00);
                    i = this.A00;
                    j = (long) i;
                    readInt2 = j2 - j;
                }
                continue;
            } else {
                A04(readInt2);
            }
        }
    }

    public void A04(long j) {
        AbstractC50392Un r2 = this.A02;
        r2.AOq(r2.position() + j);
    }
}
