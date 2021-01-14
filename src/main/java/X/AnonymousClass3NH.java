package X;

import android.os.SystemClock;
import com.whatsapp.Conversation;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.3NH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NH implements AnonymousClass0SG {
    public final /* synthetic */ SearchFragment A00;

    public /* synthetic */ AnonymousClass3NH(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        SearchFragment searchFragment = this.A00;
        C28301Tu.A05();
        searchFragment.A0h(Conversation.A05(searchFragment.A01(), (AnonymousClass02N) obj).putExtra("start_t", SystemClock.uptimeMillis()));
    }
}
