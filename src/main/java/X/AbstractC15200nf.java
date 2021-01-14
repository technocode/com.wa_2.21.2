package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;

/* renamed from: X.0nf  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC15200nf implements Parcelable {
    public static final AbstractC15200nf A01 = new C30171as();
    public static final Parcelable.Creator CREATOR = new C15190ne();
    public final Parcelable A00;

    public int describeContents() {
        return 0;
    }

    public AbstractC15200nf() {
        this.A00 = null;
    }

    public AbstractC15200nf(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public AbstractC15200nf(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.os.Bundle[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: android.os.Parcelable[] */
    /* JADX WARN: Multi-variable type inference failed */
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (this instanceof C36951nC) {
            C36951nC r1 = (C36951nC) this;
            parcel.writeParcelable(((AbstractC15200nf) r1).A00, i);
            TextUtils.writeToParcel(r1.A00, parcel, i);
            parcel.writeInt(r1.A01 ? 1 : 0);
        } else if (this instanceof C36911n8) {
            C36911n8 r12 = (C36911n8) this;
            parcel.writeParcelable(((AbstractC15200nf) r12).A00, i);
            AnonymousClass05W r8 = r12.A00;
            int i3 = r8.A00;
            parcel.writeInt(i3);
            String[] strArr = new String[i3];
            Bundle[] bundleArr = new Bundle[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                Object[] objArr = r8.A02;
                int i5 = i4 << 1;
                strArr[i4] = objArr[i5];
                bundleArr[i4] = objArr[i5 + 1];
            }
            parcel.writeStringArray(strArr);
            parcel.writeTypedArray(bundleArr, 0);
        } else if (this instanceof C36711mk) {
            C36711mk r13 = (C36711mk) this;
            parcel.writeParcelable(((AbstractC15200nf) r13).A00, i);
            parcel.writeInt(r13.A00);
        } else if (this instanceof C36661mb) {
            C36661mb r14 = (C36661mb) this;
            parcel.writeParcelable(((AbstractC15200nf) r14).A00, i);
            parcel.writeInt(r14.A01);
            parcel.writeFloat(r14.A00);
            parcel.writeByte(r14.A02 ? (byte) 1 : 0);
        } else if (this instanceof C30941cF) {
            C30941cF r15 = (C30941cF) this;
            parcel.writeParcelable(((AbstractC15200nf) r15).A00, i);
            parcel.writeInt(r15.A00);
            parcel.writeParcelable(r15.A01, i);
        } else if (this instanceof C30621be) {
            C30621be r16 = (C30621be) this;
            parcel.writeParcelable(((AbstractC15200nf) r16).A00, i);
            parcel.writeParcelable(r16.A00, 0);
        } else if (this instanceof C29881aM) {
            C29881aM r5 = (C29881aM) this;
            parcel.writeParcelable(((AbstractC15200nf) r5).A00, i);
            SparseArray sparseArray = r5.A00;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i6 = 0; i6 < i2; i6++) {
                iArr[i6] = r5.A00.keyAt(i6);
                parcelableArr[i6] = r5.A00.valueAt(i6);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        } else if (this instanceof C29681Zz) {
            C29681Zz r17 = (C29681Zz) this;
            parcel.writeParcelable(((AbstractC15200nf) r17).A00, i);
            parcel.writeInt(r17.A00);
            parcel.writeInt(r17.A01 ? 1 : 0);
        } else if (!(this instanceof C29661Zx)) {
            parcel.writeParcelable(this.A00, i);
        } else {
            C29661Zx r18 = (C29661Zx) this;
            parcel.writeParcelable(((AbstractC15200nf) r18).A00, i);
            parcel.writeValue(Boolean.valueOf(r18.A00));
        }
    }
}
