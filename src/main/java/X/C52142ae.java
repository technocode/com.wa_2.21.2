package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.util.Log;

/* renamed from: X.2ae  reason: invalid class name and case insensitive filesystem */
public final class C52142ae extends AnonymousClass1PD {
    public final Activity A00;
    public final ViewGroup A01;
    public final C52152af A02;
    public final AnonymousClass02N A03;
    public final AnonymousClass02J A04;
    public final WallPaperView A05;
    public final AnonymousClass00T A06;

    public C52142ae(AnonymousClass02N r12, Activity activity, AnonymousClass02M r14, AnonymousClass00T r15, C000300f r16, AnonymousClass03P r17, AnonymousClass01X r18, AnonymousClass02J r19, AbstractC004502c r20, Runnable runnable, ViewGroup viewGroup, WallPaperView wallPaperView, AnonymousClass2JG r24) {
        this.A03 = r12;
        this.A00 = activity;
        this.A06 = r15;
        this.A04 = r19;
        this.A01 = viewGroup;
        this.A05 = wallPaperView;
        this.A02 = new C52152af(activity, r14, r16, r17, r18, r19, r20, new C52132ad(this, runnable, wallPaperView), r24);
    }

    public final void A00() {
        this.A06.ANC(new C10720f5(this.A03, this.A00, this.A04, new C52122ac(this)), new Void[0]);
    }

    public final void A01(Drawable drawable) {
        if (drawable != null) {
            Log.d("conversation/wallpaper/set/drawable");
            this.A05.setDrawable(drawable);
            this.A01.setBackgroundResource(0);
            return;
        }
        Log.d("conversation/wallpaper/clear/toggle_view");
        WallPaperView wallPaperView = this.A05;
        wallPaperView.A02 = false;
        wallPaperView.setImageDrawable(null);
        wallPaperView.invalidate();
        this.A01.setBackgroundResource(R.color.conversation_background);
    }

    @Override // X.AnonymousClass1PD
    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(null);
        A00();
    }
}
