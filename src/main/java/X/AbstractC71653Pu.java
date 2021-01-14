package X;

import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;

/* renamed from: X.3Pu  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC71653Pu {
    public final /* synthetic */ AbstractC71663Pv A00;

    public AbstractC71653Pu(AbstractC71663Pv r1) {
        this.A00 = r1;
    }

    public void A00() {
        StringBuilder sb = new StringBuilder("playbackPage/onPlaybackContentFinished page=");
        sb.append(this);
        sb.append("; host=");
        AbstractC71663Pv r3 = this.A00;
        sb.append(r3.A0I.A00);
        Log.i(sb.toString());
        StatusPlaybackProgressView statusPlaybackProgressView = r3.A02;
        if (statusPlaybackProgressView.A03 == r3.A0J) {
            statusPlaybackProgressView.A03 = null;
        }
        statusPlaybackProgressView.invalidate();
        if (!r3.A04) {
            r3.A08.post(new RunnableEBaseShape12S0100000_I1_7(this, 43));
        }
    }

    public void A01() {
        StringBuilder sb = new StringBuilder("playbackPage/onPlaybackContentStarted page=");
        sb.append(this);
        sb.append("; host=");
        AbstractC71663Pv r1 = this.A00;
        sb.append(r1.A0I.A00);
        Log.i(sb.toString());
        r1.A0E();
    }
}
