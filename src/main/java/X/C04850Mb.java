package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* renamed from: X.0Mb  reason: invalid class name and case insensitive filesystem */
public class C04850Mb extends ContextWrapper {
    public int A00;
    public Configuration A01;
    public Resources.Theme A02;
    public Resources A03;
    public LayoutInflater A04;

    public C04850Mb() {
        super(null);
    }

    public C04850Mb(Context context) {
        super(context);
        this.A02 = null;
    }

    public C04850Mb(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.A02.setTo(theme);
            }
        }
        this.A02.applyStyle(this.A00, true);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        Resources resources = this.A03;
        if (resources != null) {
            return resources;
        }
        Configuration configuration = this.A01;
        if (configuration == null) {
            Resources resources2 = super.getResources();
            this.A03 = resources2;
            return resources2;
        } else if (Build.VERSION.SDK_INT < 17) {
            return resources;
        } else {
            Resources resources3 = createConfigurationContext(configuration).getResources();
            this.A03 = resources3;
            return resources3;
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.A04 = cloneInContext;
        return cloneInContext;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.A02;
        if (theme != null) {
            return theme;
        }
        if (this.A00 == 0) {
            this.A00 = 2131952214;
        }
        A00();
        return this.A02;
    }

    public void setTheme(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00();
        }
    }
}
