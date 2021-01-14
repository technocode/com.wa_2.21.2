package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* renamed from: X.247  reason: invalid class name */
public class AnonymousClass247 extends Binder implements IMultiInstanceInvalidationService {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public IBinder asBinder() {
        return this;
    }

    public AnonymousClass247(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public void A2M(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            HashMap hashMap = multiInstanceInvalidationService.A03;
            String str = (String) hashMap.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    int intValue = ((Integer) remoteCallbackList.getBroadcastCookie(i2)).intValue();
                    String str2 = (String) hashMap.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((IMultiInstanceInvalidationCallback) remoteCallbackList.getBroadcastItem(i2)).AGp(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } catch (Throwable th) {
                    remoteCallbackList.finishBroadcast();
                    throw th;
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public int AMR(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
        RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
        synchronized (remoteCallbackList) {
            int i = multiInstanceInvalidationService.A00 + 1;
            multiInstanceInvalidationService.A00 = i;
            Integer valueOf = Integer.valueOf(i);
            if (remoteCallbackList.register(iMultiInstanceInvalidationCallback, valueOf)) {
                multiInstanceInvalidationService.A03.put(valueOf, str);
                return i;
            }
            multiInstanceInvalidationService.A00--;
            return 0;
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IMultiInstanceInvalidationCallback r1;
        IInterface r12;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                r1 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                    r1 = new C30691bl(readStrongBinder);
                } else {
                    r1 = (IMultiInstanceInvalidationCallback) queryLocalInterface;
                }
            }
            int AMR = AMR(r1, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(AMR);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 == null) {
                r12 = null;
            } else {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                    r12 = new C30691bl(readStrongBinder2);
                } else {
                    r12 = (IMultiInstanceInvalidationCallback) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.A00;
            RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.A01;
            synchronized (remoteCallbackList) {
                remoteCallbackList.unregister(r12);
                multiInstanceInvalidationService.A03.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            A2M(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
