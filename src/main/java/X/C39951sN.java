package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceActivity;
import android.text.TextUtils;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.1sN  reason: invalid class name and case insensitive filesystem */
public class C39951sN extends PreferenceActivity implements AbstractC004502c {
    public int A00;
    public int A01;
    public long A02;
    public ProgressDialog A03;
    public Intent A04;
    public AbstractC003201p A05;
    public Integer A06;
    public String A07;
    public boolean A08 = true;
    public boolean A09;
    public final AnonymousClass02M A0A = AnonymousClass02M.A00();
    public final AnonymousClass0LB A0B = AnonymousClass0LB.A00();
    public final AnonymousClass0XS A0C = new C38641qD(this);
    public final AnonymousClass01X A0D = AnonymousClass01X.A00();

    public final AbstractC003201p A00() {
        AbstractC003201p r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0MW r02 = new AnonymousClass0MW(this, null, null, this);
        this.A05 = r02;
        return r02;
    }

    @Override // X.AbstractC004502c
    public boolean AB1() {
        return C002001d.A3D(this);
    }

    @Override // X.AbstractC004502c
    public void AMi() {
        this.A03 = null;
        C002001d.A2N(this, 501);
    }

    @Override // X.AbstractC004502c
    public void APl(DialogFragment dialogFragment, String str) {
        throw new IllegalStateException("Unsupported operation");
    }

    @Override // X.AbstractC004502c
    public void APm(DialogFragment dialogFragment) {
        throw new IllegalStateException("Unsupported operation");
    }

    @Override // X.AbstractC004502c
    public void APo(int i) {
        this.A00 = i;
        C002001d.A2O(this, 500);
    }

    @Override // X.AbstractC004502c
    public void APp(int i, int i2, int i3, C42921xV r5, Object... objArr) {
        this.A01 = i;
        this.A00 = i2;
        C002001d.A2O(this, 500);
    }

    @Override // X.AbstractC004502c
    public void APq(int i, int i2, Object... objArr) {
        this.A01 = i;
        this.A00 = i2;
        C002001d.A2O(this, 500);
    }

    @Override // X.AbstractC004502c
    public void APr(String str) {
        this.A07 = str;
        C002001d.A2O(this, 500);
    }

    @Override // X.AbstractC004502c
    public void APv(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        C002001d.A2O(this, 501);
    }

    @Override // X.AbstractC004502c
    public void AQu(String str) {
        ProgressDialog progressDialog = this.A03;
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0D(view, layoutParams);
    }

    public void addPreferencesFromResource(int i) {
        super.addPreferencesFromResource(i);
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            AnonymousClass0MW r0 = (AnonymousClass0MW) A00();
            r0.A0N();
            r0.A0B.A08(title);
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(new AnonymousClass0S7(context, this.A0D, this.A0B));
        AnonymousClass0MW r1 = (AnonymousClass0MW) A00();
        r1.A0W(false);
        r1.A0R = true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.A08 || SystemClock.elapsedRealtime() - this.A02 > 500 || !(motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) && super.dispatchTouchEvent(motionEvent);
    }

    public MenuInflater getMenuInflater() {
        Context context;
        AnonymousClass0MW r2 = (AnonymousClass0MW) A00();
        MenuInflater menuInflater = r2.A05;
        if (menuInflater != null) {
            return menuInflater;
        }
        r2.A0N();
        AnonymousClass0S2 r0 = r2.A0B;
        if (r0 != null) {
            context = r0.A01();
        } else {
            context = r2.A0j;
        }
        C12950jM r1 = new C12950jM(context);
        r2.A05 = r1;
        return r1;
    }

    public void invalidateOptionsMenu() {
        A00().A06();
    }

    public /* synthetic */ void lambda$setContentView$15$DialogPreferenceActivity(View view) {
        finish();
    }

    public void onBackPressed() {
        if (this.A08) {
            super.onBackPressed();
        } else {
            Log.e("dialogtoasttreferenceactivity/onbackpressed/activity no active");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A0D.A0J();
        super.onConfigurationChanged(configuration);
        A00().A0A(configuration);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass01X r5 = this.A0D;
        r5.A0J();
        this.A09 = false;
        AnonymousClass0SE.A09(r5, getWindow());
        getTheme().applyStyle(R.style.NoActionBar, true);
        getLayoutInflater().setFactory2(new LayoutInflater$Factory2C27171Ok(A00()));
        A00().A0B(bundle);
        super.onCreate(bundle);
        View findViewById = findViewById(16908298);
        if (findViewById != null) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingLeft2 = findViewById.getPaddingLeft();
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                paddingLeft += view.getPaddingLeft();
                paddingLeft2 += view.getPaddingRight();
                view.setPadding(0, 0, 0, 0);
            }
            findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
            findViewById.setScrollBarStyle(33554432);
        }
        r5.A0A.add(this.A0C);
    }

    public Dialog onCreateDialog(int i) {
        String str;
        if (i == 500) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(this);
            if (TextUtils.isEmpty(this.A07)) {
                str = this.A0D.A06(this.A00);
            } else {
                str = this.A07;
            }
            AnonymousClass0MC r3 = r4.A01;
            r3.A0E = str;
            AnonymousClass01X r2 = this.A0D;
            r4.A07(r2.A06(R.string.ok), new DialogInterface$OnClickListenerC25691Hy(this));
            int i2 = this.A01;
            if (i2 != 0) {
                r3.A0I = r2.A06(i2);
            }
            return r4.A00();
        } else if (i != 501) {
            return super.onCreateDialog(i);
        } else {
            ProgressDialog progressDialog = new ProgressDialog(this);
            int i3 = this.A01;
            if (i3 != 0) {
                progressDialog.setTitle(this.A0D.A06(i3));
            }
            progressDialog.setMessage(this.A0D.A06(this.A00));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            this.A03 = progressDialog;
            return progressDialog;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        A00().A07();
        AnonymousClass01X r0 = this.A0D;
        r0.A0A.remove(this.A0C);
        this.A04 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        this.A0A.A07(this);
        super.onPause();
        this.A08 = false;
        this.A02 = SystemClock.elapsedRealtime();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AnonymousClass0MW) A00()).A0L();
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass0MW r0 = (AnonymousClass0MW) A00();
        r0.A0N();
        AnonymousClass0S2 r1 = r0.A0B;
        if (r1 != null) {
            r1.A0E(true);
        }
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        String str;
        if (i != 500) {
            super.onPrepareDialog(i, dialog);
            return;
        }
        AnonymousClass0MD r5 = (AnonymousClass0MD) dialog;
        if (TextUtils.isEmpty(this.A07)) {
            str = this.A0D.A06(this.A00);
        } else {
            str = this.A07;
        }
        r5.A04(str);
        StringBuilder sb = new StringBuilder("dialogtoastpref/preparedialog/message ");
        sb.append(str);
        Log.d(sb.toString());
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getString("dialogToastMessage");
        this.A00 = bundle.getInt("dialogToastMessageId", 0);
        this.A01 = bundle.getInt("dialogToastTitleId", 0);
    }

    public void onResume() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".onResume");
        Log.i(sb.toString());
        if (this.A09) {
            this.A09 = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A0A.A09(this);
        this.A08 = true;
        Intent intent = this.A04;
        if (intent != null) {
            Integer num = this.A06;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            this.A04 = null;
            this.A06 = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".onSaveInstanceState");
        Log.i(sb.toString());
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("dialogToastMessage", this.A07);
        bundle.putInt("dialogToastMessageId", this.A00);
        bundle.putInt("dialogToastTitleId", this.A01);
    }

    public void onStop() {
        super.onStop();
        A00().A08();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A00().A0G(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(R.layout.toolbar, (ViewGroup) null, false);
        toolbar.setTitle(getTitle());
        if (Build.VERSION.SDK_INT >= 21) {
            toolbar.setElevation(getResources().getDimension(R.dimen.actionbar_elevation));
        }
        if (this.A0D.A02().A06) {
            toolbar.setNavigationIcon(R.drawable.ic_back_rtl);
        } else {
            toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material));
        ViewGroup frameLayout = new FrameLayout(this);
        getLayoutInflater().inflate(i, frameLayout, true);
        linearLayout.addView(frameLayout, -1, -1);
        setContentView(linearLayout);
        A00().A0F(toolbar);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 19));
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A00().A0C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0E(view, layoutParams);
    }
}
