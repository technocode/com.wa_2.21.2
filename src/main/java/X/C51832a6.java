package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.2a6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51832a6 implements AnonymousClass0TF {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    public /* synthetic */ C51832a6(MediaAlbumActivity mediaAlbumActivity, View view, View view2, View view3) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }

    @Override // X.AnonymousClass0TF
    public final C06730Um ACw(View view, C06730Um r9) {
        MediaAlbumActivity mediaAlbumActivity = this.A03;
        View view2 = this.A00;
        View view3 = this.A01;
        View view4 = this.A02;
        int dimensionPixelSize = mediaAlbumActivity.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + r9.A04();
        int A012 = r9.A01();
        view2.setPadding(0, 0, 0, dimensionPixelSize);
        view3.setPadding(0, 0, 0, A012);
        view4.setPadding(0, 0, 0, dimensionPixelSize);
        return r9;
    }
}
