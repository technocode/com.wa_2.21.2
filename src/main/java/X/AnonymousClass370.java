package X;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Formatter;

/* renamed from: X.370  reason: invalid class name */
public class AnonymousClass370 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass374 A00;
    public final /* synthetic */ AnonymousClass37M A01;

    public AnonymousClass370(AnonymousClass374 r1, AnonymousClass37M r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        if (z && ((long) this.A01.A02()) != -9223372036854775807L) {
            AnonymousClass374 r0 = this.A00;
            TextView textView = r0.A0S;
            StringBuilder sb = r0.A0Z;
            Formatter formatter = r0.A0a;
            int progress = seekBar.getProgress();
            AnonymousClass37M r02 = r0.A05;
            if (r02 != null) {
                i2 = (int) ((((long) r02.A02()) * ((long) progress)) / 1000);
            } else {
                i2 = 0;
            }
            textView.setText(C28051Sr.A18(sb, formatter, (long) i2));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        AnonymousClass374 r1 = this.A00;
        r1.A0B = true;
        r1.A06();
        r1.removeCallbacks(r1.A0Y);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        AnonymousClass374 r5 = this.A00;
        r5.A0B = false;
        r5.A0Q.setProgress(seekBar.getProgress());
        int progress = seekBar.getProgress();
        AnonymousClass37M r0 = r5.A05;
        if (r0 != null) {
            i = (int) ((((long) r0.A02()) * ((long) progress)) / 1000);
        } else {
            i = 0;
        }
        AnonymousClass37M r1 = this.A01;
        if (i >= r1.A02()) {
            i -= 600;
        }
        r1.A09(i);
        r5.A0C(800);
        r5.A01();
    }
}
