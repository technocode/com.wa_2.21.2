package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1kU  reason: invalid class name and case insensitive filesystem */
public final class C35521kU extends C241919h implements AnonymousClass199 {
    public C35521kU(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // X.AnonymousClass199
    public final int ARg(IObjectWrapper iObjectWrapper, String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass19i.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(z ? 1 : 0);
        Parcel A00 = A00(3, obtain);
        int readInt = A00.readInt();
        A00.recycle();
        return readInt;
    }

    @Override // X.AnonymousClass199
    public final IObjectWrapper ARm(IObjectWrapper iObjectWrapper, String str, int i) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass19i.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        Parcel A00 = A00(2, obtain);
        IObjectWrapper A01 = BinderC04810Lw.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }

    @Override // X.AnonymousClass199
    public final int AS4() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        Parcel A00 = A00(6, obtain);
        int readInt = A00.readInt();
        A00.recycle();
        return readInt;
    }

    @Override // X.AnonymousClass199
    public final int AS5(IObjectWrapper iObjectWrapper, String str, boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass19i.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(z ? 1 : 0);
        Parcel A00 = A00(5, obtain);
        int readInt = A00.readInt();
        A00.recycle();
        return readInt;
    }

    @Override // X.AnonymousClass199
    public final IObjectWrapper AS7(IObjectWrapper iObjectWrapper, String str, int i) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass19i.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        Parcel A00 = A00(4, obtain);
        IObjectWrapper A01 = BinderC04810Lw.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }
}
