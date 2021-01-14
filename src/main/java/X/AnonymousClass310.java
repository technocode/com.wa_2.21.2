package X;

import android.widget.SeekBar;

/* renamed from: X.310  reason: invalid class name */
public abstract class AnonymousClass310 implements SeekBar.OnSeekBarChangeListener {
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void A00(int i) {
        if (this instanceof AnonymousClass3OJ) {
            AnonymousClass3OK r0 = ((AnonymousClass3OJ) this).A00;
            r0.A00.setDescription(C002001d.A1W(r0.A07, (long) i));
        } else if (!(this instanceof AnonymousClass3OH)) {
            C60332pG r3 = ((C51582Zh) this).A00;
            r3.setDuration(C002001d.A1W(r3.A0n, (long) i));
        } else {
            AnonymousClass3OI r02 = ((AnonymousClass3OH) this).A00;
            r02.A00.setDuration(C002001d.A1W(r02.A02, (long) i));
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this instanceof C51582Zh) {
            C60332pG r0 = ((C51582Zh) this).A00;
            C28301Tu.A06(r0.getFMessage(), r0.A04.A02.getProgress());
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this instanceof C51582Zh) {
            C60332pG r0 = ((C51582Zh) this).A00;
            C28301Tu.A06(r0.getFMessage(), r0.A04.A02.getProgress());
        }
    }
}
