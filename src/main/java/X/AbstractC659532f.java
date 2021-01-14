package X;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.32f  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC659532f {
    public View A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final Rect A06 = new Rect();

    public View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void A01() {
        StringBuilder sb = new StringBuilder("playbackPage/onConfigurationChanged page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }

    public void A02() {
        this.A01 = false;
        StringBuilder sb = new StringBuilder("playbackPage/onDestroy page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }

    public void A03() {
        this.A03 = false;
        StringBuilder sb = new StringBuilder("playbackPage/onPause page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }

    public void A04() {
        this.A03 = true;
        StringBuilder sb = new StringBuilder("playbackPage/onResume page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }

    public void A05() {
        this.A04 = true;
        StringBuilder sb = new StringBuilder("playbackPage/onViewActive page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }

    public void A06() {
        this.A04 = false;
        StringBuilder sb = new StringBuilder("playbackPage/onViewInactive page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0D()) == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC659532f.A07():void");
    }

    public void A08(Rect rect) {
        this.A06.set(rect);
    }

    public void A09(View view) {
        StringBuilder sb = new StringBuilder("playbackPage/onViewCreated page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((AbstractC71663Pv) this).A0I.A00);
        Log.i(sb.toString());
    }
}
