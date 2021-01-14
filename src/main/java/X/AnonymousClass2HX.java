package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.conversation.ConversationVideoPictureInPictureActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2HX  reason: invalid class name */
public class AnonymousClass2HX extends BroadcastReceiver {
    public final WeakReference A00;

    public AnonymousClass2HX(ConversationVideoPictureInPictureActivity conversationVideoPictureInPictureActivity) {
        this.A00 = new WeakReference(conversationVideoPictureInPictureActivity);
    }

    public void onReceive(Context context, Intent intent) {
        ConversationVideoPictureInPictureActivity conversationVideoPictureInPictureActivity = (ConversationVideoPictureInPictureActivity) this.A00.get();
        if (conversationVideoPictureInPictureActivity != null) {
            if ("media_control".equals(intent.getAction())) {
                if (intent.getIntExtra("control_type", 0) == 0) {
                    Log.i("ConversationVideoPictureInPictureActivity/remoteActionsReceiver/play-clicked");
                    AnonymousClass37D r1 = conversationVideoPictureInPictureActivity.A06;
                    if (r1 != null) {
                        Log.i("PictureInPictureVideoPlaybackHandler/onPipPlayButtonClicked");
                        r1.A03();
                        return;
                    }
                    throw null;
                }
                Log.i("ConversationVideoPictureInPictureActivity/remoteActionsReceiver/pause-clicked");
                conversationVideoPictureInPictureActivity.A06.A02();
            } else if ("finish_pip".equals(intent.getAction()) && conversationVideoPictureInPictureActivity.isInPictureInPictureMode()) {
                Log.i("ConversationVideoPictureInPictureActivity/finishActivityReceiver/finish-pip");
                conversationVideoPictureInPictureActivity.finish();
            }
        }
    }
}
