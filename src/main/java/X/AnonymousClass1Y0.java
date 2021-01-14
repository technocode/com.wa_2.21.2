package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Y0  reason: invalid class name */
public abstract class AnonymousClass1Y0 {
    public static AnonymousClass1Y0 A00(File file, int i) {
        if (file.getAbsolutePath().endsWith(".opus")) {
            return new AnonymousClass3SB(file, i);
        }
        AnonymousClass232 r2 = new AnonymousClass232(i);
        r2.A00.setDataSource(file.getAbsolutePath());
        return r2;
    }

    public int A01() {
        if (!(this instanceof AnonymousClass3SB)) {
            return ((AnonymousClass232) this).A00.getCurrentPosition();
        }
        try {
            return (int) ((AnonymousClass3SB) this).A00.getCurrentPosition();
        } catch (IOException e) {
            Log.e(e);
            return 0;
        }
    }

    public int A02() {
        if (!(this instanceof AnonymousClass3SB)) {
            return ((AnonymousClass232) this).A00.getDuration();
        }
        try {
            return (int) ((AnonymousClass3SB) this).A00.getLength();
        } catch (IOException e) {
            Log.e(e);
            return 0;
        }
    }

    public void A03() {
        if (!(this instanceof AnonymousClass3SB)) {
            ((AnonymousClass232) this).A00.pause();
            return;
        }
        try {
            ((AnonymousClass3SB) this).A00.pause();
        } catch (IOException e) {
            Log.e(e);
        }
    }

    public void A04() {
        if (!(this instanceof AnonymousClass3SB)) {
            ((AnonymousClass232) this).A00.prepare();
        } else {
            ((AnonymousClass3SB) this).A00.prepare();
        }
    }

    public void A05() {
        if (!(this instanceof AnonymousClass3SB)) {
            AnonymousClass232 r1 = (AnonymousClass232) this;
            r1.A01.postDelayed(new RunnableEBaseShape13S0100000_I1_8(r1, 21), 100);
            return;
        }
        ((AnonymousClass3SB) this).A00.close();
    }

    public void A06() {
        if (!(this instanceof AnonymousClass3SB)) {
            ((AnonymousClass232) this).A00.start();
        } else {
            ((AnonymousClass3SB) this).A00.start();
        }
    }

    public void A07(int i) {
        if (!(this instanceof AnonymousClass3SB)) {
            ((AnonymousClass232) this).A00.seekTo(i);
        } else {
            ((AnonymousClass3SB) this).A00.seek((long) i);
        }
    }

    public boolean A08() {
        if (!(this instanceof AnonymousClass3SB)) {
            return ((AnonymousClass232) this).A00.isPlaying();
        }
        try {
            return ((AnonymousClass3SB) this).A00.isPlaying();
        } catch (IOException e) {
            Log.e(e);
            return false;
        }
    }
}
