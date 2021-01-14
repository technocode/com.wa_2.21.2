package X;

import android.widget.SeekBar;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.311  reason: invalid class name */
public class AnonymousClass311 implements SeekBar.OnSeekBarChangeListener {
    public AnonymousClass310 A00;
    public boolean A01;
    public final AudioPlayerView A02;
    public final AbstractC656830z A03;

    public AnonymousClass311(AudioPlayerView audioPlayerView, AbstractC656830z r2, AnonymousClass310 r3) {
        this.A02 = audioPlayerView;
        this.A03 = r2;
        this.A00 = r3;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int i2 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            AnonymousClass310 r0 = this.A00;
            if (r0 != null) {
                r0.onProgressChanged(seekBar, i, z);
                this.A00.A00(i2);
            }
            AudioPlayerView audioPlayerView = this.A02;
            audioPlayerView.setSeekbarContentDescription((long) audioPlayerView.A02.getProgress());
        }
        C28301Tu.A06(this.A03.A6K(), this.A02.A02.getProgress());
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        AnonymousClass0MP A6K = this.A03.A6K();
        this.A01 = false;
        C28301Tu r1 = C28301Tu.A0i;
        if (C28301Tu.A08(A6K) && C28301Tu.A07() && r1 != null) {
            r1.A0A();
            this.A01 = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        AnonymousClass0MP A6K = this.A03.A6K();
        AnonymousClass310 r0 = this.A00;
        if (r0 != null) {
            r0.onStopTrackingTouch(seekBar);
        }
        if (!C28301Tu.A08(A6K) || C28301Tu.A07() || !this.A01) {
            AnonymousClass310 r1 = this.A00;
            if (r1 != null) {
                r1.A00(((AnonymousClass0M3) A6K).A00);
            }
            C28301Tu.A06(A6K, this.A02.A02.getProgress());
            return;
        }
        this.A01 = false;
        C28301Tu r12 = C28301Tu.A0i;
        if (r12 != null) {
            r12.A0M(this.A02.A02.getProgress());
            r12.A0B();
        }
    }
}
