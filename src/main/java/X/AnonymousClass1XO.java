package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1XO  reason: invalid class name */
public class AnonymousClass1XO implements Parcelable {
    public static final AnonymousClass1XO A04;
    public static final AnonymousClass1XO A05;
    public static final AnonymousClass1XO A06;
    public static final AnonymousClass1XO A07;
    public static final AnonymousClass1XO A08;
    public static final AnonymousClass1XO A09;
    public static final AnonymousClass1XO A0A;
    public static final AnonymousClass1XO A0B;
    public static final AnonymousClass1XO A0C;
    public static final AnonymousClass1XO A0D;
    public static final AnonymousClass1XO A0E;
    public static final AnonymousClass1XO A0F;
    public static final AnonymousClass1XO A0G;
    public static final AnonymousClass1XO A0H;
    public static final AnonymousClass1XO A0I;
    public static final AnonymousClass1XO A0J;
    public static final AnonymousClass1XO A0K;
    public static final AnonymousClass1XO A0L;
    public static final AnonymousClass1XO A0M;
    public static final AnonymousClass1XO A0N;
    public static final AnonymousClass1XO A0O;
    public static final AnonymousClass1XO A0P;
    public static final AnonymousClass1XO A0Q;
    public static final byte[] A0R;
    public static final byte[] A0S;
    public static final byte[] A0T;
    public static final byte[] A0U;
    public static final byte[] A0V;
    public static final byte[] A0W;
    public static final byte[] A0X;
    public static final byte[] A0Y = "walibra_hkdf_info".getBytes();
    public static final byte[] A0Z;
    public static final byte[] A0a;
    public static final Parcelable.Creator CREATOR = new C64252xs();
    public final byte A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    static {
        byte[] bytes = "WhatsApp Audio Keys".getBytes();
        A0R = bytes;
        byte[] bytes2 = "WhatsApp Image Keys".getBytes();
        A0U = bytes2;
        byte[] bytes3 = "WhatsApp Image Thumbnail Keys".getBytes();
        A0V = bytes3;
        byte[] bytes4 = "WhatsApp Video Keys".getBytes();
        A0Z = bytes4;
        byte[] bytes5 = "WhatsApp Video Thumbnail Keys".getBytes();
        A0a = bytes5;
        byte[] bytes6 = "WhatsApp Document Keys".getBytes();
        A0S = bytes6;
        byte[] bytes7 = "WhatsApp Document Thumbnail Keys".getBytes();
        A0T = bytes7;
        byte[] bytes8 = "WhatsApp App State Keys".getBytes();
        A0W = bytes8;
        byte[] bytes9 = "WhatsApp History Keys".getBytes();
        A0X = bytes9;
        A05 = new AnonymousClass1XO((byte) 2, bytes, "audio", "AUD");
        A0D = new AnonymousClass1XO((byte) 2, bytes, "ptt", "PTT");
        A0A = new AnonymousClass1XO((byte) 1, bytes2, "image", "IMG");
        A0B = new AnonymousClass1XO((byte) 1, bytes3, "thumbnail-image");
        A0P = new AnonymousClass1XO((byte) 42, bytes2, "image", "IMG");
        A0H = new AnonymousClass1XO((byte) 23, bytes2, "image", "IMG");
        A06 = new AnonymousClass1XO((byte) 37, bytes2, "image", "IMG");
        A0G = new AnonymousClass1XO((byte) 44, bytes2, "image", "IMG");
        A0I = new AnonymousClass1XO((byte) 20, bytes2, "sticker", "STK");
        A0L = new AnonymousClass1XO((byte) 25, bytes2, "image");
        A0C = new AnonymousClass1XO((byte) 1, bytes2, "kyc-id", null);
        A0N = new AnonymousClass1XO((byte) 3, bytes4, "video", "VID");
        A0O = new AnonymousClass1XO((byte) 3, bytes5, "thumbnail-video");
        A0Q = new AnonymousClass1XO((byte) 43, bytes4, "video", "VID");
        A04 = new AnonymousClass1XO((byte) 13, bytes4, "gif", "VID");
        A09 = new AnonymousClass1XO((byte) 13, bytes5, "gif");
        A0M = new AnonymousClass1XO((byte) 28, bytes4, "video");
        A0K = new AnonymousClass1XO((byte) 29, bytes4, "gif");
        A07 = new AnonymousClass1XO((byte) 9, bytes6, "document", "DOC");
        A0J = new AnonymousClass1XO((byte) 26, bytes6, "document");
        A08 = new AnonymousClass1XO((byte) 9, bytes7, "thumbnail-document");
        A0E = new AnonymousClass1XO((byte) 51, bytes8, "md-app-state");
        A0F = new AnonymousClass1XO((byte) 35, bytes9, "md-msg-hist");
    }

    public AnonymousClass1XO(byte b, byte[] bArr, String str) {
        this.A00 = b;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = null;
    }

    public AnonymousClass1XO(byte b, byte[] bArr, String str, String str2) {
        this.A00 = b;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = str2;
    }

    public static AnonymousClass1XO A00(byte b) {
        if (b == 1) {
            return A0B;
        }
        if (b == 3) {
            return A0O;
        }
        if (b == 9) {
            return A08;
        }
        if (b == 13) {
            return A09;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("media-file-type: The media type is not supported: type=", b));
    }

    public static AnonymousClass1XO A01(byte b, int i) {
        if (b == 1) {
            return i == 6 ? A0C : A0A;
        }
        if (b == 2) {
            return i == 1 ? A0D : A05;
        }
        if (b == 3) {
            return A0N;
        }
        if (b == 9) {
            return A07;
        }
        if (b == 13) {
            return A04;
        }
        if (b == 20) {
            return A0I;
        }
        if (b == 23) {
            return A0H;
        }
        if (b == 35) {
            return A0F;
        }
        if (b == 37) {
            return A06;
        }
        if (b == 51) {
            return A0E;
        }
        if (b == 25) {
            return A0L;
        }
        if (b == 26) {
            return A0J;
        }
        if (b == 28) {
            return A0M;
        }
        if (b == 29) {
            return A0K;
        }
        switch (b) {
            case 42:
                return A0P;
            case 43:
                return A0Q;
            case 44:
                return A0G;
            default:
                throw new IllegalArgumentException(AnonymousClass008.A0H("media-file-type: The media type is not supported: type=", b, ", mediaOrigin=", i));
        }
    }

    public static AnonymousClass1XO A02(AbstractC007503q r2) {
        return A01(r2.A0m, r2.A04);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.A00)});
    }

    public String toString() {
        int i;
        StringBuilder A0S2 = AnonymousClass008.A0S("MmsType{type=");
        A0S2.append((int) this.A00);
        A0S2.append(", origin=");
        if (this == A0D) {
            i = 1;
        } else {
            i = 0;
            if (this == A0C) {
                i = 6;
            }
        }
        A0S2.append(i);
        A0S2.append(", fileType=");
        A0S2.append(this.A02);
        A0S2.append('}');
        return A0S2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByte(this.A00);
        if (this == A0D) {
            i2 = 1;
        } else {
            i2 = 0;
            if (this == A0C) {
                i2 = 6;
            }
        }
        parcel.writeInt(i2);
    }
}
