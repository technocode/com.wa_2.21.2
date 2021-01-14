package com.whatsapp.status.playback;

import X.AnonymousClass32P;
import X.C04380Kd;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.MessageReplyActivity;

public class StatusReplyActivity extends MessageReplyActivity {
    public final Rect A00 = new Rect();
    public final ViewTreeObserver.OnGlobalLayoutListener A01 = new AnonymousClass32P(this);
    public final C04380Kd A02 = C04380Kd.A00();
    public final Runnable A03 = new RunnableEBaseShape12S0100000_I1_7(this, 40);

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, com.whatsapp.MessageReplyActivity, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(134217728, 134217728);
            getWindow().setFlags(67108864, 67108864);
        }
        super.onCreate(bundle);
        View view = ((MessageReplyActivity) this).A02;
        if (view != null) {
            view.setSystemUiVisibility(4);
            ((MessageReplyActivity) this).A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, com.whatsapp.MessageReplyActivity, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        View view = ((MessageReplyActivity) this).A02;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.A01);
            ((MessageReplyActivity) this).A02.removeCallbacks(this.A03);
        }
    }
}
