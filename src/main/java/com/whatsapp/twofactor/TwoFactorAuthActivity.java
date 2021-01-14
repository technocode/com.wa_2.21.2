package com.whatsapp.twofactor;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass037;
import X.AnonymousClass0LW;
import X.AnonymousClass0N2;
import X.AnonymousClass0QB;
import X.AnonymousClass0QC;
import X.AnonymousClass0S2;
import X.AnonymousClass0Z2;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C04530Ks;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.List;

public class TwoFactorAuthActivity extends ActivityC004602e implements AnonymousClass0Z2 {
    public static final int[] A09 = {R.id.page_indicator_1, R.id.page_indicator_2, R.id.page_indicator_3};
    public AnonymousClass0S2 A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public int[] A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final C04530Ks A07 = C04530Ks.A00();
    public final Runnable A08 = new RunnableEBaseShape13S0100000_I1_8(this, 14);

    public AnonymousClass037 A0T() {
        int i = this.A05[0];
        if (i == 1) {
            Bundle A012 = AnonymousClass008.A01("type", 1);
            SetCodeFragment setCodeFragment = new SetCodeFragment();
            setCodeFragment.A0N(A012);
            return setCodeFragment;
        } else if (i == 2) {
            Bundle A013 = AnonymousClass008.A01("type", 1);
            SetEmailFragment setEmailFragment = new SetEmailFragment();
            setEmailFragment.A0N(A013);
            return setEmailFragment;
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("Invalid work flow:");
            A0S.append(i);
            throw new IllegalStateException(A0S.toString());
        }
    }

    public void A0U() {
        A0G(R.string.two_factor_auth_submitting);
        this.A06.postDelayed(this.A08, C04530Ks.A07);
        String str = this.A01;
        if (str == null) {
            str = this.A07.A00.getString("two_factor_auth_code", "");
            this.A01 = str;
        }
        this.A07.A01(str, this.A03);
    }

    public void A0V(View view, int i) {
        int i2 = 0;
        while (i2 < i) {
            i2++;
            AnonymousClass0N2.A1E((ImageView) view.findViewById(A09[i2]), ColorStateList.valueOf(C004302a.A00(this, R.color.pageIndicatorSelected)));
        }
        int length = this.A05.length;
        while (true) {
            length++;
            int[] iArr = A09;
            if (length < iArr.length) {
                view.findViewById(iArr[length]).setVisibility(8);
            } else {
                return;
            }
        }
    }

    public void A0W(AnonymousClass037 r7, boolean z) {
        StringBuilder A0S = AnonymousClass008.A0S("twofactorauthactivity/navigate-to fragment=");
        A0S.append(r7.getClass().getName());
        A0S.append(" add=");
        A0S.append(z);
        Log.d(A0S.toString());
        AnonymousClass0LW A042 = A04();
        if (A042 != null) {
            AnonymousClass0QB r4 = new AnonymousClass0QB(A042);
            ((AnonymousClass0QC) r4).A02 = R.anim.slide_in_right;
            r4.A03 = R.anim.slide_out_left;
            r4.A04 = R.anim.slide_in_left;
            r4.A05 = R.anim.slide_out_right;
            r4.A06(R.id.container, r7, null);
            if (z) {
                r4.A08(null);
            }
            r4.A00();
            return;
        }
        throw null;
    }

    public boolean A0X(AnonymousClass037 r4) {
        return this.A05.length == 1 || r4.getClass() == SetEmailFragment.class;
    }

    @Override // X.AnonymousClass0Z2
    public void ALK() {
        Log.d("twofactorauthactivity/two-factor-auth-settings-refresh-error");
        Handler handler = this.A06;
        handler.removeCallbacks(this.A08);
        handler.postDelayed(new RunnableEBaseShape13S0100000_I1_8(this, 17), 700);
    }

    @Override // X.AnonymousClass0Z2
    public void ALL() {
        Log.d("twofactorauthactivity/two-factor-auth-settings-refreshed");
        Handler handler = this.A06;
        handler.removeCallbacks(this.A08);
        handler.postDelayed(new RunnableEBaseShape13S0100000_I1_8(this, 18), 700);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.settings_two_factor_auth));
        AnonymousClass0S2 A092 = A09();
        this.A00 = A092;
        boolean z = true;
        if (A092 != null) {
            A092.A0A(true);
        }
        setContentView(R.layout.activity_two_factor_auth);
        int[] intArrayExtra = getIntent().getIntArrayExtra("workflows");
        if (intArrayExtra != null) {
            this.A05 = intArrayExtra;
            if (intArrayExtra.length <= 0) {
                z = false;
            }
            AnonymousClass00E.A07(z);
            AnonymousClass0LW A042 = A04();
            if (A042 != null) {
                AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
                r2.A06(R.id.container, A0T(), null);
                r2.A00();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass0LW A042 = A04();
            if (A042.A03() > 0) {
                A042.A0C();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        List list = this.A07.A05;
        AnonymousClass00E.A07(list.contains(this));
        list.remove(this);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        List list = this.A07.A05;
        AnonymousClass00E.A07(!list.contains(this));
        list.add(this);
    }
}
