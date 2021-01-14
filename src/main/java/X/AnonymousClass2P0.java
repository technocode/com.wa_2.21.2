package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2P0  reason: invalid class name */
public class AnonymousClass2P0 extends BroadcastReceiver {
    public final /* synthetic */ GalleryPickerFragment A00;

    public AnonymousClass2P0(GalleryPickerFragment galleryPickerFragment) {
        this.A00 = galleryPickerFragment;
    }

    public void onReceive(Context context, Intent intent) {
        GalleryPickerFragment galleryPickerFragment = this.A00;
        if (galleryPickerFragment != null) {
            String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1514214344:
                        if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_MOUNTED");
                            return;
                        }
                        return;
                    case -1142424621:
                        if (action.equals("android.intent.action.MEDIA_SCANNER_FINISHED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED");
                            galleryPickerFragment.A0p(false, false);
                            return;
                        }
                        return;
                    case -963871873:
                        if (action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED");
                            galleryPickerFragment.A0p(true, false);
                            return;
                        }
                        return;
                    case -625887599:
                        if (action.equals("android.intent.action.MEDIA_EJECT")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_EJECT");
                            galleryPickerFragment.A0p(true, false);
                            return;
                        }
                        return;
                    case 1412829408:
                        if (action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                            galleryPickerFragment.A0p(false, true);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            throw null;
        }
    }
}
