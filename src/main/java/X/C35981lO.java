package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: X.1lO  reason: invalid class name and case insensitive filesystem */
public final class C35981lO extends AnonymousClass1AY implements IGoogleMapDelegate {
    public C35981lO(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final AnonymousClass1Ab A1p(C36011lR r3) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, r3);
        Parcel A01 = A01(11, A00);
        AnonymousClass1Ab A002 = AbstractBinderC35851l4.A00(A01.readStrongBinder());
        A01.recycle();
        return A002;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void A1x(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        A02(5, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void A1y(IObjectWrapper iObjectWrapper, AnonymousClass1BL r4) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        C24321Aa.A01(A00, r4);
        A02(6, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void A1z(IObjectWrapper iObjectWrapper, int i, AnonymousClass1BL r5) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        A00.writeInt(i);
        C24321Aa.A01(A00, r5);
        A02(7, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final CameraPosition A59() {
        Parcel A01 = A01(1, A00());
        CameraPosition cameraPosition = (CameraPosition) C24321Aa.A00(A01, CameraPosition.CREATOR);
        A01.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IProjectionDelegate A8Z() {
        IProjectionDelegate r1;
        Parcel A01 = A01(26, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof IProjectionDelegate) {
                r1 = (IProjectionDelegate) queryLocalInterface;
            } else {
                r1 = new C35951lL(readStrongBinder);
            }
        }
        A01.recycle();
        return r1;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IUiSettingsDelegate A9W() {
        IUiSettingsDelegate r1;
        Parcel A01 = A01(25, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof IUiSettingsDelegate) {
                r1 = (IUiSettingsDelegate) queryLocalInterface;
            } else {
                r1 = new C35961lM(readStrongBinder);
            }
        }
        A01.recycle();
        return r1;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean ABd() {
        Parcel A01 = A01(17, A00());
        boolean z = false;
        if (A01.readInt() != 0) {
            z = true;
        }
        A01.recycle();
        return z;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void ACA(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        A02(4, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AN1() {
        A02(94, A00());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean AON(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        Parcel A01 = A01(20, A00);
        boolean z2 = false;
        if (A01.readInt() != 0) {
            z2 = true;
        }
        A01.recycle();
        return z2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOO(AnonymousClass1BN r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(33, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean AOT(C36001lQ r4) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, r4);
        Parcel A01 = A01(91, A00);
        boolean z = false;
        if (A01.readInt() != 0) {
            z = true;
        }
        A01.recycle();
        return z;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOU(int i) {
        Parcel A00 = A00();
        A00.writeInt(i);
        A02(16, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOX(float f) {
        Parcel A00 = A00();
        A00.writeFloat(f);
        A02(93, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOc(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(22, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOe(AnonymousClass1BO r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(99, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOf(AnonymousClass1BP r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(96, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOg(AnonymousClass1BF r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(32, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOi(AnonymousClass1BG r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(28, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOj(AnonymousClass1BI r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(30, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AOl(int i, int i2, int i3, int i4) {
        Parcel A00 = A00();
        A00.writeInt(i);
        A00.writeInt(i2);
        A00.writeInt(i3);
        A00.writeInt(i4);
        A02(39, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void APF(boolean z) {
        Parcel A00 = A00();
        A00.writeInt(z ? 1 : 0);
        A02(18, A00);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void AQD() {
        A02(8, A00());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() {
        A02(14, A00());
    }
}
