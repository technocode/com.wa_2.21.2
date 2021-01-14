package com.whatsapp.authentication;

import X.AnonymousClass01X;
import X.AnonymousClass1Pz;
import X.AnonymousClass24Q;
import X.C004302a;
import X.C41251uj;
import X.C41261uk;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class FingerprintView extends LinearLayout {
    public AnonymousClass1Pz A00;
    public final ImageView A01;
    public final TextView A02;
    public final AnonymousClass24Q A03;
    public final AnonymousClass24Q A04;
    public final AnonymousClass24Q A05;
    public final AnonymousClass24Q A06;
    public final AnonymousClass01X A07;
    public final Runnable A08;

    public FingerprintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.FingerprintView);
    }

    public FingerprintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A07 = AnonymousClass01X.A00();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        setOrientation(1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.fingerprint_view, (ViewGroup) this, true);
        this.A02 = (TextView) findViewById(R.id.fingerprint_prompt);
        this.A01 = (ImageView) findViewById(R.id.fingerprint_icon);
        AnonymousClass24Q A002 = AnonymousClass24Q.A00(contextThemeWrapper, R.drawable.fingerprint_icon);
        if (A002 != null) {
            this.A04 = A002;
            this.A01.setImageDrawable(A002);
            this.A04.start();
            AnonymousClass24Q A003 = AnonymousClass24Q.A00(contextThemeWrapper, R.drawable.fingerprint_icon_to_success);
            if (A003 != null) {
                this.A06 = A003;
                AnonymousClass24Q A004 = AnonymousClass24Q.A00(contextThemeWrapper, R.drawable.fingerprint_icon_to_error);
                if (A004 != null) {
                    this.A05 = A004;
                    AnonymousClass24Q A005 = AnonymousClass24Q.A00(contextThemeWrapper, R.drawable.error_to_fingerprint_icon);
                    if (A005 != null) {
                        this.A03 = A005;
                        this.A08 = new RunnableEBaseShape7S0100000_I1_2(this, 0);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A00() {
        AnonymousClass24Q r2 = this.A04;
        A05(this.A07.A06(R.string.fingerprint_locked_fingerprint_prompt), R.color.settings_item_subtitle_text);
        this.A01.setImageDrawable(r2);
        r2.start();
    }

    public void A01() {
        AnonymousClass24Q r2 = this.A03;
        A05(this.A07.A06(R.string.fingerprint_locked_fingerprint_prompt), R.color.settings_item_subtitle_text);
        this.A01.setImageDrawable(r2);
        r2.start();
    }

    public void A02() {
        this.A02.setText("");
        ImageView imageView = this.A01;
        imageView.removeCallbacks(this.A08);
        AnonymousClass24Q r1 = this.A06;
        imageView.setImageDrawable(r1);
        r1.start();
        r1.A02(new C41251uj(this));
    }

    public void A03(CharSequence charSequence) {
        setError(charSequence.toString());
        ImageView imageView = this.A01;
        imageView.removeCallbacks(this.A08);
        Drawable drawable = imageView.getDrawable();
        AnonymousClass24Q r1 = this.A05;
        if (!drawable.equals(r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
            r1.A02(new C41261uk(this));
        }
    }

    public void A04(String str) {
        setError(str);
        ImageView imageView = this.A01;
        Drawable drawable = imageView.getDrawable();
        AnonymousClass24Q r1 = this.A05;
        if (!drawable.equals(r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
        }
        Runnable runnable = this.A08;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000);
    }

    public final void A05(String str, int i) {
        if (getContext() != null) {
            TextView textView = this.A02;
            textView.setText(str);
            textView.setTextColor(C004302a.A00(getContext(), i));
            textView.announceForAccessibility(str);
        }
    }

    private void setError(String str) {
        A05(str, R.color.red_error);
    }

    public void setListener(AnonymousClass1Pz r1) {
        this.A00 = r1;
    }
}
