package X;

import android.widget.SeekBar;
import com.whatsapp.VoiceNoteSeekBar;

/* renamed from: X.2Gg  reason: invalid class name and case insensitive filesystem */
public class C47052Gg implements SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ VoiceNoteSeekBar A01;
    public final /* synthetic */ C47062Gh A02;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public C47052Gg(C47062Gh r1, VoiceNoteSeekBar voiceNoteSeekBar) {
        this.A02 = r1;
        this.A01 = voiceNoteSeekBar;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.A00 = false;
        C28301Tu r1 = C28301Tu.A0i;
        if (C28301Tu.A07() && r1 != null) {
            r1.A0A();
            this.A00 = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (!C28301Tu.A07() && this.A00) {
            this.A00 = false;
            this.A02.A02.A0B();
        }
        C28301Tu r1 = C28301Tu.A0i;
        if (r1 != null) {
            r1.A0M(this.A01.getProgress());
        }
    }
}
