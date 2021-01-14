package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import java.util.List;

/* renamed from: X.2Ib  reason: invalid class name */
public class AnonymousClass2Ib extends BaseAdapter {
    public List A00;
    public final C47492Ic A01 = new C47492Ic(this.A02);
    public final /* synthetic */ MediaAlbumActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 79;
    }

    public AnonymousClass2Ib(MediaAlbumActivity mediaAlbumActivity) {
        this.A02 = mediaAlbumActivity;
    }

    public boolean A00(C007303n r3) {
        List<AbstractC007503q> list = this.A00;
        if (list == null) {
            return false;
        }
        for (AbstractC007503q r0 : list) {
            if (r0.A0n.equals(r3)) {
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public int getItemViewType(int i) {
        List list = this.A00;
        if (list != null) {
            AbstractC007503q r0 = (AbstractC007503q) list.get(i);
            if (r0 != null) {
                return AnonymousClass2IG.A00(r0);
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (((X.AnonymousClass2DW) r5).A00 != null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ib.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
