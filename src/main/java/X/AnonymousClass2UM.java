package X;

import android.widget.SeekBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2UM  reason: invalid class name */
public class AnonymousClass2UM implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MediaViewFragment A00;

    public AnonymousClass2UM(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            MediaViewFragment mediaViewFragment = this.A00;
            AnonymousClass01X r5 = mediaViewFragment.A0v;
            String A1X = C002001d.A1X(r5, (long) seekBar.getProgress());
            mediaViewFragment.A0C.setContentDescription(r5.A0D(R.string.voice_message_time_elapsed, A1X));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass1Y0 r0 = mediaViewFragment.A0M;
        if (r0 != null && r0.A08()) {
            mediaViewFragment.A0M.A03();
        }
        mediaViewFragment.A06.removeMessages(0);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass1Y0 r5 = mediaViewFragment.A0M;
        if (r5 == null) {
            mediaViewFragment.A0C.setProgress(0);
        } else if (mediaViewFragment.A01 == 1) {
            try {
                r5.A07((int) ((((float) mediaViewFragment.A0C.getProgress()) / ((float) mediaViewFragment.A0C.getMax())) * ((float) r5.A02())));
                mediaViewFragment.A0M.A06();
                mediaViewFragment.A06.sendEmptyMessage(0);
                mediaViewFragment.A14();
            } catch (IOException e) {
                Log.e("mediaview/fail onStopTracking", e);
                mediaViewFragment.AMs().APo(R.string.gallery_audio_cannot_load);
            }
        } else {
            int progress = (int) ((((float) mediaViewFragment.A0C.getProgress()) / ((float) mediaViewFragment.A0C.getMax())) * ((float) r5.A02()));
            AnonymousClass0M3 A12 = mediaViewFragment.A12(mediaViewFragment.A03);
            if (A12 != null) {
                mediaViewFragment.A1A(A12, progress, false);
            }
        }
    }
}
