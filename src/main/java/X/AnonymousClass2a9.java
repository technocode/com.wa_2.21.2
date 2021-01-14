package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;

/* renamed from: X.2a9  reason: invalid class name */
public class AnonymousClass2a9 implements AnonymousClass2PS {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Toolbar A02;
    public final /* synthetic */ MediaAlbumActivity A03;

    @Override // X.AnonymousClass2PS
    public void AFL(int i) {
    }

    @Override // X.AnonymousClass2PS
    public void AK2(View view) {
    }

    public AnonymousClass2a9(MediaAlbumActivity mediaAlbumActivity, View view, View view2, Toolbar toolbar) {
        this.A03 = mediaAlbumActivity;
        this.A00 = view;
        this.A01 = view2;
        this.A02 = toolbar;
    }

    @Override // X.AnonymousClass2PS
    public void AF9(View view) {
        this.A03.onBackPressed();
    }

    @Override // X.AnonymousClass2PS
    public void AKE(View view, float f) {
        float f2;
        float f3 = 1.0f - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        this.A00.setAlpha(f2);
        this.A01.setAlpha(f2);
        this.A02.setAlpha(f2);
    }
}
