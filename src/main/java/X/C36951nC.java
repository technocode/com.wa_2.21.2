package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.1nC  reason: invalid class name and case insensitive filesystem */
public class C36951nC extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1EC();
    public CharSequence A00;
    public boolean A01;

    public C36951nC(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A01 = parcel.readInt() != 1 ? false : true;
    }

    public C36951nC(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("TextInputLayout.SavedState{");
        A0S.append(Integer.toHexString(System.identityHashCode(this)));
        A0S.append(" error=");
        A0S.append((Object) this.A00);
        A0S.append("}");
        return A0S.toString();
    }
}
