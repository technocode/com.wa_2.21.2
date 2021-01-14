package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.0qL  reason: invalid class name and case insensitive filesystem */
public class RemoteCallbackListC16740qL extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public RemoteCallbackListC16740qL(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public void onCallbackDied(IInterface iInterface, Object obj) {
        this.A00.A03.remove(Integer.valueOf(((Number) obj).intValue()));
    }
}
