package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.conversation.ConversationVideoPictureInPictureActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2HY  reason: invalid class name */
public class AnonymousClass2HY extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ConversationVideoPictureInPictureActivity A00;

    public AnonymousClass2HY(ConversationVideoPictureInPictureActivity conversationVideoPictureInPictureActivity) {
        this.A00 = conversationVideoPictureInPictureActivity;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent.getY() - motionEvent2.getY() >= 0.0f) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        Log.i("SwipeDownListener/onFling/enter-pip");
        this.A00.A0D();
        return true;
    }
}
