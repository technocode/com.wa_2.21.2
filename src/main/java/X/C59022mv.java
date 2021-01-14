package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2mv  reason: invalid class name and case insensitive filesystem */
public class C59022mv extends AbstractC39391rQ {
    public final /* synthetic */ AbstractC51572Zg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59022mv(AbstractC51572Zg r2, Context context) {
        super(context, R.color.link_color);
        this.A00 = r2;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        AbstractC51572Zg r4 = this.A00;
        AbstractC007503q fMessage = r4.getFMessage();
        AbstractC43421yL rowsContainer = r4.getRowsContainer();
        if (rowsContainer != null) {
            int A9L = rowsContainer.A9L(fMessage);
            if (A9L == 0) {
                A9L = 1;
            }
            rowsContainer.APB(fMessage, A9L + 1);
            r4.A0K();
        }
    }
}
