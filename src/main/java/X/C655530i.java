package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.search.SearchViewModel;

/* renamed from: X.30i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C655530i implements Handler.Callback {
    public final /* synthetic */ SearchViewModel A00;

    public /* synthetic */ C655530i(SearchViewModel searchViewModel) {
        this.A00 = searchViewModel;
    }

    public final boolean handleMessage(Message message) {
        SearchViewModel searchViewModel = this.A00;
        if (message.what != 0) {
            return false;
        }
        searchViewModel.A0J = C08590bO.A00().A01();
        Runnable runnable = searchViewModel.A0W;
        if (runnable != null) {
            runnable.run();
        }
        searchViewModel.A01.removeMessages(0);
        searchViewModel.A0C();
        return true;
    }
}
