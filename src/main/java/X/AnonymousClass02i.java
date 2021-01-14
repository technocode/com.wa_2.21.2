package X;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity$2;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ImmLeaksCleaner;

/* renamed from: X.02i  reason: invalid class name */
public class AnonymousClass02i extends ActivityC005002j implements AbstractC005102k, AbstractC005302m, AbstractC005402n, AnonymousClass02o, AbstractC005502p {
    public AnonymousClass0O4 A00;
    public AnonymousClass0O5 A01;
    public final AnonymousClass0S8 A02 = new AnonymousClass0S8(new RunnableEBaseShape0S0100000_I0_0(this, 0));
    public final C013807v A03 = new C013807v(this);
    public final AnonymousClass0SH A04 = new AnonymousClass0SH(this);

    public AnonymousClass02i() {
        C013807v r1 = this.A03;
        if (Build.VERSION.SDK_INT >= 19) {
            r1.A00(new ComponentActivity$2(this));
        }
        this.A03.A00(new ComponentActivity$3(this));
        int i = Build.VERSION.SDK_INT;
        if (19 <= i && i <= 23) {
            this.A03.A00(new ImmLeaksCleaner(this));
        }
    }

    @Override // X.AbstractC005502p
    public AnonymousClass0O4 A62() {
        Bundle bundle;
        if (getApplication() != null) {
            AnonymousClass0O4 r2 = this.A00;
            if (r2 != null) {
                return r2;
            }
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            C452523v r22 = new C452523v(application, this, bundle);
            this.A00 = r22;
            return r22;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // X.AbstractC005102k
    public AbstractC013907w A75() {
        return this.A03;
    }

    @Override // X.AnonymousClass02o
    public final AnonymousClass0S8 A7i() {
        return this.A02;
    }

    @Override // X.AbstractC005402n
    public final AnonymousClass0SI A8t() {
        return this.A04.A00;
    }

    @Override // X.AbstractC005302m
    public AnonymousClass0O5 A9n() {
        if (getApplication() != null) {
            AnonymousClass0O5 r0 = this.A01;
            if (r0 != null) {
                return r0;
            }
            C12740io r02 = (C12740io) getLastNonConfigurationInstance();
            if (r02 != null) {
                this.A01 = r02.A00;
            }
            AnonymousClass0O5 r03 = this.A01;
            if (r03 != null) {
                return r03;
            }
            AnonymousClass0O5 r04 = new AnonymousClass0O5();
            this.A01 = r04;
            return r04;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.A02.A00();
    }

    @Override // X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04.A00(bundle);
        AnonymousClass084.A00(this);
    }

    public final Object onRetainNonConfigurationInstance() {
        C12740io r0;
        AnonymousClass0O5 r1 = this.A01;
        if (r1 == null && ((r0 = (C12740io) getLastNonConfigurationInstance()) == null || (r1 = r0.A00) == null)) {
            return null;
        }
        C12740io r02 = new C12740io();
        r02.A00 = r1;
        return r02;
    }

    @Override // X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        C013807v r1 = this.A03;
        if (r1 != null) {
            r1.A05(EnumC014207z.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A04.A00.A02(bundle);
    }
}
