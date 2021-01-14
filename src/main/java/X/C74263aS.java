package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.3aS  reason: invalid class name and case insensitive filesystem */
public class C74263aS extends AbstractC39391rQ {
    public final /* synthetic */ RunnableEBaseShape0S0102000_I1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74263aS(RunnableEBaseShape0S0102000_I1 runnableEBaseShape0S0102000_I1, Context context, int i) {
        super(context, i);
        this.A00 = runnableEBaseShape0S0102000_I1;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        RunnableEBaseShape0S0102000_I1 runnableEBaseShape0S0102000_I1 = this.A00;
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) runnableEBaseShape0S0102000_I1.A02;
        AnonymousClass34Z r0 = readMoreTextView.A02;
        if (r0 == null || !r0.AE9()) {
            readMoreTextView.A05 = true;
            runnableEBaseShape0S0102000_I1.A01 = 0;
            runnableEBaseShape0S0102000_I1.A00 = 0;
            readMoreTextView.setText(readMoreTextView.A04);
            readMoreTextView.setMaxLines(Integer.MAX_VALUE);
            readMoreTextView.A09.removeCallbacks(readMoreTextView.A0B);
        }
    }
}
