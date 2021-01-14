package X;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.SeekBar;

/* renamed from: X.36z  reason: invalid class name and case insensitive filesystem */
public class C670436z implements Handler.Callback {
    public final /* synthetic */ AnonymousClass374 A00;

    public C670436z(AnonymousClass374 r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        AnonymousClass37M r0;
        AnonymousClass374 r5 = this.A00;
        if (r5.A0A && !r5.A07 && (r0 = r5.A05) != null && r0.A0B() && r5.A05.A02() != 0) {
            long A01 = (((long) r5.A05.A01()) * 1000) / ((long) r5.A05.A02());
            ProgressBar progressBar = r5.A0Q;
            if (progressBar != null) {
                progressBar.setProgress((int) A01);
            }
            SeekBar seekBar = r5.A0R;
            if (seekBar != null && !r5.A0B) {
                seekBar.setProgress((int) A01);
                r5.A0S.setText(C28051Sr.A18(r5.A0Z, r5.A0a, (long) r5.A05.A01()));
            }
        }
        r5.A0C.sendEmptyMessageDelayed(0, 50);
        return true;
    }
}
