package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2PC  reason: invalid class name */
public class AnonymousClass2PC extends BroadcastReceiver {
    public final /* synthetic */ MediaPickerFragment A00;

    public AnonymousClass2PC(MediaPickerFragment mediaPickerFragment) {
        this.A00 = mediaPickerFragment;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1514214344:
                    if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_MOUNTED");
                        return;
                    }
                    return;
                case -1142424621:
                    if (action.equals("android.intent.action.MEDIA_SCANNER_FINISHED")) {
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED");
                        this.A00.A0v(false, false);
                        return;
                    }
                    return;
                case -963871873:
                    if (action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED");
                        this.A00.A0v(true, false);
                        return;
                    }
                    return;
                case -625887599:
                    if (action.equals("android.intent.action.MEDIA_EJECT")) {
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT");
                        this.A00.A0v(true, false);
                        return;
                    }
                    return;
                case 1412829408:
                    if (action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                        Log.i("mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                        this.A00.A0v(false, true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
