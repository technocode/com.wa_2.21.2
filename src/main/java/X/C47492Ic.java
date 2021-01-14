package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.2Ic  reason: invalid class name and case insensitive filesystem */
public class C47492Ic {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC51572Zg A04;
    public final /* synthetic */ MediaAlbumActivity A05;

    public C47492Ic(MediaAlbumActivity mediaAlbumActivity) {
        this.A05 = mediaAlbumActivity;
    }

    public int A00(int i, int i2, boolean z) {
        int i3;
        MediaAlbumActivity mediaAlbumActivity = this.A05;
        int i4 = -mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.album_item_padding);
        if (Build.VERSION.SDK_INT >= 21) {
            int identifier = mediaAlbumActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i3 = mediaAlbumActivity.getResources().getDimensionPixelSize(identifier);
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        int max = Math.max(i4, ((mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + (i3 + i)) - i2) >> 1);
        return z ? Math.max(max, i - i2) : max;
    }
}
