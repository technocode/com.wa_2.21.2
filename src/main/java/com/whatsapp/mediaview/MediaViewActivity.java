package com.whatsapp.mediaview;

import X.AbstractC07270Wu;
import X.ActivityC004602e;
import X.AnonymousClass02N;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass2UT;
import X.C006803i;
import X.C007303n;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class MediaViewActivity extends ActivityC004602e implements AbstractC07270Wu {
    public MediaViewFragment A00;

    @Override // X.AbstractC07270Wu
    public void AFB() {
    }

    @Override // X.AbstractC07270Wu
    public void AKp() {
    }

    @Override // X.AbstractC07270Wu
    public boolean APe() {
        return true;
    }

    @Override // X.AbstractC07270Wu
    public void AHi() {
        finish();
    }

    public void finish() {
        super.finish();
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment != null) {
            ((MediaViewBaseFragment) mediaViewFragment).A0B.A08();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        MediaViewFragment mediaViewFragment = this.A00;
        if (mediaViewFragment != null) {
            mediaViewFragment.A0v();
        }
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (AnonymousClass2UT.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        setContentView(R.layout.media_view_activity);
        AnonymousClass0LW A04 = A04();
        MediaViewFragment mediaViewFragment = (MediaViewFragment) A04.A0Q.A01("media_view_fragment");
        this.A00 = mediaViewFragment;
        if (mediaViewFragment == null) {
            Intent intent = getIntent();
            C007303n A08 = C006803i.A08(intent);
            if (A08 == null) {
                Log.e("mediaview/message key parameter is missing");
                finish();
                return;
            }
            this.A00 = MediaViewFragment.A02(A08, AnonymousClass02N.A01(intent.getStringExtra("jid")), intent.getBooleanExtra("gallery", false), intent.getBooleanExtra("nogallery", false), intent.getIntExtra("video_play_origin", 5), intent.getLongExtra("start_t", 0), intent.getBundleExtra("animation_bundle"), intent.getIntExtra("menu_style", 1), intent.getBooleanExtra("menu_set_wallpaper", false), 1);
        }
        AnonymousClass0QB r5 = new AnonymousClass0QB(A04);
        r5.A06(R.id.media_view_fragment_container, this.A00, "media_view_fragment");
        r5.A00();
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A00(this, true);
    }
}
