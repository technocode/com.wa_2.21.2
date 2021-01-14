package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.2pc  reason: invalid class name and case insensitive filesystem */
public class C60522pc extends C59592ny {
    public Drawable A00;

    public C60522pc(Context context) {
        super(context);
    }

    @Override // X.C59592ny
    public void setMediaItem(AbstractC48882Od r4) {
        super.setMediaItem(r4);
        if (r4 != null) {
            int A9V = r4.A9V();
            if (A9V == 1) {
                this.A00 = C004302a.A03(getContext(), R.drawable.mark_video);
            } else if (A9V != 2) {
                this.A00 = null;
            } else {
                this.A00 = C004302a.A03(getContext(), R.drawable.mark_gif);
            }
        } else {
            this.A00 = null;
        }
    }
}
