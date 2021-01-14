package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.3PL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3PL implements AnonymousClass0TF {
    public final /* synthetic */ StatusPlaybackActivity A00;

    public /* synthetic */ AnonymousClass3PL(StatusPlaybackActivity statusPlaybackActivity) {
        this.A00 = statusPlaybackActivity;
    }

    @Override // X.AnonymousClass0TF
    public final C06730Um ACw(View view, C06730Um r8) {
        StatusPlaybackActivity statusPlaybackActivity = this.A00;
        Rect rect = statusPlaybackActivity.A0G;
        rect.set(r8.A02(), r8.A04(), r8.A03(), r8.A01());
        Iterator it = ((AbstractCollection) statusPlaybackActivity.A0D()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r1 = (AnonymousClass037) it.next();
            if (r1 instanceof StatusPlaybackFragment) {
                ((StatusPlaybackFragment) r1).A0s(rect);
            }
        }
        return r8;
    }
}
