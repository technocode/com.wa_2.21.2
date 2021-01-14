package com.whatsapp.gallerypicker;

import X.ActivityC004602e;
import X.AnonymousClass037;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0TX;
import X.AnonymousClass2C0;
import X.AnonymousClass2UT;
import X.C002301g;
import X.C004302a;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

public class MediaPicker extends ActivityC004602e {
    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass037 A06 = A04().A06(R.id.content);
        if (A06 != null) {
            A06.A0g(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        A0A().A0H(5);
        if (AnonymousClass2UT.A00) {
            Window window = getWindow();
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setEnterTransition(inflateTransition);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setReturnTransition(inflateTransition2);
            AnonymousClass0TX.A0C(this);
        }
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.gallery_label));
        A09().A0A(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.content);
        if (bundle == null) {
            MediaPickerFragment mediaPickerFragment = new MediaPickerFragment();
            AnonymousClass0LW A04 = A04();
            if (A04 != null) {
                AnonymousClass0QB r1 = new AnonymousClass0QB(A04);
                r1.A05(frameLayout.getId(), mediaPickerFragment);
                r1.A00();
                View view = new View(this);
                view.setBackgroundColor(C004302a.A00(this, R.color.divider_gray));
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.ceil((double) (C002301g.A0K.A00 / 2.0f))));
                frameLayout.addView(view);
            } else {
                throw null;
            }
        }
        setContentView(frameLayout);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass0TX.A0B(this);
        return true;
    }
}
