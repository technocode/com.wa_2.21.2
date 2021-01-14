package X;

import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.views.ProgressView;

/* renamed from: X.3Ng  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71013Ng implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ C71013Ng(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ProgressView progressView = this.A00.A0C;
        if (progressView == null) {
            return;
        }
        if (Boolean.TRUE.equals(obj)) {
            progressView.A00(true);
        } else {
            progressView.A00(false);
        }
    }
}
