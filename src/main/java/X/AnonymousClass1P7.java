package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1P7  reason: invalid class name */
public final class AnonymousClass1P7 extends Handler {
    public final C014708f A00;
    public final WeakReference A01;

    public AnonymousClass1P7(C014708f r2, DeleteAccountConfirmation deleteAccountConfirmation) {
        super(Looper.getMainLooper());
        this.A00 = r2;
        this.A01 = new WeakReference(deleteAccountConfirmation);
    }

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            Log.w("delete account confirmation was garbage collected with messages still enqueued");
        } else if (message.what == 0) {
            Log.i("deleteacctconfirm/timeout/expired");
            C002001d.A2N(activity, 1);
            if (this.A00.A01() == 0) {
                Log.d("deleteacctconfirm/go-to-eula");
                return;
            }
            Log.w("deleteacctconfirm/dialog-delete-failed");
            C002001d.A2O(activity, 3);
        }
    }
}
