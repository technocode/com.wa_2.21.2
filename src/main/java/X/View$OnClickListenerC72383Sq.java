package X;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.Formatter;

/* renamed from: X.3Sq  reason: invalid class name and case insensitive filesystem */
public final class View$OnClickListenerC72383Sq implements View.OnClickListener, AnonymousClass12G, SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ ExoPlaybackControlView A01;

    @Override // X.AnonymousClass12G
    public void AHH(boolean z) {
    }

    @Override // X.AnonymousClass12G
    public void AIV(AnonymousClass12F r1) {
    }

    @Override // X.AnonymousClass12G
    public void AIX(AnonymousClass11w r1) {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AJu() {
    }

    @Override // X.AnonymousClass12G
    public void ALC(AnonymousClass14A r1, C232214w r2) {
    }

    public View$OnClickListenerC72383Sq(ExoPlaybackControlView exoPlaybackControlView) {
        this.A01 = exoPlaybackControlView;
    }

    @Override // X.AnonymousClass12G
    public void AIY(boolean z, int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A04();
        exoPlaybackControlView.A05();
    }

    @Override // X.AnonymousClass12G
    public void AIZ(int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A03();
        exoPlaybackControlView.A05();
    }

    @Override // X.AnonymousClass12G
    public void AKz(AnonymousClass12R r2, Object obj, int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A03();
        exoPlaybackControlView.A05();
    }

    public void onClick(View view) {
        AbstractC33811hQ r0;
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        AbstractC669536o r02 = exoPlaybackControlView.A02;
        if (r02 != null) {
            r02.AE7();
        }
        if (exoPlaybackControlView.A09 == view && (r0 = exoPlaybackControlView.A01) != null) {
            if (r0.A8R() == 4) {
                exoPlaybackControlView.A01.ANW(0);
            } else {
                AbstractC33811hQ r1 = exoPlaybackControlView.A01;
                r1.AOo(!r1.A8P());
            }
        }
        exoPlaybackControlView.A06(300);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        long j;
        if (z) {
            ExoPlaybackControlView exoPlaybackControlView = this.A01;
            TextView textView = exoPlaybackControlView.A0G;
            StringBuilder sb = exoPlaybackControlView.A0M;
            Formatter formatter = exoPlaybackControlView.A0N;
            long duration = exoPlaybackControlView.getDuration();
            if (duration == -9223372036854775807L) {
                j = 0;
            } else {
                j = (duration * ((long) i)) / 1000;
            }
            textView.setText(C28051Sr.A18(sb, formatter, j));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0K);
        AbstractC669636p r0 = exoPlaybackControlView.A03;
        if (r0 != null) {
            r0.AKO();
        }
        AbstractC33811hQ r02 = exoPlaybackControlView.A01;
        if (r02 != null && r02.A8P()) {
            exoPlaybackControlView.A01.AOo(false);
            this.A00 = true;
        }
        exoPlaybackControlView.A07 = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        long j;
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A07 = false;
        AbstractC33811hQ r8 = exoPlaybackControlView.A01;
        if (r8 != null) {
            int progress = seekBar.getProgress();
            long duration = exoPlaybackControlView.getDuration();
            if (duration == -9223372036854775807L) {
                j = 0;
            } else {
                j = (duration * ((long) progress)) / 1000;
            }
            r8.ANW(j);
        }
        AbstractC33811hQ r1 = exoPlaybackControlView.A01;
        if (r1 != null && this.A00) {
            r1.AOo(true);
        }
        this.A00 = false;
        exoPlaybackControlView.A06(3000);
    }
}
