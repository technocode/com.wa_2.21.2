package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.Mp4Ops;
import com.whatsapp.conversation.ConversationVideoPictureInPictureActivity;
import com.whatsapp.util.Log;

/* renamed from: X.37D  reason: invalid class name */
public class AnonymousClass37D {
    public int A00;
    public int A01;
    public AnonymousClass374 A02;
    public AnonymousClass37C A03;
    public AnonymousClass37M A04;
    public String A05;
    public final Context A06;
    public final FrameLayout A07;
    public final CoordinatorLayout A08;
    public final AnonymousClass009 A09;
    public final AnonymousClass02M A0A;
    public final Mp4Ops A0B;
    public final AnonymousClass03P A0C;
    public final AnonymousClass00G A0D;
    public final AnonymousClass01X A0E;
    public final AnonymousClass00T A0F;

    public AnonymousClass37D(Context context, AnonymousClass00G r2, AnonymousClass00T r3, Mp4Ops mp4Ops, AnonymousClass02M r5, AnonymousClass009 r6, AnonymousClass03P r7, AnonymousClass01X r8, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, AnonymousClass374 r11, AnonymousClass37C r12) {
        this.A06 = context;
        this.A0D = r2;
        this.A0F = r3;
        this.A0B = mp4Ops;
        this.A0A = r5;
        this.A09 = r6;
        this.A0C = r7;
        this.A0E = r8;
        this.A08 = coordinatorLayout;
        this.A03 = r12;
        this.A07 = frameLayout;
        this.A02 = r11;
    }

    public void A00() {
        Log.i("PictureInPictureVideoPlaybackHandler/destroyVideoPlayer");
        AnonymousClass37M r0 = this.A04;
        if (r0 != null) {
            r0.A01 = null;
            r0.A03 = null;
            r0.A02 = null;
            r0.A00 = null;
            r0.A08();
            this.A04 = null;
        }
        this.A02.A04 = null;
    }

    public void A01() {
        if (this.A02.A0G.getVisibility() == 0) {
            this.A02.A00();
        } else {
            this.A02.A05();
        }
    }

    public void A02() {
        Log.i("PictureInPictureVideoPlaybackHandler/onPipPauseButtonClicked");
        AnonymousClass37M r0 = this.A04;
        if (r0 != null && r0.A0B()) {
            this.A04.A05();
            ((ConversationVideoPictureInPictureActivity) this.A03).A0F();
        }
    }

    public final void A03() {
        Log.i("PictureInPictureVideoPlaybackHandler/playVideo");
        AnonymousClass37M r0 = this.A04;
        if (r0 != null && !r0.A0B()) {
            this.A04.A07();
            ((ConversationVideoPictureInPictureActivity) this.A03).A0E();
        }
    }

    public /* synthetic */ void A04() {
        this.A03.finish();
    }

    public /* synthetic */ void A05() {
        ((ConversationVideoPictureInPictureActivity) this.A03).A0D();
    }

    public /* synthetic */ void A06(AnonymousClass37M r2) {
        ((ConversationVideoPictureInPictureActivity) this.A03).A0F();
        if (this.A03.isInPictureInPictureMode()) {
            this.A02.A02();
        } else {
            this.A02.A05();
        }
        this.A02.A0F(r2);
    }

    public /* synthetic */ void A07(boolean z, AnonymousClass37M r7) {
        AnonymousClass374 r1 = this.A02;
        AnonymousClass37M r0 = r1.A05;
        if (r0 != null) {
            r1.A0T.setText(C28051Sr.A18(r1.A0Z, r1.A0a, (long) r0.A02()));
        }
        this.A02.A0P.setVisibility(0);
        AnonymousClass374 r2 = this.A02;
        r2.A0D.setVisibility(8);
        r2.A0E.setVisibility(8);
        if (this.A03.isInPictureInPictureMode()) {
            this.A02.A02();
        } else {
            this.A02.A05();
        }
        r7.A09(this.A00);
        AnonymousClass37M r02 = this.A04;
        if (r02 == null || z) {
            A03();
        } else {
            r02.A05();
        }
    }
}
