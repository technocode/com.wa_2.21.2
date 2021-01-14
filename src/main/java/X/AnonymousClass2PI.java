package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.2PI  reason: invalid class name */
public class AnonymousClass2PI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2PH();
    public final AnonymousClass2PG A00;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2PI(AnonymousClass2PG r1) {
        this.A00 = r1;
    }

    public AnonymousClass2PI(Parcel parcel) {
        Byte b;
        File file;
        Parcelable readParcelable = parcel.readParcelable(Uri.class.getClassLoader());
        if (readParcelable != null) {
            AnonymousClass2PG r1 = new AnonymousClass2PG((Uri) readParcelable);
            this.A00 = r1;
            File file2 = null;
            boolean z = true;
            if (parcel.readByte() == 1) {
                b = Byte.valueOf(parcel.readByte());
            } else {
                b = null;
            }
            r1.A09(b);
            String readString = parcel.readString();
            AnonymousClass2PG r12 = this.A00;
            if (readString == null) {
                file = null;
            } else {
                file = new File(readString);
            }
            synchronized (r12) {
                r12.A06 = file;
            }
            this.A00.A0A(parcel.readString());
            this.A00.A0B(parcel.readString());
            AnonymousClass2PG r13 = this.A00;
            String readString2 = parcel.readString();
            synchronized (r13) {
                r13.A09 = readString2;
            }
            AnonymousClass2PG r14 = this.A00;
            String readString3 = parcel.readString();
            synchronized (r14) {
                r14.A0A = readString3;
            }
            AnonymousClass2PG r15 = this.A00;
            int readInt = parcel.readInt();
            synchronized (r15) {
                r15.A01 = readInt;
            }
            String readString4 = parcel.readString();
            AnonymousClass2PG r16 = this.A00;
            file2 = readString4 != null ? new File(readString4) : file2;
            synchronized (r16) {
                r16.A05 = file2;
            }
            AnonymousClass2PG r17 = this.A00;
            Rect rect = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            synchronized (r17) {
                r17.A03 = rect;
            }
            AnonymousClass2PG r18 = this.A00;
            z = parcel.readByte() != 1 ? false : z;
            synchronized (r18) {
                r18.A0E = z;
            }
            AnonymousClass2PG r19 = this.A00;
            Point point = (Point) parcel.readParcelable(Point.class.getClassLoader());
            synchronized (r19) {
                r19.A02 = point;
            }
            AnonymousClass2PG r110 = this.A00;
            int readInt2 = parcel.readInt();
            synchronized (r110) {
                r110.A00 = readInt2;
            }
            return;
        }
        throw null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String absolutePath;
        String str;
        Rect rect;
        int i2;
        AnonymousClass2PG r1 = this.A00;
        parcel.writeParcelable(r1.A0F, i);
        Byte A05 = r1.A05();
        if (A05 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByte(A05.byteValue());
        }
        String str2 = null;
        if (r1.A04() == null) {
            absolutePath = null;
        } else {
            absolutePath = r1.A04().getAbsolutePath();
        }
        parcel.writeString(absolutePath);
        parcel.writeString(r1.A06());
        parcel.writeString(r1.A08());
        parcel.writeString(r1.A07());
        synchronized (r1) {
            str = r1.A0A;
        }
        parcel.writeString(str);
        parcel.writeInt(r1.A00());
        if (r1.A02() != null) {
            str2 = r1.A02().getAbsolutePath();
        }
        parcel.writeString(str2);
        synchronized (r1) {
            rect = r1.A03;
        }
        parcel.writeParcelable(rect, i);
        parcel.writeByte(r1.A0C() ? (byte) 1 : 0);
        parcel.writeParcelable(r1.A01(), i);
        synchronized (r1) {
            i2 = r1.A00;
        }
        parcel.writeInt(i2);
    }
}
