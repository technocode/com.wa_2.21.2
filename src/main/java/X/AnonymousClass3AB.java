package X;

import android.os.HandlerThread;
import com.whatsapp.util.Log;

/* renamed from: X.3AB  reason: invalid class name */
public class AnonymousClass3AB extends HandlerThread {
    public AnonymousClass3AB() {
        super("VoipCameraThread");
    }

    public void run() {
        Log.i("voip/video/VoipCamera/CameraThread Start");
        super.run();
        Log.i("voip/video/VoipCamera/CameraThread Exit");
    }
}
