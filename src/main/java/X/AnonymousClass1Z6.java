package X;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.app.INotificationSideChannel;

/* renamed from: X.1Z6  reason: invalid class name */
public class AnonymousClass1Z6 implements INotificationSideChannel {
    public IBinder A00;

    public AnonymousClass1Z6(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // android.support.v4.app.INotificationSideChannel
    public void A2Y(String str, int i, String str2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            this.A00.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.support.v4.app.INotificationSideChannel
    public void ACT(String str, int i, String str2, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.A00.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
