package X;

import android.graphics.Matrix;
import android.view.View;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0md  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC14640md {
    public Matrix A00;

    public void A00(List list, Map map) {
        View A02;
        View A022;
        View A023;
        if (!(this instanceof C51862aA)) {
            C51682Zr r3 = (C51682Zr) this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!map.containsKey(str) && (A023 = AnonymousClass2UT.A02(r3.A00.getWindow().getDecorView(), str)) != null) {
                    map.put(str, A023);
                }
            }
            return;
        }
        MediaAlbumActivity mediaAlbumActivity = ((C51862aA) this).A00;
        List<AbstractC007503q> list2 = mediaAlbumActivity.A02.A00;
        if (list2 != null) {
            int i = 0;
            boolean z = false;
            for (AbstractC007503q r4 : list2) {
                i++;
                if (i <= 3) {
                    View findViewWithTag = mediaAlbumActivity.A0T().findViewWithTag(r4.A0n);
                    if (findViewWithTag == null || z || (findViewWithTag.getTop() < 0 && (findViewWithTag.getTop() >= 0 || findViewWithTag.getBottom() < mediaAlbumActivity.A0T().getHeight()))) {
                        map.remove(AbstractC59162nB.A07(r4));
                        map.remove(AbstractC59162nB.A05(r4));
                    } else {
                        String A07 = AbstractC59162nB.A07(r4);
                        if (!map.containsKey(A07) && (A022 = AnonymousClass2UT.A02(mediaAlbumActivity.A0T(), A07)) != null) {
                            list.add(A07);
                            map.put(A07, A022);
                        }
                        String A05 = AbstractC59162nB.A05(r4);
                        if (!map.containsKey(A05) && (A02 = AnonymousClass2UT.A02(mediaAlbumActivity.A0T(), A05)) != null) {
                            list.add(A05);
                            map.put(A05, A02);
                        }
                        z = true;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
