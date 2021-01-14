package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: X.1kq  reason: invalid class name and case insensitive filesystem */
public final class C35731kq implements IInterface, AnonymousClass1AA {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.analytics.internal.IAnalyticsService";

    public C35731kq(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.AnonymousClass1AA
    public final void AS2(Map map, long j, String str, List list) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
        obtain.writeMap(map);
        obtain.writeLong(j);
        obtain.writeString(str);
        obtain.writeTypedList(list);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
