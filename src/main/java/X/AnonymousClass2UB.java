package X;

import android.os.Handler;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VoiceNoteSeekBar;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2UB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UB implements Handler.Callback {
    public final /* synthetic */ MediaViewFragment A00;

    public /* synthetic */ AnonymousClass2UB(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public final boolean handleMessage(Message message) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment.A0M != null) {
            if (mediaViewFragment.A01 == 1) {
                if (mediaViewFragment.A0C.getMax() > 0) {
                    int min = Math.min(mediaViewFragment.A0M.A01(), mediaViewFragment.A0C.getMax());
                    int i = mediaViewFragment.A00 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                    int i2 = min / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                    if (i != i2) {
                        mediaViewFragment.A09.setText(C002001d.A1W(mediaViewFragment.A0v, (long) i2));
                        mediaViewFragment.A00 = min;
                    }
                    mediaViewFragment.A0C.setProgress(min);
                } else {
                    mediaViewFragment.AMs().APo(R.string.error_zero_audio_length);
                }
            }
            if (!mediaViewFragment.A0B().isFinishing() && mediaViewFragment.A01 == 1 && mediaViewFragment.A0M.A08()) {
                mediaViewFragment.A06.sendEmptyMessageDelayed(0, 50);
            } else if (mediaViewFragment.A01 != 2) {
                Log.i("mediaview/audio/set to stop status");
                VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A0C;
                voiceNoteSeekBar.setProgress(voiceNoteSeekBar.getMax());
                mediaViewFragment.A09.setText(C002001d.A1W(mediaViewFragment.A0v, (long) (mediaViewFragment.A0M.A02() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                mediaViewFragment.A13();
                return true;
            }
        }
        return true;
    }
}
