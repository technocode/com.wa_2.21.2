package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.02g  reason: invalid class name and case insensitive filesystem */
public class ActivityC004802g extends ActivityC004902h implements AnonymousClass02s, AnonymousClass02t {
    public Resources A00;
    public AbstractC003201p A01;

    @Override // X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r1) {
    }

    @Override // X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r1) {
    }

    @Override // X.AnonymousClass02s
    public AbstractC06110Rt ALr(AbstractC06100Rs r2) {
        return null;
    }

    public AnonymousClass0S2 A09() {
        AnonymousClass0MW r0 = (AnonymousClass0MW) A0A();
        r0.A0N();
        return r0.A0B;
    }

    public AbstractC003201p A0A() {
        AbstractC003201p r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0MW r02 = new AnonymousClass0MW(this, null, this, this);
        this.A01 = r02;
        return r02;
    }

    public AbstractC06110Rt A0B(AbstractC06100Rs r2) {
        return A0A().A04(r2);
    }

    public void A0C(Toolbar toolbar) {
        A0A().A0F(toolbar);
    }

    @Override // X.AnonymousClass02t
    public Intent A9G() {
        return C002001d.A0P(this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0A().A0D(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AbstractC003201p A0A = A0A();
        if (A0A instanceof AnonymousClass0MW) {
            AnonymousClass0MW r1 = (AnonymousClass0MW) A0A;
            r1.A0W(false);
            r1.A0R = true;
        }
    }

    public void closeOptionsMenu() {
        boolean AAS;
        AnonymousClass0S2 A09 = A09();
        if (getWindow().hasFeature(0)) {
            if (A09 != null) {
                if (!(A09 instanceof AnonymousClass0TC)) {
                    AAS = false;
                } else {
                    AAS = ((AnonymousClass0TC) A09).A01.AAS();
                }
                if (AAS) {
                    return;
                }
            }
            super.closeOptionsMenu();
        }
    }

    @Override // X.ActivityC005002j
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        AnonymousClass0S2 A09 = A09();
        if (keyCode == 82 && A09 != null) {
            if (!(A09 instanceof AnonymousClass0TC)) {
                z = false;
            } else {
                AnonymousClass0TC r2 = (AnonymousClass0TC) A09;
                z = true;
                if (keyEvent.getAction() == 1) {
                    r2.A01.APs();
                }
            }
            if (z) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i) {
        AnonymousClass0MW r0 = (AnonymousClass0MW) A0A();
        r0.A0L();
        return r0.A08.findViewById(i);
    }

    public MenuInflater getMenuInflater() {
        Context context;
        AnonymousClass0MW r2 = (AnonymousClass0MW) A0A();
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

    public Resources getResources() {
        Resources resources = this.A00;
        if (resources == null && AnonymousClass016.A00()) {
            resources = new AnonymousClass016(this, super.getResources());
            this.A00 = resources;
        }
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        A0A().A06();
    }

    @Override // X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A00 != null) {
            this.A00.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A0A().A0A(configuration);
    }

    public void onContentChanged() {
        if (this instanceof ActivityC03630Ha) {
            ActivityC03630Ha r2 = (ActivityC03630Ha) this;
            Log.d("WaBaseListActivity/onSupportContentChanged");
            View findViewById = r2.findViewById(16908292);
            ListView listView = (ListView) r2.findViewById(16908298);
            r2.A01 = listView;
            if (listView != null) {
                if (findViewById != null) {
                    listView.setEmptyView(findViewById);
                }
                r2.A01.setOnItemClickListener(r2.A04);
                if (r2.A02) {
                    r2.A0U(r2.A00);
                }
                r2.A03.post(r2.A05);
                r2.A02 = true;
                return;
            }
            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        }
    }

    @Override // X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AbstractC003201p A0A = A0A();
        A0A.A05();
        A0A.A0B(bundle);
        super.onCreate(bundle);
    }

    @Override // X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        A0A().A07();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // X.ActivityC004902h
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int A65;
        Intent A9G;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AnonymousClass0S2 A09 = A09();
        if (menuItem.getItemId() != 16908332 || A09 == null) {
            return false;
        }
        if (!(A09 instanceof AnonymousClass0TA)) {
            A65 = ((AnonymousClass0TC) A09).A01.A65();
        } else {
            A65 = ((AnonymousClass0TA) A09).A0B.A65();
        }
        if ((A65 & 4) == 0 || (A9G = A9G()) == null) {
            return false;
        }
        if (shouldUpRecreateTask(A9G)) {
            C14650me r4 = new C14650me(this);
            Intent A9G2 = A9G();
            if (!(A9G2 == null && (A9G2 = C002001d.A0P(this)) == null)) {
                ComponentName component = A9G2.getComponent();
                if (component == null) {
                    component = A9G2.resolveActivity(r4.A00.getPackageManager());
                }
                ArrayList arrayList = r4.A01;
                int size = arrayList.size();
                try {
                    Context context = r4.A00;
                    for (Intent A0Q = C002001d.A0Q(context, component); A0Q != null; A0Q = C002001d.A0Q(context, A0Q.getComponent())) {
                        arrayList.add(size, A0Q);
                    }
                    arrayList.add(A9G2);
                } catch (PackageManager.NameNotFoundException e) {
                    android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            ArrayList arrayList2 = r4.A01;
            if (!arrayList2.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList2.toArray(new Intent[arrayList2.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                r4.A00.startActivities(intentArr, null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(A9G);
            return true;
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AnonymousClass0MW) A0A()).A0L();
    }

    @Override // X.ActivityC004902h
    public void onPostResume() {
        super.onPostResume();
        AnonymousClass0MW r0 = (AnonymousClass0MW) A0A();
        r0.A0N();
        AnonymousClass0S2 r1 = r0.A0B;
        if (r1 != null) {
            r1.A0E(true);
        }
    }

    @Override // X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass0MW r1 = (AnonymousClass0MW) A0A();
        int i = r1.A01;
        if (i != -100) {
            ((AnonymousClass05W) AnonymousClass0MW.A0o).put(r1.A0l.getClass(), Integer.valueOf(i));
        }
    }

    @Override // X.ActivityC004902h
    public void onStart() {
        super.onStart();
        AnonymousClass0MW r3 = (AnonymousClass0MW) A0A();
        r3.A0f = true;
        r3.A0W(true);
        synchronized (AbstractC003201p.A02) {
            AbstractC003201p.A02(r3);
            AbstractC003201p.A01.add(new WeakReference(r3));
        }
    }

    @Override // X.ActivityC004902h
    public void onStop() {
        super.onStop();
        A0A().A08();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A0A().A0G(charSequence);
    }

    public void openOptionsMenu() {
        boolean APs;
        AnonymousClass0S2 A09 = A09();
        if (getWindow().hasFeature(0)) {
            if (A09 != null) {
                if (!(A09 instanceof AnonymousClass0TC)) {
                    APs = false;
                } else {
                    APs = ((AnonymousClass0TC) A09).A01.APs();
                }
                if (APs) {
                    return;
                }
            }
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A0A().A09(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A0A().A0C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0A().A0E(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        AbstractC003201p A0A = A0A();
        if (A0A instanceof AnonymousClass0MW) {
            ((AnonymousClass0MW) A0A).A02 = i;
        }
    }
}
