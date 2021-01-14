package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1l5  reason: invalid class name and case insensitive filesystem */
public final class C35861l5 extends AnonymousClass1AY implements AnonymousClass1Ab {
    public C35861l5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // X.AnonymousClass1Ab
    public final LatLng A8S() {
        Parcel A01 = A01(4, A00());
        LatLng latLng = (LatLng) C24321Aa.A00(A01, LatLng.CREATOR);
        A01.recycle();
        return latLng;
    }

    @Override // X.AnonymousClass1Ab
    public final void AAR() {
        A02(12, A00());
    }

    @Override // X.AnonymousClass1Ab
    public final void AOr(LatLng latLng) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, latLng);
        A02(3, A00);
    }

    @Override // X.AnonymousClass1Ab
    public final void APD(String str) {
        Parcel A00 = A00();
        A00.writeString(str);
        A02(5, A00);
    }

    @Override // X.AnonymousClass1Ab
    public final void APL(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(14, A00);
    }

    @Override // X.AnonymousClass1Ab
    public final void APQ(float f) {
        Parcel A00 = A00();
        A00.writeFloat(f);
        A02(27, A00);
    }

    @Override // X.AnonymousClass1Ab
    public final void APn() {
        A02(11, A00());
    }

    @Override // X.AnonymousClass1Ab
    public final void ASH(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        A02(29, A00);
    }

    @Override // X.AnonymousClass1Ab
    public final void ASJ(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        A02(18, A00);
    }

    @Override // X.AnonymousClass1Ab
    public final int ASK() {
        Parcel A01 = A01(17, A00());
        int readInt = A01.readInt();
        A01.recycle();
        return readInt;
    }

    @Override // X.AnonymousClass1Ab
    public final boolean ASL(AnonymousClass1Ab r4) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r4);
        Parcel A01 = A01(16, A00);
        boolean z = false;
        if (A01.readInt() != 0) {
            z = true;
        }
        A01.recycle();
        return z;
    }

    @Override // X.AnonymousClass1Ab
    public final IObjectWrapper ASM() {
        Parcel A01 = A01(30, A00());
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // X.AnonymousClass1Ab
    public final String getId() {
        Parcel A01 = A01(2, A00());
        String readString = A01.readString();
        A01.recycle();
        return readString;
    }

    @Override // X.AnonymousClass1Ab
    public final boolean isVisible() {
        Parcel A01 = A01(15, A00());
        boolean z = false;
        if (A01.readInt() != 0) {
            z = true;
        }
        A01.recycle();
        return z;
    }
}
