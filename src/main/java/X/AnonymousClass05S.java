package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.05S  reason: invalid class name */
public final class AnonymousClass05S {
    public static boolean A0H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static byte A00(Parcel parcel, int i) {
        A0E(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float A01(Parcel parcel, int i) {
        A0E(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int A02(Parcel parcel) {
        int readInt = parcel.readInt();
        int A04 = A04(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new AnonymousClass18H(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = A04 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new AnonymousClass18H(sb.toString(), parcel);
    }

    public static int A03(Parcel parcel, int i) {
        A0E(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A04(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static long A05(Parcel parcel, int i) {
        A0E(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle A06(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A04);
        return readBundle;
    }

    public static IBinder A07(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A04);
        return readStrongBinder;
    }

    public static Parcelable A08(Parcel parcel, int i, Parcelable.Creator creator) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A04);
        return parcelable;
    }

    public static String A09(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A04);
        return readString;
    }

    public static ArrayList A0A(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A04);
        return createStringArrayList;
    }

    public static ArrayList A0B(Parcel parcel, int i, Parcelable.Creator creator) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A04);
        return createTypedArrayList;
    }

    public static void A0C(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new AnonymousClass18H(AnonymousClass008.A08(37, "Overread allowed size end=", i), parcel);
        }
    }

    public static void A0D(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A04(parcel, i));
    }

    public static void A0E(Parcel parcel, int i, int i2) {
        int A04 = A04(parcel, i);
        if (A04 != i2) {
            String hexString = Integer.toHexString(A04);
            StringBuilder sb = new StringBuilder(AnonymousClass008.A00(hexString, 46));
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(A04);
            throw new AnonymousClass18H(AnonymousClass008.A0P(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static void A0F(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(AnonymousClass008.A00(hexString, 46));
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            throw new AnonymousClass18H(AnonymousClass008.A0P(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static boolean A0G(Parcel parcel, int i) {
        A0E(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] A0I(Parcel parcel, int i) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A04);
        return createByteArray;
    }

    public static Object[] A0J(Parcel parcel, int i, Parcelable.Creator creator) {
        int A04 = A04(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A04 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A04);
        return createTypedArray;
    }
}
