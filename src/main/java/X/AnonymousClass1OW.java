package X;

import android.widget.SeekBar;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1OW  reason: invalid class name */
public class AnonymousClass1OW implements SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ C27131Oe A01;

    public AnonymousClass1OW(C27131Oe r1) {
        this.A01 = r1;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C27131Oe r1 = this.A01;
        AnonymousClass1Y0 r0 = r1.A0a;
        if (r0 != null) {
            try {
                r0.A07(i);
                if (i == 0 && !r1.A0a.A08()) {
                    i = r1.A0a.A02();
                }
                r1.A0N.setText(C002001d.A1W(r1.A12, (long) (i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
            } catch (IOException e) {
                StringBuilder A0S = AnonymousClass008.A0S("Error seeking media player ");
                A0S.append(e.getMessage());
                Log.e(A0S.toString());
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C27131Oe r2 = this.A01;
        if (r2.A0a != null) {
            r2.A0n.removeCallbacks(r2.A1G);
            this.A00 = r2.A0a.A08();
            if (r2.A0a.A08()) {
                r2.A0a.A03();
                r2.A08();
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C27131Oe r3 = this.A01;
        AnonymousClass1Y0 r1 = r3.A0a;
        if (r1 != null && this.A00) {
            try {
                if (!(r1 instanceof AnonymousClass3SB)) {
                    ((AnonymousClass232) r1).A00.start();
                } else {
                    ((AnonymousClass3SB) r1).A00.resume();
                }
                r3.A0J.setImageResource(R.drawable.inline_audio_pause);
                r3.A0J.setContentDescription(r3.A12.A06(R.string.pause));
                r3.A0n.post(r3.A1G);
            } catch (IOException e) {
                StringBuilder A0S = AnonymousClass008.A0S("Error resuming playback after seek ");
                A0S.append(e.getMessage());
                Log.e(A0S.toString());
            }
            this.A00 = false;
        }
    }
}
