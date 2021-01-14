package org.npci.commonlibrary;

import X.ActivityC004802g;
import X.AnonymousClass01X;
import X.AnonymousClass02i;
import X.AnonymousClass3B7;
import X.AnonymousClass3BJ;
import X.AnonymousClass3BK;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetCredential extends ActivityC004802g {
    public int A00;
    public TransitionDrawable A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public JSONArray A05 = null;
    public JSONArray A06 = new JSONArray();
    public JSONObject A07 = null;
    public JSONObject A08 = null;
    public AnonymousClass3B7 A09;
    public AnonymousClass3BK A0A;
    public NPCIFragment A0B = null;
    public boolean A0C = false;
    public boolean A0D;
    public final Context A0E = this;
    public final AnonymousClass01X A0F = AnonymousClass01X.A00();

    public static final void A00(float f, float f2, View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration((long) 300);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public final void A0D(boolean z) {
        float f = 0.0f;
        ImageView imageView = this.A04;
        if (z) {
            A00(0.0f, 180.0f, imageView);
        } else {
            A00(180.0f, 0.0f, imageView);
        }
        int height = this.A02.getHeight();
        if (height == 0) {
            height = this.A00;
        }
        this.A02.clearAnimation();
        ViewPropertyAnimator animate = this.A02.animate();
        float f2 = 0.0f;
        if (!z) {
            f2 = ((float) height) * -1.0f;
        }
        ViewPropertyAnimator y = animate.y(f2);
        if (z) {
            f = 1.0f;
        }
        y.alpha(f).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new AnonymousClass3BJ(this, z, height));
    }

    public void lambda$onCreate$177$GetCredential(View view) {
        Intent intent = new Intent();
        int i = 252;
        if (this.A0D) {
            i = 251;
        }
        setResult(i, intent);
        finish();
    }

    public /* synthetic */ void lambda$renderTransactionBar$180$GetCredential(View view) {
        boolean z = false;
        if (this.A02.getVisibility() == 0) {
            z = true;
        }
        A0D(!z);
    }

    @Override // X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A0C) {
            Intent intent = new Intent();
            int i = 252;
            if (this.A0D) {
                i = 251;
            }
            setResult(i, intent);
            ((AnonymousClass02i) this).A02.A00();
            return;
        }
        this.A0C = true;
        Toast.makeText(this, this.A0F.A06(R.string.npci_back_button_exit_message), 0).show();
        new Handler().postDelayed(new RunnableEBaseShape13S0100000_I1_8(this, 45), 2000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:227:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0564  */
    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 1388
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.GetCredential.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004902h
    public void onPause() {
        super.onPause();
        try {
            AnonymousClass3BK r0 = this.A0A;
            if (r0 != null) {
                unregisterReceiver(r0);
                this.A0A = null;
            }
        } catch (Throwable unused) {
            Log.e("PAY: Failed to unregister SMS receiver (Ignoring)");
        }
    }

    @Override // X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (checkCallingOrSelfPermission("android.permission.RECEIVE_SMS") == 0) {
            this.A0A = new AnonymousClass3BK(this);
            IntentFilter intentFilter = new IntentFilter();
            try {
                intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(Integer.MAX_VALUE);
                registerReceiver(this.A0A, intentFilter);
            } catch (Throwable unused) {
                Log.e("PAY: Failed to register SMS broadcast receiver (Ignoring)");
            }
        } else {
            Log.e("PAY: RECEIVE_SMS permission not provided by the App. This will affect Auto OTP detection feature of Common Library");
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_error", this.A0D);
    }
}
