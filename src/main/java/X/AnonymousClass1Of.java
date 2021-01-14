package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.VoiceNoteSeekBar;

/* renamed from: X.1Of  reason: invalid class name */
public class AnonymousClass1Of extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ VoiceNoteSeekBar A00;

    public AnonymousClass1Of(VoiceNoteSeekBar voiceNoteSeekBar) {
        this.A00 = voiceNoteSeekBar;
    }

    public void onLongPress(MotionEvent motionEvent) {
        VoiceNoteSeekBar voiceNoteSeekBar = this.A00;
        if (voiceNoteSeekBar.isLongClickable()) {
            voiceNoteSeekBar.performLongClick();
        }
    }
}
