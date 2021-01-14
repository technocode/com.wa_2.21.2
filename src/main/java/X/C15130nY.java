package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.0nY  reason: invalid class name and case insensitive filesystem */
public class C15130nY extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C15120nX();
    public int A00;

    public C15130nY(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public C15130nY(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("HorizontalScrollView.SavedState{");
        A0S.append(Integer.toHexString(System.identityHashCode(this)));
        A0S.append(" scrollPosition=");
        return AnonymousClass008.A0N(A0S, this.A00, "}");
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
