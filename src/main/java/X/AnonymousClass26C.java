package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.26C  reason: invalid class name */
public class AnonymousClass26C extends AbstractC35391kG {
    public static final Parcelable.Creator CREATOR = new C239518f();
    public int A00;
    public int A01;
    public final int A02;
    public final int A03 = 2;
    public final Parcel A04;
    public final C35401kH A05;
    public final String A06;

    public AnonymousClass26C(int i, Parcel parcel, C35401kH r5) {
        this.A02 = i;
        C001801b.A1Q(parcel);
        this.A04 = parcel;
        this.A05 = r5;
        if (r5 != null) {
            this.A06 = r5.A01;
        }
        this.A00 = 2;
    }

    public static BigDecimal A02(Parcel parcel, int i) {
        int A042 = AnonymousClass05S.A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A042 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + A042);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static void A03(StringBuilder sb, int i, Object obj) {
        String encodeToString;
        String encodeToString2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C240118m.A00(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    encodeToString = null;
                } else {
                    encodeToString = Base64.encodeToString(bArr, 0);
                }
                sb.append(encodeToString);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 == null) {
                    encodeToString2 = null;
                } else {
                    encodeToString2 = Base64.encodeToString(bArr2, 10);
                }
                sb.append(encodeToString2);
                sb.append("\"");
                return;
            case 10:
                C008805h.A1H(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(AnonymousClass008.A08(26, "Unknown type = ", i));
        }
    }

    public static final void A04(StringBuilder sb, C35381kF r5, Object obj) {
        if (r5.A09) {
            AbstractList abstractList = (AbstractList) obj;
            sb.append("[");
            int size = abstractList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                A03(sb, r5.A03, abstractList.get(i));
            }
            sb.append("]");
            return;
        }
        A03(sb, r5.A03, obj);
    }

    public final void A05(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        String encodeToString;
        String encodeToString2;
        Parcel obtain;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((C35381kF) entry.getValue()).A05, entry);
        }
        sb.append('{');
        int A022 = AnonymousClass05S.A02(parcel);
        boolean z = false;
        while (parcel.dataPosition() < A022) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(65535 & readInt);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                C35381kF r6 = (C35381kF) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (r6.A00 != null) {
                    int i = r6.A04;
                    switch (i) {
                        case 0:
                            A04(sb, r6, AbstractC239018a.A00(r6, Integer.valueOf(AnonymousClass05S.A03(parcel, readInt))));
                            break;
                        case 1:
                            int A042 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (A042 == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + A042);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            A04(sb, r6, AbstractC239018a.A00(r6, bigInteger2));
                            break;
                        case 2:
                            A04(sb, r6, AbstractC239018a.A00(r6, Long.valueOf(AnonymousClass05S.A05(parcel, readInt))));
                            break;
                        case 3:
                            A04(sb, r6, AbstractC239018a.A00(r6, Float.valueOf(AnonymousClass05S.A01(parcel, readInt))));
                            break;
                        case 4:
                            AnonymousClass05S.A0E(parcel, readInt, 8);
                            A04(sb, r6, AbstractC239018a.A00(r6, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            A04(sb, r6, AbstractC239018a.A00(r6, A02(parcel, readInt)));
                            break;
                        case 6:
                            A04(sb, r6, AbstractC239018a.A00(r6, Boolean.valueOf(AnonymousClass05S.A0G(parcel, readInt))));
                            break;
                        case 7:
                            A04(sb, r6, AbstractC239018a.A00(r6, AnonymousClass05S.A09(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            A04(sb, r6, AbstractC239018a.A00(r6, AnonymousClass05S.A0I(parcel, readInt)));
                            break;
                        case 10:
                            Bundle A062 = AnonymousClass05S.A06(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str : A062.keySet()) {
                                hashMap.put(str, A062.getString(str));
                            }
                            A04(sb, r6, AbstractC239018a.A00(r6, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(AnonymousClass008.A08(36, "Unknown field out type = ", i));
                    }
                } else if (r6.A0A) {
                    sb.append("[");
                    BigInteger[] bigIntegerArr = null;
                    BigDecimal[] bigDecimalArr = null;
                    Parcel[] parcelArr = null;
                    String[] strArr = null;
                    boolean[] zArr = null;
                    double[] dArr = null;
                    float[] fArr = null;
                    long[] jArr = null;
                    int[] iArr = null;
                    switch (r6.A04) {
                        case 0:
                            int A043 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (A043 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + A043);
                            }
                            int length = iArr.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Integer.toString(iArr[i2]));
                            }
                            break;
                        case 1:
                            int A044 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (A044 != 0) {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition3 + A044);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i4].toString());
                            }
                            break;
                        case 2:
                            int A045 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (A045 != 0) {
                                jArr = parcel.createLongArray();
                                parcel.setDataPosition(dataPosition4 + A045);
                            }
                            int length3 = jArr.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Long.toString(jArr[i5]));
                            }
                            break;
                        case 3:
                            int A046 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (A046 != 0) {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition5 + A046);
                            }
                            int length4 = fArr.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Float.toString(fArr[i6]));
                            }
                            break;
                        case 4:
                            int A047 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (A047 != 0) {
                                dArr = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition6 + A047);
                            }
                            int length5 = dArr.length;
                            for (int i7 = 0; i7 < length5; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Double.toString(dArr[i7]));
                            }
                            break;
                        case 5:
                            int A048 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (A048 != 0) {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i8 = 0; i8 < readInt3; i8++) {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    bigDecimalArr[i8] = new BigDecimal(new BigInteger(createByteArray2), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition7 + A048);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i9].toString());
                            }
                            break;
                        case 6:
                            int A049 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition8 = parcel.dataPosition();
                            if (A049 != 0) {
                                zArr = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition8 + A049);
                            }
                            int length7 = zArr.length;
                            for (int i10 = 0; i10 < length7; i10++) {
                                if (i10 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Boolean.toString(zArr[i10]));
                            }
                            break;
                        case 7:
                            int A0410 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition9 = parcel.dataPosition();
                            if (A0410 != 0) {
                                strArr = parcel.createStringArray();
                                parcel.setDataPosition(dataPosition9 + A0410);
                            }
                            int length8 = strArr.length;
                            for (int i11 = 0; i11 < length8; i11++) {
                                if (i11 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArr[i11]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int A0411 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (A0411 != 0) {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i12 = 0; i12 < readInt4; i12++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition11 = parcel.dataPosition();
                                        Parcel obtain2 = Parcel.obtain();
                                        obtain2.appendFrom(parcel, dataPosition11, readInt5);
                                        parcelArr2[i12] = obtain2;
                                        parcel.setDataPosition(dataPosition11 + readInt5);
                                    } else {
                                        parcelArr2[i12] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition10 + A0411);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i13 = 0; i13 < length9; i13++) {
                                if (i13 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i13].setDataPosition(0);
                                String str2 = r6.A08;
                                C001801b.A1Q(str2);
                                C35401kH r0 = r6.A01;
                                C001801b.A1Q(r0);
                                A05(sb, (Map) r0.A02.get(str2), parcelArr[i13]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (r6.A04) {
                        case 0:
                            sb.append(AnonymousClass05S.A03(parcel, readInt));
                            break;
                        case 1:
                            int A0412 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition12 = parcel.dataPosition();
                            if (A0412 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] createByteArray3 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition12 + A0412);
                                bigInteger = new BigInteger(createByteArray3);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(AnonymousClass05S.A05(parcel, readInt));
                            break;
                        case 3:
                            sb.append(AnonymousClass05S.A01(parcel, readInt));
                            break;
                        case 4:
                            AnonymousClass05S.A0E(parcel, readInt, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(A02(parcel, readInt));
                            break;
                        case 6:
                            sb.append(AnonymousClass05S.A0G(parcel, readInt));
                            break;
                        case 7:
                            String A09 = AnonymousClass05S.A09(parcel, readInt);
                            sb.append("\"");
                            sb.append(C240118m.A00(A09));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] A0I = AnonymousClass05S.A0I(parcel, readInt);
                            sb.append("\"");
                            if (A0I == null) {
                                encodeToString = null;
                            } else {
                                encodeToString = Base64.encodeToString(A0I, 0);
                            }
                            sb.append(encodeToString);
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] A0I2 = AnonymousClass05S.A0I(parcel, readInt);
                            sb.append("\"");
                            if (A0I2 == null) {
                                encodeToString2 = null;
                            } else {
                                encodeToString2 = Base64.encodeToString(A0I2, 10);
                            }
                            sb.append(encodeToString2);
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle A063 = AnonymousClass05S.A06(parcel, readInt);
                            Set<String> keySet = A063.keySet();
                            keySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                AnonymousClass008.A1Y(sb, "\"", str3, "\"", ":");
                                sb.append("\"");
                                sb.append(C240118m.A00(A063.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int A0413 = AnonymousClass05S.A04(parcel, readInt);
                            int dataPosition13 = parcel.dataPosition();
                            if (A0413 == 0) {
                                obtain = null;
                            } else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition13, A0413);
                                parcel.setDataPosition(dataPosition13 + A0413);
                            }
                            obtain.setDataPosition(0);
                            String str4 = r6.A08;
                            C001801b.A1Q(str4);
                            C35401kH r02 = r6.A01;
                            C001801b.A1Q(r02);
                            A05(sb, (Map) r02.A02.get(str4), obtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == A022) {
            sb.append('}');
            return;
        }
        throw new AnonymousClass18H(AnonymousClass008.A08(37, "Overread allowed size end=", A022), parcel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 != 1) goto L_0x000e;
     */
    @Override // X.AbstractC239018a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            X.1kH r4 = r5.A05
            java.lang.String r0 = "Cannot convert to JSON on client side."
            X.C001801b.A1R(r4, r0)
            int r1 = r5.A00
            if (r1 == 0) goto L_0x002d
            r0 = 1
            if (r1 == r0) goto L_0x0037
        L_0x000e:
            android.os.Parcel r3 = r5.A04
            r0 = 0
            r3.setDataPosition(r0)
            r0 = 100
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r1 = r5.A06
            java.util.HashMap r0 = r4.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            r5.A05(r2, r0, r3)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x002d:
            android.os.Parcel r1 = r5.A04
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = X.C008805h.A03(r1, r0)
            r5.A01 = r0
        L_0x0037:
            android.os.Parcel r1 = r5.A04
            int r0 = r5.A01
            X.C008805h.A0r(r1, r0)
            r0 = 2
            r5.A00 = r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26C.toString():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        if (r0 != 1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r2 = 20293(0x4f45, float:2.8437E-41)
            int r4 = X.C008805h.A03(r6, r2)
            int r0 = r5.A02
            r1 = 1
            X.C008805h.A0u(r6, r1, r0)
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0030
            if (r0 == r1) goto L_0x0038
        L_0x0012:
            android.os.Parcel r3 = r5.A04
            r2 = 0
            r0 = 2
            if (r3 == 0) goto L_0x0026
            int r1 = X.C008805h.A03(r6, r0)
            int r0 = r3.dataSize()
            r6.appendFrom(r3, r2, r0)
            X.C008805h.A0r(r6, r1)
        L_0x0026:
            r1 = 3
            X.1kH r0 = r5.A05
            X.C008805h.A0z(r6, r1, r0, r7, r2)
            X.C008805h.A0r(r6, r4)
            return
        L_0x0030:
            android.os.Parcel r0 = r5.A04
            int r0 = X.C008805h.A03(r0, r2)
            r5.A01 = r0
        L_0x0038:
            android.os.Parcel r1 = r5.A04
            int r0 = r5.A01
            X.C008805h.A0r(r1, r0)
            r0 = 2
            r5.A00 = r0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26C.writeToParcel(android.os.Parcel, int):void");
    }
}
